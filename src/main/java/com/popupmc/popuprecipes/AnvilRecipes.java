package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class AnvilRecipes {
    public static void addDamagedAnvilRecipes() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.CHIPPED_ANVIL, RecipeTools.x1, "chipped_anvil")
                        .shape("iii", " i ", "iii")
                        .setIngredient('i', Material.IRON_INGOT)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.DAMAGED_ANVIL, RecipeTools.x1, "damaged_anvil")
                        .shape("nnn", " i ", "iii")
                        .setIngredient('i', Material.IRON_INGOT)
                        .setIngredient('n', Material.IRON_NUGGET)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
