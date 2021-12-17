package net.mcreator.latexes.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.LatexdartItem;
import net.mcreator.latexes.item.LatexDartRifleItem;
import net.mcreator.latexes.item.DartrifleItem;
import net.mcreator.latexes.item.DartItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class LatexDartRifleCanUseRangedItemProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure LatexDartRifleCanUseRangedItem!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((LatexdartItem.block == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem())) {
			return (true);
		} else if ((DartItem.block == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem())) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(LatexDartRifleItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(DartrifleItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
		return (false);
	}
}
