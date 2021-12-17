
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class LatextuneItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:latextune")
	public static final Item block = null;
	public LatextuneItem(LatexModElements instance) {
		super(instance, 168);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, LatexModElements.sounds.get(new ResourceLocation("latex:latex_tune")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("latextune");
		}
	}
}
