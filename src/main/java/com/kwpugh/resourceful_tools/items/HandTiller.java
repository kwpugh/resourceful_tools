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
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class HandTiller extends ShovelItem
{
	public HandTiller(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double boneFragmentChance = ResourcefulToolsConfig.bone_fragment_chance.get();
		double inkSacChance = ResourcefulToolsConfig.ink_sac_chance.get();
		
		Block block = state.getBlock();
		
		if (!worldIn.isClientSide)
		{
			if(block == Blocks.GRAVEL)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });

		        double r = worldIn.random.nextDouble();
		        if (r <= boneFragmentChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.BONE_FRAGMENT.get(), 1)));
		        }	
			}
			else if(block == Blocks.CLAY)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });

		        double r = worldIn.random.nextDouble();
		        if (r <= inkSacChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.INK_SAC, 1)));
		        }
			}
			
			if(!(block == Blocks.CLAY) || !(block == Blocks.GRAVEL))
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
		tooltip.add((new TranslatableComponent("item.resourceful_tools.hand_tiller.line1").withStyle(ChatFormatting.GREEN)));
	}
}

