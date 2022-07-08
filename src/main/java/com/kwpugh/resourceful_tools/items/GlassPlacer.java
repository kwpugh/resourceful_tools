package com.kwpugh.resourceful_tools.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class GlassPlacer extends Item
{

	public GlassPlacer(Properties properties)
	{
		super(properties);
	}

	//Places a glass block where the player is looking, think Angel block
	@Nonnull
	public InteractionResultHolder<ItemStack> use(Level world, Player player,@Nonnull InteractionHand hand)
	{			
		if (!world.isClientSide)
		{			
			ItemStack stack = player.getMainHandItem();
			
			double x = player.position().x + 3 * player.getLookAngle().x;
			double y = 1.5 + player.position().y + 3 * player.getLookAngle().y;
			double z = player.position().z  + 3 * player.getLookAngle().z;

			BlockPos pos = new BlockPos(x,y,z);
			Block glassBlock = Blocks.GLASS;
			BlockState glassDefaultState = glassBlock.defaultBlockState();	      
      
			if (world.isEmptyBlock(pos) || !world.getFluidState(pos).isEmpty())
			{
				world.setBlockAndUpdate(pos, glassDefaultState);
				stack.hurtAndBreak(1, player, (p_220038_0_) -> {
			         p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
			         });
			}
    }
		return new InteractionResultHolder<>(InteractionResult.PASS, player.getItemInHand(hand));
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.resourceful_tools.glass_placer.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.resourceful_tools.glass_placer.line2").withStyle(ChatFormatting.YELLOW)));
	}
}
