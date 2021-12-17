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
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.world.DarkLatexTransfurGameRule;
import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarkLatexSnakeThisEntityKillsAnotherOneProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarkLatexSnakeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DarkLatexSnakeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarkLatexSnakeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarkLatexSnakeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarkLatexSnakeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarkLatexSnakeThisEntityKillsAnotherOne!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexTransfurGameRule.gamerule)) == (true))) {
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
									: ItemStack.EMPTY).getItem() == HazmatItem.boots))) != (true))
					&& ((entity instanceof PlayerEntity) != (true)))) {
				if ((Math.random() < 0.6)) {
					if (((entity instanceof IronGolemEntity) || (entity instanceof HertxEntity.CustomEntity))) {
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
						} else if (true) {
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
						} else if (true) {
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
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
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
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if (((entity instanceof DarklatexEntity.CustomEntity) != (true))) {
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
							Entity entityToSpawn = new DarkLatexSnakeEntity.CustomEntity(DarkLatexSnakeEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else if (((((entity instanceof EvilSniperEntity.CustomEntity) || (entity instanceof ScientistEntity.CustomEntity))
							|| (entity instanceof EvilScientistEntity.CustomEntity)) == (true))) {
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
						if ((Math.random() < 0.3)) {
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
								Entity entityToSpawn = new DarkLatexFoxScientistEntity.CustomEntity(DarkLatexFoxScientistEntity.entity,
										(World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						}
					}
				} else {
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
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarklatexgooItem.block));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
							if ((Math.random() < 0.2)) {
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.SKELETON_SKULL));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 250);
				}
			}
		}
		return (false);
	}
}
