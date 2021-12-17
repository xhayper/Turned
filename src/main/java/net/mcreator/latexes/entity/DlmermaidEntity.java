
package net.mcreator.latexes.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.World;
import net.minecraft.world.IWorldReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.SwimmerPathNavigator;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.FollowMobGoal;
import net.minecraft.entity.ai.goal.BreakDoorGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerDetectGameruleProcedure;
import net.mcreator.latexes.procedures.DlsharkThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.DlsharkEntityDiesProcedure;
import net.mcreator.latexes.procedures.DlmermaidOnEntityTickUpdateProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.renderer.DlmermaidRenderer;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

@LatexModElements.ModElement.Tag
public class DlmermaidEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.7f, 2.1f)).build("dlmermaid").setRegistryName("dlmermaid");
	public DlmermaidEntity(LatexModElements instance) {
		super(instance, 13);
		FMLJavaModLoadingContext.get().getModEventBus().register(new DlmermaidRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -16777216, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("dlmermaid_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 22);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0.4);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 4);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.2);
			ammma = ammma.createMutableAttribute(ForgeMod.SWIM_SPEED.get(), 0.5);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 8;
			setNoAI(false);
			this.moveController = new MovementController(this) {
				@Override
				public void tick() {
					if (this.action == MovementController.Action.MOVE_TO && !CustomEntity.this.getNavigator().noPath()) {
						double dx = this.posX - CustomEntity.this.getPosX();
						double dy = this.posY - CustomEntity.this.getPosY();
						double dz = this.posZ - CustomEntity.this.getPosZ();
						float f = (float) (MathHelper.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
						CustomEntity.this.rotationYaw = this.limitAngle(CustomEntity.this.rotationYaw, f, 10);
						CustomEntity.this.renderYawOffset = CustomEntity.this.rotationYaw;
						CustomEntity.this.rotationYawHead = CustomEntity.this.rotationYaw;
						float f1 = (float) (this.speed * CustomEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						if (CustomEntity.this.isInWater()) {
							CustomEntity.this.setAIMoveSpeed(f1 * 0.1F);
							float f2 = -(float) (MathHelper.atan2(dy, MathHelper.sqrt(dx * dx + dz * dz)) * (180F / Math.PI));
							f2 = MathHelper.clamp(MathHelper.wrapDegrees(f2), -85, 85);
							CustomEntity.this.rotationPitch = this.limitAngle(CustomEntity.this.rotationPitch, f2, 5);
							float f3 = MathHelper.cos(CustomEntity.this.rotationPitch * (float) (Math.PI / 180.0));
							float f4 = MathHelper.sin(CustomEntity.this.rotationPitch * (float) (Math.PI / 180.0));
							CustomEntity.this.setMoveForward(f3 * f1);
							CustomEntity.this.setMoveVertical((float) (f1 * dy));
						} else {
							CustomEntity.this.setAIMoveSpeed(f1 * 0.05F);
						}
					} else {
						CustomEntity.this.setAIMoveSpeed(0);
						CustomEntity.this.setMoveVertical(0);
						CustomEntity.this.setMoveForward(0);
					}
				}
			};
			this.navigator = new SwimmerPathNavigator(this, this.world);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && TargetwearingmaskProcedure.executeProcedure(ImmutableMap.of("entity", entity));
				}
			});
			this.goalSelector.addGoal(2, new BreakDoorGoal(this, e -> true));
			this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 2, 40));
			this.goalSelector.addGoal(4, new FollowMobGoal(this, (float) 1, 10, 5));
			this.targetSelector.addGoal(5, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, ScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, WanderingTraderEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, IronGolemEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, WitchEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, VindicatorEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, EvokerEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, ZombieEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, ZombieVillagerEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, CodEntity.class, true, false));
			this.goalSelector.addGoal(27, new BreakBlockGoal(Blocks.OAK_LOG, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(28, new BreakBlockGoal(Blocks.ACACIA_LOG, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(29, new BreakBlockGoal(Blocks.OAK_PLANKS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(30, new BreakBlockGoal(Blocks.SPRUCE_PLANKS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(31, new BreakBlockGoal(Blocks.ACACIA_PLANKS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(32, new BreakBlockGoal(Blocks.DARK_OAK_PLANKS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(33, new BreakBlockGoal(Blocks.BIRCH_PLANKS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(34, new BreakBlockGoal(Blocks.JUNGLE_PLANKS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(35, new BreakBlockGoal(Blocks.OAK_STAIRS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(36, new BreakBlockGoal(Blocks.DARK_OAK_STAIRS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(37, new BreakBlockGoal(Blocks.ACACIA_STAIRS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(38, new BreakBlockGoal(Blocks.SPRUCE_STAIRS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(39, new BreakBlockGoal(Blocks.BIRCH_STAIRS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(40, new BreakBlockGoal(Blocks.JUNGLE_STAIRS, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(41, new BreakBlockGoal(Blocks.OAK_SLAB, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(42, new BreakBlockGoal(Blocks.DARK_OAK_SLAB, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(43, new BreakBlockGoal(Blocks.ACACIA_SLAB, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(44, new BreakBlockGoal(Blocks.SPRUCE_SLAB, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(45, new BreakBlockGoal(Blocks.BIRCH_SLAB, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(46, new BreakBlockGoal(Blocks.JUNGLE_SLAB, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.ARTHROPOD;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
			this.entityDropItem(new ItemStack(DarklatexgooItem.block));
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
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
				return false;
			if (source == DamageSource.DROWN)
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
				DlsharkEntityDiesProcedure.executeProcedure($_dependencies);
			}
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
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				DlsharkThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void baseTick() {
			super.baseTick();
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				DlmermaidOnEntityTickUpdateProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean canBreatheUnderwater() {
			return true;
		}

		@Override
		public boolean isNotColliding(IWorldReader worldreader) {
			return worldreader.checkNoEntityCollision(this, VoxelShapes.create(this.getBoundingBox()));
		}

		@Override
		public boolean isPushedByWater() {
			return false;
		}
	}
}
