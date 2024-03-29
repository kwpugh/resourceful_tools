package com.kwpugh.resourceful_tools.config;


import net.minecraftforge.common.ForgeConfigSpec;

public class ResourcefulToolsConfig 
{
	public static ForgeConfigSpec.DoubleValue bone_fragment_chance;
	public static ForgeConfigSpec.DoubleValue ink_sac_chance;
	public static ForgeConfigSpec.DoubleValue saltpeter_chance;
	public static ForgeConfigSpec.DoubleValue sulfur_chance;
	public static ForgeConfigSpec.DoubleValue small_blaze_chance;
	public static ForgeConfigSpec.DoubleValue ghast_tear_fragment_chance;
	public static ForgeConfigSpec.DoubleValue nether_star_fragment_chance;
	public static ForgeConfigSpec.DoubleValue netherite_fragment_chance;
	public static ForgeConfigSpec.DoubleValue feather_chance;
	public static ForgeConfigSpec.DoubleValue string_chance;
	public static ForgeConfigSpec.DoubleValue apple_chance;
	public static ForgeConfigSpec.DoubleValue rabbit_chance;
	public static ForgeConfigSpec.DoubleValue spider_eye_chance;
	public static ForgeConfigSpec.DoubleValue pearl_fragment_chance;
	public static ForgeConfigSpec.DoubleValue prismarine_crystal_chance;
	public static ForgeConfigSpec.DoubleValue prismarine_shard_chance;
	public static ForgeConfigSpec.DoubleValue membbrane_chance;
	public static ForgeConfigSpec.DoubleValue egg_chance;
	public static ForgeConfigSpec.DoubleValue clam_chance;
	public static ForgeConfigSpec.DoubleValue bit_o_slime_chance;
	public static ForgeConfigSpec.DoubleValue acorn_chance;
	public static ForgeConfigSpec.DoubleValue acorn_dark_chance;

	public static ForgeConfigSpec.IntValue cooked_clam_hunger;
	public static ForgeConfigSpec.DoubleValue cooked_clam_saturation;
	public static ForgeConfigSpec.IntValue jerky_hunger;
	public static ForgeConfigSpec.DoubleValue jerky_saturation;
	public static ForgeConfigSpec.IntValue acorn_hunger;
	public static ForgeConfigSpec.DoubleValue acorn_saturation;
	public static ForgeConfigSpec.IntValue acorn_dark_hunger;
	public static ForgeConfigSpec.DoubleValue acorn_dark_saturation;

	public static ForgeConfigSpec.IntValue hand_scraper_durability;
	public static ForgeConfigSpec.IntValue hand_scraper_copper_durability;

	public static ForgeConfigSpec.IntValue copper_tool_durability;
	public static ForgeConfigSpec.DoubleValue copper_tool_efficiency;
	public static ForgeConfigSpec.DoubleValue copper_tool_attack;
	public static ForgeConfigSpec.IntValue copper_tool_enchantability;

