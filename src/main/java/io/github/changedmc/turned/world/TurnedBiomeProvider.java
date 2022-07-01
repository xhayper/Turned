package io.github.changedmc.turned.world;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.SurfaceRules;
import terrablender.api.BiomeProvider;
import terrablender.api.ParameterUtils;
import terrablender.worldgen.TBClimate;

import java.util.Optional;
import java.util.function.Consumer;

public class TurnedBiomeProvider extends BiomeProvider {
    public TurnedBiomeProvider(ResourceLocation name, int overworldWeight) {
        super(name, overworldWeight);
    }

    @Override
    public void addOverworldBiomes(Registry<Biome> registry, Consumer<Pair<TBClimate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addBiome(mapper,
                ParameterUtils.Temperature.HOT.parameter(),
                ParameterUtils.Humidity.HUMID.parameter(),
                ParameterUtils.Continentalness.NEAR_INLAND.parameter(),
                ParameterUtils.Erosion.EROSION_1.parameter(),
                ParameterUtils.Weirdness.MID_SLICE_NORMAL_ASCENDING.parameter(),
                Climate.Parameter.point(.0f),
                0f,
                TurnedBiomes.DARK_LATEX);
    }

    @Override
    public Optional<SurfaceRules.RuleSource> getOverworldSurfaceRules() {
        return Optional.of(TurnedSurfaceRulesData.makeRules());
    }
}
