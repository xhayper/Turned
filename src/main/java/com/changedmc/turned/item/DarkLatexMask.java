package com.changedmc.turned.item;

import java.util.function.Consumer;

import com.changedmc.turned.client.model.armor.DarkLatexDisguiseMask;
import com.changedmc.turned.event.EventLifecycle;
import com.changedmc.turned.reference.TurnedArmor;
import com.changedmc.turned.reference.TurnedCreativeModeTab;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.IItemRenderProperties;


public class DarkLatexMask extends ArmorItem 
{
	
	public DarkLatexMask() {
		super(TurnedArmor.LATEX_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS).rarity(Rarity.COMMON).durability(100).defaultDurability(100));
	}
	/*
	@OnlyIn(Dist.CLIENT)
	public void initializeClient(Consumer<IItemRenderProperties> consumer) {
		consumer.accept(new IItemRenderProperties() {
			public <A extends HumanoidModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default) 
			{
				return;
			}
			
		}
		);
	}
	*/
	//I'll do this later, maybe
}
