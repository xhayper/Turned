
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
import net.minecraft.item.ItemStack;
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
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.latexes.procedures.MilitaryRiotOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.item.RiotarmorItem;
import net.mcreator.latexes.item.BatonItem;
import net.mcreator.latexes.entity.renderer.MilitaryRiotRenderer;
import net.mcreator.latexes.LatexModElements;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class MilitaryRiotEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("military_riot").setRegistryName("military_riot");
	public MilitaryRiotEntity(LatexModElements instance) {
		super(instance, 33);
		FMLJavaModLoadingContext.get().getModEventBus().register(new MilitaryRiotRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
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
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 1);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			enablePersistence();
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(BatonItem.block));
			this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(RiotarmorItem.helmet));
			this.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(RiotarmorItem.body));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, false));
			this.goalSelector.addGoal(2, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(4, new LookAtGoal(this, ScientistEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(5, new LookAtGoal(this, MilitaryEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, (float) 6));
			this.goalSelector.addGoal(7, new OpenDoorGoal(this, false));
			this.targetSelector.addGoal(8, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(9, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(10, new SwimGoal(this));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, TSCOutsiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, TSCOutsiderGunnerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, TSCdroneEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, TSCHunterEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, YufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, NoiseStalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, SYufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, DlmermaidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, DlsharkEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, DarkLatexSkeletonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, DarkLatexFoxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, DarkLatexDragonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, DLbeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, DarkLatexFoxSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, DarkLatexSnakeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, DarkLatexFoxScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, DarkLatexMothEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, DarkLatexSnepEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, DarklatexslugEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, IllusionerEntity.class, true, false));
			this.targetSelector.addGoal(40, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(41, new NearestAttackableTargetGoal(this, RavagerEntity.class, true, false));
			this.targetSelector.addGoal(42, new NearestAttackableTargetGoal(this, SpellcastingIllagerEntity.class, true, false));
			this.targetSelector.addGoal(43, new NearestAttackableTargetGoal(this, VindicatorEntity.class, true, false));
			this.targetSelector.addGoal(44, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false));
			this.targetSelector.addGoal(45, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.targetSelector.addGoal(46, new NearestAttackableTargetGoal(this, MonsterEntity.class, true, false));
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
				MilitaryRiotOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
