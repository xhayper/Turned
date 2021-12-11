package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.config.TurnedCommonConfig;
import com.changedmc.turned.deferredregister.TurnedBlock;
import com.changedmc.turned.deferredregister.TurnedEntityType;
import com.changedmc.turned.deferredregister.TurnedFluid;
import com.changedmc.turned.deferredregister.TurnedItem;
import com.changedmc.turned.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class EventManager {
    public static void registerEvents() {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventLifecycle");
        FMLJavaModLoadingContext.get().getModEventBus().register(EventLifecycle.class);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventCapability");
        MinecraftForge.EVENT_BUS.register(EventCapability.class);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventRegistry");
        MinecraftForge.EVENT_BUS.register(EventRegistry.class);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventEntity");
        MinecraftForge.EVENT_BUS.register(EventEntity.class);

        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering ENTITY_TYPES");
        TurnedEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering ITEMS");
        TurnedItem.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering BLOCKS");
        TurnedBlock.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering FLUIDS");
        TurnedFluid.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
