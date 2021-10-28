package com.changedmc.turned.util;

import com.changedmc.turned.deferredregister.TurnedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class TurnedItemGroup {
    public static final ItemGroup Utility = new ItemGroup(Reference.MOD_ID + ".utility") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TurnedItem.DARK_LATEX_BLOCK.get());
        }
    };
}
