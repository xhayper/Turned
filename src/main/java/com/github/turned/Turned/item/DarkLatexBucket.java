package com.github.turned.Turned.item;

import com.github.turned.Turned.deferredregister.TurnedFluid;
import com.github.turned.Turned.reference.TurnedCreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;

public class DarkLatexBucket extends BucketItem {
    public DarkLatexBucket() {
        super(TurnedFluid.DARK_LATEX, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS).stacksTo(1));
    }
}