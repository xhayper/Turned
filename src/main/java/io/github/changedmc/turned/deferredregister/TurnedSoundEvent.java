package io.github.changedmc.turned.deferredregister;

import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedSoundEvent {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TurnedReference.MOD_ID);

    public static final RegistryObject<SoundEvent> GOO = SOUND_EVENTS.register("goo", () -> new SoundEvent(new ResourceLocation(TurnedReference.MOD_ID, "goo")));
    public static final RegistryObject<SoundEvent> CRYSTAL_ZONE = SOUND_EVENTS.register("crystal_zone", () -> new SoundEvent(new ResourceLocation(TurnedReference.MOD_ID, "crystal_zone")));
}
