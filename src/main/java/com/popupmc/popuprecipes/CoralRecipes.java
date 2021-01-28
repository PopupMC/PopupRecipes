package com.popupmc.popuprecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;

public class CoralRecipes {
    public static void convertSpeciesSubsetRecipes(Material sm, Material med, Material lg) {
        // Convert Small -> Med
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(med, RecipeTools.x1, sm.name() + "_to_" + med.name())
                        .addIngredient(sm)
                        .addIngredient(sm)
        );
        PopupRecipes.numberOfRecipesAdded++;

        // Convert Small -> Large
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(lg, RecipeTools.x1, sm.name() + "_to_" + lg.name())
                        .addIngredient(sm)
                        .addIngredient(sm)
                        .addIngredient(sm)
                        .addIngredient(sm)
                        .addIngredient(sm)
                        .addIngredient(sm)
                        .addIngredient(sm)
                        .addIngredient(sm)
        );
        PopupRecipes.numberOfRecipesAdded++;

        // Convert Medium -> Large
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(lg, RecipeTools.x1, med.name() + "_to_" + lg.name())
                        .addIngredient(med)
                        .addIngredient(med)
                        .addIngredient(med)
                        .addIngredient(med)
        );
        PopupRecipes.numberOfRecipesAdded++;

        // Convert Medium -> Small
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(sm, RecipeTools.x2, med.name() + "_to_" + sm.name())
                        .addIngredient(med)
        );
        PopupRecipes.numberOfRecipesAdded++;

        // Convert Large -> Small
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(sm, RecipeTools.even_full, lg.name() + "_to_" + sm.name())
                        .addIngredient(lg)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void convertSpeciesLifeRecipes(Material dead, Material alive) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(dead, RecipeTools.x1, alive.name() + "_to_" + dead.name())
                        .addIngredient(alive)
                        .addIngredient(takeLife)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(alive, RecipeTools.x1, dead.name() + "_to_" + alive.name())
                        .addIngredient(dead)
                        .addIngredient(giveLife)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void convertInterSpeciesRecipes(Material a, Material aIng, Material b, Material bIng) {
        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(b, RecipeTools.x1, a.name() + "_to_" + b.name())
                        .addIngredient(a)
                        .addIngredient(bIng)
        );
        PopupRecipes.numberOfRecipesAdded++;

        Bukkit.addRecipe(
                RecipeTools.getShapelessRecipe(a, RecipeTools.x1, b.name() + "_to_" + a.name())
                        .addIngredient(b)
                        .addIngredient(aIng)
        );
        PopupRecipes.numberOfRecipesAdded++;
    }

    public static void workOnASpecies(Material smAlive, Material medAlive, Material lgAlive,
                                      Material smDead, Material medDead, Material lgDead) {
        convertSpeciesSubsetRecipes(smAlive, medAlive, lgAlive);
        convertSpeciesSubsetRecipes(smDead, medDead, lgDead);

        convertSpeciesLifeRecipes(smDead, smAlive);
        convertSpeciesLifeRecipes(medDead, medAlive);
        convertSpeciesLifeRecipes(lgDead, lgAlive);
    }

    public static void workOnInterSpeciesSameLife(Material a, Material aIng,
                                                  Material b, Material bIng,
                                                  Material c, Material cIng,
                                                  Material d, Material dIng,
                                                  Material e, Material eIng) {

        convertInterSpeciesRecipes(a, aIng, b, bIng);
        convertInterSpeciesRecipes(a, aIng, c, cIng);
        convertInterSpeciesRecipes(a, aIng, d, dIng);
        convertInterSpeciesRecipes(a, aIng, e, eIng);

        convertInterSpeciesRecipes(b, bIng, c, cIng);
        convertInterSpeciesRecipes(b, bIng, d, dIng);
        convertInterSpeciesRecipes(b, bIng, e, eIng);

        convertInterSpeciesRecipes(c, cIng, d, dIng);
        convertInterSpeciesRecipes(c, cIng, e, eIng);

        convertInterSpeciesRecipes(d, dIng, e, eIng);
    }

    public static void addCoralRecipes() {
        // Create recipes to convert between same species and bring/take life between same species
        workOnASpecies(Material.TUBE_CORAL_FAN, Material.TUBE_CORAL, Material.TUBE_CORAL_BLOCK,
                Material.DEAD_TUBE_CORAL_FAN, Material.DEAD_TUBE_CORAL, Material.DEAD_TUBE_CORAL_BLOCK);

        workOnASpecies(Material.BRAIN_CORAL_FAN, Material.BRAIN_CORAL, Material.BRAIN_CORAL_BLOCK,
                Material.DEAD_BRAIN_CORAL_FAN, Material.DEAD_BRAIN_CORAL, Material.DEAD_BRAIN_CORAL_BLOCK);

        workOnASpecies(Material.BUBBLE_CORAL_FAN, Material.BUBBLE_CORAL, Material.BUBBLE_CORAL_BLOCK,
                Material.DEAD_BUBBLE_CORAL_FAN, Material.DEAD_BUBBLE_CORAL, Material.DEAD_BUBBLE_CORAL_BLOCK);

        workOnASpecies(Material.FIRE_CORAL_FAN, Material.FIRE_CORAL, Material.FIRE_CORAL_BLOCK,
                Material.DEAD_FIRE_CORAL_FAN, Material.DEAD_FIRE_CORAL, Material.DEAD_FIRE_CORAL_BLOCK);

        workOnASpecies(Material.HORN_CORAL_FAN, Material.HORN_CORAL, Material.HORN_CORAL_BLOCK,
                Material.DEAD_HORN_CORAL_FAN, Material.DEAD_HORN_CORAL, Material.DEAD_HORN_CORAL_BLOCK);

        // Convert between inter-species of same life
        workOnInterSpeciesSameLife(Material.TUBE_CORAL_FAN, tubeCoralIng,
                Material.BRAIN_CORAL_FAN, brainCoralIng,
                Material.BUBBLE_CORAL_FAN, bubbleCoralIng,
                Material.FIRE_CORAL_FAN, fireCoralIng,
                Material.HORN_CORAL_FAN, hornCoralIng);

        workOnInterSpeciesSameLife(Material.TUBE_CORAL, tubeCoralIng,
                Material.BRAIN_CORAL, brainCoralIng,
                Material.BUBBLE_CORAL, bubbleCoralIng,
                Material.FIRE_CORAL, fireCoralIng,
                Material.HORN_CORAL, hornCoralIng);

        workOnInterSpeciesSameLife(Material.TUBE_CORAL_BLOCK, tubeCoralIng,
                Material.BRAIN_CORAL_BLOCK, brainCoralIng,
                Material.BUBBLE_CORAL_BLOCK, bubbleCoralIng,
                Material.FIRE_CORAL_BLOCK, fireCoralIng,
                Material.HORN_CORAL_BLOCK, hornCoralIng);

        workOnInterSpeciesSameLife(Material.DEAD_TUBE_CORAL_FAN, tubeCoralIng,
                Material.DEAD_BRAIN_CORAL_FAN, brainCoralIng,
                Material.DEAD_BUBBLE_CORAL_FAN, bubbleCoralIng,
                Material.DEAD_FIRE_CORAL_FAN, fireCoralIng,
                Material.DEAD_HORN_CORAL_FAN, hornCoralIng);

        workOnInterSpeciesSameLife(Material.DEAD_TUBE_CORAL, tubeCoralIng,
                Material.DEAD_BRAIN_CORAL, brainCoralIng,
                Material.DEAD_BUBBLE_CORAL, bubbleCoralIng,
                Material.DEAD_FIRE_CORAL, fireCoralIng,
                Material.DEAD_HORN_CORAL, hornCoralIng);

        workOnInterSpeciesSameLife(Material.DEAD_TUBE_CORAL_BLOCK, tubeCoralIng,
                Material.DEAD_BRAIN_CORAL_BLOCK, brainCoralIng,
                Material.DEAD_BUBBLE_CORAL_BLOCK, bubbleCoralIng,
                Material.DEAD_FIRE_CORAL_BLOCK, fireCoralIng,
                Material.DEAD_HORN_CORAL_BLOCK, hornCoralIng);
    }

    public static final Material giveLife = Material.WATER_BUCKET;
    public static final Material takeLife = Material.LAVA_BUCKET;

    public static final Material tubeCoralIng = Material.BLUE_DYE;
    public static final Material brainCoralIng = Material.PINK_DYE;
    public static final Material bubbleCoralIng = Material.PURPLE_DYE;
    public static final Material fireCoralIng = Material.RED_DYE;
    public static final Material hornCoralIng = Material.YELLOW_DYE;
}
