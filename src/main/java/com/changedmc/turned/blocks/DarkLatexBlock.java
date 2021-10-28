package com.changedmc.turned.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DarkLatexBlock extends Block {
    public DarkLatexBlock() {
        super(Block.Properties.of(Material.CLAY)
                .sound(SoundType.SLIME_BLOCK)
                .strength(0.75f, 5f)
                .lightLevel(s -> 0).harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
                .friction(0.4500000000000001f)
                .speedFactor(0.5f)
                .jumpFactor(0.7000000000000001f));
    }
}
