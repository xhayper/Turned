package io.github.changedmc.turned.deferredregister;

import io.github.changedmc.turned.entity.latex.DarkLatex;
import io.github.changedmc.turned.entity.latex.DarkLatexFox;
import io.github.changedmc.turned.entity.latex.DarkLatexSnowLeopard;
import io.github.changedmc.turned.entity.npc.Scientist;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, TurnedReference.MOD_ID);

    public static final RegistryObject<EntityType<DarkLatexSnowLeopard>> DARK_LATEX_SNOW_LEOPARD = ENTITY_TYPES.register("dark_latex_snow_leopard", () -> EntityType.Builder.of(DarkLatexSnowLeopard::new, MobCategory.CREATURE).sized(1.0f, 2.0f).build(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex_snow_leopard").toString()));

    public static final RegistryObject<EntityType<DarkLatexFox>> DARK_LATEX_FOX = ENTITY_TYPES.register("dark_latex_fox", () -> EntityType.Builder.of(DarkLatexFox::new, MobCategory.CREATURE).sized(1.0f, 2.0f).build(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex_fox").toString()));

    public static final RegistryObject<EntityType<DarkLatex>> DARK_LATEX = ENTITY_TYPES.register("dark_latex", () -> EntityType.Builder.of(DarkLatex::new, MobCategory.CREATURE).sized(1.0f, 2.0f).build(new ResourceLocation(TurnedReference.MOD_ID, "dark_latex").toString()));

    public static final RegistryObject<EntityType<Scientist>> SCIENTIST = ENTITY_TYPES.register("scientist", () -> EntityType.Builder.of(Scientist::new, MobCategory.CREATURE).sized(1.0f, 2.0f).build(new ResourceLocation(TurnedReference.MOD_ID, "scientist").toString()));

}