package com.changedmc.turned.init;

import java.util.ArrayList;
import java.util.List;
import com.changedmc.turned.item.ItemBase;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final ItemBase DARK_LATEX_GOO = new ItemBase(Item.Properties, "dark_latex_goo");
}