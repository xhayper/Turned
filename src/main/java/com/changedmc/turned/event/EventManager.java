package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class EventManager {
    public static void registerEvents() {
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventLifecycle");
        FMLJavaModLoadingContext.get().getModEventBus().register(EventLifecycle.class);
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventCapability");
        MinecraftForge.EVENT_BUS.register(EventCapability.class);
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventRegistry");
        MinecraftForge.EVENT_BUS.register(EventRegistry.class);
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventEntity");
        MinecraftForge.EVENT_BUS.register(EventEntity.class);
    }
}
