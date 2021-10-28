package com.changedmc.turned.deferredregister;

import com.changedmc.turned.item.BatonItem;
import com.changedmc.turned.util.Reference;
import com.changedmc.turned.util.TurnedItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TurnedItem {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> BATON = ITEMS.register("baton", BatonItem::new);

    public static final RegistryObject<Item> DARK_LATEX_BLOCK = ITEMS.register("dark_latex", () -> new BlockItem(TurnedBlock.DARK_LATEX_BLOCK.get(), new Item.Properties().tab(TurnedItemGroup.Utility)));

    public static final RegistryObject<Item> HARMLESS_DARK_LATEX_BLOCK = ITEMS.register("harmless_dark_latex", () -> new BlockItem(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get(), new Item.Properties().tab(TurnedItemGroup.Utility)));
}
