package net.mcreator.latexes.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.RespiratorItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class MilitaryOnInitialEntitySpawnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure MilitaryOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.05)) {
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 3, new ItemStack(RespiratorItem.helmet));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3),
							new ItemStack(RespiratorItem.helmet));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
