package com.changedmc.turned.networking;

import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import com.changedmc.turned.util.Reference;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class NetworkManager {
    private static int currentPacketId = 0;
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(Reference.MOD_ID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );
    // client = Client -> Server
    // server = Server -> Client

    public static void registerPackets() {
        registerPacket(SyncTransfurCapability.class, SyncTransfurCapability::encode, SyncTransfurCapability::decode, SyncTransfurCapability::handle);
    }

    public static <MSG> void registerPacket(Class<MSG> messageType, BiConsumer<MSG, PacketBuffer> encoder, Function<PacketBuffer, MSG> decoder, BiConsumer<MSG, Supplier<NetworkEvent.Context>> messageConsumer) {
        INSTANCE.registerMessage(NetworkManager.currentPacketId, messageType, encoder, decoder, messageConsumer);
        NetworkManager.currentPacketId++;
    }
}
