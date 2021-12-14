package com.changedmc.turned.event;

import com.changedmc.turned.client.gui.component.LatexIndicator;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventRenderer {

    private static final LatexIndicator latexIndicator = new LatexIndicator();

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Pre event) {
        if (Minecraft.getInstance().player == null) return;
        latexIndicator.render(event.getMatrixStack(), event.getWindow());
    }

}
