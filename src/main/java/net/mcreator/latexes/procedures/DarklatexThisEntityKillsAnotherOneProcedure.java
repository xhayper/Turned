package net.mcreator.latexes.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.world.DarkLatexTransfurGameRule;
import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
import net.mcreator.latexes.entity.DarkLatexArcherEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexThisEntityKillsAnotherOneProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarklatexThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DarklatexThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexThisEntityKillsAnotherOne!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double entitykills = 0;
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexTransfurGameRule.gamerule)) == (true))) {
			if (((((((entity instanceof LivingEntity)
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
									: ItemStack.EMPTY).getItem() == HazmatItem.boots))) != (true))) {
				if (((entity instanceof IronGolemEntity) || ((entity instanceof PlayerEntity) || (entity instanceof HertxEntity.CustomEntity)))) {
					return (true);
				} else if (((entity instanceof FlyingEntity) == (true))) {
					if ((Math.random() < 0.3)) {
						if (!entity.world.isRemote())
							entity.remove();
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
							Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.3)) {
						if (!entity.world.isRemote())
							entity.remove();
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
							Entity entityToSpawn = new DarkLatexMothEntity.CustomEntity(DarkLatexMothEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.3)) {
						if (!entity.world.isRemote())
							entity.remove();
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
					} else {
						if (!entity.world.isRemote())
							entity.remove();
						if (!sourceentity.world.isRemote())
							sourceentity.remove();
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
							Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity instanceof WaterMobEntity) == (true))) {
					if ((Math.random() < 0.3)) {
						if (!entity.world.isRemote())
							entity.remove();
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
							Entity entityToSpawn = new DlmermaidEntity.CustomEntity(DlmermaidEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (!entity.world.isRemote())
							entity.remove();
						if (!sourceentity.world.isRemote())
							sourceentity.remove();
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
					}
				} else if (((entity instanceof FoxEntity) == (true))) {
					if (!entity.world.isRemote())
						entity.remove();
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
						Entity entityToSpawn = new DarkLatexFoxEntity.CustomEntity(DarkLatexFoxEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if ((((entity instanceof SkeletonEntity) || (entity instanceof WitherSkeletonEntity)) == (true))) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if ((Math.random() < 0.25)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new SYufengEntity.CustomEntity(SYufengEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.5)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexArcherEntity.CustomEntity(DarkLatexArcherEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexSkeletonEntity.CustomEntity(DarkLatexSkeletonEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity instanceof BeeEntity) == (true))) {
					if (!entity.world.isRemote())
						entity.remove();
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
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if (((entity instanceof ScientistEntity.CustomEntity)
						|| ((entity instanceof EvilScientistEntity.CustomEntity) || (entity instanceof EvilSniperEntity.CustomEntity)))) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if ((Math.random() < 0.2)) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexFoxSniperEntity.CustomEntity(DarkLatexFoxSniperEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new DarkLatexFoxScientistEntity.CustomEntity(DarkLatexFoxScientistEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				} else if (((entity instanceof DarklatexEntity.CustomEntity) != (true))) {
					if ((Math.random() < 0.1)) {
						if (!entity.world.isRemote())
							entity.remove();
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
							Entity entityToSpawn = new YufengEntity.CustomEntity(YufengEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if ((Math.random() < 0.2)) {
						if (!entity.world.isRemote())
							entity.remove();
						if (!sourceentity.world.isRemote())
							sourceentity.remove();
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
							Entity entityToSpawn = new DarkLatexCentaurEntity.CustomEntity(DarkLatexCentaurEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (!entity.world.isRemote())
							entity.remove();
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
				}
			} else if ((entity instanceof PlayerEntity)) {
				return (true);
			}
		}
		return (false);
	}
}
