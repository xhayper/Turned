package net.mcreator.latexes.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.RifleAmmoItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class AssaultRifleCanUseRangedItemProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure AssaultRifleCanUseRangedItem!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == RifleAmmoItem.block)) {
			return (true);
		}
		return (false);
	}
}
