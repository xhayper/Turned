
package net.mcreator.latexes.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.ZoglinEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.YufengEntityDiesProcedure;
import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
import net.mcreator.latexes.procedures.DLbeeThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.CheckforskyProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.renderer.DLbeeRenderer;
import net.mcreator.latexes.LatexModElements;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

import com.google.common.collect.ImmutableMap;

@LatexModElements.ModElement.Tag
public class DLbeeEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.9f)).build("d_lbee").setRegistryName("d_lbee");
	public DLbeeEntity(LatexModElements instance) {
		super(instance, 19);
		FMLJavaModLoadingContext.get().getModEventBus().register(new DLbeeRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13948117, -10066432, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("d_lbee_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 20);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 4);
			ammma = ammma.createMutableAttribute(Attributes.FLYING_SPEED, 0.5);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 6;
			setNoAI(false);
			this.moveController = new FlyingMovementController(this, 10, true);
			this.navigator = new FlyingPathNavigator(this, this.world);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new Goal() {
				{
					this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
				}
				public boolean shouldExecute() {
					if (CustomEntity.this.getAttackTarget() != null && !CustomEntity.this.getMoveHelper().isUpdating()) {
						double x = CustomEntity.this.getPosX();
						double y = CustomEntity.this.getPosY();
						double z = CustomEntity.this.getPosZ();
						Entity entity = CustomEntity.this;
						return TargetwearingmaskProcedure.executeProcedure(ImmutableMap.of("entity", entity));
					} else {
						return false;
					}
				}

				@Override
				public boolean shouldContinueExecuting() {
					return CustomEntity.this.getMoveHelper().isUpdating() && CustomEntity.this.getAttackTarget() != null
							&& CustomEntity.this.getAttackTarget().isAlive();
				}

				@Override
				public void startExecuting() {
					LivingEntity livingentity = CustomEntity.this.getAttackTarget();
					Vector3d vec3d = livingentity.getEyePosition(1);
					CustomEntity.this.moveController.setMoveTo(vec3d.x, vec3d.y, vec3d.z, 1);
				}

				@Override
				public void tick() {
					LivingEntity livingentity = CustomEntity.this.getAttackTarget();
					if (CustomEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
						CustomEntity.this.attackEntityAsMob(livingentity);
					} else {
						double d0 = CustomEntity.this.getDistanceSq(livingentity);
						if (d0 < 16) {
							Vector3d vec3d = livingentity.getEyePosition(1);
							CustomEntity.this.moveController.setMoveTo(vec3d.x, vec3d.y, vec3d.z, 1);
						}
					}
				}
			});
			this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1, true) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && TargetwearingmaskProcedure.executeProcedure(ImmutableMap.of("entity", entity));
				}
			});
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, SpiderEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, WanderingTraderEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, IronGolemEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, BeeEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, WitchEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, VindicatorEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, EvokerEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, SkeletonEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, ZombieEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, ZombieVillagerEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, ZoglinEntity.class, true, false));
			this.goalSelector.addGoal(28, new WaterAvoidingRandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(29, new RandomWalkingGoal(this, 0.8, 20) {
				@Override
				protected Vector3d getPosition() {
					Random random = CustomEntity.this.getRNG();
					double dir_x = CustomEntity.this.getPosX() + ((random.nextFloat() * 2 - 1) * 16);
					double dir_y = CustomEntity.this.getPosY() + ((random.nextFloat() * 2 - 1) * 16);
					double dir_z = CustomEntity.this.getPosZ() + ((random.nextFloat() * 2 - 1) * 16);
					return new Vector3d(dir_x, dir_y, dir_z);
				}

				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && CheckforskyProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world));
				}
			});
			this.targetSelector.addGoal(30, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(31, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(32, new SwimGoal(this));
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
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
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
		public boolean onLivingFall(float l, float d) {
			return false;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.CACTUS)
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
				YufengEntityDiesProcedure.executeProcedure($_dependencies);
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
				$_dependencies.put("sourceentity", sourceentity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				DLbeeThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
		}

		@Override
		public void setNoGravity(boolean ignored) {
			super.setNoGravity(true);
		}

		public void livingTick() {
			super.livingTick();
			this.setNoGravity(true);
		}
	}
}
