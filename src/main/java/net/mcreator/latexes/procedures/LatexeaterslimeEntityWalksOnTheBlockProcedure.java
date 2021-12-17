package net.mcreator.latexes.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSnepEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexArcherEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class LatexeaterslimeEntityWalksOnTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure LatexeaterslimeEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((((entity instanceof DarklatexEntity.CustomEntity) || (entity instanceof YufengEntity.CustomEntity))
				|| ((entity instanceof NoiseStalkerEntity.CustomEntity) || (entity instanceof DlsharkEntity.CustomEntity)))
				|| (((entity instanceof DarkLatexFoxEntity.CustomEntity) || (entity instanceof DarkLatexDragonEntity.CustomEntity))
						|| ((entity instanceof DarkLatexQueenBeeEntity.CustomEntity) || (entity instanceof DLbeeEntity.CustomEntity))))
				|| (((entity instanceof DarkLatexSkeletonEntity.CustomEntity) || (entity instanceof DlmermaidEntity.CustomEntity))
						|| ((entity instanceof SYufengEntity.CustomEntity) || (entity instanceof HertxEntity.CustomEntity))))
				|| (((((entity instanceof DarkLatexFoxSniperEntity.CustomEntity) || (entity instanceof DarkLatexSnakeEntity.CustomEntity))
						|| ((entity instanceof DarkLatexArcherEntity.CustomEntity) || (entity instanceof DarkLatexFoxScientistEntity.CustomEntity)))
						|| (((entity instanceof DarkLatexSnepEntity.CustomEntity) || (entity instanceof DarkLatexSpiderEntity.CustomEntity))
								|| ((entity instanceof DarkLatexSpiderQueenEntity.CustomEntity)
										|| (entity instanceof DarklatexslugEntity.CustomEntity))))
						|| (((entity instanceof DarkLatexMothEntity.CustomEntity) || (entity instanceof NXTHertxEntity.CustomEntity))
								|| ((entity instanceof AHVHertxEntity.CustomEntity) || (entity instanceof BeeHertxEntity.CustomEntity)))))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 12);
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 1, (false), (false)));
		}
	}
}
