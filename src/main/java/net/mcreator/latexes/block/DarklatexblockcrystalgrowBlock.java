
package net.mcreator.latexes.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.state.StateContainer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.latexes.procedures.DarklatexblockcrystalgrowUpdateTickProcedure;
import net.mcreator.latexes.itemgroup.LatexItemGroup;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.LatexModElements;

import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@LatexModElements.ModElement.Tag
public class DarklatexblockcrystalgrowBlock extends LatexModElements.ModElement {
	@ObjectHolder("latex:darklatexblockcrystalgrow")
	public static final Block block = null;
	public DarklatexblockcrystalgrowBlock(LatexModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(LatexItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
		public CustomBlock() {
			super(Block.Properties.create(Material.EARTH).sound(SoundType.SLIME).hardnessAndResistance(0.8999999999999999f, 8f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.SHOVEL).setRequiresTool().slipperiness(0.7999999999999999f).speedFactor(0.5f)
					.jumpFactor(0.5f).tickRandomly());
			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
			setRegistryName("darklatexblockcrystalgrow");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void addInformation(ItemStack itemstack, IBlockReader world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Crystal Grow"));
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			;
			return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 10;
		}

		@Override
		public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DarklatexgooItem.block));
		}

		@Override
		public void tick(BlockState blockstate, ServerWorld world, BlockPos pos, Random random) {
			super.tick(blockstate, world, pos, random);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				DarklatexblockcrystalgrowUpdateTickProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
