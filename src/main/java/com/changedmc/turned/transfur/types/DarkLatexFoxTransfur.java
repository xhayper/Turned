package com.changedmc.turned.transfur.types;

import com.changedmc.turned.client.render.entity.player.PlayerDarkLatexFoxRenderer;
import com.changedmc.turned.transfur.ITransfurType;
import com.changedmc.turned.util.Utility;

import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class DarkLatexFoxTransfur implements ITransfurType {
    @Override
    public void render(RenderPlayerEvent.Pre event) {
        PlayerDarkLatexFoxRenderer playerDarkLatexFoxRenderer = new PlayerDarkLatexFoxRenderer(Utility.getEntityRendererContext());
        playerDarkLatexFoxRenderer.render(event.getPlayer(), event.getEntity().getViewYRot(event.getPartialTick()), event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
    }

    @Override
    public void renderArm(RenderArmEvent event) {
        PlayerDarkLatexFoxRenderer playerDarkLatexFoxRenderer = new PlayerDarkLatexFoxRenderer(Utility.getEntityRendererContext());
        playerDarkLatexFoxRenderer.renderHand(event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight(), event.getPlayer(), event.getArm());
    }
}
