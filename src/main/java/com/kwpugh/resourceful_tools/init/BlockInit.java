package com.kwpugh.resourceful_tools.init;

import com.kwpugh.resourceful_tools.ResourcefulTools;
import com.kwpugh.resourceful_tools.blocks.Lavaspring;
import com.kwpugh.resourceful_tools.blocks.Wellspring;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ResourcefulTools.modid);

	public static final RegistryObject<Block> WELLSPRING = BLOCKS.register("wellspring", () -> new Wellspring(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> LAVASPRING = BLOCKS.register("lavaspring", () -> new Lavaspring(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
}