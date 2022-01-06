package com.github.turned.Turned.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class HarmlessDarkLatexBlock extends Block {
    public HarmlessDarkLatexBlock() {
        super(Block.Properties.of(Material.STONE)
                .sound(SoundType.SLIME_BLOCK)
                .strength(0.75f, 5f)
                .lightLevel(s -> 0)
                .friction(0.8f)
                .speedFactor(0.5f)
                .jumpFactor(0.5f));
    }
}
