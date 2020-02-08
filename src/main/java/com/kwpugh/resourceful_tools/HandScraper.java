package com.kwpugh.resourceful_tools;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HandScraper extends Item
{

	public HandScraper(Properties properties)
	{
		super(properties);
	}

    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
    	System.out.println("has container");
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stackIn)
    {
    	ItemStack stack = stackIn.copy();
    	stack.setDamage(getDamage(stack) + 1);
    	System.out.println("get container");
        return stack;
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
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.hand_scrapper.line1").applyTextStyle(TextFormatting.BLUE)));
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.hand_scrapper.line2").applyTextStyle(TextFormatting.GREEN)));
	}
}
