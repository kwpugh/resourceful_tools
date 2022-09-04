package com.kwpugh.resourceful_tools.lists;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import net.minecraft.world.food.FoodProperties;

public class FoodList
{
    static int clamsHunger = ResourcefulToolsConfig.cooked_clam_hunger.get();
    static double clamsSaturation = ResourcefulToolsConfig.cooked_clam_saturation.get();
    static int jerkyHunger = ResourcefulToolsConfig.jerky_hunger.get();
    static double jerkySaturation = ResourcefulToolsConfig.jerky_saturation.get();
    static int acornHunger = ResourcefulToolsConfig.acorn_hunger.get();
    static double acornSaturation = ResourcefulToolsConfig.acorn_saturation.get();
    static int acornDarkHunger = ResourcefulToolsConfig.acorn_dark_hunger.get();
    static double acornDarkSaturation = ResourcefulToolsConfig.acorn_dark_saturation.get();

    public static FoodProperties cookedClam = (new FoodProperties.Builder())
            .nutrition(clamsHunger)
            .saturationMod((float) clamsSaturation)
            .alwaysEat().fast()
            .build();

    public static FoodProperties jerky = (new FoodProperties.Builder())
            .nutrition(jerkyHunger)
            .saturationMod((float) jerkySaturation)
            .alwaysEat().fast()
            .build();

    public static FoodProperties acorn = (new FoodProperties.Builder())
            .nutrition(acornHunger)
            .saturationMod((float) acornSaturation)
            .alwaysEat().fast()
            .build();

    public static FoodProperties acorn_dark = (new FoodProperties.Builder())
            .nutrition(acornDarkHunger)
            .saturationMod((float) acornDarkSaturation)
            .alwaysEat().fast()
            .build();
}
