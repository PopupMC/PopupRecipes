package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class OreRecipes {
    public static void addOreRecipe(Material main, Material result) {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(result, RecipeTools.x1, main.name() + "_to_" + result.name())
                        .shape("mmm", "mam", "mmm")
                        .setIngredient('m', main)
                        .setIngredient('a', Material.STONE)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addOreRecipes() {
        addOreRecipe(Material.COAL, Material.COAL_ORE);
        addOreRecipe(Material.CHARCOAL, Material.COAL_ORE);
        addOreRecipe(Material.DIAMOND, Material.DIAMOND_ORE);
        addOreRecipe(Material.EMERALD, Material.EMERALD_ORE);
        addOreRecipe(Material.GOLD_INGOT, Material.GOLD_ORE);
        addOreRecipe(Material.IRON_INGOT, Material.IRON_ORE);
        addOreRecipe(Material.QUARTZ, Material.NETHER_QUARTZ_ORE);
        addOreRecipe(Material.REDSTONE, Material.REDSTONE_ORE);
    }
}
