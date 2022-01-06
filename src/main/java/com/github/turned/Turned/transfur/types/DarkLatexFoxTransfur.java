package com.github.turned.Turned.transfur.types;

import com.github.turned.Turned.client.model.latex.DarkLatexFoxModel;
import com.github.turned.Turned.client.render.entity.HumanoidPlayerRenderer;
import com.github.turned.Turned.reference.Reference;
import com.github.turned.Turned.transfur.ITransfurType;
import com.github.turned.Turned.util.Utility;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import javax.annotation.Nonnull;

public class DarkLatexFoxTransfur implements ITransfurType {

    public HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> createRenderer() {
        EntityRendererProvider.Context entityRendererContext = Utility.getEntityRendererContext();
        return new HumanoidPlayerRenderer<>(Utility.getEntityRendererContext(), new DarkLatexFoxModel<>(entityRendererContext.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION))) {
            @Nonnull
            @Override
            public ResourceLocation getTextureLocation(@Nonnull Player player) {
                return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
            }
        };
    }

    @Override
    public void render(RenderPlayerEvent.Pre event) {
        HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> humanoidPlayerRenderer = createRenderer();
        humanoidPlayerRenderer.render(event.getPlayer(), event.getEntity().getViewYRot(event.getPartialTick()), event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
    }

    @Override
    public void renderArm(RenderArmEvent event) {
        HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> humanoidPlayerRenderer = createRenderer();
        humanoidPlayerRenderer.renderHand(event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight(), event.getPlayer(), event.getArm());
    }
}
