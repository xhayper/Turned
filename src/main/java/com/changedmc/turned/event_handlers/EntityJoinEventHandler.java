package com.changedmc.turned.event_handlers;

import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.network.NetworkDirection;

import java.util.UUID;

public class EntityJoinEventHandler {
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof PlayerEntity) {
            UUID player_id = event.getEntity().getUUID();
            World level = event.getWorld();
            if (level.isClientSide) {
                System.out.println("ignoring client side call");
            } else {
                MinecraftServer server = level.getServer();
                ServerPlayerEntity player = server.getPlayerList().getPlayer(player_id);
                player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfur -> {
                    boolean isTransfured = iTransfur.isTransfured();
                    int transfurType = iTransfur.getTransfurType();
                    SyncTransfurCapability packet = new SyncTransfurCapability(player.getId(), transfurType, isTransfured);
                    NetworkManager.INSTANCE.sendTo(packet, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
                });
            }
        }
    }
}
