package io.github.changedmc.turned.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DarkLatexBlock extends Block {
    public DarkLatexBlock() {
        super(Block.Properties.of(Material.CLAY)
                .sound(SoundType.SLIME_BLOCK)
                .strength(0.75f, 5f)
                .friction(0.4500000000000001f)
                .speedFactor(0.5f)
                .jumpFactor(0.7000000000000001f));
    }
}
