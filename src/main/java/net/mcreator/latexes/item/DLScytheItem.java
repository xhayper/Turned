
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@LatexModElements.ModElement.Tag
public class DLScytheItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:dl_scythe")
	public static final Item block = null;
	public DLScytheItem(LatexModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					DLSwordLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("dl_scythe"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(LatexitemsItemGroup.tab).maxDamage(225));
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 5f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3.4, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return 2 >= state.getHarvestLevel();
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			return 5.5f;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(1, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 25;
		}
	}
}
