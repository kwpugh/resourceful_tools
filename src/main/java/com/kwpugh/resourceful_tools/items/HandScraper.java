package com.kwpugh.resourceful_tools.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
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
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stackIn)
    {
    	ItemStack stack = stackIn.copy();
    	stack.setDamage(getDamage(stack) + 1);

        return stack;
    }
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.hand_scrapper.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.hand_scrapper.line2").applyTextStyle(TextFormatting.GREEN)));
	}
}
