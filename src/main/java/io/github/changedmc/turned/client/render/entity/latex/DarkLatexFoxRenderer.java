package io.github.changedmc.turned.client.render.entity.latex;

import io.github.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import io.github.changedmc.turned.client.render.entity.CustomHumanoidRenderer;
import io.github.changedmc.turned.entity.latex.DarkLatexFox;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;

import javax.annotation.Nonnull;

public class DarkLatexFoxRenderer extends CustomHumanoidRenderer<DarkLatexFox, DarkLatexFoxModel<DarkLatexFox>> {

    public static final ResourceLocation DEFAULT_TEXTURE = new ResourceLocation(TurnedReference.MOD_ID, "textures/entity/dark_latex_fox.png");

    public DarkLatexFoxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexFoxModel<>(entityRendererProvider.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexFox darkLatexFox) {
        EntityType<? extends Mob> entityType = darkLatexFox.getOriginalEntityType();
        if (entityType == null || entityType.getRegistryName() == null) return DEFAULT_TEXTURE;
        return switch (entityType.getRegistryName().toString()) {
            case "turned:scientist" -> new ResourceLocation(TurnedReference.MOD_ID, "textures/entity/dark_latex_fox_scientist.png");
            default -> DEFAULT_TEXTURE;
        };
    }
}
