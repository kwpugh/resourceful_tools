package com.kwpugh.resourceful_tools.util.handlers;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class ClamDiggerDrops
{
    static double clamChance = ResourcefulToolsConfig.clam_chance.get();

    public static void dropItems(Level level, Player player, BlockPos pos, BlockState state, ItemStack stack)
    {
        Block block = state.getBlock();

        if (!level.isClientSide)
        {
            if(block == Blocks.SAND)
            //if(block == Blocks.SAND && level.getBiome(pos).is(BiomeTags.IS_BEACH))
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= clamChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.CLAM.get(), 1)));
                }
            }

            if(!(block == Blocks.SAND))
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });
            }
        }
    }
}
