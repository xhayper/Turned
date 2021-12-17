
package net.mcreator.latexes.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.latexes.block.Blacklabblock1aBlock;
import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class LatexItemGroup extends LatexModElements.ModElement {
	public LatexItemGroup(LatexModElements instance) {
		super(instance, 170);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablatex") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blacklabblock1aBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
