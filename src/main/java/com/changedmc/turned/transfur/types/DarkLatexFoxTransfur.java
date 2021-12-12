package com.changedmc.turned.transfur.types;

import com.changedmc.turned.client.render.player.PlayerDarkLatexFoxRenderer;
import com.changedmc.turned.transfur.ITransfurType;
import com.changedmc.turned.util.Utility;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class DarkLatexFoxTransfur implements ITransfurType {
    @Override
    public void render(RenderPlayerEvent.Pre event) {
        PlayerDarkLatexFoxRenderer playerDarkLatexFoxRenderer = new PlayerDarkLatexFoxRenderer(Utility.getEntityRendererContext());
        playerDarkLatexFoxRenderer.render(event.getPlayer(), 1, event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
    }

    @Override
    public void renderHand(RenderHandEvent event) {

    }
}
