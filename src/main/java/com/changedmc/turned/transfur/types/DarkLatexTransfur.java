package com.changedmc.turned.transfur.types;

import com.changedmc.turned.client.model.latex.DarkLatexModel;
import com.changedmc.turned.client.render.entity.HumanoidPlayerRenderer;
import com.changedmc.turned.reference.Reference;
import com.changedmc.turned.transfur.ITransfurType;
import com.changedmc.turned.util.Utility;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

import javax.annotation.Nonnull;

public class DarkLatexTransfur implements ITransfurType {
    public HumanoidPlayerRenderer<Player, DarkLatexModel<Player>> createRenderer() {
        EntityRendererProvider.Context entityRendererContext = Utility.getEntityRendererContext();
        return new HumanoidPlayerRenderer<>(Utility.getEntityRendererContext(), new DarkLatexModel<>(entityRendererContext.bakeLayer(DarkLatexModel.LAYER_LOCATION))) {
            @Nonnull
            @Override
            public ResourceLocation getTextureLocation(@Nonnull Player player) {
                return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex.png");
            }
        };
    }

    @Override
    public void render(RenderPlayerEvent.Pre event) {
        HumanoidPlayerRenderer<Player, DarkLatexModel<Player>> humanoidPlayerRenderer = createRenderer();
        humanoidPlayerRenderer.render(event.getPlayer(), event.getEntity().getViewYRot(event.getPartialTick()), event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
    }

    @Override
    public void renderArm(RenderArmEvent event) {
        HumanoidPlayerRenderer<Player, DarkLatexModel<Player>> humanoidPlayerRenderer = createRenderer();
        humanoidPlayerRenderer.renderHand(event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight(), event.getPlayer(), event.getArm());
    }
}
