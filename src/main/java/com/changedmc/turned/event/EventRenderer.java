package com.changedmc.turned.event;

import com.changedmc.turned.client.gui.component.LatexIndicator;
import com.changedmc.turned.config.TurnedClientConfig;
import com.changedmc.turned.util.Reference;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
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

        ////////////////////////
        if (!TurnedClientConfig.enderDragonBooba.get() || Minecraft.getInstance().options.hideGui) return;
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 0.0F);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, new ResourceLocation(Reference.MOD_ID, "textures/gui/enderdragon_booba.png"));
        GuiComponent.blit(
                event.getMatrixStack(), // MatrixStack / PoseStack
                (event.getWindow().getGuiScaledWidth()/2) - (86/2), // x
                (event.getWindow().getGuiScaledHeight()/2) - (138/2), // y
                85, // width
                137, // height
                0,  // uOffset
                0, // vOffset
                850, // uWidth
                1364, // vHeight
                850, // textureWidth
                1364 // textureHeight
        );
    }

}
