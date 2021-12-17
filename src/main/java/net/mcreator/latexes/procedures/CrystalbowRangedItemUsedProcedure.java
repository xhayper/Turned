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

public class CrystalbowRangedItemUsedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure CrystalbowRangedItemUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LatexMod.LOGGER.warn("Failed to load dependency itemstack for procedure CrystalbowRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 25);
		if ((((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
				: ItemStack.EMPTY).getItem() == DarkLatexQuiverItem.body)
				&& ((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(CrystalarrowItem.block))
						: false)) != (true))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 25);
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(CrystalbowItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(CrystalBowUnloadedItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
