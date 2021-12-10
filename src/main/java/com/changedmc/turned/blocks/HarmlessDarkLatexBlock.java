package com.changedmc.turned.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class HarmlessDarkLatexBlock extends Block {
    public HarmlessDarkLatexBlock() {
        super(Block.Properties.of(Material.STONE)
                .sound(SoundType.SLIME_BLOCK)
                .strength(0.75f, 5f)
                .lightLevel(s -> 0)
//                .harvestLevel(0)
//                .harvestTool(ToolType.SHOVEL)
                .friction(0.8f)
                .speedFactor(0.5f)
                .jumpFactor(0.5f));
    }
}
