package net.mcreator.latexes.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.DarkLatexQuiverItem;
import net.mcreator.latexes.item.CrystalbowItem;
import net.mcreator.latexes.item.CrystalarrowItem;
import net.mcreator.latexes.item.CrystalBowUnloadedItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class CrystalBowUnloadedRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure CrystalBowUnloadedRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == CrystalarrowItem.block)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(CrystalBowUnloadedItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CrystalbowItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
				: ItemStack.EMPTY).getItem() == DarkLatexQuiverItem.body)
				&& ((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(CrystalarrowItem.block))
						: false))) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(CrystalBowUnloadedItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CrystalbowItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
