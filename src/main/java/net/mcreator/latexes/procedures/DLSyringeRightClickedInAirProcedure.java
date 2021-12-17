package net.mcreator.latexes.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.item.SyringeItem;
import net.mcreator.latexes.item.DLSyringeItem;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DLSyringeRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure DLSyringeRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LatexMod.LOGGER.warn("Failed to load dependency itemstack for procedure DLSyringeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(DLSyringeItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(DarklatexdarteffectPotionEffect.potion, (int) 120, (int) 1, (false), (false)));
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(SyringeItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown((itemstack).getItem(), (int) 100);
	}
}
