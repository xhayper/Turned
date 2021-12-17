package net.mcreator.latexes.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class NXTSitRightClickedOnEntityProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure NXTSitRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure NXTSitRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure NXTSitRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure NXTSitRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure NXTSitRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure NXTSitRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == DarklatexgooItem.block)) {
			if ((((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) == (true))) {
				if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < ((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getMaxHealth()
						: -1))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 1, (int) 1, (false), (false)));
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 1, 2, 1, 1);
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(DarklatexgooItem.block);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
				}
			}
		} else if ((((sourceentity instanceof LivingEntity)
				? ((LivingEntity) sourceentity).getHealth()
				: -1) < ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getMaxHealth() : -1))) {
			if ((((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) == (true))) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 100, (int) 1, (false), (false)));
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 250, (int) 1, (false), (false)));
			}
		} else if (((entity instanceof TameableEntity && sourceentity instanceof LivingEntity)
				? ((TameableEntity) entity).isOwner((LivingEntity) sourceentity)
				: false)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new NXTHertxEntity.CustomEntity(NXTHertxEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, (float) (entity.rotationYaw), (float) (entity.rotationPitch));
				entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
				entityToSpawn.setRotationYawHead((float) (entity.rotationYaw));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
