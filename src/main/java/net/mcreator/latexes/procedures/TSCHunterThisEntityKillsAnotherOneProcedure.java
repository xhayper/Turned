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
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.entity.TSCdroneEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.MilitaryflameunitEntity;
import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilMilitaryEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class TSCHunterThisEntityKillsAnotherOneProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure TSCHunterThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TSCHunterThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure TSCHunterThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure TSCHunterThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure TSCHunterThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure TSCHunterThisEntityKillsAnotherOne!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((((entity instanceof MilitaryEntity.CustomEntity) || (entity instanceof ScientistEntity.CustomEntity))
				|| ((entity instanceof MilitaryflameunitEntity.CustomEntity) || (entity instanceof VillagerEntity)))
				|| ((entity instanceof WanderingTraderEntity) || (entity instanceof WitchEntity)))
				|| (((entity instanceof EvilMilitaryEntity.CustomEntity) || (entity instanceof EvilSniperEntity.CustomEntity))
						|| (((entity instanceof EvilScientistEntity.CustomEntity) || (entity instanceof PillagerEntity))
								|| ((entity instanceof VindicatorEntity) || (entity instanceof EvokerEntity))))) == (true))) {
			if ((Math.random() < 0.2)) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null,
							new BlockPos((int) (sourceentity.getPosX()), (int) (sourceentity.getPosY()), (int) (sourceentity.getPosZ())),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound((sourceentity.getPosX()), (sourceentity.getPosY()), (sourceentity.getPosZ()),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, (sourceentity.getPosX()), (sourceentity.getPosY()),
							(sourceentity.getPosZ()), (int) 5, 1, 2, 1, 1);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TSCdroneEntity.CustomEntity(TSCdroneEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((sourceentity.getPosX()), (sourceentity.getPosY()), (sourceentity.getPosZ()), (float) 0,
							(float) 0);
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else if ((Math.random() < 0.35)) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
				}
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 200, (int) 1, (false), (false)));
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 200, (int) 1, (false), (false)));
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
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new TSCdroneEntity.CustomEntity(TSCdroneEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles((sourceentity.getPosX()), (sourceentity.getPosY()), (sourceentity.getPosZ()),
									(float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world)
									.playSound(null, new BlockPos((int) x, (int) y, (int) z),
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("entity.iron_golem.repair")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("entity.iron_golem.repair")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.END_ROD, (sourceentity.getPosX()), (sourceentity.getPosY()),
									(sourceentity.getPosZ()), (int) 5, 1, 2, 1, 1);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 200);
			}
		}
	}
}
