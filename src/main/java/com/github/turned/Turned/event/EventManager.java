package com.github.turned.Turned.event;

import com.github.turned.Turned.Main;
import com.github.turned.Turned.config.TurnedCommonConfig;
import com.github.turned.Turned.deferredregister.*;
import com.github.turned.Turned.reference.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class EventManager {
    public static void registerEvents() {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventLifecycle");
        FMLJavaModLoadingContext.get().getModEventBus().register(EventLifecycle.class);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventCapability");
        MinecraftForge.EVENT_BUS.register(EventCapability.class);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventEntity");
        MinecraftForge.EVENT_BUS.register(EventEntity.class);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventRenderer");
        MinecraftForge.EVENT_BUS.register(EventRenderer.class);

        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering ENTITY_TYPES");
        TurnedEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering ITEMS");
        TurnedItem.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering BLOCKS");
        TurnedBlock.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering FLUIDS");
        TurnedFluid.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering SOUND_EVENT");
        TurnedSoundEvent.SOUND_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}