package net.mcreator.latexes.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DLSwordLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DLSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(DarklatexdarteffectPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}
}
