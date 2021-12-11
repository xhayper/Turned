package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapabilityProvider;
import com.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import com.changedmc.turned.client.model.latex.DarkLatexSnowLeopardModel;
import com.changedmc.turned.client.render.latex.DarkLatexFoxRenderer;
import com.changedmc.turned.client.render.latex.DarkLatexSnowLeopardRenderer;
import com.changedmc.turned.client.render.npc.ScientistRenderer;
import com.changedmc.turned.config.TurnedCommonConfig;
import com.changedmc.turned.deferredregister.TurnedEntityType;
import com.changedmc.turned.entity.latex.DarkLatexFox;
import com.changedmc.turned.entity.latex.DarkLatexSnowLeopard;
import com.changedmc.turned.entity.npc.Scientist;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class EventLifecycle {
    @SubscribeEvent
    public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Network Packets");
        NetworkManager.registerPackets();
    }

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFox.createAttributes().build());
        event.put(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopard.createAttributes().build());
        event.put(TurnedEntityType.SCIENTIST.get(), Scientist.createAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        TransfurCapability.register(event);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onRegisterLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DarkLatexFoxModel.LAYER_LOCATION, DarkLatexFoxModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexSnowLeopardModel.LAYER_LOCATION, DarkLatexSnowLeopardModel::createBodyLayer);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Dark Latex Fox Entity");
        EntityRenderers.register(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFoxRenderer::new);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering Dark Latex Snow Leopard Entity");
        EntityRenderers.register(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopardRenderer::new);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Scientist Entity");
        EntityRenderers.register(TurnedEntityType.SCIENTIST.get(), ScientistRenderer::new);
    }
}
