package com.changedmc.turned.transfur.types;

import com.changedmc.turned.client.render.player.PlayerDarkLatexSnowLeopardRenderer;
import com.changedmc.turned.transfur.ITransfurType;
import com.changedmc.turned.util.Utility;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class DarkLatexSnowLeopardTransfur implements ITransfurType {
    @Override
    public void render(RenderPlayerEvent.Pre event) {
        PlayerDarkLatexSnowLeopardRenderer playerDarkLatexSnowLeopardRenderer = new PlayerDarkLatexSnowLeopardRenderer(Utility.getEntityRendererContext());
        playerDarkLatexSnowLeopardRenderer.render(event.getPlayer(), event.getEntity().getViewYRot(event.getPartialTick()), event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
    }

    @Override
    public void renderHand(RenderHandEvent event) {

    }
}
