package net.mcreator.latexes.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DartrifleBulletHitsLivingEntityProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DartrifleBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof HertxEntity.CustomEntity) || (entity instanceof DlsharkEntity.CustomEntity))
				|| ((entity instanceof DlmermaidEntity.CustomEntity) || (entity instanceof DarkLatexFoxEntity.CustomEntity)))
				|| ((((entity instanceof YufengEntity.CustomEntity) || (entity instanceof NoiseStalkerEntity.CustomEntity))
						|| ((entity instanceof DarklatexEntity.CustomEntity) || (entity instanceof SYufengEntity.CustomEntity)))
						|| (((entity instanceof DarkLatexSkeletonEntity.CustomEntity) || (entity instanceof DLbeeEntity.CustomEntity))
								|| ((entity instanceof SlimelingEntity.CustomEntity)
										|| (entity instanceof DarkLatexQueenBeeEntity.CustomEntity))))) != (true))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity)
						.addPotionEffect(new EffectInstance(DarklatexdarteffectPotionEffect.potion, (int) 82, (int) 1, (false), (false)));
		}
	}
}
