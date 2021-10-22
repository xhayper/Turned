package com.changedmc.turned.item;

import com.changedmc.turned.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {
    public ItemBase(Item.Properties properties, String name) {
        super(properties);
        this.setRegistryName(name);
        this.getCreativeTabs().add(CreativeModeTab.TAB_MISC);
        ItemInit.ITEMS.add(this);
    }
}