package com.changedmc.turned.deferredregister;

import com.changedmc.turned.blocks.DarkLatexBlock;
import com.changedmc.turned.blocks.HarmlessDarkLatexBlock;
import com.changedmc.turned.util.Reference;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TurnedBlock {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> DARK_LATEX_BLOCK = BLOCKS.register("dark_latex", DarkLatexBlock::new);

    public static final RegistryObject<Block> HARMLESS_DARK_LATEX_BLOCK = BLOCKS.register("harmless_dark_latex", HarmlessDarkLatexBlock::new);
}
