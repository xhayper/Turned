package net.mcreator.latexes.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.RespiratorItem;
import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class ScientistOnInitialEntitySpawnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure ScientistOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.01)) {
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
		if ((Math.random() < 0.001)) {
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 0, new ItemStack(HazmatItem.helmet));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0),
							new ItemStack(HazmatItem.helmet));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 1, new ItemStack(HazmatItem.body));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1),
							new ItemStack(HazmatItem.body));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(HazmatItem.legs));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
							new ItemStack(HazmatItem.legs));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 3, new ItemStack(HazmatItem.boots));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3),
							new ItemStack(HazmatItem.boots));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		} else if ((Math.random() < 0.001)) {
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 1, new ItemStack(HazmatItem.body));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1),
							new ItemStack(HazmatItem.body));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(HazmatItem.legs));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
							new ItemStack(HazmatItem.legs));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof LivingEntity) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).inventory.armorInventory.set((int) 3, new ItemStack(HazmatItem.boots));
				else
					((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3),
							new ItemStack(HazmatItem.boots));
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
