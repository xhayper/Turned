package com.changedmc.turned.item;

import com.changedmc.turned.util.TurnedItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;

public class DarkLatexAxeItem extends AxeItem {
    public DarkLatexAxeItem() {
        super(
            TurnedItemTier.DARK_LATEX,
            2f,
            3f,
            new Item.Properties()
                .tab(TurnedItemGroup.Utility)
                .rarity(Rarity.COMMON)
                .durability(125)
                .defaultDurability(125)
        );
    }
}
