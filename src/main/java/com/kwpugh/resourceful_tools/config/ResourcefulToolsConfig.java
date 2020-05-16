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
	public static ForgeConfigSpec.DoubleValue feather_chance;
	public static ForgeConfigSpec.DoubleValue string_chance;
	public static ForgeConfigSpec.DoubleValue apple_chance;
	public static ForgeConfigSpec.DoubleValue rabbit_chance;
	public static ForgeConfigSpec.DoubleValue spider_eye_chance;
	public static ForgeConfigSpec.DoubleValue pearl_fragment_chance;
	public static ForgeConfigSpec.DoubleValue prismarine_crystal_chance;
	public static ForgeConfigSpec.DoubleValue prismarine_shard_chance;
	
	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{	
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
				.defineInRange("ghast_tear_fragment_chance", 0.20, 0.0, 1.0);	
		
		nether_star_fragment_chance = server
				.comment("Chance to drop nether star fragment from End Stone with Hand Pick")
				.defineInRange("nether_star_fragment_chance", 0.15, 0.0, 1.0);	
		
		feather_chance = server
				.comment("Chance to drop feathers from Spruce Leaves with Hand Trimmer")
				.defineInRange("feather_chance", 0.15, 0.0, 1.0);	
		
		string_chance = server
				.comment("Chance to drop string from Birch Leaves with Hand Trimmer")
				.defineInRange("string_chance", 0.15, 0.0, 1.0);	
		
		apple_chance = server
				.comment("Chance to drop apple from Oak Leaves with Hand Trimmer")
				.defineInRange("apple_chance", 0.25, 0.0, 1.0);
	
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
	}
}