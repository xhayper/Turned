package io.github.changedmc.turned.reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public class TurnedTag {

    public static final Tag.Named<Item> LATEX_HOLDABLE_ITEM = ItemTags.bind(new ResourceLocation(TurnedReference.MOD_ID, "items/latex_holdable_item").toString());

}
