package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.world.DarklatexspreadspeedGameRule;
import net.mcreator.latexes.world.DarkLatexSpreadGameRule;
import net.mcreator.latexes.block.DarklatexpuddleharmlessBlock;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexcarpetUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexcarpetUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexcarpetUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexcarpetUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexcarpetUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexSpreadGameRule.gamerule))
				&& ((Math.random() * 100) <= (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule))))) {
			if (((Math.random() * 100) <= Math
					.ceil((1.5 / (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))))) {
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
						.getBlock() == DarklatexpuddleharmlessBlock.block)
						|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.AIR)
								|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.CAVE_AIR)
										|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
												.getBlock() == Blocks.VOID_AIR))))) {
					if ((Math.random() < 0.8)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
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
				} else {
					if ((Math.random() < 0.1)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = DarklatexpuddleharmlessBlock.block.getDefaultState();
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
			if (((Math.random() * 100) <= Math
					.ceil((1.5 / (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))))) {
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
						.getBlock() == DarklatexpuddleharmlessBlock.block)
						|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.AIR)
								|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.CAVE_AIR)
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
												.getBlock() == Blocks.VOID_AIR))))) {
					if ((Math.random() < 0.8)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
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
				} else {
					if ((Math.random() < 0.1)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = DarklatexpuddleharmlessBlock.block.getDefaultState();
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
			if (((Math.random() * 100) <= Math
					.ceil((1.5 / (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))))) {
				if ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1))))
						.getBlock() == DarklatexpuddleharmlessBlock.block)
						|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.AIR)
								|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR)
										|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1))))
												.getBlock() == Blocks.VOID_AIR))))) {
					if ((Math.random() < 0.8)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
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
				} else {
					if ((Math.random() < 0.1)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = DarklatexpuddleharmlessBlock.block.getDefaultState();
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
			if (((Math.random() * 100) <= Math
					.ceil((1.5 / (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))))) {
				if ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))))
						.getBlock() == DarklatexpuddleharmlessBlock.block)
						|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.AIR)
								|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR)
										|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))))
												.getBlock() == Blocks.VOID_AIR))))) {
					if ((Math.random() < 0.8)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
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
				} else {
					if ((Math.random() < 0.1)) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = DarklatexpuddleharmlessBlock.block.getDefaultState();
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
		} else if ((Math.random() < 0.05)) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
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
