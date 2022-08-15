package com.kwpugh.resourceful_tools.lists;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import net.minecraft.world.food.FoodProperties;

public class FoodList
{
    static int clamHunger = ResourcefulToolsConfig.cooked_clam_hunger.get();
    static double clamSaturation = ResourcefulToolsConfig.cooked_clam_saturation.get();
    static int jerkyHunger = ResourcefulToolsConfig.jerky_hunger.get();
    static double jerkySaturation = ResourcefulToolsConfig.jerky_saturation.get();

    public static FoodProperties cookedClam = (new FoodProperties.Builder()).nutrition(clamHunger).saturationMod((float) clamSaturation).alwaysEat().fast().build();
    public static FoodProperties jerky = (new FoodProperties.Builder()).nutrition(jerkyHunger).saturationMod((float) jerkySaturation).alwaysEat().fast().build();
}
