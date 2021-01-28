package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class GrassRecipes {
    public static void addGrassBlockRecipe(int amount, Material sourceBlock) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.GRASS_BLOCK, amount, sourceBlock.name() + "_to_grass_block")
                        .addIngredient(Material.DIRT)
                        .addIngredient(sourceBlock)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addGrassBlockRecipes() {
        addGrassBlockRecipe(RecipeTools.x1, Material.GRASS);
        addGrassBlockRecipe(RecipeTools.x2, Material.TALL_GRASS);
        addGrassBlockRecipe(RecipeTools.soup, Material.BONE_MEAL);
        addGrassBlockRecipe(RecipeTools.soup_ing, Material.BONE);
        addGrassBlockRecipe(RecipeTools.soup_ing_block, Material.BONE_BLOCK);
    }

    public static void addGrassRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.GRASS, RecipeTools.x1, "grass_block_to_grass")
                        .addIngredient(Material.GRASS_BLOCK)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.GRASS, RecipeTools.x2, "tall_grass_to_grass")
                        .addIngredient(Material.TALL_GRASS)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.SEAGRASS, RecipeTools.x1, "grass_block_to_seagrass")
                        .addIngredient(Material.GRASS_BLOCK)
                        .addIngredient(Material.WATER_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.GRASS, RecipeTools.x1, "seagrass_to_grass")
                        .addIngredient(Material.SEAGRASS)
                        .addIngredient(Material.SAND)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.SEAGRASS, RecipeTools.x1, "grass_to_seagrass")
                        .addIngredient(Material.GRASS)
                        .addIngredient(Material.WATER_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.SEAGRASS, RecipeTools.x2, "tall_grass_to_seagrass")
                        .addIngredient(Material.TALL_GRASS)
                        .addIngredient(Material.WATER_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addTallGrassRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.TALL_GRASS, RecipeTools.x1, "grass_block_to_tall_grass")
                        .addIngredient(Material.GRASS_BLOCK)
                        .addIngredient(Material.GRASS_BLOCK)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.TALL_GRASS, RecipeTools.x1, "grass_to_tall_grass")
                        .addIngredient(Material.GRASS)
                        .addIngredient(Material.GRASS)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.TALL_GRASS, RecipeTools.x1, "seagrass_to_tall_grass")
                        .addIngredient(Material.SEAGRASS)
                        .addIngredient(Material.SEAGRASS)
                        .addIngredient(Material.SAND)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
