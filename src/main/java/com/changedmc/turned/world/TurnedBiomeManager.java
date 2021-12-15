package com.changedmc.turned.world;

import com.changedmc.turned.Main;
import com.changedmc.turned.deferredregister.TurnedBiome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class TurnedBiomeManager {

    public static void register() {
        Main.LOGGER.info(TurnedBiome.DARK_LATEX_KEY);
        BiomeManager.addAdditionalOverworldBiomes(TurnedBiome.DARK_LATEX_KEY);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(TurnedBiome.DARK_LATEX_KEY, 1));
        BiomeDictionary.addTypes(TurnedBiome.DARK_LATEX_KEY, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.SPOOKY);
    }

}
