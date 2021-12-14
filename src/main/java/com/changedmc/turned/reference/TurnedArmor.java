package com.changedmc.turned.reference;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class TurnedArmor implements ArmorMaterial {
	
	private int durabilityForSlot;
	private int defenseForSlot;
	private int enchantmentValue;
	private SoundEvent equipSound;
	private Ingredient repairIngredient;
	private String name;
	private float toughness;
	private float knockbackResistance;
	
	TurnedArmor(int durabilityForSlot, int defenseForSlot, int enchantmentValue, SoundEvent equipSound, Ingredient repairIngredient, String name, float toughness, float knockbackResistance) {
		this.durabilityForSlot = durabilityForSlot;
		this.defenseForSlot = defenseForSlot;
		this.enchantmentValue = enchantmentValue;
		this.equipSound = equipSound;
		this.repairIngredient = repairIngredient;
		this.name = name;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}
	
	
	@Override
	public int getDurabilityForSlot(EquipmentSlot p_40410_) {
		return this.durabilityForSlot;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot p_40411_) {
		return this.defenseForSlot;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
	

	
	
	
	

}
