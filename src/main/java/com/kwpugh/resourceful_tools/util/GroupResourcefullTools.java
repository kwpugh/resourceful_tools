package com.kwpugh.resourceful_tools.util;

import com.kwpugh.resourceful_tools.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GroupResourcefullTools extends CreativeModeTab
{
	public GroupResourcefullTools() 
	{
		super("resourceful_tools");
	}
	
	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(ItemInit.HAND_TILLER.get());
	}	
}
