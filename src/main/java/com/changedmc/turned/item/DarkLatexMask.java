package com.changedmc.turned.item;

import com.changedmc.turned.reference.TurnedArmor;
import com.changedmc.turned.reference.TurnedCreativeModeTab;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


public class DarkLatexMask extends ArmorItem {
	
	public DarkLatexMask() {
		super(TurnedArmor.LATEX_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS).rarity(Rarity.COMMON).durability(100).defaultDurability(100));
	}
}
