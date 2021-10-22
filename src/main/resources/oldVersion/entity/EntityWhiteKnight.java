package com.changedmc.turned.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class EntityWhiteKnight extends Monster {
    public EntityWhiteKnight(EntityType<? extends Zombie> p_34271_, Level p_34272_) {
        super(p_34271_, p_34272_);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, EntityDarkLatexM.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, EntityEyelessWhiteLatex.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Villager.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
    }

    public static AttributeSupplier.Builder createMonsterAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.FOLLOW_RANGE, 40.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.300045D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D)
                .add(Attributes.ARMOR, 2.0D);
    }
}