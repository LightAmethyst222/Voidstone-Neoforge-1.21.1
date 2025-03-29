package net.lightamethyst.voidstone.block;

import net.lightamethyst.voidstone.Voidstone;
import net.lightamethyst.voidstone.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.DEEPSLATE;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Voidstone.MOD_ID);


    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(4.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> VOIDSTONE = registerBlock("voidstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> COMPRESSED_VOIDSTONE = registerBlock("compressed_voidstone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> DEEP_VOIDSTONE = registerBlock("deep_voidstone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(9f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_DIAMOND_ORE = registerBlock("compressed_deepslate_diamond_ore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_REDSTONE_ORE = registerBlock("compressed_deepslate_redstone_ore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_LAPIS_ORE = registerBlock("compressed_deepslate_lapis_ore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_GOLD_ORE = registerBlock("compressed_deepslate_gold_ore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_IRON_ORE = registerBlock("compressed_deepslate_iron_ore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES)));

    public static final DeferredBlock<Block> VOIDSTONE_DIAMOND_ORE = registerBlock("voidstone_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> VOIDSTONE_REDSTONE_ORE = registerBlock("voidstone_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> VOIDSTONE_LAPIS_ORE = registerBlock("voidstone_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> VOIDSTONE_GOLD_ORE = registerBlock("voidstone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(7.5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_VOIDSTONE_REDSTONE_ORE = registerBlock("compressed_voidstone_redstone_ore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(9f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));



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
