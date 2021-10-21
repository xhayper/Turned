package com.changedmc.turned.event;

import com.changedmc.turned.capability.ITransfur;
import com.changedmc.turned.capability.TransfurProvider;
import com.changedmc.turned.client.renderer.entity.RenderDarkLatexMPlayer;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ClientEventHandler 
{
	
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onRenderPlayerPre(RenderPlayerEvent.Pre event) 
	{
	    ITransfur trans = event.getPlayer().getCapability(TransfurProvider.TRANS_CAP, null);
	    	if(trans.getTransfur() > 0){
	    	System.out.println("[TEMP] Transfur value is greater than 0");
	    	event.setCanceled(true);
			new RenderDarkLatexMPlayer(Minecraft.getMinecraft().getRenderManager()).doRender(event.getPlayer(), event.getX(), event.getY(), event.getZ(), event.getPlayer().rotationYaw, event.getPartialRenderTick());
	    	}

	    
	    }
	

}