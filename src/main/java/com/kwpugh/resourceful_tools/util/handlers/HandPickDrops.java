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

public class HandPickDrops
{
    static double saltPeterChance = ResourcefulToolsConfig.saltpeter_chance.get();
    static double sulfurChance = ResourcefulToolsConfig.sulfur_chance.get();
    static double smallBlazeChance = ResourcefulToolsConfig.small_blaze_chance.get();
    static double ghastTearChance = ResourcefulToolsConfig.ghast_tear_fragment_chance.get();
    static double netherStarChance = ResourcefulToolsConfig.nether_star_fragment_chance.get();
    static double netheriteChance = ResourcefulToolsConfig.netherite_fragment_chance.get();

    public static void dropItems(Level level, Player player, BlockPos pos, BlockState state, ItemStack stack)
    {
        Block block = state.getBlock();

        if (!level.isClientSide)
        {
            if(block == Blocks.SANDSTONE)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= saltPeterChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SALTPETER.get(), 1)));
                }
            }
            else if(block == Blocks.NETHERRACK)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= sulfurChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.POWDER_SULFUR.get(), 1)));
                }
            }
            else if(block == Blocks.MAGMA_BLOCK)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= smallBlazeChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SMALL_BLAZE_POWDER.get(), 1)));
                }
            }
            else if(block == Blocks.NETHER_QUARTZ_ORE)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= ghastTearChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.GHAST_TEAR_FRAGMENT.get(), 1)));
                }
            }
            else if(block == Blocks.BLACKSTONE)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= netheriteChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHERITE_FRAGMENT.get(), 1)));
                }
            }
            else if(block == Blocks.END_STONE)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= netherStarChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.NETHER_STAR_FRAGMENT.get(), 1)));
                }
            }

            if(!(block == Blocks.SANDSTONE) ||
                    !(block == Blocks.NETHERRACK) ||
                    !(block == Blocks.MAGMA_BLOCK) ||
                    !(block == Blocks.NETHER_QUARTZ_ORE) ||
                    !(block == Blocks.BLACKSTONE) ||
                    !(block == Blocks.END_STONE))
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });
            }
        }
    }
}
