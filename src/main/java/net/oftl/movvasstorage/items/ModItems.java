package net.oftl.movvasstorage.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oftl.movvasstorage.MovvaStorage;

import java.rmi.registry.Registry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MovvaStorage.MOD_ID);

    public static final RegistryObject<Item> POWERED_AMETHYST_SHARD = ITEMS.register("powered_amethyst_shard", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTabs.MS_MAIN_TAB)));
    public static final RegistryObject<Item> POWERED_EMERALD = ITEMS.register("powered_emerald", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTabs.MS_MAIN_TAB)));

    public static final RegistryObject<Item> SMALL_BATTERY = ITEMS.register("small_battery", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTabs.MS_MAIN_TAB)));
    public static final RegistryObject<Item> MEDIUM_BATTERY = ITEMS.register("medium_battery", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTabs.MS_MAIN_TAB)));
    public static final RegistryObject<Item> BIG_BATTERY = ITEMS.register("big_battery", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTabs.MS_MAIN_TAB)));

    public static final RegistryObject<Item> SIMPLE_FLOPPY_DISK = ITEMS.register("simple_floppy_disk", () ->
            new Item(new Item.Properties().tab(ModCreativeModeTabs.MS_MAIN_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
