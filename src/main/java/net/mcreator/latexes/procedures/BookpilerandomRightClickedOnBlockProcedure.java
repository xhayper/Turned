package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.item.BookpilerandomItem;
import net.mcreator.latexes.block.Bookpile5Block;
import net.mcreator.latexes.block.Bookpile4Block;
import net.mcreator.latexes.block.Bookpile3Block;
import net.mcreator.latexes.block.Bookpile2Block;
import net.mcreator.latexes.block.Bookpile1Block;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class BookpilerandomRightClickedOnBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure BookpilerandomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure BookpilerandomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure BookpilerandomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure BookpilerandomRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure BookpilerandomRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)) {
			if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false) == (false))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BookpilerandomItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
			if ((Math.random() < Math.random())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Bookpile1Block.block.getDefaultState(), 3);
			} else if ((Math.random() < Math.random())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Bookpile2Block.block.getDefaultState(), 3);
			} else if ((Math.random() < Math.random())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Bookpile3Block.block.getDefaultState(), 3);
			} else if ((Math.random() < Math.random())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Bookpile4Block.block.getDefaultState(), 3);
			} else {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Bookpile5Block.block.getDefaultState(), 3);
			}
		}
	}
}
