
package net.mcreator.latexes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;

import net.mcreator.latexes.procedures.LatexSoupFoodEatenProcedure;
import net.mcreator.latexes.itemgroup.LatexitemsItemGroup;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class LatexSoupItem extends LatexModElements.ModElement {
	@ObjectHolder("latex:latex_soup")
	public static final Item block = null;
	public LatexSoupItem(LatexModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(LatexitemsItemGroup.tab).maxStackSize(16).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.5f).build()));
			setRegistryName("latex_soup");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 42;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = new ItemStack(Items.BOWL);
			super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				LatexSoupFoodEatenProcedure.executeProcedure($_dependencies);
			}
			if (itemstack.isEmpty()) {
				return retval;
			} else {
				if (entity instanceof PlayerEntity) {
					PlayerEntity player = (PlayerEntity) entity;
					if (!player.isCreative() && !player.inventory.addItemStackToInventory(retval))
						player.dropItem(retval, false);
				}
				return itemstack;
			}
		}
	}
}
