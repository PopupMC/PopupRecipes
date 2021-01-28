package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import java.util.List;

public class HorseArmorRecipes {
    public static void addHorseArmorRecipes() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.DIAMOND_HORSE_ARMOR, RecipeTools.x1, "diamond_horse_armor")
                        .shape("  m", "mam", "mmm")
                        .setIngredient('m', Material.DIAMOND)
                        .setIngredient('a', Material.WHITE_WOOL)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.IRON_HORSE_ARMOR, RecipeTools.x1, "iron_horse_armor")
                        .shape("  m", "mam", "mmm")
                        .setIngredient('m', Material.IRON_INGOT)
                        .setIngredient('a', Material.WHITE_WOOL)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.GOLDEN_HORSE_ARMOR, RecipeTools.x1, "golden_horse_armor")
                        .shape("  m", "mam", "mmm")
                        .setIngredient('m', Material.GOLD_INGOT)
                        .setIngredient('a', Material.WHITE_WOOL)
        );
        PopupRecipes.numberOfRecipesAdded++;

        // Remove old leather recipe
        RecipeTools.removeShapedRecipe(Material.LEATHER_HORSE_ARMOR, RecipeTools.x1);

        // Add new one
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.LEATHER_HORSE_ARMOR, RecipeTools.x1, "leather_horse_armor")
                        .shape("  m", "mam", "mmm")
                        .setIngredient('m', Material.LEATHER)
                        .setIngredient('a', Material.WHITE_WOOL)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
