package io.github.changedmc.turned.deferredregister;

import io.github.changedmc.turned.item.*;
import io.github.changedmc.turned.reference.TurnedCreativeModeTab;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TurnedItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TurnedReference.MOD_ID);

    public static final RegistryObject<Baton> BATON = ITEMS.register("baton", Baton::new);
    public static final RegistryObject<DarkLatexAxe> DARK_LATEX_AXE = ITEMS.register("dark_latex_axe", DarkLatexAxe::new);
    public static final RegistryObject<DarkLatexPickaxe> DARK_LATEX_PICKAXE = ITEMS.register("dark_latex_pickaxe", DarkLatexPickaxe::new);
    public static final RegistryObject<DarkLatexScythe> DARK_LATEX_SCYTHE = ITEMS.register("dark_latex_scythe", DarkLatexScythe::new);
    public static final RegistryObject<DarkLatexBucket> DARK_LATEX_BUCKET = ITEMS.register("dark_latex_bucket", DarkLatexBucket::new);
    public static final RegistryObject<BlockItem> DARK_LATEX_BLOCK = ITEMS.register("dark_latex", () -> new BlockItem(TurnedBlock.DARK_LATEX_BLOCK.get(), new Item.Properties().tab(TurnedCreativeModeTab.BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> HARMLESS_DARK_LATEX_BLOCK = ITEMS.register("harmless_dark_latex", () -> new BlockItem(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get(), new Item.Properties().tab(TurnedCreativeModeTab.BUILDING_BLOCKS)));
    public static final RegistryObject<ForgeSpawnEggItem> DARK_LATEX_FOX_SPAWN_EGG = ITEMS.register("dark_latex_fox_spawn_egg", () -> new ForgeSpawnEggItem(TurnedEntityType.DARK_LATEX_FOX, 0x1F1F1F, 0x343434, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS)));
    public static final RegistryObject<ForgeSpawnEggItem> DARK_LATEX_SNOW_LEOPARD_SPAWN_EGG = ITEMS.register("dark_latex_snow_leopard_spawn_egg", () -> new ForgeSpawnEggItem(TurnedEntityType.DARK_LATEX_SNOW_LEOPARD, 0x1F1F1F, 0x343434, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS)));
    public static final RegistryObject<ForgeSpawnEggItem> SCIENTIST_SPAWN_EGG = ITEMS.register("scientist_spawn_egg", () -> new ForgeSpawnEggItem(TurnedEntityType.SCIENTIST, 0xFFFFFF, 0x000000, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS)));
    //public static final RegistryObject<DarkLatexMask> DARK_LATEX_MASK = ITEMS.register("dark_latex_mask", DarkLatexMask::new);
    public static final RegistryObject<ForgeSpawnEggItem> DARK_LATEX_SPAWN_EGG = ITEMS.register("dark_latex_spawn_egg", () -> new ForgeSpawnEggItem(TurnedEntityType.DARK_LATEX, 0x1F1F1F, 0x343434, new Item.Properties().tab(TurnedCreativeModeTab.MISCELLANEOUS)));
}
