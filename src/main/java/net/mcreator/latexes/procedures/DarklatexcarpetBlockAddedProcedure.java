package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;

import net.mcreator.latexes.block.DarklatexpuddleharmlessBlock;
import net.mcreator.latexes.block.DarklatexiceBlock;
import net.mcreator.latexes.block.DarklatexcrystaleggBlock;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexcarpetBlockAddedProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexcarpetBlockAdded!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexcarpetBlockAdded!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexcarpetBlockAdded!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexcarpetBlockAdded!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:invalidblockbelow").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))
				|| (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexcrystaleggBlock.block)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexiceBlock.block))
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexblockcrystalgrowBlock.block)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexblockBlock.block)))
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexpuddleharmlessBlock.block)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
										.getBlock() == DarklatexcarpetBlock.block))))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			return (true);
		}
		return (false);
	}
}
