package com.kwpugh.resourceful_tools.items;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.init.ItemInit;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class HandPick extends PickaxeItem
{
	public HandPick(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double saltPeterChance = ResourcefulToolsConfig.saltpeter_chance.get();
		double sulfurChance = ResourcefulToolsConfig.sulfur_chance.get();
		double smallBlazeChance = ResourcefulToolsConfig.small_blaze_chance.get();
		double ghastTearChance = ResourcefulToolsConfig.ghast_tear_fragment_chance.get();
		double netherStarChance = ResourcefulToolsConfig.nether_star_fragment_chance.get();
		double netheriteChance = ResourcefulToolsConfig.netherite_fragment_chance.get();

		Block block = state.getBlock();
		
		if (!worldIn.isClientSide)
		{
			if(block == Blocks.SANDSTONE)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         	        
		        double r = worldIn.random.nextDouble();
		        if (r <= saltPeterChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SALTPETER.get(), 1)));
		        }		
			}			
			else if(block == Blocks.NETHERRACK)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         		        
		        double r = worldIn.random.nextDouble();
		        if (r <= sulfurChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SULFUR.get(), 1)));
		        }		
			}		
			else if(block == Blocks.MAGMA_BLOCK)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         
		        double r = worldIn.random.nextDouble();
		        if (r <= smallBlazeChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SMALL_BLAZE_POWDER.get(), 1)));
		        }	
			}
			else if(block == Blocks.NETHER_QUARTZ_ORE)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         
		        double r = worldIn.random.nextDouble();
		        if (r <= ghastTearChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.GHAST_TEAR_FRAGMENT.get(), 1)));
		        }		
			}
			else if(block == Blocks.BLACKSTONE)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         
		        double r = worldIn.random.nextDouble();
		        if (r <= netheriteChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHERITE_FRAGMENT.get(), 1)));
		        }		
			}
			else if(block == Blocks.END_STONE)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         
		        double r = worldIn.random.nextDouble();
		        if (r <= netherStarChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHER_STAR_FRAGMENT.get(), 1)));
		        }		
			}
			
			if(!(block == Blocks.SANDSTONE) || 
					!(block == Blocks.NETHERRACK) || 
					!(block == Blocks.MAGMA_BLOCK) || 
					!(block == Blocks.NETHER_QUARTZ_ORE) || 
					!(block == Blocks.BLACKSTONE) || 
					!(block == Blocks.END_STONE))
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });		
			}
	    }

		return true;
	}
	 
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.resourceful_tools.hand_pick.line1").withStyle(ChatFormatting.GREEN)));
	}
}