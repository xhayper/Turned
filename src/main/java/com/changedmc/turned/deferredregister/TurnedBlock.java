package com.changedmc.turned.deferredregister;

import com.changedmc.turned.block.DarkLatexBlock;
import com.changedmc.turned.block.DarkLatexFluid;
import com.changedmc.turned.block.HarmlessDarkLatexBlock;
import com.changedmc.turned.util.Reference;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedBlock {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<DarkLatexBlock> DARK_LATEX_BLOCK = BLOCKS.register("dark_latex", DarkLatexBlock::new);
    public static final RegistryObject<HarmlessDarkLatexBlock> HARMLESS_DARK_LATEX_BLOCK = BLOCKS.register("harmless_dark_latex", HarmlessDarkLatexBlock::new);
    public static final RegistryObject<LiquidBlock> DARK_LATEX_FLUID = BLOCKS.register("dark_latex_fluid", DarkLatexFluid::new);
}
