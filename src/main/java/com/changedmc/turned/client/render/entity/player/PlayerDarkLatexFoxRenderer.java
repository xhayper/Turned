package com.changedmc.turned.client.render.entity.player;

import com.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import com.changedmc.turned.reference.Reference;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nonnull;

public class PlayerDarkLatexFoxRenderer extends HumanoidPlayerRenderer<Player, DarkLatexFoxModel<Player>> {
    public PlayerDarkLatexFoxRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new DarkLatexFoxModel<>(entityRendererProvider.bakeLayer(DarkLatexFoxModel.LAYER_LOCATION)));
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull Player player) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
    }
}
