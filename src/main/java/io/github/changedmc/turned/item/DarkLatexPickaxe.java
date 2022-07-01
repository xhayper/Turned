package io.github.changedmc.turned.item;

import io.github.changedmc.turned.reference.TurnedCreativeModeTab;
import io.github.changedmc.turned.reference.TurnedItemTier;
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
