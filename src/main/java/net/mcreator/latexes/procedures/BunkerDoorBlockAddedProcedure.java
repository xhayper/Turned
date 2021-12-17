package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.block.BunkerDoorBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class BunkerDoorBlockAddedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure BunkerDoorBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure BunkerDoorBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure BunkerDoorBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure BunkerDoorBlockAdded!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BunkerDoorBlock.block)
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BARRIER))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
										.getBlock() == Blocks.CAVE_AIR)))) != (true))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
				BlockState _bs = BunkerDoorBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
		if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR)
				|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR)))
				|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
										.getBlock() == Blocks.CAVE_AIR)))) != (true))) {
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
				if (_property != null) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, Direction.WEST), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.WEST.getAxis()),
							3);
				}
			} catch (Exception e) {
			}
		}
	}
}
