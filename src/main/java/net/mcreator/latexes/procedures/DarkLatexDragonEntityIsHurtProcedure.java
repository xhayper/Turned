package net.mcreator.latexes.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.block.DarklatexcrystaleggBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarkLatexDragonEntityIsHurtProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarkLatexDragonEntityIsHurt!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarkLatexDragonEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarkLatexDragonEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarkLatexDragonEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarkLatexDragonEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.1)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), (int) 5,
						3, 3, 3, 1);
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
							DarklatexcrystaleggBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 1), (int) (entity.getPosZ())),
							DarklatexblockcrystalgrowBlock.block.getDefaultState(), 3);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 60);
		}
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getHealth()
				: -1) <= (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 2))) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if ((Math.random() < 0.0001)) {
						if ((Math.random() < 0.8)) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarklatexEntity.CustomEntity(DarklatexEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ITEM_SLIME, x, y, z, (int) 3, 3, 3, 3, 1);
							}
						} else if ((Math.random() < 0.3)) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ITEM_SLIME, x, y, z, (int) 3, 3, 3, 3, 1);
							}
						} else if ((Math.random() < 0.1)) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new SYufengEntity.CustomEntity(SYufengEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ITEM_SLIME, x, y, z, (int) 3, 3, 3, 3, 1);
							}
						} else if ((Math.random() < 0.1)) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexSkeletonEntity.CustomEntity(DarkLatexSkeletonEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.ITEM_SLIME, x, y, z, (int) 3, 3, 3, 3, 1);
							}
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 250);
		}
	}
}
