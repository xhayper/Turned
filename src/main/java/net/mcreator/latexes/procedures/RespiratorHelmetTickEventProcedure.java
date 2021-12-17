package net.mcreator.latexes.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class RespiratorHelmetTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure RespiratorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
