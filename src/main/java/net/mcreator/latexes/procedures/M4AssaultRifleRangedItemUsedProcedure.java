package net.mcreator.latexes.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class M4AssaultRifleRangedItemUsedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure M4AssaultRifleRangedItemUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LatexMod.LOGGER.warn("Failed to load dependency itemstack for procedure M4AssaultRifleRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 2.5);
	}
}
