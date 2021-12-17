
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
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.merchant.villager.WanderingTraderEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.TSCOutsiderGunnerEntityDiesProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.item.TSCPistolItem;
import net.mcreator.latexes.entity.renderer.TSCOutsiderGunnerRenderer;
import net.mcreator.latexes.block.DarklatexhiveBlock;
import net.mcreator.latexes.block.DarklatexblockharmlessBlock;
import net.mcreator.latexes.block.DarklatexblockcrystalgrowBlock;
import net.mcreator.latexes.block.DarklatexblockBlock;
import net.mcreator.latexes.LatexModElements;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class TSCOutsiderGunnerEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire()
			.size(0.6f, 1.8f)).build("tsc_outsider_gunner").setRegistryName("tsc_outsider_gunner");
	public TSCOutsiderGunnerEntity(LatexModElements instance) {
		super(instance, 30);
		FMLJavaModLoadingContext.get().getModEventBus().register(new TSCOutsiderGunnerRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -3355444, -3407872, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("tsc_outsider_gunner_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 30);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 6);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.5);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity implements IRangedAttackMob {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
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
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(4, new LookAtGoal(this, EvilScientistEntity.CustomEntity.class, (float) 4));
			this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, (float) 8));
			this.goalSelector.addGoal(6, new LookAtGoal(this, ScientistEntity.CustomEntity.class, (float) 6));
			this.targetSelector.addGoal(7, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(8, new BreakBlockGoal(DarklatexblockBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(9, new BreakBlockGoal(DarklatexblockharmlessBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(10, new BreakBlockGoal(DarklatexblockcrystalgrowBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(11, new BreakBlockGoal(DarklatexhiveBlock.block, this, 1, (int) 3));
			this.goalSelector.addGoal(12, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(13, new SwimGoal(this));
			this.goalSelector.addGoal(14, new OpenDoorGoal(this, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, DarkLatexArcherEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, MilitaryEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, MilitaryRiotEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, ScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, DarklatexEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, YufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, NoiseStalkerEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, SYufengEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, DlmermaidEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, DlsharkEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, DarkLatexSkeletonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, DarkLatexFoxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, DarkLatexDragonEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, DLbeeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, SlimelingEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, DarkLatexFoxSniperEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, DarkLatexSnakeEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, DarkLatexFoxScientistEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, BeeHertxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, AHVHertxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, NXTHertxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(40, new NearestAttackableTargetGoal(this, La4tankmorphrEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(41, new NearestAttackableTargetGoal(this, La4tankmorphmEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(42, new NearestAttackableTargetGoal(this, HertxEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(43, new NearestAttackableTargetGoal(this, DarklatexslugEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(44, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(45, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(46, new NearestAttackableTargetGoal(this, DarkLatexMothEntity.CustomEntity.class, true, false));
			this.targetSelector.addGoal(47, new NearestAttackableTargetGoal(this, VillagerEntity.class, true, false));
			this.targetSelector.addGoal(48, new NearestAttackableTargetGoal(this, WanderingTraderEntity.class, true, false));
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

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
			this.entityDropItem(new ItemStack(Items.IRON_INGOT));
		}

		@Override
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")),
					0.15f, 1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source.getImmediateSource() instanceof PotionEntity)
				return false;
			if (source == DamageSource.DROWN)
				return false;
			if (source == DamageSource.DRAGON_BREATH)
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
				TSCOutsiderGunnerEntityDiesProcedure.executeProcedure($_dependencies);
			}
		}

		public void attackEntityWithRangedAttack(LivingEntity target, float flval) {
			TSCPistolItem.shoot(this, target);
		}
	}
}
