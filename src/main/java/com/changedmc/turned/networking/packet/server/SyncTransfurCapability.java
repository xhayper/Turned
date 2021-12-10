package com.changedmc.turned.networking.packet.server;

import com.changedmc.turned.capability.TurnedCapability;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SyncTransfurCapability {

    public int entityID;
    public int transfurType;
    public boolean isTransfured;

    public SyncTransfurCapability(int entityID, int transfurType, boolean isTransfured) {
        this.entityID = entityID;
        this.transfurType = transfurType;
        this.isTransfured = isTransfured;
    }

    public static void encode(SyncTransfurCapability message, FriendlyByteBuf packetBuffer) {
        packetBuffer.writeInt(message.entityID);
        packetBuffer.writeInt(message.transfurType);
        packetBuffer.writeBoolean(message.isTransfured);
    }

    public static SyncTransfurCapability decode(FriendlyByteBuf packetBuffer) {
        return new SyncTransfurCapability(packetBuffer.readInt(), packetBuffer.readInt(), packetBuffer.readBoolean());
    }

    public static void handle(SyncTransfurCapability message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            Level level = Minecraft.getInstance().level;
            if (level == null) return;
            Entity entity = level.getEntity(message.entityID);
            if (entity == null) return;
            entity.getCapability(TurnedCapability.TRANSFUR).ifPresent(capability -> {
                capability.setTransfured(message.isTransfured);
                capability.setTransfurType(message.transfurType);
            });
        }));
        context.setPacketHandled(true);
    }
}