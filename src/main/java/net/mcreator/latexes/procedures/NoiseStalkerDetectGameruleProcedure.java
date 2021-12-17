package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.latexes.world.DarkLatexBreakBlocksGameRule;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class NoiseStalkerDetectGameruleProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure NoiseStalkerDetectGamerule!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		return (world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexBreakBlocksGameRule.gamerule));
	}
}