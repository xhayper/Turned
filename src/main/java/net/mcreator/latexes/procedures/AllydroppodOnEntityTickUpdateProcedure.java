package net.mcreator.latexes.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.HertxvarSolEntity;
import net.mcreator.latexes.entity.HertxvarFEntity;
import net.mcreator.latexes.entity.HertxvarFBEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.AshburyHertxEntity;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.block.SupplyCrateBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class AllydroppodOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure AllydroppodOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure AllydroppodOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure AllydroppodOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure AllydroppodOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure AllydroppodOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)))
				|| (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
						|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR)
								|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)))
						|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.CAVE_AIR)
								|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.VOID_AIR)
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR))))
						|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.CAVE_AIR)
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.VOID_AIR)
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR)))
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.CAVE_AIR)
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.VOID_AIR)
												|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
														.getBlock() == Blocks.AIR)))))) != (true))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.SPLASH, x, y, z, (int) 5, 3, 3, 3, 1);
			}
			if ((Math.random() < 0.7)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SupplyCrateBlock.block.getDefaultState(), 3);
			} else {
				if ((Math.random() < 0.2)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new IronGolemEntity(EntityType.IRON_GOLEM, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if ((Math.random() < 0.2)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new MilitaryEntity.CustomEntity(MilitaryEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if ((Math.random() < 0.2)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new MilitaryEntity.CustomEntity(MilitaryEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ScientistEntity.CustomEntity(ScientistEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ScientistEntity.CustomEntity(ScientistEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if ((Math.random() < 0.2)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ScientistEntity.CustomEntity(ScientistEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ScientistEntity.CustomEntity(ScientistEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new AHVHertxEntity.CustomEntity(AHVHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new NXTHertxEntity.CustomEntity(NXTHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new AshburyHertxEntity.CustomEntity(AshburyHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.075)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new BeeHertxEntity.CustomEntity(BeeHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxvarFEntity.CustomEntity(HertxvarFEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxvarFBEntity.CustomEntity(HertxvarFBEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxvarSolEntity.CustomEntity(HertxvarSolEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxEntity.CustomEntity(HertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				} else if ((Math.random() < 0.2)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new VillagerEntity(EntityType.VILLAGER, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ScientistEntity.CustomEntity(ScientistEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ScientistEntity.CustomEntity(ScientistEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else {
					if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new AHVHertxEntity.CustomEntity(AHVHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new NXTHertxEntity.CustomEntity(NXTHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new AshburyHertxEntity.CustomEntity(AshburyHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.075)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new BeeHertxEntity.CustomEntity(BeeHertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxvarFEntity.CustomEntity(HertxvarFEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxvarFBEntity.CustomEntity(HertxvarFBEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxvarSolEntity.CustomEntity(HertxvarSolEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new HertxEntity.CustomEntity(HertxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
