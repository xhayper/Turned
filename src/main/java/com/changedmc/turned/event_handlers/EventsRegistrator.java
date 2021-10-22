package com.changedmc.turned.event_handlers;

import net.minecraftforge.common.MinecraftForge;

public class EventsRegistrator {
    public static void registerEvents() {
        MinecraftForge.EVENT_BUS.addListener(EntityJoinEventHandler::onEntityJoin);
    }
}
