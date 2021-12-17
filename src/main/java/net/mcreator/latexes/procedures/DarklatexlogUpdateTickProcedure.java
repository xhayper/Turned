package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.world.DarklatexspreadspeedGameRule;
import net.mcreator.latexes.block.DarklatexlogBlock;
import net.mcreator.latexes.block.DarklatexleavesBlock;
import net.mcreator.latexes.block.DarklatexhiveBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexlogUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexlogUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexlogUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexlogUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexlogUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((Math.random() * 100) <= (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))) {
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
					BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
					BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.OAK_LEAVES)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
					BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.OAK_LEAVES)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
					BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
			if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LOG)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LOG)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
					BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.BEE_NEST)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
					BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.BEE_NEST)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
					BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.BEE_NEST)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
					BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
			} else if (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.BEE_NEST)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
					BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
			if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.DIRT)
					|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.GRASS_BLOCK))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
					BlockState _bs = DarklatexblockBlock.block.getDefaultState();
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
