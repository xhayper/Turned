package com.changedmc.turned.deferredregister;

import com.changedmc.turned.util.Reference;
import com.changedmc.turned.world.biome.DarkLatexBiome;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TurnedBiome {
    public static final RegistryKey<Biome> DARK_LATEX_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Reference.MOD_ID, "dark_latex"));

    public static DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Reference.MOD_ID);

    public static RegistryObject<Biome> DARK_LATEX = BIOMES.register("dark_latex", () -> DarkLatexBiome.createDarkLatex(0.1f, 0.1f));
}
