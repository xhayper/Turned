package com.changedmc.turned.client.render.entity.player;

import com.changedmc.turned.client.model.latex.DarkLatexSnowLeopardModel;
import com.changedmc.turned.reference.Reference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nonnull;

public class PlayerDarkLatexSnowLeopardRenderer extends HumanoidPlayerRenderer<Player, DarkLatexSnowLeopardModel<Player>> {
    public PlayerDarkLatexSnowLeopardRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexSnowLeopardModel<>(entityRendererProvider.bakeLayer(DarkLatexSnowLeopardModel.LAYER_LOCATION)));
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull Player player) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_snow_leopard.png");
    }
}
