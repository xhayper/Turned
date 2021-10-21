package com.changedmc.turned.util.handlers;

import com.changedmc.turned.event.LootTableEvent;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
	public static void registerEvents()
	{
		LootTableEvent lootEvent = new LootTableEvent();
		
		MinecraftForge.EVENT_BUS.register(lootEvent);

	}
}