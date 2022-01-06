package com.github.turned.Turned.deferredregister;

import com.github.turned.Turned.block.DarkLatexBlock;
import com.github.turned.Turned.block.DarkLatexFluid;
import com.github.turned.Turned.block.HarmlessDarkLatexBlock;
import com.github.turned.Turned.reference.Reference;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<DarkLatexBlock> DARK_LATEX_BLOCK = BLOCKS.register("dark_latex", DarkLatexBlock::new);
    public static final RegistryObject<HarmlessDarkLatexBlock> HARMLESS_DARK_LATEX_BLOCK = BLOCKS.register("harmless_dark_latex", HarmlessDarkLatexBlock::new);
    public static final RegistryObject<LiquidBlock> DARK_LATEX_FLUID = BLOCKS.register("dark_latex_fluid", DarkLatexFluid::new);
}
