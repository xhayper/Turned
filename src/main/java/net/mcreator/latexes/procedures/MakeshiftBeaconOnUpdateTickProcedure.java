package net.mcreator.latexes.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.world.DoEvilsRaidGameRule;
import net.mcreator.latexes.world.BeaconDropMultiplierGameRule;
import net.mcreator.latexes.entity.LatexDropPodEntity;
import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.entity.AllydroppodEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class MakeshiftBeaconOnUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure MakeshiftBeaconOnUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure MakeshiftBeaconOnUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure MakeshiftBeaconOnUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure MakeshiftBeaconOnUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
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
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("entity.experience_orb.pickup")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("entity.experience_orb.pickup")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 35);
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
				if ((Math.random() < (0.0075 * ((world.getWorldInfo().getGameRulesInstance().getInt(BeaconDropMultiplierGameRule.gamerule)) / 10)))) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, x, y, z, (int) 5, 3, 1, 3, 1);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.PORTAL, x, (y + 48), z, (int) 8, 3, 1, 3, 1);
					}
					if ((Math.random() < 0.6)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new AllydroppodEntity.CustomEntity(AllydroppodEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, (y + 48), z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							entityToSpawn.setMotion(0, 0, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.1)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new AllydroppodEntity.CustomEntity(AllydroppodEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x + 6), (y + 48), (z + 6), (float) 0, (float) 0);
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
							Entity entityToSpawn = new AllydroppodEntity.CustomEntity(AllydroppodEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((x - 6), (y + 48), (z - 6), (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							entityToSpawn.setMotion(0, 0, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.5)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new LatexDropPodEntity.CustomEntity(LatexDropPodEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, (y + 48), z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							entityToSpawn.setMotion(0, 0, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DoEvilsRaidGameRule.gamerule))) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DROPPODEntity.CustomEntity(DROPPODEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, (y + 48), z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new LatexDropPodEntity.CustomEntity(LatexDropPodEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, (y + 48), z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								entityToSpawn.setMotion(0, 0, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						}
					}
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 250);
	}
}
