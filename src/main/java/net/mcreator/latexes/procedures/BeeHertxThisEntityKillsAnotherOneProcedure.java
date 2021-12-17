package net.mcreator.latexes.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.item.BrokendlmaskItem;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilMilitaryEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DlmermaidEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class BeeHertxThisEntityKillsAnotherOneProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure BeeHertxThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure BeeHertxThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure BeeHertxThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure BeeHertxThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure BeeHertxThisEntityKillsAnotherOne!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity instanceof DarklatexEntity.CustomEntity) || (entity instanceof YufengEntity.CustomEntity))
				|| (((entity instanceof DlsharkEntity.CustomEntity) || (entity instanceof DlmermaidEntity.CustomEntity))
						|| ((entity instanceof DLbeeEntity.CustomEntity) || (entity instanceof DarkLatexFoxEntity.CustomEntity))))
				|| ((entity instanceof DarkLatexFoxScientistEntity.CustomEntity) || (entity instanceof DarkLatexSnakeEntity.CustomEntity)))) {
			if ((Math.random() < 0.3)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
				}
				if (!entity.world.isRemote())
					entity.remove();
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
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")),
									SoundCategory.NEUTRAL, (float) 1, (float) 2);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")),
									SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarklatexgooItem.block));
							entityToSpawn.setPickupDelay((int) 60);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
							entityToSpawn.setPickupDelay((int) 60);
							world.addEntity(entityToSpawn);
						}
						if ((Math.random() < 0.1)) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BrokendlmaskItem.block));
								entityToSpawn.setPickupDelay((int) 60);
								world.addEntity(entityToSpawn);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) (Math.random() * (60 * 20)));
			}
		} else if (((entity instanceof SYufengEntity.CustomEntity) || (entity instanceof DarkLatexSkeletonEntity.CustomEntity))) {
			if ((Math.random() < 0.2)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
				}
				if (!entity.world.isRemote())
					entity.remove();
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
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")),
									SoundCategory.NEUTRAL, (float) 1, (float) 2);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")),
									SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
							entityToSpawn.setPickupDelay((int) 60);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarklatexgooItem.block));
							entityToSpawn.setPickupDelay((int) 60);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
							entityToSpawn.setPickupDelay((int) 60);
							world.addEntity(entityToSpawn);
						}
						if ((Math.random() < 0.1)) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BrokendlmaskItem.block));
								entityToSpawn.setPickupDelay((int) 60);
								world.addEntity(entityToSpawn);
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) (Math.random() * (60 * 20)));
			}
		} else if ((((entity instanceof AnimalEntity)
				|| (((entity instanceof VindicatorEntity) || (entity instanceof EvilMilitaryEntity.CustomEntity))
						|| ((entity instanceof EvilSniperEntity.CustomEntity) || (entity instanceof EvilScientistEntity.CustomEntity))))
				|| (((entity instanceof MonsterEntity) || (entity instanceof VindicatorEntity))
						|| (((entity instanceof PillagerEntity) || (entity instanceof WitchEntity))
								|| ((entity instanceof IllusionerEntity) || (entity instanceof EvokerEntity)))))) {
			if ((Math.random() < 0.2)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
							SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
				}
				if (!entity.world.isRemote())
					entity.remove();
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
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")),
									SoundCategory.NEUTRAL, (float) 1, (float) 2);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")),
									SoundCategory.NEUTRAL, (float) 1, (float) 2, false);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
							entityToSpawn.setPickupDelay((int) 60);
							world.addEntity(entityToSpawn);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) (Math.random() * (50 * 20)));
			}
		}
	}
}
