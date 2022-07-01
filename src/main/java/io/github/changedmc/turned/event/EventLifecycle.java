package io.github.changedmc.turned.event;

import io.github.changedmc.turned.Main;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.client.model.armor.DarkLatexDisguiseMask;
import io.github.changedmc.turned.client.model.latex.DarkLatexFoxModel;
import io.github.changedmc.turned.client.model.latex.DarkLatexModel;
import io.github.changedmc.turned.client.model.latex.DarkLatexSnowLeopardModel;
import io.github.changedmc.turned.client.render.entity.latex.DarkLatexFoxRenderer;
import io.github.changedmc.turned.client.render.entity.latex.DarkLatexRenderer;
import io.github.changedmc.turned.client.render.entity.latex.DarkLatexSnowLeopardRenderer;
import io.github.changedmc.turned.client.render.entity.npc.ScientistRenderer;
import io.github.changedmc.turned.config.TurnedCommonConfig;
import io.github.changedmc.turned.deferredregister.TurnedEntityType;
import io.github.changedmc.turned.entity.latex.DarkLatex;
import io.github.changedmc.turned.entity.latex.DarkLatexFox;
import io.github.changedmc.turned.entity.latex.DarkLatexSnowLeopard;
import io.github.changedmc.turned.entity.npc.Scientist;
import io.github.changedmc.turned.gamerule.TurnedGamerules;
import io.github.changedmc.turned.networking.NetworkManager;
import io.github.changedmc.turned.reference.TurnedReference;
import io.github.changedmc.turned.transfur.TransfurManager;
import io.github.changedmc.turned.world.TurnedBiomeProvider;
import io.github.changedmc.turned.world.TurnedBiomes;
import io.github.changedmc.turned.world.TurnedOverworldBiomes;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;
import terrablender.api.BiomeProviders;

public class EventLifecycle {

    @SubscribeEvent
    public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering Network Packets");
        NetworkManager.registerPackets();
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) Main.LOGGER.debug("Registering Gamerules");
        //noinspection ALL
        new TurnedGamerules();
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD)
            Main.LOGGER.debug("Registering Biome Provider");
        event.enqueueWork(() ->
                BiomeProviders.register(new TurnedBiomeProvider(new ResourceLocation(TurnedReference.MOD_ID, "biome_provider"), 1)));
    }

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), DarkLatexSnowLeopard.createAttributes().build());
        event.put(TurnedEntityType.DARK_LATEX_FOX.get(), DarkLatexFox.createAttributes().build());
        event.put(TurnedEntityType.DARK_LATEX.get(), DarkLatex.createAttributes().build());
        event.put(TurnedEntityType.SCIENTIST.get(), Scientist.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(TurnedOverworldBiomes.darkLatex().setRegistryName(TurnedBiomes.DARK_LATEX.location()));
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
