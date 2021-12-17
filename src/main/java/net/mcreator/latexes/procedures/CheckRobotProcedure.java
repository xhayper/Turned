package net.mcreator.latexes.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.latexes.entity.TSCdroneEntity;
import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
import net.mcreator.latexes.entity.TSCOutsiderEntity;
import net.mcreator.latexes.entity.TSCHunterEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class CheckRobotProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure CheckRobot!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((((entity instanceof TSCOutsiderEntity.CustomEntity) || (entity instanceof TSCOutsiderGunnerEntity.CustomEntity))
				|| ((entity instanceof TSCHunterEntity.CustomEntity) || (entity instanceof TSCdroneEntity.CustomEntity))) == (false));
	}
}
