package com.changedmc.turned.client.render.entity.latex;

import com.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import com.changedmc.turned.entity.latex.DarkLatexFox;
import com.changedmc.turned.reference.Reference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

public class DarkLatexFoxRenderer extends MobRenderer<DarkLatexFox, DarkLatexFoxModel<DarkLatexFox>> {
    public DarkLatexFoxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexFoxModel<>(entityRendererProvider.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexFox darkLatexFox) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
    }
}
