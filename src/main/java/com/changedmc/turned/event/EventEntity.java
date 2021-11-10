package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import com.changedmc.turned.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.PacketDistributor;

public class EventEntity {
    // TODO: Not sure if we need to only sync the player or we need to sync all entity, maybe make it work with entity later?
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof PlayerEntity)) return;
        if (event.getWorld().isClientSide) return;
        World world = event.getWorld();
        Entity entity = event.getEntity();
        MinecraftServer server = world.getServer();
        if (server == null) return;
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> {
            for (ServerPlayerEntity serverPlayerEntity : server.getPlayerList().getPlayers()) {
                if (serverPlayerEntity.level.dimension().location() == entity.level.dimension().location()) {
                    NetworkManager.INSTANCE.send(PacketDistributor.PLAYER.with(() -> serverPlayerEntity), new SyncTransfurCapability(entity.getId(), capability.getTransfurType(), capability.isTransfured()));
                }
            }
        });
    }

    // TODO: Remove this event when we manage to get transfur capability to work properly
    @SubscribeEvent
    public static void onEntityItemPickup(EntityItemPickupEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> capability.setTransfured(!capability.isTransfured()));
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD)
            event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> Main.LOGGER.debug(event.getEntity() + "'s isTransfured: " + capability.isTransfured()));
    }

    @SubscribeEvent
    public static void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
        PlayerEntity player = event.getPlayer();
        player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> {
            if (!capability.isTransfured()) return;
            event.setCanceled(true);
            switch(capability.getTransfurType()) {
                case 1:
                    // Placeholder
                    break;
                case 2:
                    // Placeholder
                    break;
            }
        });
    }
}