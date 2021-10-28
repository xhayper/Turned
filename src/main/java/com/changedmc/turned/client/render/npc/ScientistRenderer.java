package com.changedmc.turned.client.render.npc;

import com.changedmc.turned.entity.npc.ScientistEntity;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class ScientistRenderer extends BipedRenderer<ScientistEntity, BipedModel<ScientistEntity>> {
    public ScientistRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new BipedModel(0), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull ScientistEntity scientistEntity) {
        return new ResourceLocation(Reference.MOD_ID, scientistEntity.isEvil() ? "textures/entity/evil_scientist.png" : "textures/entity/scientist.png");
    }
}
