package com.github.turned.Turned.event;

import com.github.turned.Turned.capability.transfur.ITransfurCapability;
import com.github.turned.Turned.capability.transfur.TransfurCapability;
import com.github.turned.Turned.config.TurnedServerConfig;
import com.github.turned.Turned.entity.latex.Latex;
import com.github.turned.Turned.util.Utility;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

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

    @SubscribeEvent
    public static void onLivingAttackEvent(LivingAttackEvent event) {
        Entity entity = event.getEntity();
        ITransfurCapability entityTransfurCapability = entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (((entityTransfurCapability != null && entityTransfurCapability.isTransfured()) || entity instanceof Latex) && event.getSource().msgId.equals("drown")) {
            event.setCanceled(true);
        }
//        if (entity instanceof Latex || ((entity instanceof Player) && entityTransfurCapability != null && entityTransfurCapability.isTransfured())) {
//            event.setCanceled(true);
//        } // Immunity 2 :)
    }

    @SubscribeEvent
    public static void onLivingDamageEvent(LivingDamageEvent event) {
        if (event.getSource().getDirectEntity() == null || !(event.getSource().getDirectEntity() instanceof Player player)) return;
        Entity entity = event.getEntity();
        ITransfurCapability entityTransfurCapability = event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        ITransfurCapability playerTransfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (entityTransfurCapability == null || playerTransfurCapability == null || entityTransfurCapability.isTransfured() || !playerTransfurCapability.isTransfured() || !player.getMainHandItem().is(Items.AIR)) return;
        event.setAmount(1);
        int nextLevel = Math.min(entityTransfurCapability.getLatexLevel() + new Random().nextInt(10) + 1, 100);
        if (nextLevel >= 100 || TurnedServerConfig.INSTANT_TRANSFUR.get()) {
            Utility.removeAllNonLatexItem(entity);
            Utility.transfur(player, entity, playerTransfurCapability, entityTransfurCapability);
        } else {
            entityTransfurCapability.setLatexLevel(nextLevel);
        }
    }
}