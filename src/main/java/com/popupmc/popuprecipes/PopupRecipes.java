package com.popupmc.popuprecipes;

import org.bukkit.plugin.java.JavaPlugin;

public class PopupRecipes extends JavaPlugin {
    @Override
    public void onEnable() {
        plugin = this;

        // Creation of Grass Block, Dirt + <ingridient>
        GrassRecipes.addGrassBlockRecipes();

        // Creation of Mycelium, Dirt + <ingridient>
        MyceliumRecipes.addMyceliumRecipes();

        // Creation of mushroom blocks
        MushroomRecipes.addMushroomBlockRecipes();

        // Creation of mushroom stems
        MushroomRecipes.addMushroomStemRecipe();

        // Creation of leaves to saplings
        SaplingRecipes.addSaplingsRecipe();

        // Creation of apples
        AppleRecipes.addAppleRecipes();

        // Creation of seeds
        MiscRecipes.addSeedsRecipes();

        // Creation of Bell Recipe
        MiscRecipes.addBellRecipe();

        // Creation of chainmail
        ChainmailRecipes.addChainmailRecipes();

        // Creation of damaged anvils
        AnvilRecipes.addDamagedAnvilRecipes();

        // Creation of cobweb
        MiscRecipes.addCobwebRecipe();

        // Creation of horse armor
        HorseArmorRecipes.addHorseArmorRecipes();

        // Creation, manipulation, and conversion of coral
        CoralRecipes.addCoralRecipes();

        // Creation of ores
        OreRecipes.addOreRecipes();

        // Creation of Stone, Netherrack, and End Stone recipes and cross-converting
        WorldStoneRecipes.addWorldStoneRecipes();

        // Creation of grass
        GrassRecipes.addGrassRecipe();

        // Creation of Nametags
        MiscRecipes.addNametagRecipe();

        // Creation of Petrified Oak
        MiscRecipes.addPetrifiedOakSlabRecipe();

        // Creation of Phantom Membrane
        // Because phantoms were disabled
        MiscRecipes.addPhantomMembraneRecipe();

        // Creation of Podzol
        PodzolRecipes.addPodzolRecipes();

        // Creation of Ferns
        MiscRecipes.addFernRecipe();

        // Creation of Dead Bush
        MiscRecipes.addDeadbushRecipe();

        // Creation of saddle
        MiscRecipes.addSaddleRecipe();

        // Creation of sands
        MiscRecipes.addSandRecipes();

        // Creation of Tall Grass
        GrassRecipes.addTallGrassRecipe();

        getLogger().info("Added: " + numberOfRecipesAdded + " recipes");
        getLogger().info("PopupRecipes is enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("PopupRecipes is disabled");
    }

    static JavaPlugin plugin;
    static int numberOfRecipesAdded = 0;
}
