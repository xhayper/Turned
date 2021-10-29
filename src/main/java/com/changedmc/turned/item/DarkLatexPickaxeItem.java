package com.changedmc.turned.item;

import com.changedmc.turned.util.TurnedItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;

public class DarkLatexPickaxeItem extends PickaxeItem {
    public DarkLatexPickaxeItem() {
        super(
            TurnedItemTier.DARK_LATEX,
            2,
            3f,
            new Item.Properties()
                .tab(TurnedItemGroup.COMBAT)
                .rarity(Rarity.COMMON)
                .durability(125)
                .defaultDurability(125)
        );
    }
}
