package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class CheckbordersharkProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure Checkbordershark!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure Checkbordershark!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure Checkbordershark!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure Checkbordershark!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return (((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.WATER)
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.WATER))
				|| ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BUBBLE_COLUMN)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR))
						|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR))))
				&& ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.WATER)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.WATER))
						|| ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BUBBLE_COLUMN)
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR))
								|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR)))))
				&& (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.WATER)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.WATER))
						|| ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BUBBLE_COLUMN)
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR))
								|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.VOID_AIR)
										|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR))))
						&& ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.WATER)
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.WATER))
								|| ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BUBBLE_COLUMN)
										|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR))
										|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.VOID_AIR)
												|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
														.getBlock() == Blocks.CAVE_AIR)))))) != (true));
	}
}
