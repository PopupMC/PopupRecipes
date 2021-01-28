package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class PodzolRecipes {
    public static void addPodzolRecipe(int amount, Material sourceBlock) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.PODZOL, amount, sourceBlock.name() + "_to_podzol")
                        .addIngredient(Material.DIRT)
                        .addIngredient(sourceBlock)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addPodzolRecipes() {
        addPodzolRecipe(RecipeTools.x1, Material.STICK);
        addPodzolRecipe(RecipeTools.x1, Material.DEAD_BUSH);
        addPodzolRecipe(RecipeTools.soup_ing, Material.ACACIA_LEAVES);
        addPodzolRecipe(RecipeTools.soup_ing, Material.BIRCH_LEAVES);
        addPodzolRecipe(RecipeTools.soup_ing, Material.DARK_OAK_LEAVES);
        addPodzolRecipe(RecipeTools.soup_ing, Material.JUNGLE_LEAVES);
        addPodzolRecipe(RecipeTools.soup_ing, Material.OAK_LEAVES);
        addPodzolRecipe(RecipeTools.soup_ing, Material.SPRUCE_LEAVES);
    }
}
