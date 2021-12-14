package com.changedmc.turned.item;

import com.changedmc.turned.reference.TurnedCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Baton extends Item {
    public Baton() {
        super(new Item.Properties()
                .tab(TurnedCreativeModeTab.COMBAT)
                .rarity(Rarity.COMMON)
                .durability(125)
                .defaultDurability(125)
        );
    }
}
