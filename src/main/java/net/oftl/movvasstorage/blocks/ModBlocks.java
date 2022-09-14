package net.oftl.movvasstorage.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oftl.movvasstorage.MovvaStorage;
import net.oftl.movvasstorage.items.ModCreativeModeTabs;
import net.oftl.movvasstorage.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MovvaStorage.MOD_ID);

    public static final RegistryObject<Block> POWERED_EMERALD_BLOCK = registerBlock("powered_emerald_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)),
            ModCreativeModeTabs.MS_MAIN_TAB);
    public static final RegistryObject<Block> POWERED_AMETHYST_BLOCK = registerBlock("powered_amethyst_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)),
            ModCreativeModeTabs.MS_MAIN_TAB);

    public static final RegistryObject<Block> BATTERY = registerBlock("battery", () ->
            new HorizontalDirectionalBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)) {
                @Override
                public BlockState rotate(BlockState pState, Rotation pRot) {
                    return super.rotate(pState, pRot);
                }
            },
            ModCreativeModeTabs.MS_MAIN_TAB);

    public static final RegistryObject<Block> ENERGY_CABLE = registerBlock("energy_cable", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)),
            ModCreativeModeTabs.MS_MAIN_TAB);
    public static final RegistryObject<Block> FLUID_CABLE = registerBlock("fluid_cable", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED)),
            ModCreativeModeTabs.MS_MAIN_TAB);

    public static final RegistryObject<Block> ENERGIZER = registerBlock("energyzer", () ->
            new HorizontalDirectionalBlock(BlockBehaviour.Properties.of(Material.METAL)) {
                @Override
                public BlockState rotate(BlockState pState, Rotation pRot) {
                    return super.rotate(pState, pRot);
                }
            }, ModCreativeModeTabs.MS_MAIN_TAB);
    public static final RegistryObject<Block> FLUID_CATALIZER = registerBlock("fluid_catalyzer", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)), ModCreativeModeTabs.MS_MAIN_TAB);
    public static final RegistryObject<Block> FLUIDIZER = registerBlock("fluidyzer", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL)), ModCreativeModeTabs.MS_MAIN_TAB);

    public static final RegistryObject<Block> TEST_FALLING_BLOCK = registerBlock("test", () ->
            new FallingBlock(BlockBehaviour.Properties.of(Material.METAL)), ModCreativeModeTabs.MS_MAIN_TAB);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                    CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           iveModeTab tab) {
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
