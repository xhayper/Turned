package io.github.changedmc.turned.event;

import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.config.TurnedServerConfig;
import io.github.changedmc.turned.entity.latex.Latex;
import io.github.changedmc.turned.networking.NetworkManager;
import io.github.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import io.github.changedmc.turned.util.Utility;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.PacketDistributor;

import java.util.Random;

public class EventEntity {

    private static void syncCapability(Entity entity) {
        DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER, () -> () ->
                entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent((transfurCapability) -> NetworkManager.INSTANCE.send((entity instanceof ServerPlayer) ? PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> entity) : PacketDistributor.TRACKING_ENTITY.with(() -> entity), new SyncTransfurCapability(entity.getId(), transfurCapability.getTransfurType(), transfurCapability.getLatexLevel(), transfurCapability.isTransfured())))
        );
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        syncCapability(event.getPlayer());
    }

    @SubscribeEvent
    public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        syncCapability(event.getPlayer());
    }

    @SubscribeEvent
    public static void onPlayerChangeDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        syncCapability(event.getPlayer());
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        if (event.isWasDeath() || !(event.getPlayer() instanceof ServerPlayer player)) return;
        Entity entity = event.getEntity();
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent((transfurCapability) -> NetworkManager.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new SyncTransfurCapability(entity.getId(), transfurCapability.getTransfurType(), transfurCapability.getLatexLevel(), transfurCapability.isTransfured())));
    }

    @SubscribeEvent
    public static void onPlayerStartTracking(PlayerEvent.StartTracking event) {
        if (!(event.getPlayer() instanceof ServerPlayer player)) return;
        Entity targetEntity = event.getEntity();
        ITransfurCapability transfurCapability = targetEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null) return;
        NetworkManager.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player),
                new SyncTransfurCapability(targetEntity.getId(), transfurCapability.getTransfurType(), transfurCapability.getLatexLevel(), transfurCapability.isTransfured()));
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
        if (event.getSource().getDirectEntity() == null || !(event.getSource().getDirectEntity() instanceof Player player))
            return;
        Entity entity = event.getEntity();
        ITransfurCapability entityTransfurCapability = event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        ITransfurCapability playerTransfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (entityTransfurCapability == null || playerTransfurCapability == null || entityTransfurCapability.isTransfured() || !playerTransfurCapability.isTransfured() || !player.getMainHandItem().is(Items.AIR))
            return;
        event.setAmount(1);
        int nextLevel = Math.min(entityTransfurCapability.getLatexLevel() + new Random().nextInt(10) + 1, 100);
        if (nextLevel >= 100 || TurnedServerConfig.INSTANT_TRANSFUR.get()) {
            Utility.removeAllNonLatexItem(entity);
            Utility.transfur(player, entity, playerTransfurCapability, entityTransfurCapability);
        } else {
            entityTransfurCapability.setLatexLevel(nextLevel);
            entityTransfurCapability.syncCapability();
        }
    }
}