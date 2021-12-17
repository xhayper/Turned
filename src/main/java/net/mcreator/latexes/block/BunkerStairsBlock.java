
package net.mcreator.latexes.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.latexes.itemgroup.LatexItemGroup;
import net.mcreator.latexes.LatexModElements;

import java.util.List;
import java.util.Collections;

@LatexModElements.ModElement.Tag
public class BunkerStairsBlock extends LatexModElements.ModElement {
	@ObjectHolder("latex:bunker_stairs")
	public static final Block block = null;
	public BunkerStairsBlock(LatexModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(LatexItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(5f, 25f).setLightLevel(s -> 0))
					.getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(5f, 25f).setLightLevel(s -> 0));
			setRegistryName("bunker_stairs");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
