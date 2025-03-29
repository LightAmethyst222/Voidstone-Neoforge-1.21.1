package net.lightamethyst.voidstone.item;

import net.lightamethyst.voidstone.Voidstone;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Voidstone.MOD_ID);


    public static final DeferredItem<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
     ITEMS.register(eventBus);
    }
}
