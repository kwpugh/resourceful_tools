package com.kwpugh.resourceful_tools.util.handlers;

import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class HandTillerDrops
{
    static double boneFragmentChance = ResourcefulToolsConfig.bone_fragment_chance.get();
    static double inkSacChance = ResourcefulToolsConfig.ink_sac_chance.get();

    public static void dropItems(Level level, Player player, BlockPos pos, BlockState state, ItemStack stack)
    {
        Block block = state.getBlock();

        if (!level.isClientSide)
        {
            if(block == Blocks.GRAVEL)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= boneFragmentChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.BONE_FRAGMENT.get(), 1)));
                }
            }
            else if(block == Blocks.CLAY)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= inkSacChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.INK_SAC, 1)));
                }
            }

            if(!(block == Blocks.CLAY) || !(block == Blocks.GRAVEL))
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });
            }
        }
    }
}
