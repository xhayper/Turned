package com.changedmc.turned;

import com.changedmc.turned.capability.transfur.CapabilityAttachmentHandler;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.event_handlers.EventsRegistrator;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Main::init);
    }
    
    public static void init(final FMLCommonSetupEvent event) {
    	TransfurCapability.register();
    	NetworkManager.registerPackets();
    	MinecraftForge.EVENT_BUS.addGenericListener(Entity.class, CapabilityAttachmentHandler::onAttachCapabilitiesEvent);
        EventsRegistrator.registerEvents();
    }
}
