package io.github.changedmc.turned.item;

import io.github.changedmc.turned.reference.TurnedCreativeModeTab;
import io.github.changedmc.turned.reference.TurnedItemTier;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class DarkLatexAxe extends AxeItem {
    public DarkLatexAxe() {
        super(
                TurnedItemTier.DARK_LATEX,
                2f,
                3f,
                new Item.Properties()
                        .tab(TurnedCreativeModeTab.COMBAT)
                        .rarity(Rarity.COMMON)
                        .durability(125)
                        .defaultDurability(125)
        );
    }
}
