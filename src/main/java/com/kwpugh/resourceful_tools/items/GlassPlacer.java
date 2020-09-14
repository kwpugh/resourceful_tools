package com.kwpugh.resourceful_tools.items;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GlassPlacer extends Item
{

	public GlassPlacer(Properties properties)
	{
		super(properties);
	}

	//Places a glass block where the player is looking, think Angel block
	@Nonnull
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player,@Nonnull Hand hand)
	{			
		if (!world.isRemote)
		{			
			ItemStack stack = player.getHeldItemMainhand();
			
			double x = player.getPositionVec().x + 3 * player.getLookVec().x;
			double y = 1.5 + player.getPositionVec().y + 3 * player.getLookVec().y;
			double z = player.getPositionVec().z  + 3 * player.getLookVec().z;

			BlockPos pos = new BlockPos(x,y,z);
			Block glassBlock = Blocks.GLASS;
			BlockState glassDefaultState = glassBlock.getDefaultState();	      
      
			if (world.isAirBlock(pos) || !world.getFluidState(pos).isEmpty())
			{
				world.setBlockState(pos, glassDefaultState);
				stack.damageItem(1, player, (p_220038_0_) -> {
			         p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
			         });
			}
    }
		return new ActionResult<>(ActionResultType.PASS, player.getHeldItem(hand));
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.glass_placer.line1").mergeStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.glass_placer.line2").mergeStyle(TextFormatting.YELLOW)));
	}
}
