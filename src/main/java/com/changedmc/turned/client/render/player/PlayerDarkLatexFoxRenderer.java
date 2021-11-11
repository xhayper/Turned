package com.changedmc.turned.client.render.player;

import com.changedmc.turned.client.model.player.PlayerDarkLatexFoxModel;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

/**
 * @deprecated
 * This is the worst way to do it
 */
public class PlayerDarkLatexFoxRenderer<T extends AbstractClientPlayerEntity> extends LivingRenderer<T, PlayerDarkLatexFoxModel<T>> {
    public PlayerDarkLatexFoxRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new PlayerDarkLatexFoxModel<>(), 0.7f);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(@Nonnull AbstractClientPlayerEntity abstractClientPlayerEntity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/dark_latex_fox.png");
    }
}
