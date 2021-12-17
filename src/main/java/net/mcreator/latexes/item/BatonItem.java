
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class BatonItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:baton")
	public static final Item block = null;
	public BatonItem(LatexModElements instance) {
		super(instance, 478);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 120;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 2.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BatonItem.block), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET));
			}
		}, 3, -3f, new Item.Properties().group(null)) {
		}.setRegistryName("baton"));
	}
}
