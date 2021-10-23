package com.changedmc.turned.entity;

import com.changedmc.turned.entity.latex.DarkLatexMaleEntity;
import com.changedmc.turned.entity.latex.DarkLatexSnowLeopardEntity;
import com.changedmc.turned.util.Reference;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TurnedEntityType {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);

    public static final RegistryObject<EntityType<DarkLatexMaleEntity>> DARK_LATEX_MALE = ENTITY_TYPES.register("dark_latex_male", () -> EntityType.Builder.of(DarkLatexMaleEntity::new, EntityClassification.CREATURE).sized(1.0f, 2.0f).build(new ResourceLocation(Reference.MOD_ID, "dark_latex_male").toString()));


    public static final RegistryObject<EntityType<DarkLatexSnowLeopardEntity>> DARK_LATEX_SNOW_LEOPARD = ENTITY_TYPES.register("dark_latex_snow_leopard", () -> EntityType.Builder.of(DarkLatexSnowLeopardEntity::new, EntityClassification.CREATURE).sized(1.0f, 2.0f).build(new ResourceLocation(Reference.MOD_ID, "dark_latex_snow_leopard").toString()));
}