package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.world.DarkLatexesLeaveBlockGameRule;
import net.mcreator.latexes.block.DarklatexcrystaleggBlock;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class NoiseStalkerEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure NoiseStalkerEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure NoiseStalkerEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure NoiseStalkerEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure NoiseStalkerEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexesLeaveBlockGameRule.gamerule)) == (true))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK) != (true)))) {
			if ((Math.random() < 0.5)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DarklatexcarpetBlock.block.getDefaultState(), 3);
			} else if ((Math.random() < 0.2)) {
				if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
										.getBlock() == Blocks.VOID_AIR))) != (true))) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), DarklatexcrystaleggBlock.block.getDefaultState(), 3);
				}
			}
		}
	}
}
