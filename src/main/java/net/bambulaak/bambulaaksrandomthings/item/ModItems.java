package net.bambulaak.bambulaaksrandomthings.item;

import net.bambulaak.bambulaaksrandomthings.BambulaaksRT;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


//My items
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BambulaaksRT.MOD_ID);

    public static final DeferredItem<Item> TURQUOISE = ITEMS.register("turquoise",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TURQUOISE = ITEMS.register("raw_turquoise",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}