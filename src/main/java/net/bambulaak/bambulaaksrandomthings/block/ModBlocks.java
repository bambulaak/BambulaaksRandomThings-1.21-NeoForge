package net.bambulaak.bambulaaksrandomthings.block;

import net.bambulaak.bambulaaksrandomthings.BambulaaksRT;
import net.bambulaak.bambulaaksrandomthings.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BambulaaksRT.MOD_ID);

    //my blocks
    public static final DeferredBlock<Block> TURQUOISE_BLOCK = registerBlock("turquoise_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> TURQUOISE_ORE = registerBlock("turquoise_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE).mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> RAW_TURQUOISE_BLOCK = registerBlock("raw_turquoise_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final DeferredBlock<Block> CHITIN_BLOCK = registerBlock("chitin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).mapColor(MapColor.COLOR_LIGHT_GRAY)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
