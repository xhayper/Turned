package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.world.DarkLatexesLeaveBlockGameRule;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DlsharkEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DlsharkEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DlsharkEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DlsharkEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DlsharkEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexesLeaveBlockGameRule.gamerule)) == (true))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK) != (true)))) {
			if (((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.WATER)
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BUBBLE_COLUMN)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.WATER)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR))
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR)
							|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.VOID_AIR))) != (true))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = DarklatexcarpetBlock.block.getDefaultState();
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
			} else if ((((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.WATER)
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BUBBLE_COLUMN)
							|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.WATER)))
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR))
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
							|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR)))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = DarklatexcarpetBlock.block.getDefaultState();
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
		}
	}
}
