package io.github.changedmc.turned.reference;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public enum TurnedArmor implements ArmorMaterial {

    LATEX_ARMOR(100, 1, 1, null, null, null, 1, 0);

    private final int durabilityForSlot;
    private final int defenseForSlot;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final Ingredient repairIngredient;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

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
    public int getDurabilityForSlot(@Nonnull EquipmentSlot p_40410_) {
        return this.durabilityForSlot;
    }

    @Override
    public int getDefenseForSlot(@Nonnull EquipmentSlot p_40411_) {
        return this.defenseForSlot;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Nonnull
    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Nonnull
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
