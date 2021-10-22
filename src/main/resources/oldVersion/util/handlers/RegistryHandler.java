package com.changedmc.turned.util.handlers;

import com.changedmc.turned.init.BlockInit;
import com.changedmc.turned.init.EntityInit;
import com.changedmc.turned.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ItemInit.ITEMS) {
            Main.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for (Block block : BlockInit.BLOCKS) {
            Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
        RenderHandler.registerEntityRenders();
    }

    public static void preInitRegistries() {
        EntityInit.registerEntities();
        EventHandler.registerEvents();
    }
}
