
package net.mcreator.latexes.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.StateContainer;
import net.minecraft.state.BooleanProperty;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.FluidState;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.latexes.procedures.LatexcobwebfixUpdateTickProcedure;
import net.mcreator.latexes.procedures.LatexcobwebEntityCollidesInTheBlockProcedure;
import net.mcreator.latexes.itemgroup.LatexItemGroup;
import net.mcreator.latexes.LatexModElements;

import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@LatexModElements.ModElement.Tag
public class LatexcobwebfixBlock extends LatexModElements.ModElement {
	@ObjectHolder("latex:latexcobwebfix")
	public static final Block block = null;
	public LatexcobwebfixBlock(LatexModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(LatexItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}
	public static class CustomBlock extends Block implements IWaterLoggable {
		public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
		public CustomBlock() {
			super(Block.Properties.create(Material.WEB).sound(SoundType.SLIME).hardnessAndResistance(1f, 2.5f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.SHOVEL).setRequiresTool().doesNotBlockMovement().slipperiness(0.9f).speedFactor(0.1f).jumpFactor(0.1f)
					.notSolid().setOpaque((bs, br, bp) -> false));
			this.setDefaultState(this.stateContainer.getBaseState().with(WATERLOGGED, false));
			setRegistryName("latexcobwebfix");
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
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			boolean flag = context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER;
			return this.getDefaultState().with(WATERLOGGED, flag);
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(WATERLOGGED);
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
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 20;
		}

		@Override
		public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 2;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.GRAY;
		}

		@Override
		public PathNodeType getAiPathNodeType(BlockState state, IBlockReader world, BlockPos pos, MobEntity entity) {
			return PathNodeType.STICKY_HONEY;
		}

		@Override
		public Block.OffsetType getOffsetType() {
			return Block.OffsetType.XYZ;
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
			world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, 80);
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
				LatexcobwebfixUpdateTickProcedure.executeProcedure($_dependencies);
			}
			world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, 80);
		}

		@Override
		public void onEntityCollision(BlockState blockstate, World world, BlockPos pos, Entity entity) {
			super.onEntityCollision(blockstate, world, pos, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				LatexcobwebEntityCollidesInTheBlockProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
