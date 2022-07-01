package io.github.changedmc.turned.client.render.entity.latex;

import io.github.changedmc.turned.client.model.latex.DarkLatexModel;
import io.github.changedmc.turned.client.render.entity.CustomHumanoidRenderer;
import io.github.changedmc.turned.entity.latex.DarkLatex;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

public class DarkLatexRenderer extends CustomHumanoidRenderer<DarkLatex, DarkLatexModel<DarkLatex>> {

    public DarkLatexRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexModel<>(entityRendererProvider.bakeLayer(DarkLatexModel.LAYER_LOCATION)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatex darkLatex) {
        return new ResourceLocation(TurnedReference.MOD_ID, "textures/entity/dark_latex.png");
    }
}
