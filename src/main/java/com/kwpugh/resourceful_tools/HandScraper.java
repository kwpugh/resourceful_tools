package com.kwpugh.resourceful_tools;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class HandScraper extends Item
{

	public HandScraper(Properties properties)
	{
		super(properties);
	}

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack)
    {
    	stack.setDamage(stack.getItem().getDamage(stack) + 1);

        return stack.copy();
    }
    
    @Override
    public int getItemEnchantability()
    {
    	return 0;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
    	return false;
    }

    @Override
    public boolean isDamageable()
    {
    	return true;
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book)
    {
    	return false;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment)
    {
    	return false;
    }
    
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.GREEN + "Used on Bamboo to make sheets"));
		list.add(new StringTextComponent(TextFormatting.BLUE + "Use in a crafting table"));

	} 
}
