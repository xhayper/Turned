package net.mcreator.latexes.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.TabletoffItem;
import net.mcreator.latexes.item.TabletItem;
import net.mcreator.latexes.item.BatteryItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class TabletoffRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure TabletoffRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BatteryItem.block)) : false)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BatteryItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(TabletoffItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(TabletItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
