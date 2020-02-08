package com.kwpugh.resourceful_tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemInit
{
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(				
					ItemList.hand_tiller = new HandTiller(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("hand_tiller")),	
					ItemList.hand_pick = new HandPick(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("hand_pick")),
					ItemList.hand_scraper = new HandScraper(new Item.Properties().maxDamage(128).group(ResourcefulTools.resourceful_tools)).setRegistryName(location("hand_scraper")),
					ItemList.tree_trimmer = new TreeTrimmer(ItemTier.IRON, -2, -3, new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("tree_trimmer")),
					
					ItemList.powder_sulfur = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("powder_sulfur")),
					ItemList.powder_saltpeter = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("powder_saltpeter")),				
					ItemList.bone_fragment = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("bone_fragment")),
					ItemList.pearl_fragment = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("pearl_fragment")),
					ItemList.small_blaze_powder = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("small_blaze_powder")),
					ItemList.nether_star_fragment = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("nether_star_fragment")),
					ItemList.ghast_tear_fragment = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("ghast_tear_fragment")),
					
					ItemList.bamboo_sheet = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("bamboo_sheet")),
					ItemList.large_bamboo_sheet = new Item(new Item.Properties().group(ResourcefulTools.resourceful_tools)).setRegistryName(location("large_bamboo_sheet"))				
			);		
			ResourcefulTools.logger.info("Items registered.");
		}
		
		private static ResourceLocation location(String name)
		{
			return new ResourceLocation(ResourcefulTools.modid, name);
		}
	}
}