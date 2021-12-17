package net.mcreator.latexes.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexdarteffectOnEffectActiveTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexdarteffectOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 10, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 10, (int) 1, (false), (false)));
	}
}
