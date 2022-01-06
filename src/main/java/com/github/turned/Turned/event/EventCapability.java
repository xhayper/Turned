package com.github.turned.Turned.event;

import com.github.turned.Turned.Main;
import com.github.turned.Turned.capability.transfur.TransfurCapabilityProvider;
import com.github.turned.Turned.config.TurnedCommonConfig;
import com.github.turned.Turned.reference.Reference;
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