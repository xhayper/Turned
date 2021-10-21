package com.changedmc.turned.util.handlers;

import com.changedmc.turned.client.renderer.entity.RenderDarkLatexM;
import com.changedmc.turned.client.renderer.entity.RenderEyelessWhiteLatex;
import com.changedmc.turned.client.renderer.entity.RenderWhiteKnight;
import com.changedmc.turned.entity.EntityDarkLatexM;
import com.changedmc.turned.entity.EntityEyelessWhiteLatex;
import com.changedmc.turned.entity.EntityWhiteKnight;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityDarkLatexM.class, new IRenderFactory<EntityDarkLatexM>() {
            @Override
            public Render<? super EntityDarkLatexM> createRenderFor(RenderManager renderManager) {
                return new RenderDarkLatexM(renderManager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityEyelessWhiteLatex.class, new IRenderFactory<EntityEyelessWhiteLatex>() {
            @Override
            public Render<? super EntityEyelessWhiteLatex> createRenderFor(RenderManager renderManager) {
                return new RenderEyelessWhiteLatex(renderManager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityWhiteKnight.class, new IRenderFactory<EntityWhiteKnight>() {
            @Override
            public Render<? super EntityWhiteKnight> createRenderFor(RenderManager renderManager) {
                return new RenderWhiteKnight(renderManager);
            }
        });
    }
}