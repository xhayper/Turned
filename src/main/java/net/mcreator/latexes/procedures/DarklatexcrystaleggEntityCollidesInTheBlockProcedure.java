package net.mcreator.latexes.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.TSCdroneEntity;
import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
import net.mcreator.latexes.entity.TSCOutsiderEntity;
import net.mcreator.latexes.entity.TSCHunterEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.LatexDropPodEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.AllydroppodEntity;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexcrystaleggEntityCollidesInTheBlockProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexcrystaleggEntityCollidesInTheBlock!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexcrystaleggEntityCollidesInTheBlock!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexcrystaleggEntityCollidesInTheBlock!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexcrystaleggEntityCollidesInTheBlock!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexcrystaleggEntityCollidesInTheBlock!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
			return (true);
		} else {
			if ((((((((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
					: ItemStack.EMPTY).getItem() == HazmatItem.helmet)
					&& (((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
							: ItemStack.EMPTY).getItem() == HazmatItem.body))
					&& ((((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
							: ItemStack.EMPTY).getItem() == HazmatItem.legs)
							&& (((entity instanceof LivingEntity)
									? ((LivingEntity) entity)
											.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
									: ItemStack.EMPTY).getItem() == HazmatItem.boots)))
					|| (((entity instanceof IronGolemEntity) || (entity instanceof HertxEntity.CustomEntity))
							|| (((((entity instanceof TSCdroneEntity.CustomEntity) || (entity instanceof TSCHunterEntity.CustomEntity))
									|| ((entity instanceof TSCOutsiderEntity.CustomEntity)
											|| (entity instanceof TSCOutsiderGunnerEntity.CustomEntity)))
									|| (((entity instanceof NXTHertxEntity.CustomEntity) || (entity instanceof AHVHertxEntity.CustomEntity))
											|| ((entity instanceof BeeHertxEntity.CustomEntity) || (entity instanceof HertxEntity.CustomEntity))))
									|| (((entity instanceof DROPPODEntity.CustomEntity) || (entity instanceof FireballEntity))
											|| ((entity instanceof AllydroppodEntity.CustomEntity)
													|| (entity instanceof LatexDropPodEntity.CustomEntity)))))) != (true))) {
				if (((Math.random() < 0.25) && ((entity instanceof PlayerEntity) != (true)))) {
					if ((entity instanceof DarklatexEntity.CustomEntity)) {
						if ((Math.random() < 0.3)) {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexSkeletonEntity.CustomEntity(DarkLatexSkeletonEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else if ((Math.random() < 0.1)) {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 200, (int) 1, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
						}
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					} else if ((entity instanceof DLbeeEntity.CustomEntity)) {
						if ((Math.random() < 0.3)) {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexQueenBeeEntity.CustomEntity(DarkLatexQueenBeeEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 200, (int) 1, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
						}
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					} else if ((entity instanceof YufengEntity.CustomEntity)) {
						if ((Math.random() < 0.3)) {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new SYufengEntity.CustomEntity(SYufengEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 200, (int) 1, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
						}
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					} else if (((((entity instanceof NoiseStalkerEntity.CustomEntity) || (entity instanceof DarkLatexFoxEntity.CustomEntity))
							|| ((entity instanceof DarkLatexDragonEntity.CustomEntity) || (entity instanceof DarkLatexQueenBeeEntity.CustomEntity)))
							|| (((entity instanceof DarkLatexSkeletonEntity.CustomEntity) || (entity instanceof DlmermaidEntity.CustomEntity))
									|| ((entity instanceof DarkLatexSpiderQueenEntity.CustomEntity)
											|| (entity instanceof DarkLatexMothEntity.CustomEntity))))) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 200, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					} else if ((entity instanceof BeeEntity)) {
						entity.attackEntityFrom(DamageSource.CACTUS, (float) 20);
						if (!entity.world.isRemote())
							entity.remove();
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DLbeeEntity.CustomEntity(DLbeeEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if (((entity instanceof DarkLatexSkeletonEntity.CustomEntity) || (entity instanceof SYufengEntity.CustomEntity))) {
						if ((Math.random() < 0.3)) {
							if (!entity.world.isRemote())
								entity.remove();
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexDragonEntity.CustomEntity(DarkLatexDragonEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 200, (int) 1, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						}
					} else if ((entity.isInWater())) {
						entity.attackEntityFrom(DamageSource.CACTUS, (float) 20);
						if (!entity.world.isRemote())
							entity.remove();
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DlsharkEntity.CustomEntity(DlsharkEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if (((entity instanceof SpiderEntity) || (entity instanceof CaveSpiderEntity))) {
						entity.attackEntityFrom(DamageSource.CACTUS, (float) 20);
						if (!entity.world.isRemote())
							entity.remove();
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexSpiderEntity.CustomEntity(DarkLatexSpiderEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((entity instanceof DarkLatexSpiderEntity.CustomEntity)) {
						if ((Math.random() < 0.3)) {
							if (!entity.world.isRemote())
								entity.remove();
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("entity.zombie_villager.converted")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new DarkLatexSpiderQueenEntity.CustomEntity(DarkLatexSpiderQueenEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 200, (int) 1, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 200, (int) 1, (false), (false)));
							world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						}
					} else {
						entity.attackEntityFrom(DamageSource.CACTUS, (float) 20);
						if (!entity.world.isRemote())
							entity.remove();
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
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
					entity.attackEntityFrom(DamageSource.CACTUS, (float) 5);
				}
			} else {
				return (true);
			}
		}
		return (false);
	}
}
