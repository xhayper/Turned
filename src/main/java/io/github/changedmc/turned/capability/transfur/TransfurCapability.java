package io.github.changedmc.turned.capability.transfur;

import io.github.changedmc.turned.networking.NetworkManager;
import io.github.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.network.PacketDistributor;

import javax.annotation.Nonnull;

public class TransfurCapability {
    public static final ResourceLocation KEY = new ResourceLocation(TurnedReference.MOD_ID, "transfur_capability");

    public static final Capability<ITransfurCapability> TRANSFUR_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() {
    });

    public static void register(RegisterCapabilitiesEvent event) {
        event.register(ITransfurCapability.class);
    }


    public static class Default implements ITransfurCapability {
        private Entity entity;

        private int transfurType;
        private int latexLevel;
        private boolean isTransfured;

        @Override
        public int getTransfurType() {
            return transfurType;
        }

        public void setTransfurType(int type) {
            this.transfurType = type;
        }

        @Override
        public boolean isTransfured() {
            return this.isTransfured;
        }

        public void setTransfured(boolean isTransfured) {
            this.isTransfured = isTransfured;
        }

        @Override
        public void setEntity(Entity entity) {
            this.entity = entity;
        }

        @Override
        public int getLatexLevel() {
            return this.latexLevel;
        }

        @Override
        public void setLatexLevel(int latexLevel) {
            this.latexLevel = Math.min(latexLevel, 100);
        }

        @Override
        public void syncCapability() {
            DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER, () -> () -> NetworkManager.INSTANCE.send(PacketDistributor.TRACKING_ENTITY.with(() -> this.entity), new SyncTransfurCapability(this.entity.getId(), this.transfurType, this.latexLevel, this.isTransfured)));
        }
    }

    public static class Provider implements ICapabilitySerializable<CompoundTag> {
        final TransfurCapability.Default defaultTransfurCapability = new TransfurCapability.Default();
        final LazyOptional<ITransfurCapability> opt = LazyOptional.of(() -> defaultTransfurCapability);

        public Provider(Entity entity) {
            this.defaultTransfurCapability.setEntity(entity);
        }

        public void invalidate() {
            opt.invalidate();
        }

        @Nonnull
        @Override
        public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, Direction facing) {
            return TRANSFUR_CAPABILITY.orEmpty(capability, opt);
        }

        @Override
        public void deserializeNBT(CompoundTag compoundTag) {
            defaultTransfurCapability.setTransfurType(compoundTag.getInt("transfurType"));
            defaultTransfurCapability.setLatexLevel(compoundTag.getInt("latexLevel"));
            defaultTransfurCapability.setTransfured(compoundTag.getBoolean("isTransfured"));
            defaultTransfurCapability.syncCapability();
        }

        @Override
        public CompoundTag serializeNBT() {
            if (TransfurCapability.TRANSFUR_CAPABILITY == null) {
                return new CompoundTag();
            } else {
                CompoundTag compoundNBT = new CompoundTag();
                compoundNBT.putInt("transfurType", defaultTransfurCapability.getTransfurType());
                compoundNBT.putInt("latexLevel", defaultTransfurCapability.getLatexLevel());
                compoundNBT.putBoolean("isTransfured", defaultTransfurCapability.isTransfured());
                return compoundNBT;
            }
        }
    }
}
