package net.mcreator.latexes.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.world.DarkLatexesLeaveBlockGameRule;
import net.mcreator.latexes.block.DarklatexhiveBlock;
import net.mcreator.latexes.block.DarklatexcarpetBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarkLatexQueenBeeEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarkLatexQueenBeeEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarkLatexQueenBeeEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarkLatexQueenBeeEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarkLatexQueenBeeEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexesLeaveBlockGameRule.gamerule))) {
			if ((Math.random() < 0.8)) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), DarklatexhiveBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DarklatexblockBlock.block.getDefaultState(), 3);
				if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexesLeaveBlockGameRule.gamerule)) == (true))
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK) != (true)))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DarklatexcarpetBlock.block.getDefaultState(), 3);
				}
			} else {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new BeeEntity(EntityType.BEE, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
