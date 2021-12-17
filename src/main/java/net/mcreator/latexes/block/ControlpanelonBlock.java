
package net.mcreator.latexes.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.StateContainer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.BooleanProperty;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.FluidState;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.latexes.procedures.ControlpanelonBlockAddedProcedure;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@LatexModElements.ModElement.Tag
public class ControlpanelonBlock extends LatexModElements.ModElement {
	@ObjectHolder("latex:controlpanelon")
	public static final Block block = null;
	public ControlpanelonBlock(LatexModElements instance) {
		super(instance, 586);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}
	public static class CustomBlock extends Block implements IWaterLoggable {
		public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
		public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.25f, 12.5f).setLightLevel(s -> 0)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().slipperiness(0.5f).notSolid().setOpaque((bs, br, bp) -> false));
			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
			setRegistryName("controlpanelon");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return state.getFluidState().isEmpty();
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 0;
		}

		@Override
		public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
			Vector3d offset = state.getOffset(world, pos);
			switch ((Direction) state.get(FACING)) {
				case SOUTH :
				default :
					return VoxelShapes.or(makeCuboidShape(16, 0, 8, 0, 16, 0)).withOffset(offset.x, offset.y, offset.z);
				case NORTH :
					return VoxelShapes.or(makeCuboidShape(0, 0, 8, 16, 16, 16)).withOffset(offset.x, offset.y, offset.z);
				case EAST :
					return VoxelShapes.or(makeCuboidShape(8, 0, 0, 0, 16, 16)).withOffset(offset.x, offset.y, offset.z);
				case WEST :
					return VoxelShapes.or(makeCuboidShape(8, 0, 16, 16, 16, 0)).withOffset(offset.x, offset.y, offset.z);
			}
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING, WATERLOGGED);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			boolean flag = context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER;;
			return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, flag);
		}

		@Override
		public FluidState getFluidState(BlockState state) {
			return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
		}

		@Override
		public BlockState updatePostPlacement(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos,
				BlockPos facingPos) {
			if (state.get(WATERLOGGED)) {
				world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
			}
			return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
		}

		@Override
		public boolean canProvidePower(BlockState state) {
			return true;
		}

		@Override
		public int getWeakPower(BlockState blockstate, IBlockReader blockAccess, BlockPos pos, Direction side) {
			return 12;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.IRON;
		}

		@Override
		public boolean canConnectRedstone(BlockState state, IBlockReader world, BlockPos pos, Direction side) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public void onBlockAdded(BlockState blockstate, World world, BlockPos pos, BlockState oldState, boolean moving) {
			super.onBlockAdded(blockstate, world, pos, oldState, moving);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ControlpanelonBlockAddedProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
