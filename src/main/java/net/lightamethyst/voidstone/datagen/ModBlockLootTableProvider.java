package net.lightamethyst.voidstone.datagen;

import net.lightamethyst.voidstone.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE.get());
        dropSelf(ModBlocks.VOIDSTONE.get());
        dropSelf(ModBlocks.COMPRESSED_VOIDSTONE.get());
        dropSelf(ModBlocks.DEEP_VOIDSTONE.get());


        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get());
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get());
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE.get());
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE.get());
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE_IRON_ORE.get());
        dropSelf(ModBlocks.VOIDSTONE_DIAMOND_ORE.get());
        dropSelf(ModBlocks.VOIDSTONE_REDSTONE_ORE.get());
        dropSelf(ModBlocks.VOIDSTONE_LAPIS_ORE.get());
        dropSelf(ModBlocks.VOIDSTONE_GOLD_ORE.get());
        dropSelf(ModBlocks.COMPRESSED_VOIDSTONE_REDSTONE_ORE.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
