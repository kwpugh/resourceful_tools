package com.kwpugh.resourceful_tools.util;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.config.ResourcefulToolsConfig;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = ResourcefulTools.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class ForgeEventSubscriber
{
    static double chance = ResourcefulToolsConfig.anvil_damage_chance.get();

    @SubscribeEvent
    public static void onAnvilUse(AnvilRepairEvent event)
    {
        event.setBreakChance((float) chance);
    }
}