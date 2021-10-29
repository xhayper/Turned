package com.changedmc.turned.util;

import com.changedmc.turned.deferredregister.TurnedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class TurnedItemGroup {
    public static final ItemGroup COMBAT = new ItemGroup(Reference.MOD_ID + ".combat") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TurnedItem.BATON.get());
        }
    };

    public static final ItemGroup BUILDING_BLOCKS = new ItemGroup(Reference.MOD_ID + ".building_blocks") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TurnedItem.DARK_LATEX_BLOCK.get());
        }
    };
}
