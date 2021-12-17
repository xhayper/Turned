package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.block.LatexcobwebfixBlock;
import net.mcreator.latexes.block.DarklatexpuddleharmlessBlock;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarkLatexSpiderOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarkLatexSpiderOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarkLatexSpiderOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarkLatexSpiderOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarkLatexSpiderOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarkLatexSpiderOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.VOID_AIR)
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR))
				|| ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == LatexcobwebfixBlock.block)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.COBWEB))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == DarklatexcarpetBlock.block))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == DarklatexpuddleharmlessBlock.block))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR))) != (true))
				|| (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.VOID_AIR)
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR))
						|| ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == LatexcobwebfixBlock.block)
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.COBWEB))
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == DarklatexcarpetBlock.block))
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
										.getBlock() == DarklatexpuddleharmlessBlock.block))
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR))) != (true)))
				|| ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR))
						|| ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == LatexcobwebfixBlock.block)
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.COBWEB))
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == DarklatexcarpetBlock.block))
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
										.getBlock() == DarklatexpuddleharmlessBlock.block))
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR))) != (true))
						|| (((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.CAVE_AIR))
								|| ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == LatexcobwebfixBlock.block)
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.COBWEB))
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
												.getBlock() == DarklatexcarpetBlock.block))
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
												.getBlock() == DarklatexpuddleharmlessBlock.block))
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
												.getBlock() == Blocks.AIR))) != (true))))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 5, (int) 2, (false), (false)));
		}
	}
}
