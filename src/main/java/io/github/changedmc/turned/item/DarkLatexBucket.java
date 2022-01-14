package io.github.changedmc.turned.item;

import io.github.changedmc.turned.deferredregister.TurnedFluid;
import io.github.changedmc.turned.reference.TurnedCreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;

public class DarkLatexBucket extends BucketItem {
    public DarkLatexBucket() {
        super(TurnedFluid.DARK_LATEX, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS).stacksTo(1));
    }
}