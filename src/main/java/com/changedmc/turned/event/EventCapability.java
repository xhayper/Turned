package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.TransfurCapabilityProvider;
import com.changedmc.turned.config.TurnedCommonConfig;
import com.changedmc.turned.util.Reference;
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