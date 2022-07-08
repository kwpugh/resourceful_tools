package com.kwpugh.resourceful_tools.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class HookKnife extends SwordItem
{
	public HookKnife(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public InteractionResult useOn(UseOnContext context)
	{
		 Level world = context.getLevel();
		 Player player = context.getPlayer();
		 BlockPos pos = context.getClickedPos();
		 BlockState state = world.getBlockState(pos);
		 Block block = state.getBlock();
		 ItemStack stack = context.getItemInHand();
	      
	     if(block == Blocks.WHITE_WOOL ||
	    		 block == Blocks.BLACK_WOOL ||
	    		 block == Blocks.BLUE_WOOL ||
	    		 block == Blocks.BROWN_WOOL ||
	    		 block == Blocks.CYAN_WOOL ||
	    		 block == Blocks.GRAY_WOOL ||
	    		 block == Blocks.GREEN_WOOL ||
	    		 block == Blocks.LIGHT_BLUE_WOOL ||
	    		 block == Blocks.LIGHT_GRAY_WOOL ||
	    		 block == Blocks.LIME_WOOL ||
	    		 block == Blocks.MAGENTA_WOOL ||
	    		 block == Blocks.ORANGE_WOOL ||
	    		 block == Blocks.PINK_WOOL ||
	    		 block == Blocks.PURPLE_WOOL ||
	    		 block == Blocks.RED_WOOL ||
	    		 block == Blocks.YELLOW_WOOL
	    		 )
	     {
	    	 world.destroyBlock(pos, false);
	    	 world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 4))); 
	    	 stack.hurtAndBreak(1, player, (p_220038_0_) -> {
		         p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });
	     }
	     
	     
		 return InteractionResult.PASS;
	}
	
	public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity)
	{
		if(entity instanceof Sheep)
		{
			Level world = player.level;
			Vec3 pos = entity.position();
			
			 world.addFreshEntity(new ItemEntity(world, pos.x(), pos.y(), pos.z(), new ItemStack(Items.STRING, 1))); 
	    	 stack.hurtAndBreak(1, player, (p_220038_0_) -> {
		         p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });	
		}
    	 
		return true;
		
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
    	stack.setDamageValue(getDamage(stack) + 1);

        return stack;
    }
	    
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.resourceful_tools.hook_knife.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.resourceful_tools.hook_knife.line2").withStyle(ChatFormatting.GREEN)));
	}
}