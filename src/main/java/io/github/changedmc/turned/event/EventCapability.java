package io.github.changedmc.turned.event;

import io.github.changedmc.turned.Main;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.config.TurnedCommonConfig;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventCapability {

    @SubscribeEvent
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Attaching Transfur Capability to an Entity");
        TransfurCapability.Provider transfurCapabilityProvider = new TransfurCapability.Provider(event.getObject());
        event.addCapability(TransfurCapability.KEY, transfurCapabilityProvider);
        event.addListener(transfurCapabilityProvider::invalidate);
    }

}