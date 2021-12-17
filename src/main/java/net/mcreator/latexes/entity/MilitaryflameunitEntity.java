
package net.mcreator.latexes.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.SpellcastingIllagerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.FlamethowerItem;
import net.mcreator.latexes.entity.renderer.MilitaryflameunitRenderer;
import net.mcreator.latexes.block.DarklatexblockharmlessBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexModElements;

@LatexModElements.ModElement.Tag
public class MilitaryflameunitEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire()
			.size(0.6f, 1.8f)).build("militaryflameunit").setRegistryName("militaryflameunit");
	public MilitaryflameunitEntity(LatexModElements instance) {
		super(instance, 25);
		FMLJavaModLoadingContext.get().getModEventBus().register(new MilitaryflameunitRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -14858464, -13473224, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("militaryflameunit_spawn_egg"));
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
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(FlamethowerItem.block));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, DROPPODEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, EvilSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EvilScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DarkLatexArcherEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, YufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, NoiseStalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, SYufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, DlmermaidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, DlsharkEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, DarkLatexSkeletonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, DarkLatexFoxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, DarkLatexDragonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, DLbeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, DarkLatexFoxSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, DarkLatexSnakeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, DarkLatexFoxScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, DarklatexslugEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, DarkLatexMothEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, IllusionerEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, PillagerEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, SpellcastingIllagerEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, VindicatorEntity.class, true, false));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, PiglinEntity.class, true, false));
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, true, false));
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, MonsterEntity.class, true, false));
			this.goalSelector.addGoal(33, new MeleeAttackGoal(this, 1, false));
			this.goalSelector.addGoal(34, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(35, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(36, new OpenDoorGoal(this, false));
			this.goalSelector.addGoal(37, new BreakBlockGoal(DarklatexblockBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(38, new BreakBlockGoal(DarklatexblockharmlessBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(39, new BreakBlockGoal(DarklatexblockcrystalgrowBlock.block, this, 1, (int) 3));
			this.targetSelector.addGoal(40, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(41, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(42, new SwimGoal(this));
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
			if (source == DamageSource.DRAGON_BREATH)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			FlamethowerItem.shoot(this, target);
		}
	}
}
