package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.lists.FoodList;
import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.items.*;

import com.kwpugh.resourceful_tools.lists.ToolMaterialTiers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ResourcefulTools.modid);

	public static final RegistryObject<Item> DIRT_SINGLE = ITEMS.register("dirt_single", () -> new BlockItem(BlockInit.DIRT_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIRT_DOUBLE = ITEMS.register("dirt_double", () -> new BlockItem(BlockInit.DIRT_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIRT_TRIPLE = ITEMS.register("dirt_triple", () -> new BlockItem(BlockInit.DIRT_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> GRAVEL_SINGLE = ITEMS.register("gravel_single", () -> new BlockItem(BlockInit.GRAVEL_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRAVEL_DOUBLE = ITEMS.register("gravel_double", () -> new BlockItem(BlockInit.GRAVEL_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRAVEL_TRIPLE = ITEMS.register("gravel_triple", () -> new BlockItem(BlockInit.GRAVEL_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> SAND_SINGLE = ITEMS.register("sand_single", () -> new BlockItem(BlockInit.SAND_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> SAND_DOUBLE = ITEMS.register("sand_double", () -> new BlockItem(BlockInit.SAND_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> SAND_TRIPLE = ITEMS.register("sand_triple", () -> new BlockItem(BlockInit.SAND_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> COBBLESTONE_SINGLE = ITEMS.register("cobblestone_single", () -> new BlockItem(BlockInit.COBBLESTONE_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COBBLESTONE_DOUBLE = ITEMS.register("cobblestone_double", () -> new BlockItem(BlockInit.COBBLESTONE_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COBBLESTONE_TRIPLE = ITEMS.register("cobblestone_triple", () -> new BlockItem(BlockInit.COBBLESTONE_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> STONE_SINGLE = ITEMS.register("stone_single", () -> new BlockItem(BlockInit.STONE_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> STONE_DOUBLE = ITEMS.register("stone_double", () -> new BlockItem(BlockInit.STONE_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> STONE_TRIPLE = ITEMS.register("stone_triple", () -> new BlockItem(BlockInit.STONE_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> ANDESITE_SINGLE = ITEMS.register("andesite_single", () -> new BlockItem(BlockInit.ANDESITE_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> ANDESITE_DOUBLE = ITEMS.register("andesite_double", () -> new BlockItem(BlockInit.ANDESITE_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> ANDESITE_TRIPLE = ITEMS.register("andesite_triple", () -> new BlockItem(BlockInit.ANDESITE_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> DIORITE_SINGLE = ITEMS.register("diorite_single", () -> new BlockItem(BlockInit.DIORITE_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIORITE_DOUBLE = ITEMS.register("diorite_double", () -> new BlockItem(BlockInit.DIORITE_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIORITE_TRIPLE = ITEMS.register("diorite_triple", () -> new BlockItem(BlockInit.DIORITE_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> GRANITE_SINGLE = ITEMS.register("granite_single", () -> new BlockItem(BlockInit.GRANITE_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRANITE_DOUBLE = ITEMS.register("granite_double", () -> new BlockItem(BlockInit.GRANITE_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRANITE_TRIPLE = ITEMS.register("granite_triple", () -> new BlockItem(BlockInit.GRANITE_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> NETHERRACK_SINGLE = ITEMS.register("netherrack_single", () -> new BlockItem(BlockInit.NETHERRACK_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHERRACK_DOUBLE = ITEMS.register("netherrack_double", () -> new BlockItem(BlockInit.NETHERRACK_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHERRACK_TRIPLE = ITEMS.register("netherrack_triple", () -> new BlockItem(BlockInit.NETHERRACK_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> BASALT_SINGLE = ITEMS.register("basalt_single", () -> new BlockItem(BlockInit.BASALT_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> BASALT_DOUBLE = ITEMS.register("basalt_double", () -> new BlockItem(BlockInit.BASALT_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> BASALT_TRIPLE = ITEMS.register("basalt_triple", () -> new BlockItem(BlockInit.BASALT_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> COBBLED_DEEPSLATE_SINGLE = ITEMS.register("cobbled_deepslate_single", () -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_DOUBLE = ITEMS.register("cobbled_deepslate_double", () -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COBBLED_DEEPSLATE_TRIPLE = ITEMS.register("cobbled_deepslate_triple", () -> new BlockItem(BlockInit.COBBLED_DEEPSLATE_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> TUFF_SINGLE = ITEMS.register("tuff_single", () -> new BlockItem(BlockInit.TUFF_SINGLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> TUFF_DOUBLE = ITEMS.register("tuff_double", () -> new BlockItem(BlockInit.TUFF_DOUBLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> TUFF_TRIPLE = ITEMS.register("tuff_triple", () -> new BlockItem(BlockInit.TUFF_TRIPLE.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> HAND_TILLER = ITEMS.register("hand_tiller", () -> new HandTiller(Tiers.IRON, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HOOK_KNIFE = ITEMS.register("hook_knife", () -> new HookKnife(Tiers.IRON, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_PICK = ITEMS.register("hand_pick", () -> new HandPick(Tiers.IRON, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_SCRAPPER = ITEMS.register("hand_scraper", () -> new HandScraper(new Item.Properties().durability(ResourcefulToolsConfig.hand_scraper_durability.get()).setNoRepair().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> TREE_TRIMMER = ITEMS.register("tree_trimmer", () -> new TreeTrimmer(Tiers.IRON, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GLASS_PLACER = ITEMS.register("glass_placer", () -> new GlassPlacer(new Item.Properties().durability(8).tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> CLAM_DIGGER = ITEMS.register("clam_digger", () -> new ClamDigger(Tiers.IRON, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_TILLER_COPPER = ITEMS.register("hand_tiller_copper", () -> new HandTiller(ToolMaterialTiers.COPPER, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HOOK_KNIFE_COPPER = ITEMS.register("hook_knife_copper", () -> new HookKnife(ToolMaterialTiers.COPPER, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_PICK_COPPER = ITEMS.register("hand_pick_copper", () -> new HandPick(ToolMaterialTiers.COPPER, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_SCRAPPER_COPPER = ITEMS.register("hand_scraper_copper", () -> new HandScraper(new Item.Properties().durability(ResourcefulToolsConfig.hand_scraper_copper_durability.get()).setNoRepair().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> TREE_TRIMMER_COPPER = ITEMS.register("tree_trimmer_copper", () -> new TreeTrimmer(ToolMaterialTiers.COPPER, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> CLAM_DIGGER_COPPER = ITEMS.register("clam_digger_copper", () -> new ClamDigger(ToolMaterialTiers.COPPER, -2, -3, new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> POWDER_SULFUR = ITEMS.register("powder_sulfur", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> POWDER_SALTPETER = ITEMS.register("powder_saltpeter", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> BONE_FRAGMENT = ITEMS.register("bone_fragment", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> PEARL_FRAGMENT = ITEMS.register("pearl_fragment", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> SMALL_BLAZE_POWDER = ITEMS.register("small_blaze_powder", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHER_STAR_FRAGMENT = ITEMS.register("nether_star_fragment", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GHAST_TEAR_FRAGMENT = ITEMS.register("ghast_tear_fragment", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHERITE_FRAGMENT = ITEMS.register("netherite_fragment", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> BAMBOO_SHEET = ITEMS.register("bamboo_sheet", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> LARGE_BAMBOO_SHEET = ITEMS.register("large_bamboo_sheet", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> CLAM = ITEMS.register("clam", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> RAW_CLAM = ITEMS.register("raw_clam", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COOKED_CLAM = ITEMS.register("cooked_clam", () -> new Item(new Item.Properties().food(FoodList.cookedClam).tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> JERKY = ITEMS.register("jerky", () -> new Item(new Item.Properties().food(FoodList.jerky).tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> REAM_OF_PAPER = ITEMS.register("ream_of_paper", () -> new Item(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> TRASH_CAN = ITEMS.register("trash_can", () -> new TrashCan(new Item.Properties().tab(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> WELLSPRING = ITEMS.register("wellspring", () -> new BlockItem(BlockInit.WELLSPRING.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> LAVASPRING = ITEMS.register("lavaspring", () -> new BlockItem(BlockInit.LAVASPRING.get(), new Item.Properties().tab(ResourcefulTools.resourceful_tools)));
}