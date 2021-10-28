package com.changedmc.turned.client.render.latex;

import com.changedmc.turned.client.model.latex.DarkLatexSnowLeopardModel;
import com.changedmc.turned.entity.latex.DarkLatexSnowLeopardEntity;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class DarkLatexSnowLeopardRenderer extends MobRenderer<DarkLatexSnowLeopardEntity, DarkLatexSnowLeopardModel<DarkLatexSnowLeopardEntity>> {
    public DarkLatexSnowLeopardRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new DarkLatexSnowLeopardModel<>(), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexSnowLeopardEntity darkLatexSnowLeopardEntity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_snow_leopard.png");
    }
}
