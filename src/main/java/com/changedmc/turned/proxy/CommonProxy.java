package com.changedmc.turned.proxy;

import java.util.concurrent.Callable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) { }

    public EntityPlayer getPlayerEntity(MessageContext ctx) {
        return (EntityPlayer) (ctx.getServerHandler()).player;
    }
}