package com.changedmc.turned.util;

import com.changedmc.turned.Main;
import com.changedmc.turned.config.TurnedServerConfig;
import com.changedmc.turned.item.LatexUsableItem;
import com.changedmc.turned.reference.TurnedItemTier;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.TieredItem;

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

}
