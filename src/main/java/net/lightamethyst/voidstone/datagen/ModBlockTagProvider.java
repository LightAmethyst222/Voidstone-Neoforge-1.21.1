package net.lightamethyst.voidstone.datagen;

import net.lightamethyst.voidstone.Voidstone;
import net.lightamethyst.voidstone.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Voidstone.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.COMPRESSED_DEEPSLATE.get())
                .add(ModBlocks.VOIDSTONE.get())
                .add(ModBlocks.COMPRESSED_VOIDSTONE.get())
                .add(ModBlocks.DEEP_VOIDSTONE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.VOIDSTONE.get())
                .add(ModBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE.get())
                .add(ModBlocks.COMPRESSED_DEEPSLATE_IRON_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COMPRESSED_VOIDSTONE.get())
                .add(ModBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get())
                .add(ModBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get())
                .add(ModBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE.get())
                .add(ModBlocks.VOIDSTONE_DIAMOND_ORE.get())
                .add(ModBlocks.VOIDSTONE_REDSTONE_ORE.get())
                .add(ModBlocks.VOIDSTONE_LAPIS_ORE.get())
                .add(ModBlocks.VOIDSTONE_GOLD_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEP_VOIDSTONE.get())
                .add(ModBlocks.COMPRESSED_VOIDSTONE_REDSTONE_ORE.get());

    }
}
