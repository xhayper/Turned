package com.changedmc.turned.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public enum TurnedItemTier implements Tier {
    DARK_LATEX(150, 12f, 5f, 2, 10, null); //(TurnedItem.DARK_LATEX_BLOCK.get());
    private final  int maxUses;
    private final float speed;
    private final float attackDamage;
    private final int level;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;

    TurnedItemTier(int maxUses, float speed, float attackDamage, int level, int enchantmentValue, Ingredient repairIngredient) {
        this.maxUses = maxUses;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed(){
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Nonnull
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
