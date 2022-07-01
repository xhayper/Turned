package io.github.changedmc.turned.util;

import com.google.common.collect.ImmutableList;
import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.config.TurnedServerConfig;
import io.github.changedmc.turned.deferredregister.TurnedSoundEvent;
import io.github.changedmc.turned.entity.latex.Latex;
import io.github.changedmc.turned.item.LatexUsableItem;
import io.github.changedmc.turned.reference.TurnedItemTier;
import io.github.changedmc.turned.reference.TurnedLatexType;
import io.github.changedmc.turned.transfur.TransfurManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.TieredItem;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class Utility {

    public static EntityRendererProvider.Context getEntityRendererContext() {
        return new EntityRendererProvider.Context(
                Minecraft.getInstance().getEntityRenderDispatcher(),
                Minecraft.getInstance().getItemRenderer(),
                Minecraft.getInstance().getResourceManager(),
                Minecraft.getInstance().getEntityModels(),
                Minecraft.getInstance().font);
    }

    public static void removeAllNonLatexItem(@Nonnull Entity entity) {
        if (TurnedServerConfig.CAN_LATEX_ONLY_USE_LATEX_ITEM.get()) {
            if (entity instanceof Player p && !p.isCreative() && !p.isSpectator()) {
                for (List<ItemStack> list : ImmutableList.of(p.getInventory().items, p.getInventory().armor, p.getInventory().offhand)) {
                    for (int i = 0; i < list.size(); i++) {
                        ItemStack itemstack = list.get(i);
                        if (itemstack.isEmpty() || Utility.isItemLatexHoldable(itemstack.getItem())) continue;
                        ItemEntity itemEntity = Utility.dropItem(p, itemstack, true, true, true);
                        if (itemEntity != null) {
                            list.set(i, ItemStack.EMPTY);
                        }
                    }
                }
            } else {
                for (ItemStack itemstack : entity.getAllSlots()) {
                    if (itemstack.isEmpty() || Utility.isItemLatexHoldable(itemstack.getItem())) continue;
                    Utility.dropItem(entity, itemstack, true, true, true);
                }
            }
        }
    }

    public static ItemEntity dropItem(Entity entity, ItemStack pDroppedItem, boolean autoAddEntity, boolean pDropAround, boolean pTraceItem) {
        if (pDroppedItem.isEmpty()) {
            return null;
        } else {
            ItemStack itemStackClone = pDroppedItem.copy();
            pDroppedItem.setCount(0);
            Random random = new Random();

            if (entity.level.isClientSide && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).swing(InteractionHand.MAIN_HAND);
            }

            double d0 = entity.getEyeY() - (double) 0.3F;
            ItemEntity itementity = new ItemEntity(entity.level, entity.getX(), d0, entity.getZ(), itemStackClone);
            itementity.setPickUpDelay(40);

            if (pTraceItem) {
                itementity.setThrower(entity.getUUID());
            }

            if (pDropAround) {
                float f = random.nextFloat() * 0.5F;
                float f1 = random.nextFloat() * ((float) Math.PI * 2F);
                itementity.setDeltaMovement(-Mth.sin(f1) * f, 0.2F, Mth.cos(f1) * f);
            } else {
                float f8 = Mth.sin(entity.getXRot() * ((float) Math.PI / 180F));
                float f2 = Mth.cos(entity.getXRot() * ((float) Math.PI / 180F));
                float f3 = Mth.sin(entity.getYRot() * ((float) Math.PI / 180F));
                float f4 = Mth.cos(entity.getYRot() * ((float) Math.PI / 180F));
                float f5 = random.nextFloat() * ((float) Math.PI * 2F);
                float f6 = 0.02F * random.nextFloat();
                itementity.setDeltaMovement((double) (-f3 * f2 * 0.3F) + Math.cos(f5) * (double) f6, -f8 * 0.3F + 0.1F + (random.nextFloat() - random.nextFloat()) * 0.1F, (double) (f4 * f2 * 0.3F) + Math.sin(f5) * (double) f6);
            }
            if (autoAddEntity && !entity.getLevel().isClientSide()) entity.getLevel().addFreshEntity(itementity);
            return itementity;
        }
    }

    public static Boolean isItemLatexHoldable(Item item) {
        boolean itemIsLatexHoldable = item instanceof LatexUsableItem;
        itemIsLatexHoldable = itemIsLatexHoldable || ((item instanceof TieredItem) && ((TieredItem) item).getTier() == TurnedItemTier.DARK_LATEX);
        itemIsLatexHoldable = itemIsLatexHoldable || item instanceof SpawnEggItem;
        return itemIsLatexHoldable;
    }

    public static <T extends Mob> EntityType<T> getTypedType(Entity entity) {
        if (!(entity instanceof Mob)) return null;
        //noinspection ALL
        return (EntityType<T>) entity.getType();
    }

    public static <T extends Mob> EntityType<T> getTypedType(EntityType<?> entityType) {
        //noinspection ALL
        return (EntityType<T>) entityType;
    }

    @Nullable
    public static <T extends Mob> EntityType<T> getTransfurType(Entity source, Entity target, @Nullable ITransfurCapability sourceCap) {
        ITransfurCapability sourceTransfurCapability = sourceCap != null ? sourceCap : source.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if ((!(source instanceof Latex) && !(source instanceof Player)) || ((source instanceof Player) && sourceTransfurCapability == null))
            return null;
        EntityType<T> sourceType = source instanceof Player ? getTypedType(TransfurManager.entityTypeHashMap.get(sourceTransfurCapability.getTransfurType())) : getTypedType((Latex) source);
        EntityType<T> targetType = getTypedType(target);
        //noinspection ALL
        return (TurnedLatexType.redirectTransfurTypeHashMap.containsKey(targetType) && TurnedLatexType.redirectTransfurTypeHashMap.get(targetType).containsKey(sourceType)) ? (EntityType<T>) TurnedLatexType.redirectTransfurTypeHashMap.get(targetType).get(sourceType) : sourceType;
    }

    public static void transfur(Entity source, Entity target, @Nullable ITransfurCapability sourceCap, @Nullable ITransfurCapability targetCap) {
        ITransfurCapability sourceTransfurCapability = sourceCap != null ? sourceCap : source.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        ITransfurCapability targetTransfurCapability = targetCap != null ? targetCap : target.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (sourceTransfurCapability == null || targetTransfurCapability == null) return;
        Utility.removeAllNonLatexItem(target);
        source.getLevel().playSound(null, new BlockPos(source.getX(), source.getY(), source.getZ()), TurnedSoundEvent.GOO.get(), SoundSource.NEUTRAL, 1F, 1F);
        if (target instanceof Player) {
            targetTransfurCapability.setTransfurType((source instanceof Latex) ? ((Latex) source).getTransfurType() : sourceTransfurCapability.getTransfurType());
            targetTransfurCapability.setTransfured(true);
            targetTransfurCapability.setLatexLevel(0);
            targetTransfurCapability.syncCapability();
        } else if (target instanceof Mob) {
            EntityType<? extends Mob> entityType = getTransfurType(source, target, sourceTransfurCapability);
            if (entityType == null) return;
            Mob newMob = ((Mob) target).convertTo(entityType, true);
            if (newMob == null) return;
            if (newMob instanceof Latex newLatex) newLatex.setOriginalEntityType(getTypedType(target.getType()));
            newMob.setDeltaMovement(target.getDeltaMovement());
        }
    }

}
