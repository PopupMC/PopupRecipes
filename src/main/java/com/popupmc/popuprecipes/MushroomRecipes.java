package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class MushroomRecipes {

    public static void addMushroomBlockRecipe(Material sourceBlock, Material resultBlock) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(resultBlock, RecipeTools.x1, sourceBlock.name() + "_to_mushroom_block")
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
                        .addIngredient(sourceBlock)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addMushroomBlockRecipes() {
        addMushroomBlockRecipe(Material.BROWN_MUSHROOM, Material.BROWN_MUSHROOM_BLOCK);
        addMushroomBlockRecipe(Material.RED_MUSHROOM, Material.RED_MUSHROOM_BLOCK);
    }

    public static void addMushroomStemRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.MUSHROOM_STEM, RecipeTools.x1, "mushroom_to_mushroom_stem")
                        .addIngredient(Material.BROWN_MUSHROOM)
                        .addIngredient(Material.BROWN_MUSHROOM)
                        .addIngredient(Material.BROWN_MUSHROOM)
                        .addIngredient(Material.BROWN_MUSHROOM)
                        .addIngredient(Material.RED_MUSHROOM)
                        .addIngredient(Material.RED_MUSHROOM)
                        .addIngredient(Material.RED_MUSHROOM)
                        .addIngredient(Material.RED_MUSHROOM)
                        .addIngredient(Material.RED_MUSHROOM)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
