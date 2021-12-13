package com.changedmc.turned.networking.packet.server;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SyncTransfurCapability {

    public int entityID;
    public int transfurType;
    public int latexLevel;
    public boolean isTransfured;

    public SyncTransfurCapability(int entityID, int transfurType, int latexLevel, boolean isTransfured) {
        this.entityID = entityID;
        this.transfurType = transfurType;
        this.latexLevel = latexLevel;
        this.isTransfured = isTransfured;
    }

    public static void encode(SyncTransfurCapability message, FriendlyByteBuf packetBuffer) {
        packetBuffer.writeInt(message.entityID);
        packetBuffer.writeInt(message.transfurType);
        packetBuffer.writeInt(message.latexLevel);
        packetBuffer.writeBoolean(message.isTransfured);
    }

    public static SyncTransfurCapability decode(FriendlyByteBuf packetBuffer) {
        return new SyncTransfurCapability(packetBuffer.readInt(), packetBuffer.readInt(), packetBuffer.readInt(), packetBuffer.readBoolean());
    }

    public static void handle(SyncTransfurCapability message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> SyncTransfurCapabilityHandler.handle(message, contextSupplier)));
        context.setPacketHandled(true);
    }
}