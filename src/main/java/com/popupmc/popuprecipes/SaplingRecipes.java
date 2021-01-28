package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class SaplingRecipes {
    public static void addSaplingsRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.ACACIA_SAPLING, RecipeTools.x1, "acacia_leaves_to_sapling")
                        .addIngredient(Material.ACACIA_LEAVES)
                        .addIngredient(Material.ACACIA_LEAVES)
                        .addIngredient(Material.ACACIA_LEAVES)
                        .addIngredient(Material.ACACIA_LEAVES)
                        .addIngredient(Material.ACACIA_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.BIRCH_SAPLING, RecipeTools.x1, "birch_leaves_to_sapling")
                        .addIngredient(Material.BIRCH_LEAVES)
                        .addIngredient(Material.BIRCH_LEAVES)
                        .addIngredient(Material.BIRCH_LEAVES)
                        .addIngredient(Material.BIRCH_LEAVES)
                        .addIngredient(Material.BIRCH_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.DARK_OAK_SAPLING, RecipeTools.x1, "dark_oak_leaves_to_sapling")
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.JUNGLE_SAPLING, RecipeTools.x1, "jungle_leaves_to_sapling")
                        .addIngredient(Material.JUNGLE_LEAVES)
                        .addIngredient(Material.JUNGLE_LEAVES)
                        .addIngredient(Material.JUNGLE_LEAVES)
                        .addIngredient(Material.JUNGLE_LEAVES)
                        .addIngredient(Material.JUNGLE_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.OAK_SAPLING, RecipeTools.x1, "oak_leaves_to_sapling")
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.SPRUCE_SAPLING, RecipeTools.x1, "spruce_leaves_to_sapling")
                        .addIngredient(Material.SPRUCE_LEAVES)
                        .addIngredient(Material.SPRUCE_LEAVES)
                        .addIngredient(Material.SPRUCE_LEAVES)
                        .addIngredient(Material.SPRUCE_LEAVES)
                        .addIngredient(Material.SPRUCE_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
