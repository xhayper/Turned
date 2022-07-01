package io.github.changedmc.turned.client.render.entity.npc;

import io.github.changedmc.turned.entity.npc.Scientist;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

public class ScientistRenderer extends HumanoidMobRenderer<Scientist, HumanoidModel<Scientist>> {
    public ScientistRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new HumanoidModel<>(entityRendererProvider.bakeLayer(ModelLayers.PLAYER)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull Scientist scientist) {
        return new ResourceLocation(TurnedReference.MOD_ID, scientist.isEvil() ? "textures/entity/evil_scientist.png" : "textures/entity/scientist.png");
    }
}
