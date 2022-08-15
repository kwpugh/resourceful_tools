package com.kwpugh.resourceful_tools.items;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ClamDigger extends ShovelItem
{
	public ClamDigger(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double clamChance = ResourcefulToolsConfig.clam_chance.get();
		
		Block block = state.getBlock();
		
		if (!worldIn.isClientSide)
		{
			if(block == Blocks.SAND && worldIn.getBiome(pos).is(BiomeTags.IS_BEACH))
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });

		        double r = worldIn.random.nextDouble();
		        if (r <= clamChance)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.CLAM.get(), 1)));
		        }	
			}
			
			if(!(block == Blocks.SAND))
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
		tooltip.add((Component.translatable("item.resourceful_tools.clam_digger.line1").withStyle(ChatFormatting.GREEN)));
	}
}

