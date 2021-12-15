package com.changedmc.turned.world.biome;

import com.changedmc.turned.deferredregister.TurnedEntityType;
import com.changedmc.turned.world.TurnedFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

// Thank you, https://github.com/TeamLapen/Vampirism/blob/1.18/src/main/java/de/teamlapen/vampirism/world/biome/VampireForestBiome.java
public class DarkLatexBiome {
    public static Biome createDarkLatexBiome() {
        return DarkLatexBiome.createBiomeBuilder(createMobSpawnSettingBuilder(), createBiomeSpecialEffectBuilder()).build();
    }

    public static Biome.BiomeBuilder createBiomeBuilder(MobSpawnSettings.Builder mobSpawnSettingBuilder, BiomeSpecialEffects.Builder specialEffectBuilder) {
        BiomeGenerationSettings.Builder builder = new BiomeGenerationSettings.Builder();
        TurnedFeatures.addDefaultCarversWithoutLakes(builder);
        builder.addFeature(GenerationStep.Decoration.LAKES, TurnedFeatures.DARK_LATEX_LAKE_PLACED);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addForestGrass(builder);
        BiomeDefaultFeatures.addDesertVegetation(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addDefaultSoftDisks(builder);
        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(0.5F).downfall(0F).specialEffects(specialEffectBuilder.build()).mobSpawnSettings(mobSpawnSettingBuilder.build()).generationSettings(builder.build());
    }

    public static MobSpawnSettings.Builder createMobSpawnSettingBuilder() {
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        builder.creatureGenerationProbability(0.25f);
        builder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(TurnedEntityType.DARK_LATEX_FOX.get(), 10, 1, 6));
        builder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), 10, 1, 6));
        return builder;
    }

    public static BiomeSpecialEffects.Builder createBiomeSpecialEffectBuilder() {
        return new BiomeSpecialEffects.Builder().fogColor(-13421773).waterColor(-13421773).waterFogColor(-16777216).skyColor(-13421773).foliageColorOverride(-13421773).grassColorOverride(-13421773);
    }
}