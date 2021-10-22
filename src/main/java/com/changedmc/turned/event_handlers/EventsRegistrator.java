package com.changedmc.turned.event_handlers;

import com.changedmc.turned.capability.transfur.CapabilityAttachmentHandler;
import net.minecraftforge.common.MinecraftForge;

public class EventsRegistrator {
    public static void registerEvents() {
        MinecraftForge.EVENT_BUS.addListener(EntityJoinEventHandler::onEntityJoin);
        MinecraftForge.EVENT_BUS.addListener(CapabilityAttachmentHandler::on_pickup);
    }
}
