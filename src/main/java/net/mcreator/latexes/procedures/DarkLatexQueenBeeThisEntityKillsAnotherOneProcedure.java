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
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.latexes.world.DarkLatexTransfurGameRule;
import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DarkLatexQueenBeeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure DarkLatexQueenBeeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarkLatexQueenBeeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarkLatexQueenBeeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarkLatexQueenBeeThisEntityKillsAnotherOne!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarkLatexQueenBeeThisEntityKillsAnotherOne!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
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
				if ((((entity instanceof PlayerEntity) != (true)) && (Math.random() < 0.3))) {
					if (((entity instanceof IronGolemEntity) || (entity instanceof HertxEntity.CustomEntity))) {
						return (true);
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
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 2, (float) 2);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 2, (float) 2, false);
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 50, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 300, (int) 1, (false), (false)));
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 50, (int) 1, (false), (false)));
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
										SoundCategory.NEUTRAL, (float) 1, (float) 2);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")),
										SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
							}
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
								entityToSpawn.setPickupDelay((int) 5);
								entityToSpawn.setNoDespawn();
								world.addEntity(entityToSpawn);
							}
							if ((Math.random() < 0.7)) {
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
									entityToSpawn.setPickupDelay((int) 5);
									entityToSpawn.setNoDespawn();
									world.addEntity(entityToSpawn);
								}
								if ((Math.random() < 0.3)) {
									if (world instanceof World && !world.isRemote()) {
										ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
										entityToSpawn.setPickupDelay((int) 5);
										entityToSpawn.setNoDespawn();
										world.addEntity(entityToSpawn);
									}
									if ((Math.random() < 0.1)) {
										if (world instanceof World && !world.isRemote()) {
											ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
											entityToSpawn.setPickupDelay((int) 5);
											entityToSpawn.setNoDespawn();
											world.addEntity(entityToSpawn);
										}
									}
								}
							}
							if ((Math.random() < 0.1)) {
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.HONEY_BLOCK));
									entityToSpawn.setPickupDelay((int) 5);
									entityToSpawn.setNoDespawn();
									world.addEntity(entityToSpawn);
								}
							}
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
								entityToSpawn.setPickupDelay((int) 5);
								entityToSpawn.setNoDespawn();
								world.addEntity(entityToSpawn);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 300);
				}
			}
		}
		return (false);
	}
}
