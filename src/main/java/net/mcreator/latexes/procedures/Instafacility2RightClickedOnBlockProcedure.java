package net.mcreator.latexes.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.latexes.item.Instafacility2Item;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class Instafacility2RightClickedOnBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LatexMod.LOGGER.warn("Failed to load dependency entity for procedure Instafacility2RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure Instafacility2RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure Instafacility2RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure Instafacility2RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure Instafacility2RightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager()
					.getTemplateDefaulted(new ResourceLocation("latex", "operative_facility_2"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Instafacility2Item.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}
}
