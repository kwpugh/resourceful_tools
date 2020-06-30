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

public class HandTiller extends ShovelItem
{
	public HandTiller(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		double boneFragmentChance = ResourcefulToolsConfig.bone_fragment_chance.get();
		double inkSacChance = ResourcefulToolsConfig.ink_sac_chance.get();
		
		Block block = state.getBlock();
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.GRAVEL)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= boneFragmentChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.BONE_FRAGMENT.get(), 1)));
		        }	
			}
			else if(block == Blocks.CLAY)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= inkSacChance)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.INK_SAC, 1)));
		        }
			}
			
			if(!(block == Blocks.CLAY) || !(block == Blocks.GRAVEL))
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
		tooltip.add((new TranslationTextComponent("item.resourceful_tools.hand_tiller.line1").func_240699_a_(TextFormatting.GREEN)));
	}
}

