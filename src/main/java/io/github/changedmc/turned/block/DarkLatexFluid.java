package io.github.changedmc.turned.block;

import io.github.changedmc.turned.deferredregister.TurnedFluid;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class DarkLatexFluid extends LiquidBlock {
    public DarkLatexFluid() {
        super(TurnedFluid.DARK_LATEX, BlockBehaviour.Properties.of(Material.WATER).noCollission().randomTicks().strength(100.0F).noDrops());
    }
}
