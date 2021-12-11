package com.changedmc.turned.networking;

import com.changedmc.turned.Main;
import com.changedmc.turned.config.TurnedCommonConfig;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import com.changedmc.turned.util.Reference;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class NetworkManager {
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(Reference.MOD_ID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );
    private static int currentPacketId = 0;

    // client = Client -> Server
    // server = Server -> Client

    public static void registerPackets() {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering SyncTransfurCapability Packet");
        registerPacket(SyncTransfurCapability.class, SyncTransfurCapability::encode, SyncTransfurCapability::decode, SyncTransfurCapability::handle);
    }

    public static <MSG> void registerPacket(Class<MSG> messageType, BiConsumer<MSG, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, MSG> decoder, BiConsumer<MSG, Supplier<NetworkEvent.Context>> messageConsumer) {
        INSTANCE.registerMessage(NetworkManager.currentPacketId, messageType, encoder, decoder, messageConsumer);
        NetworkManager.currentPacketId++;
    }
}
