package com.changedmc.turned.world.biome;

import com.changedmc.turned.deferredregister.TurnedBlock;
import com.changedmc.turned.deferredregister.TurnedEntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

// Thank you, https://github.com/TeamLapen/Vampirism/blob/1.16/src/main/java/de/teamlapen/vampirism/world/biome/VampireForestBiome.java
public class DarkLatexBiome {
    public static Biome createDarkLatex(float depth, float scale) {
        return DarkLatexBiome.createBiomeBuilder(depth, scale, createMobInfoBuilder(), createBiomeAmbienceBuilder()).build();
    }

    public static Biome.Builder createBiomeBuilder(float depth, float scale, MobSpawnInfo.Builder spawnBuilder, BiomeAmbience.Builder ambienceBuilder) {
        BiomeGenerationSettings.Builder builder = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get().defaultBlockState(), TurnedBlock.DARK_LATEX_BLOCK.get().defaultBlockState(), TurnedBlock.DARK_LATEX_BLOCK.get().defaultBlockState())));
        builder.addStructureStart(StructureFeatures.MINESHAFT);
        DefaultBiomeFeatures.addDefaultCarvers(builder);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addDesertVegetation(builder);
        DefaultBiomeFeatures.addDefaultUndergroundVariety(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultSoftDisks(builder);
        return new Biome.Builder().precipitation(Biome.RainType.NONE).biomeCategory(Biome.Category.PLAINS).depth(depth).scale(scale).temperature(0.5F).downfall(0F).specialEffects(ambienceBuilder.build()).mobSpawnSettings(spawnBuilder.build()).generationSettings(builder.build());
    }

    public static MobSpawnInfo.Builder createMobInfoBuilder() {
        MobSpawnInfo.Builder builder = new MobSpawnInfo.Builder();
        builder.creatureGenerationProbability(0.25f);
        builder.setPlayerCanSpawn();
        builder.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TurnedEntityType.DARK_LATEX_FOX.get(), 10, 1, 6));
        builder.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), 10, 1, 6));
        return builder;
    }

    public static BiomeAmbience.Builder createBiomeAmbienceBuilder() {
        return new BiomeAmbience.Builder().fogColor(-13421773).waterColor(-13421773).waterFogColor(-16777216).skyColor(-13421773).foliageColorOverride(-13421773).grassColorOverride(-13421773);
    }
}
