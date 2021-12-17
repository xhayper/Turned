
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
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.ReturnToVillageGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
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
import net.minecraft.block.BlockState;

import net.mcreator.latexes.procedures.ScientistOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.itemgroup.LatexentitiesItemGroup;
import net.mcreator.latexes.entity.renderer.EvilScientistRenderer;
import net.mcreator.latexes.LatexModElements;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class EvilScientistEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("evil_scientist").setRegistryName("evil_scientist");
	public EvilScientistEntity(LatexModElements instance) {
		super(instance, 26);
		FMLJavaModLoadingContext.get().getModEventBus().register(new EvilScientistRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13083257, -3407872, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("evil_scientist_spawn_egg"));
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

	public static class CustomEntity extends CreatureEntity {
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
			this.goalSelector.addGoal(1, new AvoidEntityGoal(this, MilitaryEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(2, new AvoidEntityGoal(this, MilitaryflameunitEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(3, new AvoidEntityGoal(this, MilitaryRiotEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(4, new AvoidEntityGoal(this, La4tankmorphmEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(5, new AvoidEntityGoal(this, La4tankmorphrEntity.CustomEntity.class, (float) 10, 1, 1.2));
			this.goalSelector.addGoal(6, new AvoidEntityGoal(this, DarklatexEntity.CustomEntity.class, (float) 10, 1, 1.2));
			this.goalSelector.addGoal(7, new AvoidEntityGoal(this, DarkLatexArcherEntity.CustomEntity.class, (float) 10, 1, 1.2));
			this.goalSelector.addGoal(8, new AvoidEntityGoal(this, YufengEntity.CustomEntity.class, (float) 10, 1, 1.2));
			this.goalSelector.addGoal(9, new AvoidEntityGoal(this, NoiseStalkerEntity.CustomEntity.class, (float) 10, 1, 1.2));
			this.goalSelector.addGoal(10, new PanicGoal(this, 1.2));
			this.targetSelector.addGoal(11, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(12, new ReturnToVillageGoal(this, 0.6, false));
			this.goalSelector.addGoal(13, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(14, new LookAtGoal(this, TSCOutsiderEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(15, new LookAtGoal(this, TSCOutsiderGunnerEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(16, new LookAtGoal(this, TSCHunterEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(17, new LookAtGoal(this, EvilScientistEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(18, new LookAtGoal(this, ScientistEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(19, new LookAtGoal(this, PlayerEntity.class, (float) 6));
			this.goalSelector.addGoal(20, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(21, new OpenDoorGoal(this, false));
			this.goalSelector.addGoal(22, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(23, new SwimGoal(this));
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
		public void playStepSound(BlockPos pos, BlockState blockIn) {
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")),
					0.15f, 1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
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
				ScientistOnInitialEntitySpawnProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
