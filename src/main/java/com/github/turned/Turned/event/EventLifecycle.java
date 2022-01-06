package com.github.turned.Turned.event;

import com.github.turned.Turned.Main;
import com.github.turned.Turned.capability.transfur.TransfurCapability;
import com.github.turned.Turned.client.model.armor.DarkLatexDisguiseMask;
import com.github.turned.Turned.client.model.latex.DarkLatexFoxModel;
import com.github.turned.Turned.client.model.latex.DarkLatexModel;
import com.github.turned.Turned.client.model.latex.DarkLatexSnowLeopardModel;
import com.github.turned.Turned.client.render.entity.latex.DarkLatexFoxRenderer;
import com.github.turned.Turned.client.render.entity.latex.DarkLatexRenderer;
import com.github.turned.Turned.client.render.entity.latex.DarkLatexSnowLeopardRenderer;
import com.github.turned.Turned.client.render.entity.npc.ScientistRenderer;
import com.github.turned.Turned.config.TurnedCommonConfig;
import com.github.turned.Turned.deferredregister.TurnedEntityType;
import com.github.turned.Turned.entity.latex.DarkLatex;
import com.github.turned.Turned.entity.latex.DarkLatexFox;
import com.github.turned.Turned.entity.latex.DarkLatexSnowLeopard;
import com.github.turned.Turned.entity.npc.Scientist;
import com.github.turned.Turned.gamerule.TurnedGamerules;
import com.github.turned.Turned.reference.networking.NetworkManager;
import com.github.turned.Turned.transfur.TransfurManager;
import com.github.turned.Turned.reference.Reference;
import com.changedmc.turned.world.TurnedBiomeManager;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

public class EventLifecycle {
//    @SubscribeEvent
//    public static void onBiomeLoading(BiomeLoadingEvent event) {
//        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Running Biome Manager");
//        TurnedBiomeManager.register();
//    }

    @SubscribeEvent
    public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Network Packets");
        NetworkManager.registerPackets();
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Gamerules");
        //noinspection ALL
        new TurnedGamerules();
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Running Biome Manager");
        TurnedBiomeManager.register();
    }

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopard.createAttributes().build());
        event.put(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFox.createAttributes().build());
        event.put(TurnedEntityType.DARK_LATEX.get(), DarkLatex.createAttributes().build());
        event.put(TurnedEntityType.SCIENTIST.get(), Scientist.createAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        TransfurCapability.register(event);
    }

    @SubscribeEvent
    public static void onRegisterLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DarkLatexSnowLeopardModel.LAYER_LOCATION, DarkLatexSnowLeopardModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexFoxModel.LAYER_LOCATION, DarkLatexFoxModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexModel.LAYER_LOCATION, DarkLatexModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexDisguiseMask.LAYER_LOCATION, DarkLatexDisguiseMask::createBodyLayer);
    }

    @SubscribeEvent
    public static void onFMLDedicatedServerSetup(FMLDedicatedServerSetupEvent event) {
        TransfurManager.init(true, false);
    }

    @SubscribeEvent
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopardRenderer::new);
        EntityRenderers.register(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFoxRenderer::new);
        EntityRenderers.register(TurnedEntityType.DARK_LATEX.get(), DarkLatexRenderer::new);
        EntityRenderers.register(TurnedEntityType.SCIENTIST.get(), ScientistRenderer::new);
        TransfurManager.init(false, false);
    }
}
