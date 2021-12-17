package net.mcreator.latexes.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.latexes.item.RifleAmmoItem;
import net.mcreator.latexes.item.RadioDroppodcallerItem;
import net.mcreator.latexes.item.KeycardItem;
import net.mcreator.latexes.item.KelvarvestItem;
import net.mcreator.latexes.item.AR70AssaultRifleItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class EvilMilitaryEntityDiesProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure EvilMilitaryEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure EvilMilitaryEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure EvilMilitaryEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure EvilMilitaryEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.6)) {
			for (int index0 = 0; index0 < (int) (Math.round((Math.random() * 10))); index0++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RifleAmmoItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if ((Math.random() < 0.1)) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(AR70AssaultRifleItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			if ((Math.random() < 0.3)) {
				for (int index1 = 0; index1 < (int) (Math.round((Math.random() * 10))); index1++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RifleAmmoItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
		if ((Math.random() < 0.3)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(KeycardItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
		if ((Math.random() < 0.1)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RadioDroppodcallerItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
		if ((Math.random() < 0.4)) {
			for (int index2 = 0; index2 < (int) (3); index2++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.IRON_NUGGET));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index3 = 0; index3 < (int) (4); index3++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.GUNPOWDER));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
		if ((Math.random() < 0.1)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(KelvarvestItem.body));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
