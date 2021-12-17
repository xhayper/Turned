package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.world.DarkLatexesLeaveBlockGameRule;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexesLeaveBlockGameRule.gamerule)) == (true))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK) != (true)))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR)
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR)))) {
				if ((Math.random() < 0.72)) {
					if (((entity.isBurning()) == (false))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DarklatexcarpetBlock.block.getDefaultState(), 3);
					}
				}
			}
		}
	}
}
