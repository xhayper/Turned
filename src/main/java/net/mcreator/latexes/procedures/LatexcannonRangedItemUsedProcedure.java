package net.mcreator.latexes.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.block.DarklatexblockharmlessBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class LatexcannonRangedItemUsedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure LatexcannonRangedItemUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LatexMod.LOGGER.warn("Failed to load dependency itemstack for procedure LatexcannonRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 25);
		if (((((itemstack)).getDamage()) <= 0.1)) {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DarklatexblockharmlessBlock.block))
					: false)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(DarklatexblockharmlessBlock.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				((itemstack)).setDamage((int) 0.6);
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 120);
			} else if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(DarklatexblockBlock.block))
					: false)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(DarklatexblockBlock.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				((itemstack)).setDamage((int) 0.6);
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 120);
			}
		}
	}
}
