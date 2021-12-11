package com.changedmc.turned.item;

import com.changedmc.turned.deferredregister.TurnedFluid;
import com.changedmc.turned.util.TurnedCreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;

public class DarkLatexBucket extends BucketItem {
    public DarkLatexBucket() {
        super(TurnedFluid.DARK_LATEX, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS).stacksTo(1));
    }
}