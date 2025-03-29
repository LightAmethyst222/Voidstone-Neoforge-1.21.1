package net.lightamethyst.voidstone.datagen;

import net.lightamethyst.voidstone.Voidstone;
import net.lightamethyst.voidstone.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Voidstone.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        logBlock(((RotatedPillarBlock) ModBlocks.COMPRESSED_DEEPSLATE.get()));
        blockItem(ModBlocks.COMPRESSED_DEEPSLATE);

        logBlock(((RotatedPillarBlock) ModBlocks.COMPRESSED_VOIDSTONE.get()));
        blockItem(ModBlocks.COMPRESSED_VOIDSTONE);
        logBlock(((RotatedPillarBlock) ModBlocks.DEEP_VOIDSTONE.get()));
        blockItem(ModBlocks.DEEP_VOIDSTONE);

        blockWithItem(ModBlocks.VOIDSTONE);

        blockWithItem(ModBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE);
        blockWithItem(ModBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE);
        blockWithItem(ModBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE);
        blockWithItem(ModBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE);
        blockWithItem(ModBlocks.COMPRESSED_DEEPSLATE_IRON_ORE);

        blockWithItem(ModBlocks.VOIDSTONE_DIAMOND_ORE);
        blockWithItem(ModBlocks.VOIDSTONE_REDSTONE_ORE);
        blockWithItem(ModBlocks.VOIDSTONE_LAPIS_ORE);
        blockWithItem(ModBlocks.VOIDSTONE_GOLD_ORE);

        blockWithItem(ModBlocks.COMPRESSED_VOIDSTONE_REDSTONE_ORE);

    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("voidstone:block/" + deferredBlock.getId().getPath()));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
