package io.github.changedmc.turned.client.render.entity.latex;

import io.github.changedmc.turned.client.model.latex.DarkLatexSnowLeopardModel;
import io.github.changedmc.turned.client.render.entity.CustomHumanoidRenderer;
import io.github.changedmc.turned.entity.latex.DarkLatexSnowLeopard;
import io.github.changedmc.turned.reference.TurnedReference;
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
        return new ResourceLocation(TurnedReference.MOD_ID, "textures/entity/dark_latex_snow_leopard.png");
    }
}
