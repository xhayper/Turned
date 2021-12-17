package net.mcreator.latexes.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.DLSwordItem;
import net.mcreator.latexes.item.DLScytheItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexOnInitialEntitySpawnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 0.05)) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(DLSwordItem.block);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		} else if ((Math.random() < 0.05)) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(DLScytheItem.block);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
