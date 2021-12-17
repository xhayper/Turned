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
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.world.DarkLatexSlugGrowTimeGameRule;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
import net.mcreator.latexes.entity.DarkLatexArcherEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexslugOnInitialEntitySpawnProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexslugOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexslugOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexslugOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexslugOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexslugOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
				if ((entity.isAlive())) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if ((Math.random() < 0.75)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.5)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DlsharkEntity.CustomEntity(DlsharkEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.75)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexFoxEntity.CustomEntity(DarkLatexFoxEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.5)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DLbeeEntity.CustomEntity(DLbeeEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.25)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new NoiseStalkerEntity.CustomEntity(NoiseStalkerEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.25)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexArcherEntity.CustomEntity(DarkLatexArcherEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.25)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexSnakeEntity.CustomEntity(DarkLatexSnakeEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.25)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexSpiderEntity.CustomEntity(DarkLatexSpiderEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexCentaurEntity.CustomEntity(DarkLatexCentaurEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.05)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexMothEntity.CustomEntity(DarkLatexMothEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarklatexEntity.CustomEntity(DarklatexEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) (30 + (world.getWorldInfo().getGameRulesInstance().getInt(DarkLatexSlugGrowTimeGameRule.gamerule))));
	}
}
