package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class ChainmailRecipes {
    public static void addChainmailRecipes() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.CHAINMAIL_HELMET, RecipeTools.x1, "chainmail_helmet")
                        .shape("sis", "i i", "   ")
                        .setIngredient('i', Material.IRON_INGOT)
                        .setIngredient('s', Material.STRING)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.CHAINMAIL_CHESTPLATE, RecipeTools.x1, "chainmail_chestplate")
                        .shape("i i", "sis", "isi")
                        .setIngredient('i', Material.IRON_INGOT)
                        .setIngredient('s', Material.STRING)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.CHAINMAIL_LEGGINGS, RecipeTools.x1, "chainmail_leggings")
                        .shape("isi", "s s", "i i")
                        .setIngredient('i', Material.IRON_INGOT)
                        .setIngredient('s', Material.STRING)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.CHAINMAIL_BOOTS, RecipeTools.x1, "chainmail_boots")
                        .shape("   ", "s i", "i s")
                        .setIngredient('i', Material.IRON_INGOT)
                        .setIngredient('s', Material.STRING)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
