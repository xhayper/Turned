package com.changedmc.turned.client.render;

import com.changedmc.turned.client.model.DarkLatexMaleModel;
import com.changedmc.turned.entity.latex.DarkLatexMaleEntity;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class DarkLatexMaleRenderer extends MobRenderer<DarkLatexMaleEntity, DarkLatexMaleModel<DarkLatexMaleEntity>> {
    public DarkLatexMaleRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new DarkLatexMaleModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexMaleEntity darkLatexMaleEntity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_male.png");
    }
}
