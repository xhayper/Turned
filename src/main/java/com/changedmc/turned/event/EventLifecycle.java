package com.changedmc.turned.event;

import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.networking.NetworkManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class EventLifecycle {
    @SubscribeEvent
    public static void FMLCommonSetup(FMLCommonSetupEvent event) {
        TransfurCapability.register();
        NetworkManager.registerPackets();
    }
}
