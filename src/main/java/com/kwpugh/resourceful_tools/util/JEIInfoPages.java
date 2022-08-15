package com.kwpugh.resourceful_tools.util;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.init.ItemInit;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIInfoPages implements IModPlugin
{
	static ResourceLocation plugin = new ResourceLocation(ResourcefulTools.modid, "plugin");

	@Override
	public ResourceLocation getPluginUid()
	{
		return plugin;
	}

	@Override
	public void registerRecipes(IRecipeRegistration registry)
	{
		registry.addIngredientInfo(new ItemStack(ItemInit.HAND_TILLER.get()), VanillaTypes.ITEM_STACK, Component.translatable("item.resourceful_tools.hand_tiller.jei_info.line1"));
		registry.addIngredientInfo(new ItemStack(ItemInit.TREE_TRIMMER.get()), VanillaTypes.ITEM_STACK, Component.translatable("item.resourceful_tools.tree_trimmer.jei_info.line1"));
		registry.addIngredientInfo(new ItemStack(ItemInit.HAND_PICK.get()), VanillaTypes.ITEM_STACK, Component.translatable("item.resourceful_tools.hand_pick.jei_info.line1"));
	}
}