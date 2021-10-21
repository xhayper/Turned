package com.changedmc.turned.entity;

import com.changedmc.turned.capability.Transfur;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityDarkLatexM extends EntityMob
{
	
	
	
	public EntityDarkLatexM(World worldIn) {
		super(worldIn);
		
	}
	protected void initEntityAI()
	{
        this.tasks.addTask(0, (EntityAIBase) new EntityAISwimming(this));
        this.tasks.addTask(5, (EntityAIBase) new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, (EntityAIBase) new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, (EntityAIBase) new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, (EntityAIBase) new EntityAILookIdle(this));
        this.tasks.addTask(6, (EntityAIBase) new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(2, (EntityAIBase) new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, (EntityAIBase) new EntityAINearestAttackableTarget(this, EntityEyelessWhiteLatex.class, true));
        this.targetTasks.addTask(3, (EntityAIBase) new EntityAINearestAttackableTarget(this, EntityWhiteKnight.class, true));
        this.targetTasks.addTask(3, (EntityAIBase) new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        this.targetTasks.addTask(3, (EntityAIBase) new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        this.tasks.addTask(8, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.0D, true));
    }
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.300045D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
    }
    public void onKillEntity(EntityLivingBase entityLivingIn)
    {
        super.onKillEntity(entityLivingIn);
        
        if (entityLivingIn instanceof EntityVillager)
        {

            EntityVillager entityvillager = (EntityVillager)entityLivingIn;
            EntityDarkLatexM entitydarklatexm = new EntityDarkLatexM(this.world);
            entitydarklatexm.copyLocationAndAnglesFrom(entityvillager);
            this.world.removeEntity(entityvillager);
            entitydarklatexm.onInitialSpawn(this.world.getDifficultyForLocation(new BlockPos(entitydarklatexm)), null);
            
            if (entityvillager.hasCustomName())
            {
            	entitydarklatexm.setCustomNameTag(entityvillager.getCustomNameTag());
            	entitydarklatexm.setAlwaysRenderNameTag(entityvillager.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entitydarklatexm);
            
        }
    	
    }
}

