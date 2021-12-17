
package net.mcreator.latexes.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.latexes.item.DLAxeItem;
import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class LatexitemsItemGroup extends LatexModElements.ModElement {
	public LatexitemsItemGroup(LatexModElements instance) {
		super(instance, 447);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablatexitems") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DLAxeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
