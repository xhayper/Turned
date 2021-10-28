package com.changedmc.turned.item;

import com.changedmc.turned.util.TurnedItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class BatonItem extends Item {
    public BatonItem() {
        super(new Item.Properties()
                .tab(TurnedItemGroup.Utility)
                .rarity(Rarity.COMMON)
                .durability(125)
                .defaultDurability(125)
        );
    }
}
