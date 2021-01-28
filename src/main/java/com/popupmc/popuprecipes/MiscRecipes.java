package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class MiscRecipes {
    public static void addSeedsRecipes() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.BEETROOT_SEEDS, RecipeTools.soup_strained_lg, "beetroot_to_seeds")
                        .addIngredient(Material.BEETROOT_SOUP)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.WHEAT_SEEDS, RecipeTools.soup_strained_sm, "wheat_to_seeds")
                        .addIngredient(Material.WHEAT)
                        .addIngredient(Material.WHEAT)
                        .addIngredient(Material.WHEAT)
                        .addIngredient(Material.WHEAT)
                        .addIngredient(Material.WHEAT)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addBellRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.BELL, RecipeTools.x1, "craft_bell")
                        .shape("sts", "sgs", "sgs")
                        .setIngredient('s', Material.STONE)
                        .setIngredient('t', Material.STICK)
                        .setIngredient('g', Material.GOLD_INGOT)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addCobwebRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.COBWEB, RecipeTools.x1, "cobweb")
                        .addIngredient(Material.STRING)
                        .addIngredient(Material.STRING)
                        .addIngredient(Material.STRING)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addPetrifiedOakSlabRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.PETRIFIED_OAK_SLAB, RecipeTools.x1, "petrified_oak_slab")
                        .shape("   ", "   ", "mmm")
                        .setIngredient('m', Material.DEAD_BUSH)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.OAK_SLAB, RecipeTools.x1, "petrified_oak_slab_to_oak_slab")
                        .addIngredient(Material.PETRIFIED_OAK_SLAB)
                        .addIngredient(Material.WATER_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.PETRIFIED_OAK_SLAB, RecipeTools.x1, "oak_slab_to_petrified_oak_slab")
                        .addIngredient(Material.OAK_SLAB)
                        .addIngredient(Material.LAVA_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addNametagRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.NAME_TAG, RecipeTools.x1, "name_tag")
                        .shape("s  ", "ipp", " pp")
                        .setIngredient('s', Material.STRING)
                        .setIngredient('i', Material.IRON_INGOT)
                        .setIngredient('p', Material.PAPER)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addPhantomMembraneRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.PHANTOM_MEMBRANE, RecipeTools.x1, "phantom_membrane")
                        .addIngredient(Material.SEAGRASS)
                        .addIngredient(Material.SNOWBALL)
                        .addIngredient(Material.REDSTONE)
                        .addIngredient(Material.TROPICAL_FISH)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addFernRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.LARGE_FERN, RecipeTools.x1, "fern")
                        .addIngredient(Material.WATER_BUCKET)
                        .addIngredient(Material.DEAD_BUSH)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.FERN, RecipeTools.x2, "large_fern_to_fern")
                        .addIngredient(Material.LARGE_FERN)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.LARGE_FERN, RecipeTools.x1, "fern_to_large_fern")
                        .addIngredient(Material.FERN)
                        .addIngredient(Material.FERN)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addDeadbushRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.DEAD_BUSH, RecipeTools.x1, "large_fern_to_dead_bush")
                        .addIngredient(Material.LARGE_FERN)
                        .addIngredient(Material.LAVA_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.DEAD_BUSH, RecipeTools.x1, "fern_to_dead_bush")
                        .addIngredient(Material.FERN)
                        .addIngredient(Material.FERN)
                        .addIngredient(Material.LAVA_BUCKET)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addSaddleRecipe() {
        Bukkit.addRecipe(
                RecipeTools.getShapedRecipe(Material.SADDLE, RecipeTools.x1, "saddle")
                        .shape("lwl", "s s", "l l")
                        .setIngredient('w', Material.WHITE_WOOL)
                        .setIngredient('l', Material.LEATHER)
                        .setIngredient('s', Material.STRING)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void addSandRecipes() {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.SAND, RecipeTools.x1, "sand")
                        .addIngredient(Material.RED_SAND)
                        .addIngredient(Material.YELLOW_DYE)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(Material.RED_SAND, RecipeTools.x1, "red_sand")
                        .addIngredient(Material.SAND)
                        .addIngredient(Material.RED_DYE)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }
}
