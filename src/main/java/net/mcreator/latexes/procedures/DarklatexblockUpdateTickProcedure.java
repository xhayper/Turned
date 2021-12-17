package net.mcreator.latexes.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.world.DarklatexsunlightonlyGameRule;
import net.mcreator.latexes.world.DarklatexspreadspeedGameRule;
import net.mcreator.latexes.world.DarklatexfluidsGameRule;
import net.mcreator.latexes.world.DarkLatexStoneSpreadGameRule;
import net.mcreator.latexes.world.DarkLatexSpreadGameRule;
import net.mcreator.latexes.block.LatexcobwebfixBlock;
import net.mcreator.latexes.block.DarklatexlogBlock;
import net.mcreator.latexes.block.DarklatexleavesBlock;
import net.mcreator.latexes.block.DarklatexiceBlock;
import net.mcreator.latexes.block.DarklatexhiveBlock;
import net.mcreator.latexes.block.DarklatexcrystaleggBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.block.DarkLatexGooFluidBlock;
import net.mcreator.latexes.LatexMod;

import java.util.Map;

public class DarklatexblockUpdateTickProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LatexMod.LOGGER.warn("Failed to load dependency x for procedure DarklatexblockUpdateTick!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LatexMod.LOGGER.warn("Failed to load dependency y for procedure DarklatexblockUpdateTick!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LatexMod.LOGGER.warn("Failed to load dependency z for procedure DarklatexblockUpdateTick!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LatexMod.LOGGER.warn("Failed to load dependency world for procedure DarklatexblockUpdateTick!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexSpreadGameRule.gamerule)) == (true))) {
			if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexsunlightonlyGameRule.gamerule)) == (true))
					&& (((((world.canBlockSeeSky(new BlockPos((int) x, (int) (y + 1), (int) z)))
							|| (world.canBlockSeeSky(new BlockPos((int) x, (int) (y - 1), (int) z))))
							|| (((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) (z + 1))))
									|| (world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) (z - 1)))))
									|| ((world.canBlockSeeSky(new BlockPos((int) (x - 1), (int) y, (int) z)))
											|| (world.canBlockSeeSky(new BlockPos((int) (x + 1), (int) y, (int) z))))))
							&& ((world.getLight(new BlockPos((int) x, (int) (y + 1), (int) z))) >= 5)) == (false)))) {
				if (((Math.random() * 100) <= (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))) {
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexblockcrystalgrowBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexblockcrystalgrowBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)
									|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.GRASS))
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0))))
											.getBlock() == Blocks.SWEET_BERRY_BUSH)
											|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0))))
													.getBlock() == Blocks.VINE)))) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0));
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
					if (((((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == DarklatexhiveBlock.block)
							|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
									.getBlock() == DarklatexblockcrystalgrowBlock.block))
							|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
									.getBlock() == LatexcobwebfixBlock.block)
									|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
											.getBlock() == DarklatexleavesBlock.block)))
							|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
									.getBlock() == DarklatexcrystaleggBlock.block)
									|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
											.getBlock() == DarklatexiceBlock.block)))
							|| ((BlockTags.getCollection()
									.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
											.getBlock())) == (false)))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)
									|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 0)))).getBlock() == Blocks.GRASS))
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 0))))
											.getBlock() == Blocks.SWEET_BERRY_BUSH)
											|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 0))))
													.getBlock() == Blocks.VINE)))) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y - 0), (int) (z + 1));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
										BlockState _bs = DarklatexcrystaleggBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z - 1)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z - 1))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
										BlockState _bs = DarklatexcrystaleggBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
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
				}
			} else {
				if (((Math.random() * 100) <= (world.getWorldInfo().getGameRulesInstance().getInt(DarklatexspreadspeedGameRule.gamerule)))) {
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexblockcrystalgrowBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
										BlockState _bs = DarklatexblockcrystalgrowBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)
									|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.GRASS))
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0))))
											.getBlock() == Blocks.SWEET_BERRY_BUSH)
											|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0))))
													.getBlock() == Blocks.VINE)))) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0));
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
					if (((((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == DarklatexhiveBlock.block)
							|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
									.getBlock() == DarklatexblockcrystalgrowBlock.block))
							|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
									.getBlock() == LatexcobwebfixBlock.block)
									|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
											.getBlock() == DarklatexleavesBlock.block)))
							|| (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
									.getBlock() == DarklatexcrystaleggBlock.block)
									|| ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
											.getBlock() == DarklatexiceBlock.block)))
							|| ((BlockTags.getCollection()
									.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
											.getBlock())) == (false)))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0))))
												.getBlock())) == (true))) == (false))) {
							if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.OAK_LEAVES)
									|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 0)))).getBlock() == Blocks.GRASS))
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 0))))
											.getBlock() == Blocks.SWEET_BERRY_BUSH)
											|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 0))))
													.getBlock() == Blocks.VINE)))) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z + 1))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y - 0), (int) (z + 1));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
										BlockState _bs = DarklatexcrystaleggBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
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
					if (((BlockTags.getCollection()
							.getTagByID(new ResourceLocation(("latex:tag_immune_blocks").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z - 1)))).getBlock())) == (false))) {
						if (((((world.getWorldInfo().getGameRulesInstance().getBoolean(DarkLatexStoneSpreadGameRule.gamerule)) == (false))
								&& ((BlockTags.getCollection()
										.getTagByID(new ResourceLocation(("latex:tag_stone_blocks").toLowerCase(java.util.Locale.ENGLISH)))
										.contains((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 0), (int) (z - 1))))
												.getBlock())) == (true))) == (false))) {
							if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEEHIVE)
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BEE_NEST))) {
								{
									BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = DarklatexhiveBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.COBWEB)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = LatexcobwebfixBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.OAK_LEAVES)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = DarklatexleavesBlock.block.getDefaultState();
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
							} else if (((world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.OAK_LOG)) {
								{
									BlockPos _bp = new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1));
									BlockState _bs = DarklatexlogBlock.block.getDefaultState();
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
							} else if ((((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlockState())
									.getBlock() == Blocks.WATER)
									|| ((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlockState())
											.getBlock() == Blocks.WATER))) {
								if ((world.getWorldInfo().getGameRulesInstance().getBoolean(DarklatexfluidsGameRule.gamerule))) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y - 0), (int) (z - 1));
										BlockState _bs = DarkLatexGooFluidBlock.block.getDefaultState();
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
								} else {
									return (true);
								}
							} else {
								if ((Math.random() < 0.025)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
										BlockState _bs = DarklatexiceBlock.block.getDefaultState();
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
								} else if ((Math.random() < 0.01)) {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
										BlockState _bs = DarklatexcrystaleggBlock.block.getDefaultState();
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
								} else {
									{
										BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
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
				}
			}
		}
		return (false);
	}
}
