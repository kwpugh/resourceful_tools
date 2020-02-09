package com.kwpugh.resourceful_tools;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupResourcefullTools extends ItemGroup
{
	public GroupResourcefullTools() 
	{
		super("resourceful_tools");
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemInit.HAND_TILLER.get());
	}	
}
