package net.lightamethyst.voidstone.datagen;

import net.lightamethyst.voidstone.block.ModBlocks;
import net.lightamethyst.voidstone.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

       /* ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OPAL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.OPAL.get())
                .unlockedBy("has_opal", has(ModItems.OPAL))
                .save(recipeOutput;);
       */

    }
}
