
package net.mcreator.latexes.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.BreakDoorGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
import net.mcreator.latexes.procedures.DarkLatexSkeletonThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.entity.renderer.DarkLatexSkeletonRenderer;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

@LatexModElements.ModElement.Tag
public class DarkLatexSkeletonEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("dark_latex_skeleton").setRegistryName("dark_latex_skeleton");
	public DarkLatexSkeletonEntity(LatexModElements instance) {
		super(instance, 6);
		FMLJavaModLoadingContext.get().getModEventBus().register(new DarkLatexSkeletonRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13421773, -16768763, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("dark_latex_skeleton_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 25);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 2);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.5);
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
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.1, true) {
				@Override
				public boolean shouldExecute() {
					double x = CustomEntity.this.getPosX();
					double y = CustomEntity.this.getPosY();
					double z = CustomEntity.this.getPosZ();
					Entity entity = CustomEntity.this;
					return super.shouldExecute() && TargetwearingmaskProcedure.executeProcedure(ImmutableMap.of("entity", entity));
				}
			});
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, WanderingTraderEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, IronGolemEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, WitchEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, AHVHertxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, EvokerEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, BeeEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, GuardianEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, FoxEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, ZombieEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, ZombieVillagerEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.goalSelector.addGoal(24, new BreakDoorGoal(this, e -> true));
			this.goalSelector.addGoal(25, new RandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(26, new LookAtGoal(this, DarkLatexDragonEntity.CustomEntity.class, (float) 6));
			this.targetSelector.addGoal(27, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(28, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(29, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEAD;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
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
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.death"));
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
				DarkLatexSkeletonThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
