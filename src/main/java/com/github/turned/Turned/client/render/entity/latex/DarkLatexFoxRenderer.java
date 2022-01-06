package com.github.turned.Turned.client.render.entity.latex;

import com.github.turned.Turned.client.model.latex.DarkLatexFoxModel;
import com.github.turned.Turned.client.render.entity.CustomHumanoidRenderer;
import com.github.turned.Turned.entity.latex.DarkLatexFox;
import com.github.turned.Turned.reference.Reference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;

import javax.annotation.Nonnull;

public class DarkLatexFoxRenderer extends CustomHumanoidRenderer<DarkLatexFox, DarkLatexFoxModel<DarkLatexFox>> {

    public static final ResourceLocation DEFAULT_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");

    public DarkLatexFoxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexFoxModel<>(entityRendererProvider.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull DarkLatexFox darkLatexFox) {
        EntityType<? extends Mob> entityType = darkLatexFox.getOriginalEntityType();
        if (entityType == null || entityType.getRegistryName() == null) return DEFAULT_TEXTURE;
        return switch (entityType.getRegistryName().toString()) {
            case "turned:scientist" -> new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox_scientist.png");
            default -> DEFAULT_TEXTURE;
        };
    }
}
