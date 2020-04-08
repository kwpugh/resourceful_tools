package com.kwpugh.resourceful_tools.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.item.EyeOfEnderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

/*
 * Taken from EnderEyeItem in vanilla sources and re-purposed for other structures
 * 
 */

public class VillageFinder extends Item {
   public VillageFinder(Item.Properties builder)
   {
      super(builder);
   }


   /**
    * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
    * {@link #onItemUse}.
    */
   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
   {
	   
//	   if(playerIn.isShiftKeyDown())
//	   {
//		   String structureType;
//		   int code = 0;
//		   
//		   switch(code)
//		   {
//			   case 0:
//				   structureType = "Pillager_Outpost";
//			   		break;
//			   case 1:
//				   structureType = "Shipwreck";
//			   		break;
//			   default:
//			   		structureType = "Village";		 
//			   		break;
//		   }
//	   }


	   		
	   		
      ItemStack itemstack = playerIn.getHeldItem(handIn);
      
         playerIn.setActiveHand(handIn);
         if (worldIn instanceof ServerWorld)
         {
        	BlockPos playerpos = playerIn.getPosition();
        	 
        	BlockPos locpos = ((ServerWorld)worldIn).getChunkProvider().getChunkGenerator().findNearestStructure(worldIn, "Pillager_Outpost", new BlockPos(playerIn), 100, false);
            if (locpos != null)
            {            	
            	int i = MathHelper.floor(getDistance(playerpos.getX(), playerpos.getZ(), locpos.getX(), locpos.getZ()));
	
            	playerIn.sendMessage(new TranslationTextComponent("Nearest outpost: " + locpos.getX() + " ~ " + locpos.getZ() + " " + i + " blocks away").applyTextStyle(TextFormatting.LIGHT_PURPLE));
	
            	EyeOfEnderEntity finderentity = new EyeOfEnderEntity(worldIn, playerIn.getPosX(), playerIn.getPosYHeight(0.5D), playerIn.getPosZ());
            	finderentity.func_213863_b(itemstack);
            	finderentity.moveTowards(locpos);
            	worldIn.addEntity(finderentity);
            	
            	if (playerIn instanceof ServerPlayerEntity)
            	{
            		CriteriaTriggers.USED_ENDER_EYE.trigger((ServerPlayerEntity)playerIn, locpos);
            	}

            	worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.BLOCK_NOTE_BLOCK_COW_BELL, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
            	worldIn.playEvent((PlayerEntity)null, 1003, new BlockPos(playerIn), 0);
            	
            	if (!playerIn.abilities.isCreativeMode)
            	{
            		itemstack.shrink(1);
            	}

            	playerIn.addStat(Stats.ITEM_USED.get(this));
            	playerIn.func_226292_a_(handIn, true);
            	
            	return ActionResult.resultSuccess(itemstack);
            }
         }

         return ActionResult.resultConsume(itemstack);
   }
   
   private static float getDistance(int x1, int z1, int x2, int z2)
   {
	  int i = x2 - x1;
	  int j = z2 - z1;
	  return MathHelper.sqrt((float)(i * i + j * j));
   }
   
}