package io.github.changedmc.turned.world;

import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class TurnedBiomes {
    public static final ResourceKey<Biome> DARK_LATEX = register("dark_latex");

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(TurnedReference.MOD_ID, name));
    }
}
