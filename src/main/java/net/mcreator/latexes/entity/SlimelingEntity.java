
package net.mcreator.latexes.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ActionResultType;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OwnerHurtTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtByTargetGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.SlimelingattackconditionsProcedure;
import net.mcreator.latexes.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.SlimelingEntityDiesProcedure;
import net.mcreator.latexes.procedures.CheckiftamedProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.SlimeessenceItem;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.renderer.SlimelingRenderer;
import net.mcreator.latexes.block.DarklatexiceBlock;
import net.mcreator.latexes.block.DarklatexhiveBlock;
import net.mcreator.latexes.block.DarklatexcrystaleggBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

@LatexModElements.ModElement.Tag
public class SlimelingEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("slimeling").setRegistryName("slimeling");
	public SlimelingEntity(LatexModElements instance) {
		super(instance, 1);
		FMLJavaModLoadingContext.get().getModEventBus().register(new SlimelingRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -12925126, -16237817, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("slimeling_spawn_egg"));
	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		boolean biomeCriteria = false;
		if (new ResourceLocation("swamp").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("plains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("mountain_edge").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("mountain_edge").equals(event.getName()))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(entity, 6, 1, 3));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.down()).getMaterial() == Material.ORGANIC && world.getLightSubtracted(pos, 0) > 8));
		DungeonHooks.addDungeonMob(entity, 180);
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 20);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 2);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends TameableEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 4;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 1, (float) 8, (float) 2, false));
			this.goalSelector.addGoal(2, new OwnerHurtTargetGoal(this));
			this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
			this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DarkLatexArcherEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, YufengEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, NoiseStalkerEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, SYufengEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, HertxEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, DlsharkEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, DlmermaidEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, DarkLatexFoxEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, DarkLatexSkeletonEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, DarkLatexDragonEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, DLbeeEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, DarkLatexFoxScientistEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, DarkLatexSnakeEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, DarkLatexFoxSniperEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, DarkLatexSnepEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, DarklatexslugEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, DarkLatexMothEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.CustomEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, MilitaryEntity.CustomEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && SlimelingattackconditionsProcedure
							.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, ScientistEntity.CustomEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, VindicatorEntity.class, true, false));
			this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, IllusionerEntity.class, true, false));
			this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, EvokerEntity.class, true, false));
			this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, WanderingTraderEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(40, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.goalSelector.addGoal(41, new BreakBlockGoal(DarklatexiceBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(42, new BreakBlockGoal(DarklatexblockcrystalgrowBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(43, new BreakBlockGoal(DarklatexblockBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(44, new BreakBlockGoal(DarklatexcrystaleggBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(45, new BreakBlockGoal(DarklatexhiveBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(46, new LookAtGoal(this, PlayerEntity.class, (float) 6) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.goalSelector.addGoal(47, new LookAtGoal(this, VillagerEntity.class, (float) 6) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.goalSelector.addGoal(48, new LookAtGoal(this, WanderingTraderEntity.class, (float) 6) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.goalSelector.addGoal(49, new TemptGoal(this, 0.8, Ingredient.fromItems(DarklatexgooItem.block), true) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute()
							&& CheckiftamedProcedure.executeProcedure(ImmutableMap.of("entity", entity, "x", x, "y", y, "z", z, "world", world));
				}
			});
			this.goalSelector.addGoal(50, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(51, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(52, new OpenDoorGoal(this, false));
			this.targetSelector.addGoal(53, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(54, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(55, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
			this.entityDropItem(new ItemStack(SlimeessenceItem.block));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f,
					1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.WITHER)
				return false;
			if (source.getDamageType().equals("witherSkull"))
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity sourceentity = source.getTrueSource();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				SlimelingEntityDiesProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public ActionResultType func_230254_b_(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			ActionResultType retval = ActionResultType.func_233537_a_(this.world.isRemote());
			Item item = itemstack.getItem();
			if (itemstack.getItem() instanceof SpawnEggItem) {
				retval = super.func_230254_b_(sourceentity, hand);
			} else if (this.world.isRemote()) {
				retval = (this.isTamed() && this.isOwner(sourceentity) || this.isBreedingItem(itemstack))
						? ActionResultType.func_233537_a_(this.world.isRemote())
						: ActionResultType.PASS;
			} else {
				if (this.isTamed()) {
					if (this.isOwner(sourceentity)) {
						if (item.isFood() && this.isBreedingItem(itemstack) && this.getHealth() < this.getMaxHealth()) {
							this.consumeItemFromStack(sourceentity, itemstack);
							this.heal((float) item.getFood().getHealing());
							retval = ActionResultType.func_233537_a_(this.world.isRemote());
						} else if (this.isBreedingItem(itemstack) && this.getHealth() < this.getMaxHealth()) {
							this.consumeItemFromStack(sourceentity, itemstack);
							this.heal(4);
							retval = ActionResultType.func_233537_a_(this.world.isRemote());
						} else {
							retval = super.func_230254_b_(sourceentity, hand);
						}
					}
				} else if (this.isBreedingItem(itemstack)) {
					this.consumeItemFromStack(sourceentity, itemstack);
					if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
						this.setTamedBy(sourceentity);
						this.world.setEntityState(this, (byte) 7);
					} else {
						this.world.setEntityState(this, (byte) 6);
					}
					this.enablePersistence();
					retval = ActionResultType.func_233537_a_(this.world.isRemote());
				} else {
					retval = super.func_230254_b_(sourceentity, hand);
					if (retval == ActionResultType.SUCCESS || retval == ActionResultType.CONSUME)
						this.enablePersistence();
				}
			}
			return retval;
		}

		@Override
		public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
			super.awardKillScore(entity, score, damageSource);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity sourceentity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("sourceentity", sourceentity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				SlimelingThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public AgeableEntity func_241840_a(ServerWorld serverWorld, AgeableEntity ageable) {
			CustomEntity retval = (CustomEntity) entity.create(serverWorld);
			retval.onInitialSpawn(serverWorld, serverWorld.getDifficultyForLocation(new BlockPos(retval.getPosition())), SpawnReason.BREEDING,
					(ILivingEntityData) null, (CompoundNBT) null);
			return retval;
		}

		@Override
		public boolean isBreedingItem(ItemStack stack) {
			if (stack == null)
				return false;
			if (SlimeessenceItem.block == stack.getItem())
				return true;
			if (DarklatexgooItem.block == stack.getItem())
				return true;
			return false;
		}
	}
}
