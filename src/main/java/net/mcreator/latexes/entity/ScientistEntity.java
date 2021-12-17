
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
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.TemptGoal;
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
import net.mcreator.latexes.item.TabletItem;
import net.mcreator.latexes.entity.renderer.ScientistRenderer;
import net.mcreator.latexes.LatexModElements;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.HashMap;

@LatexModElements.ModElement.Tag
public class ScientistEntity extends LatexModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("scientist").setRegistryName("scientist");
	public ScientistEntity(LatexModElements instance) {
		super(instance, 23);
		FMLJavaModLoadingContext.get().getModEventBus().register(new ScientistRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13083257, -15604244, new Item.Properties().group(LatexentitiesItemGroup.tab))
				.setRegistryName("scientist_spawn_egg"));
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
			this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(2, new PanicGoal(this, 1.2));
			this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
			this.goalSelector.addGoal(4, new AvoidEntityGoal(this, MonsterEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(5, new AvoidEntityGoal(this, EvilMilitaryEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(6, new AvoidEntityGoal(this, EvilSniperEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(7, new AvoidEntityGoal(this, SlimelingEntity.CustomEntity.class, (float) 6, 1, 1.2));
			this.goalSelector.addGoal(8, new ReturnToVillageGoal(this, 0.6, false));
			this.goalSelector.addGoal(9, new TemptGoal(this, 1, Ingredient.fromItems(TabletItem.block), false));
			this.goalSelector.addGoal(10, new LookAtGoal(this, PlayerEntity.class, (float) 6));
			this.goalSelector.addGoal(11, new LookAtGoal(this, MilitaryEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(12, new LookAtGoal(this, ScientistEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(13, new LookAtGoal(this, EvilScientistEntity.CustomEntity.class, (float) 6));
			this.goalSelector.addGoal(14, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(15, new OpenDoorGoal(this, false));
			this.goalSelector.addGoal(16, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(17, new SwimGoal(this));
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
			this.playSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")),
					0.15f, 1);
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
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
