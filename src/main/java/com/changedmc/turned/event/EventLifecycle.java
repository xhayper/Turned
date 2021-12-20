package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.client.model.armor.DarkLatexDisguiseMask;
import com.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import com.changedmc.turned.client.model.latex.DarkLatexModel;
import com.changedmc.turned.client.model.latex.DarkLatexSnowLeopardModel;
import com.changedmc.turned.client.render.entity.latex.DarkLatexFoxRenderer;
import com.changedmc.turned.client.render.entity.latex.DarkLatexRenderer;
import com.changedmc.turned.client.render.entity.latex.DarkLatexSnowLeopardRenderer;
import com.changedmc.turned.client.render.entity.npc.ScientistRenderer;
import com.changedmc.turned.config.TurnedCommonConfig;
import com.changedmc.turned.deferredregister.TurnedEntityType;
import com.changedmc.turned.entity.latex.DarkLatex;
import com.changedmc.turned.entity.latex.DarkLatexFox;
import com.changedmc.turned.entity.latex.DarkLatexSnowLeopard;
import com.changedmc.turned.entity.npc.Scientist;
import com.changedmc.turned.gamerule.TurnedGamerules;
import com.changedmc.turned.reference.networking.NetworkManager;
import com.changedmc.turned.transfur.TransfurManager;
import com.changedmc.turned.reference.Reference;
import com.changedmc.turned.world.TurnedBiomeManager;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

public class EventLifecycle {
    @SubscribeEvent
    public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Registering Network Packets");
        NetworkManager.registerPackets();
        //noinspection ALL
        new TurnedGamerules();
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

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onRegisterLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DarkLatexSnowLeopardModel.LAYER_LOCATION, DarkLatexSnowLeopardModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexFoxModel.LAYER_LOCATION, DarkLatexFoxModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexModel.LAYER_LOCATION, DarkLatexModel::createBodyLayer);
        event.registerLayerDefinition(DarkLatexDisguiseMask.LAYER_LOCATION, DarkLatexDisguiseMask::createBodyLayer);
    }

    @OnlyIn(Dist.DEDICATED_SERVER)
    @SubscribeEvent
    public static void onFMLDedicatedServerSetup(FMLDedicatedServerSetupEvent event) {
        TransfurManager.init(true, false);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopardRenderer::new);
        EntityRenderers.register(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFoxRenderer::new);
        EntityRenderers.register(TurnedEntityType.DARK_LATEX.get(), DarkLatexRenderer::new);
        EntityRenderers.register(TurnedEntityType.SCIENTIST.get(), ScientistRenderer::new);
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) Main.LOGGER.debug("Running Biome Manager");
        TurnedBiomeManager.register();
        TransfurManager.init(false, false);
    }
}
