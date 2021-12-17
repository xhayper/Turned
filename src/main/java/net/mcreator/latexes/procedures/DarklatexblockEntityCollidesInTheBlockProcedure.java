package net.mcreator.latexes.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class DarklatexblockEntityCollidesInTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexblockEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof DarklatexEntity.CustomEntity) || (entity instanceof YufengEntity.CustomEntity))
				|| ((entity instanceof NoiseStalkerEntity.CustomEntity) || (entity instanceof SYufengEntity.CustomEntity)))
				|| (((entity instanceof HertxEntity.CustomEntity) || (entity instanceof DlsharkEntity.CustomEntity))
						|| ((((entity instanceof DarkLatexFoxEntity.CustomEntity) || (entity instanceof DarkLatexSkeletonEntity.CustomEntity))
								|| ((entity instanceof DarkLatexDragonEntity.CustomEntity)
										|| (entity instanceof DarkLatexQueenBeeEntity.CustomEntity)))
								|| (entity instanceof DLbeeEntity.CustomEntity)))) != (true))) {
			if ((TargetwearinghazmatProcedure.executeProcedure(ImmutableMap.of("entity", entity)) != (true))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 1, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 60, (int) 1, (false), (false)));
				if ((Math.random() < 0.005)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(DarklatexdarteffectPotionEffect.potion, (int) 50, (int) 1, (false), (false)));
				}
			}
		}
	}
}
