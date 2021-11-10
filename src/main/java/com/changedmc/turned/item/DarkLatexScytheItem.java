package com.changedmc.turned.item;

import com.changedmc.turned.util.TurnedItemGroup;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DarkLatexScytheItem extends Item  {
    public DarkLatexScytheItem() {
        super(new Item.Properties().tab(TurnedItemGroup.COMBAT).durability(225));
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@Nonnull EquipmentSlotType equipmentSlot) {
        if (equipmentSlot == EquipmentSlotType.MAINHAND) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
            builder.put(Attributes.ATTACK_DAMAGE,
                    new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 5f, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED,
                    new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -3.4, AttributeModifier.Operation.ADDITION));
            return builder.build();
        }
        return super.getDefaultAttributeModifiers(equipmentSlot);
    }

    @Override
    public int getHarvestLevel(@Nonnull ItemStack stack, @Nonnull net.minecraftforge.common.ToolType tool, @Nullable PlayerEntity player, @Nullable BlockState blockState) {
        return 2;
    }

    @Override
    public float getDestroySpeed(@Nonnull ItemStack itemstack, @Nonnull BlockState blockstate) {
        return 5.5f;
    }

//    @Override
//    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
//        stack.damageItem(1, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
//        return true;
//    }
//
//    @Override
//    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
//        stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
//        return true;
//    }

    @Override
    public int getEnchantmentValue() {
        return 25;
    }
}
