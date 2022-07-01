package io.github.changedmc.turned.deferredregister;

import io.github.changedmc.turned.fluid.DarkLatexFluid;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedFluid {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, TurnedReference.MOD_ID);

    public static final RegistryObject<DarkLatexFluid.Source> DARK_LATEX = FLUIDS.register("dark_latex_fluid", DarkLatexFluid.Source::new);
    public static final RegistryObject<DarkLatexFluid.Flowing> FLOWING_DARK_LATEX = FLUIDS.register("flowing_dark_latex_fluid", DarkLatexFluid.Flowing::new);
}
