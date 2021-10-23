package com.changedmc.turned.event;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class EventManager {
    public static void registerEvents() {
        FMLJavaModLoadingContext.get().getModEventBus().register(EventLifecycle.class);
        MinecraftForge.EVENT_BUS.register(EventCapability.class);
        MinecraftForge.EVENT_BUS.register(EventRegistry.class);
        MinecraftForge.EVENT_BUS.register(EventEntity.class);
    }
}
