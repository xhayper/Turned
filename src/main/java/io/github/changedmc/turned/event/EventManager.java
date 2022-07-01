package io.github.changedmc.turned.event;

import io.github.changedmc.turned.Main;
import io.github.changedmc.turned.config.TurnedCommonConfig;
import io.github.changedmc.turned.deferredregister.*;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class EventManager {
    public static void registerEvents() {
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering EventLifecycle");
        FMLJavaModLoadingContext.get().getModEventBus().register(EventLifecycle.class);
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering EventCapability");
        MinecraftForge.EVENT_BUS.register(EventCapability.class);
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) Main.LOGGER.debug("Registering EventEntity");
        MinecraftForge.EVENT_BUS.register(EventEntity.class);
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering EventRenderer");
        MinecraftForge.EVENT_BUS.register(EventRenderer.class);

        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering ENTITY_TYPES");
        TurnedEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) Main.LOGGER.debug("Registering ITEMS");
        TurnedItem.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) Main.LOGGER.debug("Registering BLOCKS");
        TurnedBlock.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) Main.LOGGER.debug("Registering FLUIDS");
        TurnedFluid.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) Main.LOGGER.debug("Registering SOUND_EVENT");
        TurnedSoundEvent.SOUND_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
