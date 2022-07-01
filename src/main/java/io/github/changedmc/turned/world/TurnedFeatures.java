package io.github.changedmc.turned.world;

import io.github.changedmc.turned.deferredregister.TurnedBlock;
import io.github.changedmc.turned.reference.TurnedReference;
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

// https://github.com/TeamLapen/Vampirism/blob/1.18/src/main/java/de/teamlapen/vampirism/world/biome/VampirismBiomeFeatures.java

public class TurnedFeatures {

    public static final ConfiguredFeature<LakeFeature.Configuration, ?> DARK_LATEX_LAKE = FeatureUtils.register(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex_lake").toString(), Feature.LAKE.configured(new LakeFeature.Configuration(BlockStateProvider.simple(TurnedBlock.DARK_LATEX_FLUID.get().defaultBlockState()), BlockStateProvider.simple(TurnedBlock.DARK_LATEX_BLOCK.get()))));

    public static final PlacedFeature DARK_LATEX_LAKE_PLACED = PlacementUtils.register(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex_lake_placed").toString(), DARK_LATEX_LAKE.placed(RarityFilter.onAverageOnceEvery(200), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

    public static void addDefaultCarversWithoutLakes(BiomeGenerationSettings.Builder builder) {
        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE);
        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE_EXTRA_UNDERGROUND);
        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CANYON);
    }

    public static void addModdedWaterLake(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.LAKES, DARK_LATEX_LAKE_PLACED);
    }
}
