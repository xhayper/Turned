package net.mcreator.latexes.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.DlmaskItem;
import net.mcreator.latexes.LatexMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class SlimelingattackconditionsProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure Slimelingattackconditions!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure Slimelingattackconditions!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure Slimelingattackconditions!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure Slimelingattackconditions!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure Slimelingattackconditions!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		return (((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == DlmaskItem.helmet)
				|| ((((entity instanceof TameableEntity)
						? ((TameableEntity) entity).getOwner()
						: null) == ((Entity) world
								.getEntitiesWithinAABB(PlayerEntity.class,
										new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null))) != (true)))
				|| (((world.getDifficulty() == Difficulty.PEACEFUL) != (true))
						&& (((world instanceof World) ? ((World) world).isDaytime() : false) != (true))));
	}
}
