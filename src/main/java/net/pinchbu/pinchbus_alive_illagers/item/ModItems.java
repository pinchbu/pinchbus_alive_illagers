package net.pinchbu.pinchbus_alive_illagers.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinchbu.pinchbus_alive_illagers.item.custom.AdvancedCrossbowItem;
import net.pinchbu.pinchbus_alive_illagers.pinchbus_alive_illagers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, pinchbus_alive_illagers.MODID);

    public static final RegistryObject<Item> ADVANCED_CROSSBOW = ITEMS.register("advanced_crossbow",
            () -> new AdvancedCrossbowItem(new Item.Properties().stacksTo(1).durability(465)));
    public static final RegistryObject<Item> DARK_METAL = ITEMS.register("dark_metal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}