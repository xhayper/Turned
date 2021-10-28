package com.changedmc.turned.client.render.latex;

import com.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import com.changedmc.turned.entity.latex.DarkLatexFoxEntity;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class DarkLatexFoxRenderer extends MobRenderer<DarkLatexFoxEntity, DarkLatexFoxModel<DarkLatexFoxEntity>> {
    public DarkLatexFoxRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new DarkLatexFoxModel<>(), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexFoxEntity darkLatexFoxEntity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
    }
}
