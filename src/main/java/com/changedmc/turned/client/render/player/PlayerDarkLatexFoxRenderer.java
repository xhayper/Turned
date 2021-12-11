package com.changedmc.turned.client.render.player;

import com.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nonnull;

public class PlayerDarkLatexFoxRenderer extends LivingEntityRenderer<Player, DarkLatexFoxModel<Player>> {
    public PlayerDarkLatexFoxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexFoxModel<>(entityRendererProvider.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION)), 0.7F);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull Player abstractClientPlayer) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
    }
}
