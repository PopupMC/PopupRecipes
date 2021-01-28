package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import java.util.List;

public class RecipeTools {
    public static ShapelessRecipe getShapelessRecipe(Material resultItem, int resultAmount, String name) {
        ItemStack item = new ItemStack(resultItem);
        item.setAmount(resultAmount);

        NamespacedKey key = new NamespacedKey(PopupRecipes.plugin, name);
        return new ShapelessRecipe(key, item);
    }

    public static ShapedRecipe getShapedRecipe(Material resultItem, int resultAmount, String name) {
        ItemStack item = new ItemStack(resultItem);
        item.setAmount(resultAmount);

        NamespacedKey key = new NamespacedKey(PopupRecipes.plugin, name);
        return new ShapedRecipe(key, item);
    }

    public static void removeShapedRecipe(Material result, int resultAmount) {
        // Remove old leather recipe
        List<Recipe> oldRecipes = Bukkit.getRecipesFor(new ItemStack(result, resultAmount));
        for(Recipe oldRecipe : oldRecipes) {
            if(oldRecipes instanceof ShapedRecipe)
                Bukkit.removeRecipe(((ShapedRecipe)oldRecipe).getKey());
        }
    }

    public static final int x1 = 1;                           // 1
    public static final int x2 = 2;                           // 2
    public static final int soup = 7;                         // 7
    public static final int soup_ing = soup / 2;              // 3
    public static final int soup_ing_block = soup_ing * 9;    // 27
    public static final int soup_strained_sm = soup_ing;      // 3
    public static final int soup_strained_lg = soup_ing * 4;  // 12
    public static final int even_full = 8;                    // 8
    public static final int full = 9;                         // 9
}
