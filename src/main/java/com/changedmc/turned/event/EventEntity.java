package com.changedmc.turned.event;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.config.TurnedServerConfig;
import com.changedmc.turned.transfur.TransfurManager;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public class EventEntity {

    private static void syncCapability(Entity entity) {
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(ITransfurCapability::syncCapability);
        if (entity instanceof ServerPlayer serverPlayer) {
            for (ServerPlayer sp: serverPlayer.server.getPlayerList().getPlayers()) {
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
    public static void onLivingDamageEntity(LivingDamageEvent event) {
        if (event.getSource().getDirectEntity() == null || !(event.getSource().getDirectEntity() instanceof Player player)) return;
        Entity entity = event.getEntity();
        ITransfurCapability entityTransfurCapability = event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        ITransfurCapability playerTransfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (entityTransfurCapability == null || playerTransfurCapability == null || entityTransfurCapability.isTransfured() || !playerTransfurCapability.isTransfured() || !player.getMainHandItem().is(Items.AIR)) return;
        event.setAmount(1);
        int nextLevel = Math.min(entityTransfurCapability.getLatexLevel() + new Random().nextInt(10) + 1, 100);
        if (nextLevel >= 100 || TurnedServerConfig.instantTransfur.get()) {
            if (entity instanceof Player) {
                entityTransfurCapability.setTransfurType(playerTransfurCapability.getTransfurType());
                entityTransfurCapability.setTransfured(true);
                entityTransfurCapability.setLatexLevel(0);
            } else if (entity instanceof Mob) {
                Mob newMob = ((Mob) entity).convertTo(TransfurManager.entityTypeHashMap.get(playerTransfurCapability.getTransfurType()), true);
                if (newMob == null) return;
                newMob.setDeltaMovement(entity.getDeltaMovement());
            }
        } else {
            entityTransfurCapability.setLatexLevel(nextLevel);
        }
    }

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event) {
        event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent((transfurCapability) -> transfurCapability.setLatexLevel(0));
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
}