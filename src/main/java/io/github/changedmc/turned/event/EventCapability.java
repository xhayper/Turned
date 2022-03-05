package io.github.changedmc.turned.event;

import io.github.changedmc.turned.Main;
import io.github.changedmc.turned.capability.transfur.TransfurCapabilityProvider;
import io.github.changedmc.turned.config.TurnedCommonConfig;
import io.github.changedmc.turned.reference.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventCapability {

    @SubscribeEvent
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD)
            Main.LOGGER.debug("Attaching Transfur Capability to an Entity");
        TransfurCapabilityProvider transfurCapabilityProvider = new TransfurCapabilityProvider(event.getObject());
        event.addCapability(new ResourceLocation(Reference.MOD_ID, "transfur_capability"), transfurCapabilityProvider);
        event.addListener(transfurCapabilityProvider::invalidate);
    }

}