package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.block.LatexeaterslimeBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class LatexeaterslimeUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure LatexeaterslimeUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure LatexeaterslimeUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure LatexeaterslimeUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure LatexeaterslimeUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:darklatexblocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock()))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
				BlockState _bs = LatexeaterslimeBlock.block.getDefaultState();
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
		} else if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:darklatexblocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()))) {
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
				BlockState _bs = LatexeaterslimeBlock.block.getDefaultState();
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
		} else if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:darklatexblocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
				BlockState _bs = LatexeaterslimeBlock.block.getDefaultState();
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
		} else if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:darklatexblocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				BlockState _bs = LatexeaterslimeBlock.block.getDefaultState();
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
		} else if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:darklatexblocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
				BlockState _bs = LatexeaterslimeBlock.block.getDefaultState();
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
		} else if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:darklatexblocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
				BlockState _bs = LatexeaterslimeBlock.block.getDefaultState();
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
		} else {
			if ((Math.random() < 0.3)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			}
		}
	}
}