	public static ForgeConfigSpec.DoubleValue anvil_damage_chance;

	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{
		anvil_damage_chance = server
				.comment("Chance of anvil taking damage on use. [0.0 - 1.0, default: 0.0]")
				.defineInRange("anvil_damage_chance", 0.0, 0.0, 1.0);

		copper_tool_durability = server
				.comment("Copper Tool Durability [250-3000, default: 525]")
				.defineInRange("copperToolDurability", 128, 1, 512);
		copper_tool_efficiency = server
				.comment("Copper Tool efficiency [1.0-7.0, default: 4.5]")
				.defineInRange("copperToolEfficiency", 4.5, 0.0, 7.0);
		copper_tool_attack = server
				.comment("Copper attack damage [1-40, default: 2.0]")
				.defineInRange("copperAttackDamage", 2.0, 0.0, 40.0);
		copper_tool_enchantability = server
				.comment("Copper tool enchantability [1-30, default: 18]")
				.defineInRange("copperEnchantability", 18, 1, 30);

		hand_scraper_durability = server
				.comment("Max durability of Iron Hand Scraper")
				.defineInRange("hand_scraper_durability", 250, 1, 512);
		hand_scraper_copper_durability = server
				.comment("Max durability of Copper Hand Scraper")
				.defineInRange("hand_scraper_copper_durability", 128, 1, 512);

		bone_fragment_chance = server
				.comment("Chance to drop bone fragment from Gravel with Hand Tiller")
				.defineInRange("bone_fragment_chance", 0.20, 0.0, 1.0);
		
		ink_sac_chance = server
				.comment("Chance to drop ink sac from Clay with Hand Tiller")
				.defineInRange("ink_sac_chance", 0.20, 0.0, 1.0);	
	
		saltpeter_chance = server
				.comment("Chance to drop saltpeter from Sandstone with Hand Pick")
				.defineInRange("saltpeter_chance", 0.20, 0.0, 1.0);	
		
		sulfur_chance = server
				.comment("Chance to drop sulfur from Netherrack with Hand Pick")
				.defineInRange("sulfur_chance", 0.10, 0.0, 1.0);	
		
		small_blaze_chance = server
				.comment("Chance to drop small pile of blaze powder from Magma block with Hand Pick")
				.defineInRange("small_blaze_chance", 0.10, 0.0, 1.0);	
		
		ghast_tear_fragment_chance = server
				.comment("Chance to drop ghast tear fragment from Nether Quartz block with Hand Pick")
				.defineInRange("ghast_tear_fragment_chance", 0.10, 0.0, 1.0);	
		
		nether_star_fragment_chance = server
				.comment("Chance to drop nether star fragment from End Stone with Hand Pick")
				.defineInRange("nether_star_fragment_chance", 0.10, 0.0, 1.0);	

		netherite_fragment_chance = server
				.comment("Chance to drop netherite fragment from Blackstone with Hand Pick")
				.defineInRange("netherite_fragment_chance", 0.10, 0.0, 1.0);	
		
		feather_chance = server
				.comment("Chance to drop feathers from Spruce Leaves with Hand Trimmer")
				.defineInRange("feather_chance", 0.15, 0.0, 1.0);	
		
		string_chance = server
				.comment("Chance to drop string from Birch Leaves with Hand Trimmer")
				.defineInRange("string_chance", 0.15, 0.0, 1.0);	
		
		apple_chance = server
				.comment("Chance to drop apple from Oak Leaves with Hand Trimmer")
				.defineInRange("apple_chance", 0.25, 0.0, 1.0);

		acorn_chance = server
				.comment("Chance to drop acorn from Oak Leaves with Hand Trimmer")
				.defineInRange("acorn_chance", 0.05, 0.0, 1.0);

		acorn_dark_chance = server
				.comment("Chance to drop acorn from Dark Oak Leaves with Hand Trimmer")
				.defineInRange("acorn_dark_chance", 0.05, 0.0, 1.0);

		rabbit_chance = server
				.comment("Chance to drop rabbit foot from Acacia Leaves with Hand Trimmer")
				.defineInRange("rabbit_chance", 0.05, 0.0, 1.0);
		
		spider_eye_chance = server
				.comment("Chance to drop spider eye from Jungle Leaves with Hand Trimmer")
				.defineInRange("spider_eye_chance", 0.10, 0.0, 1.0);	
		
		pearl_fragment_chance = server
				.comment("Chance to drop pearl fragment from Dark Oak Leaves with Hand Trimmer")
				.defineInRange("pearl_fragment_chance", 0.10, 0.0, 1.0);
	
		prismarine_crystal_chance = server
				.comment("Chance to drop prismarine crystal from Tall Seagrass with Hand Trimmer")
				.defineInRange("prismarine_crystal_chance", 0.15, 0.0, 1.0);
		
		prismarine_shard_chance = server
				.comment("Chance to drop prismarine shard from Kelp Plant with Hand Trimmer")
				.defineInRange("prismarine_shard_chance", 0.15, 0.0, 1.0);

		membbrane_chance = server
				.comment("Chance to drop phantom membrane shard from Azela Leaves with Hand Trimmer")
				.defineInRange("membrane_chance", 0.1, 0.0, 1.0);

		egg_chance = server
				.comment("Chance to drop eggs from Hay block with Hand Trimmer")
				.defineInRange("egg_chance", 0.1, 0.0, 1.0);

		bit_o_slime_chance = server
				.comment("Chance to drop Bit o' Slime from Rooted Dirt with Tiller")
				.defineInRange("bit_o_slime_chance", 0.2, 0.0, 1.0);

		clam_chance = server
				.comment("Chance to drop clams from Sand with Clam Digger")
				.defineInRange("clam_chance", 0.1, 0.0, 1.0);

		cooked_clam_hunger = server
				.comment("Hunger value:")
				.defineInRange("cooked_clam_hunger", 6, 0, 30);

		cooked_clam_saturation = server
				.comment("Saturation value:")
				.defineInRange("cooked_clam_saturation", 0.8, 0.0, 10.0);

		jerky_hunger = server
				.comment("Hunger value:")
				.defineInRange("jerky_hunger", 6, 0, 30);

		jerky_saturation = server
				.comment("Saturation value:")
				.defineInRange("jerky_saturation", 0.8, 0.0, 10.0);

		acorn_hunger = server
				.comment("Hunger value:")
				.defineInRange("acorn_hunger", 7, 0, 30);

		acorn_saturation = server
				.comment("Saturation value:")
				.defineInRange("acorn_saturation", 0.9, 0.0, 10.0);

		acorn_dark_hunger = server
				.comment("Hunger value:")
				.defineInRange("acorn_dark_hunger", 7, 0, 30);

		acorn_dark_saturation = server
				.comment("Saturation value:")
				.defineInRange("acorn_dark_saturation", 0.9, 0.0, 10.0);
	}
}