package com.changedmc.turned.event;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventRegistry {

    @SubscribeEvent
    public void RegistryEventBlock(RegistryEvent.Register<Block> event) {
    }

}
