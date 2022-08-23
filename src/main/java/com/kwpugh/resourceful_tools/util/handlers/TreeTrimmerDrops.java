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

public class TreeTrimmerDrops
{
    static double featherChance = ResourcefulToolsConfig.feather_chance.get();
    static double stringChance = ResourcefulToolsConfig.string_chance.get();
    static double appleChance = ResourcefulToolsConfig.apple_chance.get();
    static double rabbitChance = ResourcefulToolsConfig.rabbit_chance.get();
    static double spiderEyeChance = ResourcefulToolsConfig.spider_eye_chance.get();
    static double pearlChance = ResourcefulToolsConfig.pearl_fragment_chance.get();
    static double crystalChance = ResourcefulToolsConfig.prismarine_crystal_chance.get();
    static double shardChance = ResourcefulToolsConfig.prismarine_shard_chance.get();
    static double membraneChance  = ResourcefulToolsConfig.membbrane_chance.get();
    static double eggChance = ResourcefulToolsConfig.egg_chance.get();

    public static void dropItems(Level level, Player player, BlockPos pos, BlockState state, ItemStack stack)
    {
        Block block = state.getBlock();

        if (!level.isClientSide)
        {
            if(block == Blocks.SPRUCE_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= featherChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FEATHER, 1)));
                }
            }
            else if(block == Blocks.BIRCH_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= stringChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
                }
            }
            else if(block == Blocks.OAK_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= appleChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.APPLE, 1)));
                }
            }
            else if(block == Blocks.ACACIA_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= rabbitChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.RABBIT_FOOT, 1)));
                }
            }
            else if(block == Blocks.JUNGLE_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= spiderEyeChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPIDER_EYE, 1)));
                }
            }
            else if(block == Blocks.DARK_OAK_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= pearlChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.PEARL_FRAGMENT.get(), 1)));
                }
            }
            else if(block == Blocks.AZALEA_LEAVES  || block == Blocks.FLOWERING_AZALEA_LEAVES)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= membraneChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PHANTOM_MEMBRANE, 1)));
                }
            }
            else if(block == Blocks.HAY_BLOCK)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= eggChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EGG, 1)));
                }
            }
            else if(block == Blocks.TALL_SEAGRASS)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= crystalChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_CRYSTALS, 1)));
                }
            }
            else if(block == Blocks.KELP_PLANT)
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });

                double r = level.random.nextDouble();
                if (r <= shardChance)
                {
                    level.addFreshEntity(new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_SHARD, 1)));
                }
            }

            if(!(block == Blocks.SPRUCE_LEAVES) ||
                    !(block == Blocks.BIRCH_LEAVES) ||
                    !(block == Blocks.OAK_LEAVES) ||
                    !(block == Blocks.ACACIA_LEAVES) ||
                    !(block == Blocks.JUNGLE_LEAVES) ||
                    !(block == Blocks.DARK_OAK_LEAVES) ||
                    !(block == Blocks.AZALEA_LEAVES) ||
                    !(block == Blocks.FLOWERING_AZALEA_LEAVES) ||
                    !(block == Blocks.HAY_BLOCK) ||
                    !(block == Blocks.TALL_SEAGRASS) ||
                    !(block == Blocks.KELP_PLANT))
            {
                stack.hurtAndBreak(1, player, (p_220038_0_) -> {
                    p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });
            }
        }
    }
}
