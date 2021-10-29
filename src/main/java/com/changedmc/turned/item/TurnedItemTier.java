package com.changedmc.turned.item;

import com.changedmc.turned.deferredregister.TurnedItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum TurnedItemTier implements IItemTier {
    DARK_LATEX(150, 12f, 5f, 2, 10, null); //(TurnedItem.DARK_LATEX_BLOCK.get())

    ;
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
        return maxUses;
    }

    @Override
    public float getSpeed(){
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

}
