package com.changedmc.turned.event;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.config.TurnedServerConfig;
import com.changedmc.turned.entity.latex.Latex;
import com.changedmc.turned.transfur.TransfurManager;
import com.changedmc.turned.util.Utility;
import com.google.common.collect.ImmutableList;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;
import java.util.Random;

public class EventEntity {

    private static void syncCapability(Entity entity) {
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(ITransfurCapability::syncCapability);
        if (entity instanceof ServerPlayer serverPlayer) {
            for (ServerPlayer sp : serverPlayer.server.getPlayerList().getPlayers()) {
                sp.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent((transfurCapability -> transfurCapability.syncTo(serverPlayer)));
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerChangeDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onEntityItemPickup(EntityItemPickupEvent event) {
        if (!TurnedServerConfig.CAN_LATEX_ONLY_USE_LATEX_ITEM.get()) return;
        ITransfurCapability transfurCapability = event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        boolean isTransfured = (transfurCapability != null && transfurCapability.isTransfured()) || (event.getEntity() instanceof Latex);
        if (isTransfured && !Utility.isItemLatexHoldable(event.getItem().getItem().getItem())) event.setCanceled(true);
    }

    private static <T extends Mob> EntityType<T> getTypedType(Entity entity) {
        return (EntityType<T>) entity.getType();
    }

    @SubscribeEvent
    public static void onLivingAttackEvent(LivingAttackEvent event) {
        Entity entity = event.getEntity();

        ITransfurCapability entityTransfurCapability = entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (((entityTransfurCapability != null && entityTransfurCapability.isTransfured()) || entity instanceof Latex) && event.getSource().msgId.equals("drown")) {
            event.setCanceled(true);
            return;
        }
        if (entityTransfurCapability == null || entityTransfurCapability.isTransfured() || entity instanceof Latex) return;
        Entity source = event.getSource().getDirectEntity();
        if (source == null) return;
        ITransfurCapability sourceTransfurCapability = source.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (sourceTransfurCapability == null || !sourceTransfurCapability.isTransfured() || (!(source instanceof LivingEntity)) || !((LivingEntity) source).getMainHandItem().is(Items.AIR))
            return;
        int nextLevel = Math.min(entityTransfurCapability.getLatexLevel() + new Random().nextInt(10) + 1, 100);
        if ((nextLevel >= 100 || TurnedServerConfig.INSTANT_TRANSFUR.get())) {
            if (TurnedServerConfig.CAN_LATEX_ONLY_USE_LATEX_ITEM.get()) {
                if (entity instanceof Player player && !player.isCreative() && !player.isSpectator()) {
                    for (List<ItemStack> list : ImmutableList.of(player.getInventory().items, player.getInventory().armor, player.getInventory().offhand)) {
                        for (int i = 0; i < list.size(); i++) {
                            ItemStack itemstack = list.get(i);
                            if (itemstack.isEmpty() || Utility.isItemLatexHoldable(itemstack.getItem())) continue;
                            ItemEntity itemEntity = Utility.dropItem(player, itemstack, true, true, true);
                            if (itemEntity != null) {
                                list.set(i, ItemStack.EMPTY);
                            }
                        }
                    }
                } else {
                    for (ItemStack itemstack : entity.getAllSlots()) {
                        if (itemstack.isEmpty() || Utility.isItemLatexHoldable(itemstack.getItem())) continue;
                        Utility.dropItem(entity, itemstack, true, true, true);
                    }
                }
            }
            entityTransfurCapability.setTransfurType(sourceTransfurCapability.getTransfurType());
            entityTransfurCapability.setTransfured(true);
            entityTransfurCapability.setLatexLevel(0);
            if (entity instanceof Mob) {
                Mob newMob = ((Mob) entity).convertTo((source instanceof Player) ? TransfurManager.entityTypeHashMap.get(sourceTransfurCapability.getTransfurType()) : getTypedType(source), true);
                if (newMob == null) return;
                newMob.setDeltaMovement(entity.getDeltaMovement());
            }
        } else {
            entityTransfurCapability.setLatexLevel(nextLevel);
        }
    }

    @SubscribeEvent
    public static void onLivingDamageEntity(LivingDamageEvent event) {
        Entity source = event.getSource().getDirectEntity();
        if (source == null) return;
        ITransfurCapability sourceTransfurCapability = source.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (source instanceof LivingEntity && ((sourceTransfurCapability != null && sourceTransfurCapability.isTransfured()) || source instanceof Latex) && ((LivingEntity) source).getMainHandItem().is(Items.AIR)) {
            event.setAmount(1);
        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayer(RenderPlayerEvent.Pre event) {
        Player player = event.getPlayer();
        ITransfurCapability transfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability != null && transfurCapability.isTransfured()) {
            TransfurManager.render(event, transfurCapability.getTransfurType());
        }
    }


    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderArm(RenderArmEvent event) {
        Player player = event.getPlayer();
        ITransfurCapability transfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability != null && transfurCapability.isTransfured()) {
            TransfurManager.renderArm(event, transfurCapability.getTransfurType());
        }
    }
}