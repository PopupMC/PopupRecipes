package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class MyceliumRecipes {
    public static void addMyceliumRecipe(int amount, Material sourceBlock) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.MYCELIUM, amount, sourceBlock.name() + "_to_mycelium_block")
                        .addIngredient(Material.DIRT)
                        .addIngredient(sourceBlock)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addMyceliumRecipes() {
        addMyceliumRecipe(RecipeTools.x1, Material.BROWN_MUSHROOM);
        addMyceliumRecipe(RecipeTools.x1, Material.RED_MUSHROOM);
        addMyceliumRecipe(RecipeTools.soup, Material.MUSHROOM_STEW);
        addMyceliumRecipe(RecipeTools.soup_ing_block, Material.BROWN_MUSHROOM_BLOCK);
        addMyceliumRecipe(RecipeTools.soup_ing_block, Material.MUSHROOM_STEM);
        addMyceliumRecipe(RecipeTools.soup_ing_block, Material.RED_MUSHROOM_BLOCK);
    }
}
