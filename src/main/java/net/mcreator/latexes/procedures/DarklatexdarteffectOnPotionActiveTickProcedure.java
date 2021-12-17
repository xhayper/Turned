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
import net.minecraft.util.DamageSource;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.TSCdroneEntity;
import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
import net.mcreator.latexes.entity.TSCOutsiderEntity;
import net.mcreator.latexes.entity.TSCHunterEntity;
import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSnepEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexArcherEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexdarteffectOnPotionActiveTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexdarteffectOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexdarteffectOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
				entity.attackEntityFrom(DamageSource.WITHER, (float) 3);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 15);
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) <= 1)) {
			if (((((entity instanceof IronGolemEntity) || (entity instanceof SnowGolemEntity))
					|| (((((entity instanceof DarkLatexDragonEntity.CustomEntity) || (entity instanceof DarkLatexFoxSniperEntity.CustomEntity))
							|| ((entity instanceof DarkLatexSnakeEntity.CustomEntity) || (entity instanceof DarklatexEntity.CustomEntity)))
							|| (((entity instanceof HertxEntity.CustomEntity) || (entity instanceof DlsharkEntity.CustomEntity))
									|| ((entity instanceof DlmermaidEntity.CustomEntity) || (entity instanceof DarkLatexFoxEntity.CustomEntity))))
							|| ((((entity instanceof YufengEntity.CustomEntity) || (entity instanceof NoiseStalkerEntity.CustomEntity))
									|| ((entity instanceof DarkLatexArcherEntity.CustomEntity) || (entity instanceof SYufengEntity.CustomEntity)))
									|| ((((entity instanceof DarkLatexSkeletonEntity.CustomEntity) || (entity instanceof DLbeeEntity.CustomEntity))
											|| ((entity instanceof SlimelingEntity.CustomEntity)
													|| (entity instanceof DarkLatexQueenBeeEntity.CustomEntity)))
											|| ((((entity instanceof DarkLatexFoxScientistEntity.CustomEntity)
													|| (entity instanceof DarkLatexSnepEntity.CustomEntity))
													|| ((entity instanceof DarkLatexSpiderEntity.CustomEntity)
															|| (entity instanceof DarkLatexSpiderQueenEntity.CustomEntity)))
													|| ((((entity instanceof BeeHertxEntity.CustomEntity)
															|| (entity instanceof AHVHertxEntity.CustomEntity))
															|| ((entity instanceof NXTHertxEntity.CustomEntity)
																	|| (entity instanceof DarklatexslugEntity.CustomEntity)))
															|| (((entity instanceof TSCOutsiderEntity.CustomEntity)
																	|| (entity instanceof TSCOutsiderGunnerEntity.CustomEntity))
																	|| (((entity instanceof TSCdroneEntity.CustomEntity)
																			|| (entity instanceof TSCHunterEntity.CustomEntity))
																			|| (entity instanceof DarkLatexMothEntity.CustomEntity))))))))) != (true))) {
				if (((entity instanceof PlayerEntity) != (true))) {
					if ((entity.isInWaterOrBubbleColumn())) {
						if ((Math.random() < 0.6)) {
							if (!entity.world.isRemote())
								entity.remove();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						} else {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DlmermaidEntity.CustomEntity(DlmermaidEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						}
					} else if ((entity instanceof SkeletonEntity)) {
						if ((Math.random() < 0.6)) {
							if (!entity.world.isRemote())
								entity.remove();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						} else {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexSkeletonEntity.CustomEntity(DarkLatexSkeletonEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						}
					} else {
						if ((Math.random() < 0.075)) {
							if (!entity.world.isRemote())
								entity.remove();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						} else if ((Math.random() < 0.075)) {
							if (!entity.world.isRemote())
								entity.remove();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						} else if ((Math.random() < 0.025)) {
							if (!entity.world.isRemote())
								entity.remove();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						} else if ((entity instanceof DarklatexEntity.CustomEntity)) {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexSkeletonEntity.CustomEntity(DarkLatexSkeletonEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						} else {
							if (!entity.world.isRemote())
								entity.remove();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null,
										new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						}
					}
				}
			}
		}
	}
}
