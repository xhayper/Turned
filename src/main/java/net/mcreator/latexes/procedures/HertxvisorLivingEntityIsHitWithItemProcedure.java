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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.HertxvisorItem;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.HertxvarFEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSnepEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexArcherEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class HertxvisorLivingEntityIsHitWithItemProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure HertxvisorLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure HertxvisorLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure HertxvisorLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure HertxvisorLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure HertxvisorLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity instanceof DarkLatexSnakeEntity.CustomEntity) || (entity instanceof DarkLatexSpiderEntity.CustomEntity))
				|| ((entity instanceof DarkLatexSnepEntity.CustomEntity) || (entity instanceof DarkLatexArcherEntity.CustomEntity)))
				|| (((entity instanceof DarklatexEntity.CustomEntity) || (entity instanceof YufengEntity.CustomEntity))
						|| ((entity instanceof DlsharkEntity.CustomEntity) || (entity instanceof DarkLatexFoxEntity.CustomEntity))))) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(HertxvisorItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
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
			if ((Math.random() < 0.01)) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new AHVHertxEntity.CustomEntity(AHVHertxEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else if ((Math.random() < 0.01)) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new NXTHertxEntity.CustomEntity(NXTHertxEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else if ((Math.random() < 0.1)) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new HertxvarFEntity.CustomEntity(HertxvarFEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else if ((Math.random() < 0.1)) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new HertxvarFEntity.CustomEntity(HertxvarFEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new HertxEntity.CustomEntity(HertxEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((entity instanceof DLbeeEntity.CustomEntity)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(HertxvisorItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
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
				Entity entityToSpawn = new BeeHertxEntity.CustomEntity(BeeHertxEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
