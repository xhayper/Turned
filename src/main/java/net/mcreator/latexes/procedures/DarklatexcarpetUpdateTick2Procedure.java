package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.world.DarklatexsunlightonlyGameRule;
import net.mcreator.latexes.world.DarkLatexSpreadGameRule;
import net.mcreator.latexes.block.DarklatexiceBlock;
import net.mcreator.latexes.block.DarklatexcrystaleggBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;
import java.util.HashMap;

public class DarklatexcarpetUpdateTick2Procedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexcarpetUpdateTick2!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexcarpetUpdateTick2!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexcarpetUpdateTick2!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexcarpetUpdateTick2!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double underblocktransform = 0;
		if (((BlockTags.getCollection().getTagByID(new ResourceLocation(("latex:invalidblockbelow").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))
				|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexcrystaleggBlock.block)
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexiceBlock.block))
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DarklatexblockcrystalgrowBlock.block)
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
										.getBlock() == DarklatexblockBlock.block))))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			return (true);
		} else {
			if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexSpreadGameRule.gamerule))) {
				if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexsunlightonlyGameRule.gamerule))) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getLightValue()) >= 5)
							|| (world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							DarklatexcarpetUpdateTickProcedure.executeProcedure($_dependencies);
						}
					}
				} else {
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						$_dependencies.put("world", world);
						DarklatexcarpetUpdateTickProcedure.executeProcedure($_dependencies);
					}
				}
			}
			if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexSpreadGameRule.gamerule))) {
				if ((Math.random() < 0.0075)) {
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) != (true))) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
							BlockState _bs = DarklatexblockBlock.block.getDefaultState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlockState(_bp, _bs, 3);
						}
					}
				}
			}
		}
		return (false);
	}
}
