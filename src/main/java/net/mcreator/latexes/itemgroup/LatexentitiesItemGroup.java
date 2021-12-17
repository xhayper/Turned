
package net.mcreator.latexes.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class LatexentitiesItemGroup extends LatexModElements.ModElement {
	public LatexentitiesItemGroup(LatexModElements instance) {
		super(instance, 448);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablatexentities") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DarklatexgooItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
