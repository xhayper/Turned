package com.changedmc.turned.networking.packet.server;

import com.changedmc.turned.capability.TransfurCapability;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class SyncTransfurCapability {

    public int entityID;
    public int transfurType;
    public boolean isTransfured;

    public SyncTransfurCapability() {
    }

    public SyncTransfurCapability(int entityID, int transfurType, boolean isTransfured) {
        this.entityID = entityID;
        this.transfurType = transfurType;
        this.isTransfured = isTransfured;
    }

    public static void encode(SyncTransfurCapability message, PacketBuffer packetBuffer) {
        packetBuffer.writeInt(message.entityID);
        packetBuffer.writeInt(message.transfurType);
        packetBuffer.writeBoolean(message.isTransfured);
    }

    public static SyncTransfurCapability decode(PacketBuffer packetBuffer) {
        return new SyncTransfurCapability(packetBuffer.readInt(), packetBuffer.readInt(), packetBuffer.readBoolean());
    }

    public static void handle(SyncTransfurCapability message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            World world = Minecraft.getInstance().level;
            if (world == null) return;
            Entity entity = world.getEntity(message.entityID);
            if (entity == null) return;
            entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfur -> {
                iTransfur.setTransfured(message.isTransfured);
                iTransfur.setTransfurType(message.transfurType);
            });
        }));
        context.setPacketHandled(true);
    }
}