package net.mcreator.latexes.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.DlmaskItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class TargetwearingmaskProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure Targetwearingmask!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean maskisweared = false;
		return ((((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)
				? ((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
						.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == DlmaskItem.helmet) != (true));
	}
}
