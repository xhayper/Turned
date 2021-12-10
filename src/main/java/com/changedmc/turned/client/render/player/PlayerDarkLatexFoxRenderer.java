package com.changedmc.turned.client.render.player;

import com.changedmc.turned.util.Reference;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

public class PlayerDarkLatexFoxRenderer extends PlayerRenderer {
    public PlayerDarkLatexFoxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, false);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull AbstractClientPlayer abstractClientPlayer) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
    }
}
