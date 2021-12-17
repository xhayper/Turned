
package net.mcreator.latexes.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.feature.LakesFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.Direction;
import net.minecraft.state.StateContainer;
import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
import net.mcreator.latexes.procedures.DarkLatexGooFluidUpdateTickProcedure;
import net.mcreator.latexes.itemgroup.LatexItemGroup;
import net.mcreator.latexes.LatexModElements;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class DarkLatexGooFluidBlock extends LatexModElements.ModElement {
	@ObjectHolder("latex:dark_latex_goo_fluid")
	public static final FlowingFluidBlock block = null;
	@ObjectHolder("latex:dark_latex_goo_fluid_bucket")
	public static final Item bucket = null;
	public static FlowingFluid flowing = null;
	public static FlowingFluid still = null;
	private ForgeFlowingFluid.Properties fluidproperties = null;
	public DarkLatexGooFluidBlock(LatexModElements instance) {
		super(instance, 602);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FluidRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FeatureRegisterHandler());
	}
	private static class FluidRegisterHandler {
		@SubscribeEvent
		public void registerFluids(RegistryEvent.Register<Fluid> event) {
			event.getRegistry().register(still);
			event.getRegistry().register(flowing);
		}
	}
	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(still, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(flowing, RenderType.getTranslucent());
	}

	@Override
	public void initElements() {
		fluidproperties = new ForgeFlowingFluid.Properties(() -> still, () -> flowing,
				FluidAttributes
						.builder(new ResourceLocation("latex:blocks/dark_latex_goo_fluid"), new ResourceLocation("latex:blocks/dark_latex_goo_fluid"))
						.luminosity(0).density(5000).viscosity(2500).temperature(350).rarity(Rarity.COMMON)
						.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")))).explosionResistance(125f)
								.canMultiply().tickRate(15).levelDecreasePerBlock(4).slopeFindDistance(3).bucket(() -> bucket).block(() -> block);
		still = (FlowingFluid) new CustomFlowingFluid.Source(fluidproperties).setRegistryName("dark_latex_goo_fluid");
		flowing = (FlowingFluid) new CustomFlowingFluid.Flowing(fluidproperties).setRegistryName("dark_latex_goo_fluid_flowing");
		elements.blocks
				.add(() -> new FlowingFluidBlock(still, Block.Properties.create(Material.WATER).hardnessAndResistance(125f).setLightLevel(s -> 0)) {
					@Override
					public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
						return 20;
					}

					@Override
					public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
						return 12;
					}

					@Override
					public void onBlockAdded(BlockState blockstate, World world, BlockPos pos, BlockState oldState, boolean moving) {
						super.onBlockAdded(blockstate, world, pos, oldState, moving);
						int x = pos.getX();
						int y = pos.getY();
						int z = pos.getZ();
						world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, 10);
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
							DarkLatexGooFluidUpdateTickProcedure.executeProcedure($_dependencies);
						}
						world.getPendingBlockTicks().scheduleTick(new BlockPos(x, y, z), this, 10);
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
							DarklatexblockEntityCollidesInTheBlockProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("dark_latex_goo_fluid"));
		elements.items.add(() -> new BucketItem(still,
				new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(LatexItemGroup.tab).rarity(Rarity.COMMON))
						.setRegistryName("dark_latex_goo_fluid_bucket"));
	}
	public static abstract class CustomFlowingFluid extends ForgeFlowingFluid {
		public CustomFlowingFluid(Properties properties) {
			super(properties);
		}

		@Override
		public Vector3d getFlow(IBlockReader world, BlockPos pos, FluidState fluidstate) {
			return super.getFlow(world, pos, fluidstate).scale(-2);
		}
		public static class Source extends CustomFlowingFluid {
			public Source(Properties properties) {
				super(properties);
			}

			public int getLevel(FluidState state) {
				return 8;
			}

			public boolean isSource(FluidState state) {
				return true;
			}
		}

		public static class Flowing extends CustomFlowingFluid {
			public Flowing(Properties properties) {
				super(properties);
			}

			protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
				super.fillStateContainer(builder);
				builder.add(LEVEL_1_8);
			}

			public int getLevel(FluidState state) {
				return state.get(LEVEL_1_8);
			}

			public boolean isSource(FluidState state) {
				return false;
			}
		}
	}
	private static Feature<BlockStateFeatureConfig> feature = null;
	private static ConfiguredFeature<?, ?> configuredFeature = null;
	private static class FeatureRegisterHandler {
		@SubscribeEvent
		public void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			feature = new LakesFeature(BlockStateFeatureConfig.field_236455_a_) {
				@Override
				public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos pos, BlockStateFeatureConfig config) {
					RegistryKey<World> dimensionType = world.getWorld().getDimensionKey();
					boolean dimensionCriteria = false;
					if (dimensionType == World.OVERWORLD)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.generate(world, generator, rand, pos, config);
				}
			};
			configuredFeature = feature.withConfiguration(new BlockStateFeatureConfig(block.getDefaultState()))
					.withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(2)));
			event.getRegistry().register(feature.setRegistryName("dark_latex_goo_fluid_lakes"));
			Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("latex:dark_latex_goo_fluid_lakes"), configuredFeature);
		}
	}
	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		boolean biomeCriteria = false;
		if (new ResourceLocation("latex:dark_latex_biome").equals(event.getName()))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		event.getGeneration().getFeatures(GenerationStage.Decoration.LOCAL_MODIFICATIONS).add(() -> configuredFeature);
	}
}
