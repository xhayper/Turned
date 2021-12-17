package net.mcreator.latexes.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.world.DarkLatexCrystalSpawnGameRule;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.block.DarklatexiceBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexcrystaleggUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexcrystaleggUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexcrystaleggUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexcrystaleggUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexcrystaleggUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR))) == (true))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexCrystalSpawnGameRule.gamerule)) == (true))) {
			if ((Math.random() < 0.15)) {
				if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
										.getBlock() == Blocks.VOID_AIR))) == (true))) {
					if ((Math.random() < 0.8)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarklatexslugEntity.CustomEntity(DarklatexslugEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.2)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexSpiderEntity.CustomEntity(DarkLatexSpiderEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexSnakeEntity.CustomEntity(DarkLatexSnakeEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new NoiseStalkerEntity.CustomEntity(NoiseStalkerEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.2)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexFoxEntity.CustomEntity(DarkLatexFoxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DLbeeEntity.CustomEntity(DLbeeEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.WATER)
							|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.WATER))) {
						if ((Math.random() < 0.6)) {
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DlsharkEntity.CustomEntity(DlsharkEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DlmermaidEntity.CustomEntity(DlmermaidEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						}
					} else {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarklatexEntity.CustomEntity(DarklatexEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
}
