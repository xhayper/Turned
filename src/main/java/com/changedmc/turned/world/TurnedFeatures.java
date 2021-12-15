package com.changedmc.turned.world;

import com.changedmc.turned.deferredregister.TurnedBlock;
import com.changedmc.turned.reference.Reference;
import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class TurnedFeatures {

    public static final ConfiguredFeature<LakeFeature.Configuration, ?> DARK_LATEX_LAKE = FeatureUtils.register(new ResourceLocation(Reference.MOD_ID, "latex_lake_placed").toString(), Feature.LAKE.configured(new LakeFeature.Configuration(BlockStateProvider.simple(TurnedBlock.DARK_LATEX_FLUID.get().defaultBlockState()), BlockStateProvider.simple(TurnedBlock.DARK_LATEX_BLOCK.get()))));

    public static final PlacedFeature DARK_LATEX_LAKE_PLACED = PlacementUtils.register(new ResourceLocation(Reference.MOD_ID, "dark_latex_lake_placed").toString(), DARK_LATEX_LAKE.placed(RarityFilter.onAverageOnceEvery(200), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

    public static void addDefaultCarversWithoutLakes(BiomeGenerationSettings.Builder builder) {
        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE);
        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE_EXTRA_UNDERGROUND);
        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CANYON);
    }
}
