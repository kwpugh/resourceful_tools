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
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TreeTrimmer extends ShovelItem
{

	public TreeTrimmer(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double featherChance = ResourcefulToolsConfig.feather_chance.get();
		double stringChance = ResourcefulToolsConfig.string_chance.get();
		double appleChance = ResourcefulToolsConfig.apple_chance.get();
		double rabbitChance = ResourcefulToolsConfig.rabbit_chance.get();
		double spiderEyeChance = ResourcefulToolsConfig.spider_eye_chance.get();
		double pearlChance = ResourcefulToolsConfig.pearl_fragment_chance.get();
		double crystalChance = ResourcefulToolsConfig.prismarine_crystal_chance.get();
		double shardChance = ResourcefulToolsConfig.prismarine_shard_chance.get();
		
		Block block = state.getBlock();
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.SPRUCE_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         	        
		        double r = random.nextDouble();
		        if (r <= featherChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FEATHER, 1)));
		        }		
			}	
			else if(block == Blocks.BIRCH_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         	        
		        double r = random.nextDouble();
		        if (r <= stringChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
		        }			
			}	
			else if(block == Blocks.OAK_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         		        
		        double r = random.nextDouble();
		        if (r <= appleChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.APPLE, 1)));
		        }			
			}	
			else if(block == Blocks.ACACIA_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         		        
		        double r = random.nextDouble();
		        if (r <= rabbitChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.RABBIT_FOOT, 1)));
		        }			
			}	
			else if(block == Blocks.JUNGLE_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         		        
		        double r = random.nextDouble();
		        if (r <= spiderEyeChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPIDER_EYE, 1)));
		        }			
			}	
			else if(block == Blocks.DARK_OAK_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         	        
		        double r = random.nextDouble();
		        if (r <= pearlChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.PEARL_FRAGMENT.get(), 1)));
		        }			
			}	
			else if(block == Blocks.TALL_SEAGRASS)
			{
				stack.damageItem(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});
	         
		        double r = random.nextDouble();
		        if (r <= crystalChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_CRYSTALS, 1)));
		        } 	
			}		
			else if(block == Blocks.KELP_PLANT)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        double r = random.nextDouble();
		        if (r <= shardChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_SHARD, 1)));
		        }
			}
		
			if(!(block == Blocks.SPRUCE_LEAVES) || 
					!(block == Blocks.BIRCH_LEAVES) || 
					!(block == Blocks.OAK_LEAVES) || 
					!(block == Blocks.ACACIA_LEAVES) || 
					!(block == Blocks.JUNGLE_LEAVES) || 
					!(block == Blocks.DARK_OAK_LEAVES) || 
					!(block == Blocks.TALL_SEAGRASS) || 
					!(block == Blocks.KELP_PLANT))
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
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.tree_trimmer.line1").applyTextStyle(TextFormatting.GREEN)));
	}
}
