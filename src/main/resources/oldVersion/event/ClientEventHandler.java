package com.changedmc.turned.event;

import com.changedmc.turned.capability.ITransfur;
import com.changedmc.turned.capability.TransfurProvider;
import com.changedmc.turned.client.renderer.entity.RenderDarkLatexMPlayer;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ClientEventHandler {
    @SubscribeEvent
    public void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
        ITransfur trans = (ITransfur) event.getPlayer().getCapability(TransfurProvider.TRANS_CAP, null);
        if (trans.getTransfur() > 0) {
            System.out.println("[TEMP] Transfur value is greater than 0");
            event.setCanceled(true);
            // Do we even need this?
            //new RenderDarkLatexMPlayer(Minecraft.getInstance().getEntityRenderDispatcher()).doRender(event.getPlayer(), event.getX(), event.getY(), event.getZ(), event.getPlayer().rotationYaw, event.getPartialRenderTick());
        }
    }
}