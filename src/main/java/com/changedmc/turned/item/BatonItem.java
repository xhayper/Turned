package com.changedmc.turned.item;

import com.changedmc.turned.util.TurnedCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class BatonItem extends Item {
    public BatonItem() {
        super(new Item.Properties()
                .tab(TurnedCreativeModeTab.COMBAT)
                .rarity(Rarity.COMMON)
                .durability(125)
                .defaultDurability(125)
        );
    }
}
