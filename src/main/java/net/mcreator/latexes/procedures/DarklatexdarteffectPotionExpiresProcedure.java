package net.mcreator.latexes.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexdarteffectPotionExpiresProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexdarteffectPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(DarklatexdarteffectPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.SLOWNESS);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.MINING_FATIGUE);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.WEAKNESS);
		}
	}
}
