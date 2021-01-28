package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class AppleRecipes {
    public static void addAppleRecipes() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.APPLE, RecipeTools.x1, "oak_leaves_to_apple")
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
                        .addIngredient(Material.OAK_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.APPLE, RecipeTools.x1, "dark_oak_leaves_to_apple")
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
                        .addIngredient(Material.DARK_OAK_LEAVES)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
