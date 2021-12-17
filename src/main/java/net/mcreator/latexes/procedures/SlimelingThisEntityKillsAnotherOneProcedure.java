package net.mcreator.latexes.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.monster.DrownedEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.world.DarkLatexTransfurGameRule;
import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class SlimelingThisEntityKillsAnotherOneProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure SlimelingThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				LatexMod.LOGGER.warn("Failed to load dependency sourceentity for procedure SlimelingThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure SlimelingThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure SlimelingThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure SlimelingThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure SlimelingThisEntityKillsAnotherOne!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.8)) {
			if (!entity.world.isRemote())
				entity.remove();
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 3, 3, 3, 3, 1);
			}
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
				((LivingEntity) sourceentity)
						.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1)
								+ (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getMaxHealth() : -1) / 2)));
		} else if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexTransfurGameRule.gamerule))) {
			if ((((((entity instanceof PillagerEntity) || (entity instanceof PlayerEntity))
					|| ((entity instanceof DarklatexEntity.CustomEntity) || (entity instanceof ZombifiedPiglinEntity)))
					|| (((entity instanceof PiglinBruteEntity) || (entity instanceof ZombieVillagerEntity))
							|| ((entity instanceof VindicatorEntity) || (entity instanceof VillagerEntity))))
					|| ((((entity instanceof WanderingTraderEntity) || (entity instanceof HuskEntity))
							|| ((entity instanceof EvokerEntity) || (entity instanceof IllusionerEntity))) || (entity instanceof DrownedEntity)))) {
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
					((ServerWorld) world).spawnParticle(ParticleTypes.ITEM_SLIME, x, y, z, (int) 5, 3, 3, 3, 1);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new SlimelingEntity.CustomEntity(SlimelingEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
