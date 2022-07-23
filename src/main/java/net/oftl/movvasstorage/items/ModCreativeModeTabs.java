package net.oftl.movvasstorage.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab MS_MAIN_TAB = new CreativeModeTab("ms_main_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SIMPLE_FLOPPY_DISK.get());
        }
    };

}
