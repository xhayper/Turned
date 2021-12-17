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
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.world.DarkLatexTransfurGameRule;
import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class NoiseStalkerThisEntityKillsAnotherOneProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure NoiseStalkerThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure NoiseStalkerThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure NoiseStalkerThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure NoiseStalkerThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure NoiseStalkerThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure NoiseStalkerThisEntityKillsAnotherOne!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == HazmatItem.helmet)
				|| (((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
						: ItemStack.EMPTY).getItem() == HazmatItem.body))
				|| ((((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
						: ItemStack.EMPTY).getItem() == HazmatItem.legs)
						|| (((entity instanceof LivingEntity)
								? ((LivingEntity) entity)
										.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
								: ItemStack.EMPTY).getItem() == HazmatItem.boots))) != (true))) {
			if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexTransfurGameRule.gamerule)) == (true))
					&& (((entity instanceof HertxEntity.CustomEntity) || (entity instanceof IronGolemEntity)) != (true)))) {
				if ((Math.random() < 0.4)) {
					if (((((entity instanceof HertxEntity.CustomEntity)
							|| ((entity instanceof HertxEntity.CustomEntity) || (entity instanceof SlimelingEntity.CustomEntity)))
							|| (((entity instanceof BeeHertxEntity.CustomEntity) || (entity instanceof AHVHertxEntity.CustomEntity))
									|| (entity instanceof PlayerEntity))) != (true))) {
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (!entity.world.isRemote())
							entity.remove();
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new NoiseStalkerEntity.CustomEntity(NoiseStalkerEntity.entity, (World) world);
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
				} else {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 2, (float) 2);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 2, (float) 2, false);
					}
					if (!entity.world.isRemote())
						entity.remove();
					if (sourceentity instanceof LivingEntity)
						((LivingEntity) sourceentity)
								.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1)
										+ (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 2)));
					if ((Math.random() < 0.7)) {
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
											SoundCategory.NEUTRAL, (float) 2, (float) 2);
								} else {
									((World) world).playSound(x, y, z,
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")),
											SoundCategory.NEUTRAL, (float) 2, (float) 2, false);
								}
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
									entityToSpawn.setPickupDelay((int) 30);
									world.addEntity(entityToSpawn);
								}
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarklatexgooItem.block));
									entityToSpawn.setPickupDelay((int) 30);
									world.addEntity(entityToSpawn);
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) (20 * 20));
					}
				}
			} else {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 2, (float) 2);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 2, (float) 2, false);
				}
				if (!entity.world.isRemote())
					entity.remove();
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1)
									+ (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 2)));
				if ((Math.random() < 0.25)) {
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
										SoundCategory.NEUTRAL, (float) 2, (float) 2);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")),
										SoundCategory.NEUTRAL, (float) 2, (float) 2, false);
							}
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
								entityToSpawn.setPickupDelay((int) 30);
								world.addEntity(entityToSpawn);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) ((Math.random() * 50) * 20));
				}
			}
		}
	}
}
