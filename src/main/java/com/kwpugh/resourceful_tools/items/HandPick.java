package com.kwpugh.resourceful_tools.items;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HandPick extends PickaxeItem
{
	public HandPick(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double saltPeterChance = ResourcefulToolsConfig.saltpeter_chance.get();
		double sulfurChance = ResourcefulToolsConfig.sulfur_chance.get();
		double smallBlazeChance = ResourcefulToolsConfig.small_blaze_chance.get();
		double ghastTearChance = ResourcefulToolsConfig.ghast_tear_fragment_chance.get();
		double netherStarChance = ResourcefulToolsConfig.nether_star_fragment_chance.get();

		Block block = state.getBlock();
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.SANDSTONE)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         	        
		        double r = random.nextDouble();
		        if (r <= saltPeterChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SALTPETER.get(), 1)));
		        }		
			}			
			else if(block == Blocks.NETHERRACK)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         		        
		        double r = random.nextDouble();
		        if (r <= sulfurChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SULFUR.get(), 1)));
		        }		
			}		
			else if(block == Blocks.MAGMA_BLOCK)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= smallBlazeChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SMALL_BLAZE_POWDER.get(), 1)));
		        }	
			}
			else if(block == Blocks.NETHER_QUARTZ_ORE)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= ghastTearChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.GHAST_TEAR_FRAGMENT.get(), 1)));
		        }		
			}
			else if(block == Blocks.END_STONE)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= netherStarChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHER_STAR_FRAGMENT.get(), 1)));
		        }		
			}
			
			if(!(block == Blocks.SANDSTONE) || 
					!(block == Blocks.NETHERRACK) || 
					!(block == Blocks.MAGMA_BLOCK) || 
					!(block == Blocks.NETHER_QUARTZ_ORE) || 
					!(block == Blocks.END_STONE))
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });		
			}
	    }

		return true;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.hand_pick.line1").applyTextStyle(TextFormatting.GREEN)));
	}
}