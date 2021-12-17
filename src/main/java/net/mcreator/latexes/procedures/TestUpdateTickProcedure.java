package net.mcreator.latexes.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class TestUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure TestUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure TestUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure TestUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure TestUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 6, 3, 3, 3, 1);
			}
		} else {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.ANGRY_VILLAGER, x, y, z, (int) 6, 3, 3, 3, 1);
			}
		}
	}
}
