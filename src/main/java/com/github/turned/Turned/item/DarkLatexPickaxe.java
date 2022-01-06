package com.github.turned.Turned.item;

import com.github.turned.Turned.reference.TurnedItemTier;
import com.github.turned.Turned.reference.TurnedCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;

public class DarkLatexPickaxe extends PickaxeItem {
    public DarkLatexPickaxe() {
        super(
                TurnedItemTier.DARK_LATEX,
                2,
                3f,
                new Item.Properties()
                        .tab(TurnedCreativeModeTab.COMBAT)
                        .rarity(Rarity.COMMON)
                        .durability(125)
                        .defaultDurability(125)
        );
    }
}
