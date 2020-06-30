package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.items.GlassPlacer;
import com.kwpugh.resourceful_tools.items.HandPick;
import com.kwpugh.resourceful_tools.items.HandScraper;
import com.kwpugh.resourceful_tools.items.HandTiller;
import com.kwpugh.resourceful_tools.items.HookKnife;
import com.kwpugh.resourceful_tools.items.TreeTrimmer;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ResourcefulTools.modid);

	public static final RegistryObject<Item> DIRT_SINGLE = ITEMS.register("dirt_single", () -> new BlockItem(BlockInit.DIRT_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIRT_DOUBLE = ITEMS.register("dirt_double", () -> new BlockItem(BlockInit.DIRT_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIRT_TRIPLE = ITEMS.register("dirt_triple", () -> new BlockItem(BlockInit.DIRT_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> GRAVEL_SINGLE = ITEMS.register("gravel_single", () -> new BlockItem(BlockInit.GRAVEL_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRAVEL_DOUBLE = ITEMS.register("gravel_double", () -> new BlockItem(BlockInit.GRAVEL_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRAVEL_TRIPLE = ITEMS.register("gravel_triple", () -> new BlockItem(BlockInit.GRAVEL_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> SAND_SINGLE = ITEMS.register("sand_single", () -> new BlockItem(BlockInit.SAND_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> SAND_DOUBLE = ITEMS.register("sand_double", () -> new BlockItem(BlockInit.SAND_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> SAND_TRIPLE = ITEMS.register("sand_triple", () -> new BlockItem(BlockInit.SAND_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> COBBLESTONE_SINGLE = ITEMS.register("cobblestone_single", () -> new BlockItem(BlockInit.COBBLESTONE_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COBBLESTONE_DOUBLE = ITEMS.register("cobblestone_double", () -> new BlockItem(BlockInit.COBBLESTONE_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> COBBLESTONE_TRIPLE = ITEMS.register("cobblestone_triple", () -> new BlockItem(BlockInit.COBBLESTONE_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> ANDESITE_SINGLE = ITEMS.register("andesite_single", () -> new BlockItem(BlockInit.ANDESITE_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> ANDESITE_DOUBLE = ITEMS.register("andesite_double", () -> new BlockItem(BlockInit.ANDESITE_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> ANDESITE_TRIPLE = ITEMS.register("andesite_triple", () -> new BlockItem(BlockInit.ANDESITE_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> DIORITE_SINGLE = ITEMS.register("diorite_single", () -> new BlockItem(BlockInit.DIORITE_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIORITE_DOUBLE = ITEMS.register("diorite_double", () -> new BlockItem(BlockInit.DIORITE_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> DIORITE_TRIPLE = ITEMS.register("diorite_triple", () -> new BlockItem(BlockInit.DIORITE_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> GRANITE_SINGLE = ITEMS.register("granite_single", () -> new BlockItem(BlockInit.GRANITE_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRANITE_DOUBLE = ITEMS.register("granite_double", () -> new BlockItem(BlockInit.GRANITE_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GRANITE_TRIPLE = ITEMS.register("granite_triple", () -> new BlockItem(BlockInit.GRANITE_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> NETHERRACK_SINGLE = ITEMS.register("netherrack_single", () -> new BlockItem(BlockInit.NETHERRACK_SINGLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHERRACK_DOUBLE = ITEMS.register("netherrack_double", () -> new BlockItem(BlockInit.NETHERRACK_DOUBLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHERRACK_TRIPLE = ITEMS.register("netherrack_triple", () -> new BlockItem(BlockInit.NETHERRACK_TRIPLE.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	
	public static final RegistryObject<Item> HAND_TILLER = ITEMS.register("hand_tiller", () -> new HandTiller(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HOOK_KNIFE = ITEMS.register("hook_knife", () -> new HookKnife(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_PICK = ITEMS.register("hand_pick", () -> new HandPick(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> HAND_SCRAPPER = ITEMS.register("hand_scraper", () -> new HandScraper(new Item.Properties().maxDamage(128).setNoRepair().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> TREE_TRIMMER = ITEMS.register("tree_trimmer", () -> new TreeTrimmer(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GLASS_PLACER = ITEMS.register("glass_placer", () -> new GlassPlacer(new Item.Properties().maxDamage(8).group(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> POWDER_SULFUR = ITEMS.register("powder_sulfur", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> POWDER_SALTPETER = ITEMS.register("powder_saltpeter", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> BONE_FRAGMENT = ITEMS.register("bone_fragment", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> PEARL_FRAGMENT = ITEMS.register("pearl_fragment", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> SMALL_BLAZE_POWDER = ITEMS.register("small_blaze_powder", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> NETHER_STAR_FRAGMENT = ITEMS.register("nether_star_fragment", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> GHAST_TEAR_FRAGMENT = ITEMS.register("ghast_tear_fragment", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> BAMBOO_SHEET = ITEMS.register("bamboo_sheet", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> LARGE_BAMBOO_SHEET = ITEMS.register("large_bamboo_sheet", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> REAM_OF_PAPER = ITEMS.register("ream_of_paper", () -> new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)));

	public static final RegistryObject<Item> WELLSPRING = ITEMS.register("wellspring", () -> new BlockItem(BlockInit.WELLSPRING.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
	public static final RegistryObject<Item> LAVASPRING = ITEMS.register("lavaspring", () -> new BlockItem(BlockInit.LAVASPRING.get(), new Item.Properties().group(ResourcefulTools.resourceful_tools)));
}