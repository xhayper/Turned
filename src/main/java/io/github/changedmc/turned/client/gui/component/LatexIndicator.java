package io.github.changedmc.turned.client.gui.component;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameType;

public class LatexIndicator extends GuiComponent {

    public final ResourceLocation LATEX_INDICATOR = new ResourceLocation(TurnedReference.MOD_ID, "textures/gui/hud/latex_indicator.png");

    public final int texSizeX = 32;
    public final int texSizeY = 64;

    public final int[] texYPos = new int[]{0, 64, 128, 192, 256, 320};

    public LatexIndicator() {
        this.setBlitOffset(0);
    }

    public void render(PoseStack poseStack, Window window) {
        if (Minecraft.getInstance().player == null || Minecraft.getInstance().gameMode == null || Minecraft.getInstance().options.hideGui || Minecraft.getInstance().gameMode.getPlayerMode() == GameType.SPECTATOR)
            return;
        ITransfurCapability transfurCapability = Minecraft.getInstance().player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null || (0 >= transfurCapability.getLatexLevel() && !transfurCapability.isTransfured()))
            return;
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, LATEX_INDICATOR);
        int texYPosition = transfurCapability.getLatexLevel() == 0 ? 0 : Math.max(Math.min(Math.round((transfurCapability.getLatexLevel() / (100f / texYPos.length)) - 1), texYPos.length - 1), 0);
        blit(
                poseStack, // MatrixStack / PoseStack
                (window.getGuiScaledWidth() / 2) - (Minecraft.getInstance().player.getOffhandItem().is(Items.AIR) ? 106 : 135), // x
                window.getGuiScaledHeight() - 24, // y
                12, // width
                24, // height
                0,  // uOffset
                transfurCapability.isTransfured() ? 384 : texYPos[texYPosition], // vOffset
                texSizeX, // uWidth
                texSizeY, // vHeight
                texSizeX, // textureWidth
                448 // textureHeight
        );
    }

}
