
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class ArmageddonItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:armageddon")
	public static final Item block = null;
	public ArmageddonItem(LatexModElements instance) {
		super(instance, 169);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, LatexModElements.sounds.get(new ResourceLocation("latex:armageddon")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("armageddon");
		}
	}
}
