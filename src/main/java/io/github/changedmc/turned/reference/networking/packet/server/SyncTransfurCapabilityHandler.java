package io.github.changedmc.turned.reference.networking.packet.server;

import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SyncTransfurCapabilityHandler {

    public static void handle(SyncTransfurCapability message, Supplier<NetworkEvent.Context> contextSupplier) {
        Level level = Minecraft.getInstance().level;
        if (level == null) return;
        Entity entity = level.getEntity(message.entityID);
        if (entity == null) return;
        ITransfurCapability transfurCapability = entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null) return;
        transfurCapability.setTransfured(message.isTransfured);
        transfurCapability.setLatexLevel(message.latexLevel);
        transfurCapability.setTransfurType(message.transfurType);
    }

}
