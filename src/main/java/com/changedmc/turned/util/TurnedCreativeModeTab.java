package com.changedmc.turned.util;

import com.changedmc.turned.deferredregister.TurnedItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class TurnedCreativeModeTab {

    public static final CreativeModeTab BUILDING_BLOCKS = new CreativeModeTab(Reference.MOD_ID + ".building_blocks") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TurnedItem.DARK_LATEX_BLOCK.get());
        }
    };

    public static final CreativeModeTab MISCELLANEOUS = new CreativeModeTab(Reference.MOD_ID + ".miscellaneous") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TurnedItem.DARK_LATEX_BUCKET.get());
        }
    };

    public static final CreativeModeTab COMBAT = new CreativeModeTab(Reference.MOD_ID + ".combat") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TurnedItem.BATON.get());
        }
    };
}
