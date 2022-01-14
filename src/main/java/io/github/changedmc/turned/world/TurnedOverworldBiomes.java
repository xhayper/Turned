package io.github.changedmc.turned.world;

import io.github.changedmc.turned.deferredregister.TurnedEntityType;
import io.github.changedmc.turned.deferredregister.TurnedSoundEvent;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.sounds.Music;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;

import javax.annotation.Nullable;

public class TurnedOverworldBiomes {
    @Nullable
    private static final Music NORMAL_MUSIC = null;

    protected static int calculateSkyColor(float color)
    {
        float $$1 = color / 3.0F;
        $$1 = Mth.clamp($$1, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static Biome biome(Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, MobSpawnSettings.Builder spawnBuilder, BiomeGenerationSettings.Builder biomeBuilder, @Nullable Music music)
    {
        return biome(precipitation, category, temperature, downfall, (new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(calculateSkyColor(temperature)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).backgroundMusic(music), spawnBuilder, biomeBuilder, music);
    }

    private static Biome biome(Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, BiomeSpecialEffects.Builder biomeSpecialEffectsBuilder, MobSpawnSettings.Builder spawnBuilder, BiomeGenerationSettings.Builder biomeBuilder, @Nullable Music music)
    {
        return (new Biome.BiomeBuilder()).precipitation(precipitation).biomeCategory(category).temperature(temperature).downfall(downfall).specialEffects(biomeSpecialEffectsBuilder.build()).mobSpawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }

    private static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder)
    {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static Biome darkLatex()
    {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.creatureGenerationProbability(.25f);
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(TurnedEntityType.DARK_LATEX_FOX.get(), 10, 1, 6));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD.get(), 10, 1, 6));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addFossilDecoration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
        BiomeDefaultFeatures.addDefaultGrass(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);

        BiomeSpecialEffects.Builder biomeSpecialEffectsBuilder = new BiomeSpecialEffects.Builder();
        biomeSpecialEffectsBuilder.fogColor(-13421773);
        biomeSpecialEffectsBuilder.waterColor(-13421773);
        biomeSpecialEffectsBuilder.waterFogColor(-16777216);
        biomeSpecialEffectsBuilder.skyColor(-13421773);
        biomeSpecialEffectsBuilder.foliageColorOverride(-13421773);
        biomeSpecialEffectsBuilder.grassColorOverride(-13421773);
        return biome(Biome.Precipitation.NONE, Biome.BiomeCategory.PLAINS, .5F, 0.0F, biomeSpecialEffectsBuilder, spawnBuilder, biomeBuilder, new Music(TurnedSoundEvent.CRYSTAL_ZONE.get(), 0, 0, true));
    }
}
