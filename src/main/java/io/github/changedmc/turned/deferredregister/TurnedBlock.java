package io.github.changedmc.turned.deferredregister;

import io.github.changedmc.turned.block.DarkLatexBlock;
import io.github.changedmc.turned.block.DarkLatexFluid;
import io.github.changedmc.turned.block.HarmlessDarkLatexBlock;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TurnedReference.MOD_ID);

    public static final RegistryObject<DarkLatexBlock> DARK_LATEX_BLOCK = BLOCKS.register("dark_latex", DarkLatexBlock::new);
    public static final RegistryObject<HarmlessDarkLatexBlock> HARMLESS_DARK_LATEX_BLOCK = BLOCKS.register("harmless_dark_latex", HarmlessDarkLatexBlock::new);
    public static final RegistryObject<LiquidBlock> DARK_LATEX_FLUID = BLOCKS.register("dark_latex_fluid", DarkLatexFluid::new);
}
