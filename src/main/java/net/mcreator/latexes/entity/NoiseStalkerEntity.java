
package net.mcreator.latexes.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.ZoglinEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.BreakDoorGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerDetectGameruleProcedure;
import net.mcreator.latexes.procedures.NightstalkertestPlayerCollidesWithThisEntityProcedure;
import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.renderer.NoiseStalkerRenderer;
import net.mcreator.latexes.LatexModElements;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

@LatexModElements.ModElement.Tag
public class NoiseStalkerEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(48).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.8f, 2.1f)).build("noise_stalker").setRegistryName("noise_stalker");
	public NoiseStalkerEntity(LatexModElements instance) {
		super(instance, 9);
		FMLJavaModLoadingContext.get().getModEventBus().register(new NoiseStalkerRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13816531, -16777216, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("noise_stalker_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 42);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 6);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 6);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 0.1);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 12;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new BreakDoorGoal(this, e -> true));
			this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, true) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && TargetwearingmaskProcedure.executeProcedure(ImmutableMap.of("entity", entity));
				}
			});
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MilitaryEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ScientistEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, false, true));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, true));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, VillagerEntity.class, false, true));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, WanderingTraderEntity.class, false, true));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, IronGolemEntity.class, false, true));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, WitchEntity.class, false, true));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, PillagerEntity.class, false, true));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, VindicatorEntity.class, false, true));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, EvokerEntity.class, false, true));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, ZombieEntity.class, false, true));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, ZombieVillagerEntity.class, false, true));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, PiglinEntity.class, false, true));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, ZombifiedPiglinEntity.class, false, true));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, false, true));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, ZoglinEntity.class, false, true));
			this.goalSelector.addGoal(24, new BreakBlockGoal(Blocks.SMOOTH_STONE, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(25, new BreakBlockGoal(Blocks.SMOOTH_SANDSTONE, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(26, new BreakBlockGoal(Blocks.SMOOTH_RED_SANDSTONE, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(27, new BreakBlockGoal(Blocks.BIRCH_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(28, new BreakBlockGoal(Blocks.SPRUCE_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(29, new BreakBlockGoal(Blocks.OAK_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(30, new BreakBlockGoal(Blocks.JUNGLE_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(31, new BreakBlockGoal(Blocks.ACACIA_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(32, new BreakBlockGoal(Blocks.DARK_OAK_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(33, new BreakBlockGoal(Blocks.CRIMSON_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(34, new BreakBlockGoal(Blocks.WARPED_DOOR, this, 1, (int) 3) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && NoiseStalkerDetectGameruleProcedure.executeProcedure(ImmutableMap.of("world", world));
				}
			});
			this.goalSelector.addGoal(35, new RandomWalkingGoal(this, 0.8));
			this.targetSelector.addGoal(36, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(37, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(38, new SwimGoal(this));
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient"));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f,
					1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.hurt"));
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
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				DarklatexEntityDiesProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public ILivingEntityData onInitialSpawn(IServerWorld world, DifficultyInstance difficulty, SpawnReason reason,
				@Nullable ILivingEntityData livingdata, @Nullable CompoundNBT tag) {
			ILivingEntityData retval = super.onInitialSpawn(world, difficulty, reason, livingdata, tag);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				NoiseStalkerOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
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
				NoiseStalkerThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onCollideWithPlayer(PlayerEntity sourceentity) {
			super.onCollideWithPlayer(sourceentity);
			Entity entity = this;
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				NightstalkertestPlayerCollidesWithThisEntityProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
