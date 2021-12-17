package net.mcreator.latexes.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class LatexcobwebEntityCollidesInTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure LatexcobwebEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof DarkLatexSpiderEntity.CustomEntity) || (entity instanceof DarkLatexSpiderQueenEntity.CustomEntity))
				|| ((entity instanceof SpiderEntity) || (entity instanceof CaveSpiderEntity))) == (false))) {
			entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
			if ((Math.random() < 0.01)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(DarklatexdarteffectPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
			}
		}
	}
}
