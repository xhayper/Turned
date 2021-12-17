
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.SpellcastingIllagerEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.FollowMobGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.latexes.procedures.MilitaryOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.TabletItem;
import net.mcreator.latexes.item.M4AssaultRifleItem;
import net.mcreator.latexes.entity.renderer.MilitaryRenderer;
import net.mcreator.latexes.LatexModElements;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class MilitaryEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("military").setRegistryName("military");
	public MilitaryEntity(LatexModElements instance) {
		super(instance, 24);
		FMLJavaModLoadingContext.get().getModEventBus().register(new MilitaryRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -14858464, -13473224, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("military_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 20);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends CreatureEntity implements IRangedAttackMob {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(M4AssaultRifleItem.block));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, DROPPODEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, TSCOutsiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, TSCOutsiderGunnerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, TSCdroneEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, TSCHunterEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, DarkLatexArcherEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, YufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, NoiseStalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, SYufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, DlmermaidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, DlsharkEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, DarkLatexSkeletonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, DarkLatexFoxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, DarkLatexDragonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, DLbeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, DarkLatexFoxSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, DarkLatexSnakeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, DarkLatexFoxScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, DarkLatexMothEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, DarkLatexSnepEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, DarklatexslugEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, DarkLatexMothEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, IllusionerEntity.class, true, false));
			this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, RavagerEntity.class, true, false));
			this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, SpellcastingIllagerEntity.class, true, false));
			this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, VindicatorEntity.class, true, false));
			this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false));
			this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, MonsterEntity.class, true, false));
			this.goalSelector.addGoal(40, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(41, new TemptGoal(this, 1, Ingredient.fromItems(TabletItem.block), false));
			this.goalSelector.addGoal(42, new FollowMobGoal(this, (float) 1, 10, 5));
			this.goalSelector.addGoal(43, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(44, new LookAtGoal(this, MilitaryEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(45, new LookAtGoal(this, ScientistEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(46, new LookAtGoal(this, MilitaryRiotEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(47, new LookAtGoal(this, PlayerEntity.class, (float) 6));
			this.goalSelector.addGoal(48, new OpenDoorGoal(this, false));
			this.targetSelector.addGoal(49, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(50, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(51, new SwimGoal(this));
			this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
				@Override
				public boolean shouldContinueExecuting() {
					return this.shouldExecute();
				}
			});
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			return super.attackEntityFrom(source, amount);
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
				MilitaryOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			M4AssaultRifleItem.shoot(this, target);
		}
	}
}
