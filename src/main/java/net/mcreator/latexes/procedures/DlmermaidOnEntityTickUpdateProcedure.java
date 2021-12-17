package net.mcreator.latexes.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DlmermaidOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DlmermaidOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isInWater())) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, (int) 40, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 20, (int) 1, (false), (false)));
		}
	}
}
