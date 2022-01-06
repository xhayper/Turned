package com.github.turned.Turned.client.render.entity.latex;

import com.github.turned.Turned.client.model.latex.DarkLatexSnowLeopardModel;
import com.github.turned.Turned.client.render.entity.CustomHumanoidRenderer;
import com.github.turned.Turned.entity.latex.DarkLatexSnowLeopard;
import com.github.turned.Turned.reference.Reference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

public class DarkLatexSnowLeopardRenderer extends CustomHumanoidRenderer<DarkLatexSnowLeopard, DarkLatexSnowLeopardModel<DarkLatexSnowLeopard>> {
    public DarkLatexSnowLeopardRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexSnowLeopardModel<>(entityRendererProvider.bakeLayer(DarkLatexSnowLeopardModel.LAYER_LOCATION)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexSnowLeopard darkLatexSnowLeopard) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_snow_leopard.png");
    }
}
