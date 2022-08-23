package com.kwpugh.resourceful_tools.util.handlers;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = ResourcefulTools.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class DropHandler
{
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event)
    {
        Level level = (Level) event.getLevel();
        Player player = event.getPlayer();
        BlockState state = event.getState();
        BlockPos pos = event.getPos();
        ItemStack stack = player.getMainHandItem();

        if(stack.getItem() == ItemInit.CLAM_DIGGER.get() || stack.getItem() == ItemInit.CLAM_DIGGER_COPPER.get())
        {
            ClamDiggerDrops.dropItems(level, player, pos, state, stack);
        }

        if(stack.getItem() == ItemInit.HAND_PICK.get() || stack.getItem() == ItemInit.HAND_PICK_COPPER.get())
        {
            HandPickDrops.dropItems(level, player, pos, state, stack);
        }

        if(stack.getItem() == ItemInit.HAND_TILLER.get() || stack.getItem() == ItemInit.HAND_TILLER_COPPER.get())
        {
            HandTillerDrops.dropItems(level, player, pos, state, stack);
        }

        if(stack.getItem() == ItemInit.TREE_TRIMMER.get() || stack.getItem() == ItemInit.TREE_TRIMMER_COPPER.get())
        {
            TreeTrimmerDrops.dropItems(level, player, pos, state, stack);
        }
    }
}
