
package net.mcreator.latexes.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.treedecorator.CocoaTreeDecorator;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.ISeedReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.Direction;
import net.minecraft.entity.EntityClassification;
import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.entity.SYufengEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.block.DarklatexleavesBlock;
import net.mcreator.latexes.block.DarklatexhiveBlock;
import net.mcreator.latexes.block.DarklatexblockharmlessBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexModElements;

import java.util.Set;
import java.util.Random;
import java.util.List;

import com.google.common.collect.ImmutableList;

@LatexModElements.ModElement.Tag
public class DarkLatexBiomeBiome extends LatexModElements.ModElement {
	public static Biome biome;
	public DarkLatexBiomeBiome(LatexModElements instance) {
		super(instance, 287);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-13421773).setWaterColor(-13421773).setWaterFogColor(-16777216)
						.withSkyColor(-13421773).withFoliageColor(-13421773).withGrassColor(-13421773)
						.setMusic(new BackgroundMusicSelector((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("latex:puro_the_block_music")), 12000, 24000, true))
						.build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(
						SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(DarklatexblockharmlessBlock.block.getDefaultState(),
								DarklatexblockBlock.block.getDefaultState(), DarklatexblockBlock.block.getDefaultState())));
				biomeGenerationSettings.withStructure(StructureFeatures.MINESHAFT);
				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Feature.TREE
								.withConfiguration(
										(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(DarklatexblockBlock.block.getDefaultState()),
												new SimpleBlockStateProvider(DarklatexleavesBlock.block.getDefaultState()),
												new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3),
												new StraightTrunkPlacer(7, 2, 0), new TwoLayerFeature(1, 0, 1)))
														.setDecorators(ImmutableList.of(new CustomCocoaTreeDecorator())).setMaxWaterDepth(1).build())
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				DefaultBiomeFeatures.withFossils(biomeGenerationSettings);
				DefaultBiomeFeatures.withInfestedStone(biomeGenerationSettings);
				DefaultBiomeFeatures.withMonsterRoom(biomeGenerationSettings);
				DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DarklatexEntity.entity, 5, 1, 4));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(YufengEntity.entity, 4, 1, 2));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(NoiseStalkerEntity.entity, 2, 1, 3));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(SYufengEntity.entity, 4, 1, 2));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DarkLatexFoxEntity.entity, 3, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DarkLatexSkeletonEntity.entity, 2, 1, 3));
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(DarklatexslugEntity.entity, 8, 1, 2));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DarkLatexSpiderEntity.entity, 2, 1, 2));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DarkLatexSnakeEntity.entity, 3, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DarkLatexMothEntity.entity, 2, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(DlsharkEntity.entity, 3, 1, 2));
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.PLAINS).depth(0.1f).scale(0.1f)
						.temperature(0.5f).downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("latex:dark_latex_biome"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeDictionary.addTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, WorldGenRegistries.BIOME.getKey(biome)),
				BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL,
				BiomeDictionary.Type.RARE, BiomeDictionary.Type.MODIFIED);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM,
				new BiomeManager.BiomeEntry(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, WorldGenRegistries.BIOME.getKey(biome)), 1));
	}
	private static class CustomCocoaTreeDecorator extends CocoaTreeDecorator {
		public static final CustomCocoaTreeDecorator instance = new CustomCocoaTreeDecorator();
		public static com.mojang.serialization.Codec<CustomCocoaTreeDecorator> codec;
		public static TreeDecoratorType tdt;
		static {
			codec = com.mojang.serialization.Codec.unit(() -> instance);
			tdt = new TreeDecoratorType(codec);
			tdt.setRegistryName("dark_latex_biome_ctd");
			ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
		}
		public CustomCocoaTreeDecorator() {
			super(0.2f);
		}

		@Override
		protected TreeDecoratorType<?> func_230380_a_() {
			return tdt;
		}

		@Override
		public void func_225576_a_(ISeedReader p_225576_1_, Random p_225576_2_, List<BlockPos> p_225576_3_, List<BlockPos> p_225576_4_,
				Set<BlockPos> p_225576_5_, MutableBoundingBox p_225576_6_) {
			if (!(p_225576_2_.nextFloat() >= 0.2F)) {
				int i = p_225576_3_.get(0).getY();
				p_225576_3_.stream().filter((p_236867_1_) -> {
					return p_236867_1_.getY() - i <= 2;
				}).forEach((p_242865_5_) -> {
					for (Direction direction : Direction.Plane.HORIZONTAL) {
						if (p_225576_2_.nextFloat() <= 0.25F) {
							Direction direction1 = direction.getOpposite();
							BlockPos blockpos = p_242865_5_.add(direction1.getXOffset(), 0, direction1.getZOffset());
							if (Feature.isAirAt(p_225576_1_, blockpos)) {
								BlockState blockstate = DarklatexhiveBlock.block.getDefaultState();
								this.func_227423_a_(p_225576_1_, blockpos, blockstate, p_225576_5_, p_225576_6_);
							}
						}
					}
				});
			}
		}
	}
}
