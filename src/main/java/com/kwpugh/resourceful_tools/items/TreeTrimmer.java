package com.kwpugh.resourceful_tools.items;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TreeTrimmer extends ShovelItem
{

	public TreeTrimmer(Tier tier, float attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double featherChance = ResourcefulToolsConfig.feather_chance.get();
		double stringChance = ResourcefulToolsConfig.string_chance.get();
		double appleChance = ResourcefulToolsConfig.apple_chance.get();
		double rabbitChance = ResourcefulToolsConfig.rabbit_chance.get();
		double spiderEyeChance = ResourcefulToolsConfig.spider_eye_chance.get();
		double pearlChance = ResourcefulToolsConfig.pearl_fragment_chance.get();
		double crystalChance = ResourcefulToolsConfig.prismarine_crystal_chance.get();
		double shardChance = ResourcefulToolsConfig.prismarine_shard_chance.get();
		double membraneChance  = ResourcefulToolsConfig.membbrane_chance.get();
		double eggChance = ResourcefulToolsConfig.egg_chance.get();

		Block block = state.getBlock();
		
		if (!worldIn.isClientSide)
		{
			if(block == Blocks.SPRUCE_LEAVES)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         	        
		        double r = worldIn.random.nextDouble();
		        if (r <= featherChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FEATHER, 1)));
		        }		
			}	
			else if(block == Blocks.BIRCH_LEAVES)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         	        
		        double r = worldIn.random.nextDouble();
		        if (r <= stringChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
		        }			
			}	
			else if(block == Blocks.OAK_LEAVES)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         		        
		        double r = worldIn.random.nextDouble();
		        if (r <= appleChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.APPLE, 1)));
		        }			
			}	
			else if(block == Blocks.ACACIA_LEAVES)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         		        
		        double r = worldIn.random.nextDouble();
		        if (r <= rabbitChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.RABBIT_FOOT, 1)));
		        }			
			}	
			else if(block == Blocks.JUNGLE_LEAVES)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         		        
		        double r = worldIn.random.nextDouble();
		        if (r <= spiderEyeChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPIDER_EYE, 1)));
		        }			
			}	
			else if(block == Blocks.DARK_OAK_LEAVES)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         	        
		        double r = worldIn.random.nextDouble();
		        if (r <= pearlChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.PEARL_FRAGMENT.get(), 1)));
		        }			
			}
			else if(block == Blocks.AZALEA_LEAVES  || block == Blocks.FLOWERING_AZALEA_LEAVES)
			{
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= membraneChance)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PHANTOM_MEMBRANE, 1)));
				}
			}
			else if(block == Blocks.HAY_BLOCK)
			{
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});

				double r = worldIn.random.nextDouble();
				if (r <= eggChance)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EGG, 1)));
				}
			}
			else if(block == Blocks.TALL_SEAGRASS)
			{
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
					p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
				});
	         
		        double r = worldIn.random.nextDouble();
		        if (r <= crystalChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_CRYSTALS, 1)));
		        } 	
			}		
			else if(block == Blocks.KELP_PLANT)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
		         
		        double r = worldIn.random.nextDouble();
		        if (r <= shardChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_SHARD, 1)));
		        }
			}
		
			if(!(block == Blocks.SPRUCE_LEAVES) || 
					!(block == Blocks.BIRCH_LEAVES) || 
					!(block == Blocks.OAK_LEAVES) || 
					!(block == Blocks.ACACIA_LEAVES) || 
					!(block == Blocks.JUNGLE_LEAVES) || 
					!(block == Blocks.DARK_OAK_LEAVES) ||
					!(block == Blocks.AZALEA_LEAVES) ||
					!(block == Blocks.FLOWERING_AZALEA_LEAVES) ||
					!(block == Blocks.HAY_BLOCK) ||
					!(block == Blocks.TALL_SEAGRASS) || 
					!(block == Blocks.KELP_PLANT))
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
		tooltip.add((Component.translatable("item.resourceful_tools.tree_trimmer.line1").withStyle(ChatFormatting.GREEN)));
	}
}
