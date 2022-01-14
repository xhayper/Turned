package com.github.turned.Turned.world;

import com.github.turned.Turned.reference.Reference;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class TurnedBiomes {
    public static final ResourceKey<Biome> DARK_LATEX = register("dark_latex");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Reference.MOD_ID, name));
    }
}
