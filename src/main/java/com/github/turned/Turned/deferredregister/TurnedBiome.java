package com.github.turned.Turned.deferredregister;

import com.github.turned.Turned.reference.Reference;
import com.github.turned.Turned.world.biome.DarkLatexBiome;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedBiome {

    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Reference.MOD_ID);

    public static final RegistryObject<Biome> DARK_LATEX= BIOMES.register("dark_latex", DarkLatexBiome::createDarkLatexBiome);

    public static final ResourceKey<Biome> DARK_LATEX_KEY = ResourceKey.create(Registry.BIOME_REGISTRY, DARK_LATEX.getId());

}
