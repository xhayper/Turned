package net.mcreator.latexes.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.latexes.item.HertxvisorItem;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class HertxEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure HertxEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure HertxEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure HertxEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure HertxEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.05)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(HertxvisorItem.block));
				entityToSpawn.setPickupDelay((int) 20);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.IRON_INGOT));
				entityToSpawn.setPickupDelay((int) 20);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarklatexgooItem.block));
				entityToSpawn.setPickupDelay((int) 20);
				world.addEntity(entityToSpawn);
			}
			if ((Math.random() < 0.3)) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.IRON_INGOT));
					entityToSpawn.setPickupDelay((int) 20);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DarklatexgooItem.block));
					entityToSpawn.setPickupDelay((int) 20);
					world.addEntity(entityToSpawn);
				}
			}
			if ((Math.random() < 0.2)) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.REDSTONE));
					entityToSpawn.setPickupDelay((int) 20);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
