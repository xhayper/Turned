
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class LatexdartItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:latexdart")
	public static final Item block = null;
	public LatexdartItem(LatexModElements instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(LatexitemsItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON));
			setRegistryName("latexdart");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
