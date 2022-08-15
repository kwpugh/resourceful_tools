package com.kwpugh.resourceful_tools.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TrashCan extends Item
{
    public TrashCan(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
        if(!world.isClientSide)
        {
            player.openMenu(new SimpleMenuProvider((id, inv, items) -> {
                return ChestMenu.fourRows(id, inv);
            }, Component.translatable("item.resourceful_tools.trash_can.line3")));
        }

        return super.use(world, player, hand);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add((Component.translatable("item.resourceful_tools.trash_can.line1").withStyle(ChatFormatting.GREEN)));
        tooltip.add((Component.translatable("item.resourceful_tools.trash_can.line2").withStyle(ChatFormatting.RED)));
    }
}