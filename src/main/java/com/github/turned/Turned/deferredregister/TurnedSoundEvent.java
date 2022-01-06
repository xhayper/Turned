package com.github.turned.Turned.deferredregister;

import com.github.turned.Turned.reference.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedSoundEvent {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> GOO = SOUND_EVENTS.register("goo", () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, "goo")));
}
