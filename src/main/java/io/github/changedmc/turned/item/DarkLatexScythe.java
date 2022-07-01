package io.github.changedmc.turned.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import io.github.changedmc.turned.reference.TurnedCreativeModeTab;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nonnull;

public class DarkLatexScythe extends LatexUsableItem implements Vanishable {
    public DarkLatexScythe() {
        super(new Item.Properties().tab(TurnedCreativeModeTab.COMBAT).durability(225));
    }

    @Nonnull
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@Nonnull EquipmentSlot equipmentSlot) {
        if (equipmentSlot == EquipmentSlot.MAINHAND) {
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

    public float getDestroySpeed(@Nonnull ItemStack itemstack, @Nonnull BlockState blockstate) {
        return 5.5f;
    }

    public boolean hurtEnemy(ItemStack itemStack, @Nonnull LivingEntity p_43279_, @Nonnull LivingEntity p_43280_) {
        itemStack.hurtAndBreak(1, p_43280_, (p_43296_) -> p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return true;
    }

    public boolean mineBlock(@Nonnull ItemStack itemStack, @Nonnull Level level, @Nonnull BlockState blockState, @Nonnull BlockPos blockPos, @Nonnull LivingEntity livingEntity) {
        return false;
    }

    @Override
    public int getEnchantmentValue() {
        return 25;
    }
}
