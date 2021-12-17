package net.mcreator.latexes.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.potion.DarklatexdarteffectPotionEffect;
import net.mcreator.latexes.item.YufengbodyItem;
import net.mcreator.latexes.item.DlmaskItem;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class SyufengbodyBodyTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure SyufengbodyBodyTickEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure SyufengbodyBodyTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure SyufengbodyBodyTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure SyufengbodyBodyTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure SyufengbodyBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == DlmaskItem.helmet)) {
			if ((((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
					: ItemStack.EMPTY).getItem() == YufengbodyItem.body)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).abilities.allowFlying = (true);
					((PlayerEntity) entity).sendPlayerAbilities();
				}
			}
		} else if ((entity instanceof SYufengEntity.CustomEntity)) {
			if ((((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
					: ItemStack.EMPTY).getItem() == YufengbodyItem.body)) {
				if (entity instanceof PlayerEntity) {
					((PlayerEntity) entity).abilities.allowFlying = (true);
					((PlayerEntity) entity).sendPlayerAbilities();
				}
			}
		} else {
			if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false) != (true))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(DarklatexdarteffectPotionEffect.potion, (int) 150, (int) 1, (false), (false)));
				if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 1)) {
					entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
			}
		}
	}
}
