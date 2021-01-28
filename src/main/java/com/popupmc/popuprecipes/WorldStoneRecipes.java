package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class WorldStoneRecipes {
    public static void addRecipe(Material ing, Material result, Material tool) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(result, RecipeTools.x1, ing.name() + "_to_" + result.name())
                        .addIngredient(ing)
                        .addIngredient(tool)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addEndRecipe(Material ing, Material result) {
        addRecipe(ing, result, Material.YELLOW_DYE);
    }

    public static void addNetherRecipe(Material ing, Material result) {
        addRecipe(ing, result, Material.RED_DYE);
    }

    public static void addStoneRecipe(Material ing, Material result) {
        addRecipe(ing, result, Material.GRAY_DYE);
    }

    public static void addCombo(Material stone, Material nether, Material end) {
        addStoneRecipe(nether, stone);
        addStoneRecipe(end, stone);

        addNetherRecipe(stone, nether);
        addNetherRecipe(end, nether);

        addEndRecipe(nether, end);
        addEndRecipe(stone, end);
    }

    public static void addWorldStoneRecipes() {
        addCombo(Material.STONE, Material.NETHERRACK, Material.END_STONE);
        addCombo(Material.STONE_BRICK_SLAB, Material.NETHER_BRICK_SLAB, Material.END_STONE_BRICK_SLAB);
        addCombo(Material.STONE_BRICK_STAIRS, Material.NETHER_BRICK_STAIRS, Material.END_STONE_BRICK_STAIRS);
        addCombo(Material.STONE_BRICK_WALL, Material.NETHER_BRICK_WALL, Material.END_STONE_BRICK_WALL);
        addCombo(Material.STONE_BRICKS, Material.NETHER_BRICKS, Material.END_STONE_BRICKS);
    }
}
