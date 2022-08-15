package com.kwpugh.resourceful_tools.lists;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolMaterialTiers
{
    private static int copperDurability = ResourcefulToolsConfig.copper_tool_durability.get();
    private static double copperEfficiency = ResourcefulToolsConfig.copper_tool_efficiency.get();
    private static double copperAttack = ResourcefulToolsConfig.copper_tool_attack.get();
    private static int copperMiningLevel = 2;
    private static int copperEnchantability = ResourcefulToolsConfig.copper_tool_enchantability.get();

    public static final Tier COPPER = new ForgeTier(copperMiningLevel, copperDurability, (float) copperEfficiency, (float) copperAttack, copperEnchantability,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.COPPER_INGOT));
}
