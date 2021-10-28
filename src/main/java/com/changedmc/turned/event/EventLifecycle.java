package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.client.render.latex.DarkLatexFoxRenderer;
import com.changedmc.turned.client.render.latex.DarkLatexSnowLeopardRenderer;
import com.changedmc.turned.client.render.npc.ScientistRenderer;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.entity.TurnedEntityType;
import com.changedmc.turned.entity.latex.DarkLatexFoxEntity;
import com.changedmc.turned.entity.latex.DarkLatexSnowLeopardEntity;
import com.changedmc.turned.entity.npc.ScientistEntity;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.util.Reference;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class EventLifecycle {
    @SubscribeEvent
    public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Trasnfur Capability");
        TransfurCapability.register();
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Network Packets");
        NetworkManager.registerPackets();
        DeferredWorkQueue.runLater(() -> {
            if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Dark Latex Fox Attribute");
            GlobalEntityTypeAttributes.put(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFoxEntity.createAttributes().build());
            if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Dark Latex Snow Leopard Attribute");
            GlobalEntityTypeAttributes.put(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopardEntity.createAttributes().build());
            if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Scientist Attribute");
            GlobalEntityTypeAttributes.put(TurnedEntityType.SCIENTIST.get(), ScientistEntity.createAttributes().build());
        });
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Dark Latex Fox Entity");
        RenderingRegistry.registerEntityRenderingHandler(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFoxRenderer::new);
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Dark Latex Snow Leopard Entity");
        RenderingRegistry.registerEntityRenderingHandler(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopardRenderer::new);
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Scientist Entity");
        RenderingRegistry.registerEntityRenderingHandler(TurnedEntityType.SCIENTIST.get(), ScientistRenderer::new);
    }
}
