package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class BunkerDoorBlockDestroyedByPlayerProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure BunkerDoorBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure BunkerDoorBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure BunkerDoorBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure BunkerDoorBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BARRIER)
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BARRIER))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
