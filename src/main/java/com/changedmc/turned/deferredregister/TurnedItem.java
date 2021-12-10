package com.changedmc.turned.deferredregister;

import com.changedmc.turned.blocks.DarkLatexBlock;
import com.changedmc.turned.entity.latex.DarkLatexFox;
import com.changedmc.turned.item.BatonItem;
import com.changedmc.turned.item.DarkLatexAxeItem;
import com.changedmc.turned.item.DarkLatexPickaxeItem;
import com.changedmc.turned.item.DarkLatexScytheItem;
import com.changedmc.turned.util.Reference;
import com.changedmc.turned.util.TurnedCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedItem {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<BatonItem> BATON = ITEMS.register("baton", BatonItem::new);
    public static final RegistryObject<DarkLatexAxeItem> DARK_LATEX_AXE = ITEMS.register("dark_latex_axe", DarkLatexAxeItem::new);
    public static final RegistryObject<DarkLatexPickaxeItem> DARK_LATEX_PICKAXE = ITEMS.register("dark_latex_pickaxe", DarkLatexPickaxeItem::new);
    public static final RegistryObject<DarkLatexScytheItem> DARK_LATEX_SCYTHE = ITEMS.register("dark_latex_scythe", DarkLatexScytheItem::new);
    public static final RegistryObject<BlockItem> DARK_LATEX_BLOCK = ITEMS.register("dark_latex", () -> new BlockItem(TurnedBlock.DARK_LATEX_BLOCK.get(), new Item.Properties().tab(TurnedCreativeModeTab.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> HARMLESS_DARK_LATEX_BLOCK = ITEMS.register("harmless_dark_latex", () -> new BlockItem(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get(), new Item.Properties().tab(TurnedCreativeModeTab.BUILDING_BLOCKS)));
    public static final RegistryObject<ForgeSpawnEggItem> DARK_LATEX_FOX_SPAWN_EGG = ITEMS.register("dark_latex_fox_spawn_egg", () -> new ForgeSpawnEggItem(TurnedEntityType.DARK_LATEX_FOX, 0x1F1F1F, 0x343434, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> DARK_LATEX_SNOW_LEOPARD_SPAWN_EGG = ITEMS.register("dark_latex_snow_leopard_spawn_egg", () -> new ForgeSpawnEggItem(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD, 0x1F1F1F, 0x343434, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
