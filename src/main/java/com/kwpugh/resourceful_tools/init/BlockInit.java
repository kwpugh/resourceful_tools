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
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ResourcefulTools.modid);

	public static final RegistryObject<Block> WELLSPRING = BLOCKS.register("wellspring", () -> new Wellspring(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> LAVASPRING = BLOCKS.register("lavaspring", () -> new Lavaspring(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.METAL)));

	public static final RegistryObject<Block> DIRT_SINGLE = BLOCKS.register("dirt_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> DIRT_DOUBLE = BLOCKS.register("dirt_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> DIRT_TRIPLE = BLOCKS.register("dirt_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> GRAVEL_SINGLE = BLOCKS.register("gravel_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> GRAVEL_DOUBLE = BLOCKS.register("gravel_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> GRAVEL_TRIPLE = BLOCKS.register("gravel_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> SAND_SINGLE = BLOCKS.register("sand_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> SAND_DOUBLE = BLOCKS.register("sand_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> SAND_TRIPLE = BLOCKS.register("sand_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> COBBLESTONE_SINGLE = BLOCKS.register("cobblestone_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> COBBLESTONE_DOUBLE = BLOCKS.register("cobblestone_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> COBBLESTONE_TRIPLE = BLOCKS.register("cobblestone_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> ANDESITE_SINGLE = BLOCKS.register("andesite_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> ANDESITE_DOUBLE = BLOCKS.register("andesite_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> ANDESITE_TRIPLE = BLOCKS.register("andesite_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> DIORITE_SINGLE = BLOCKS.register("diorite_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> DIORITE_DOUBLE = BLOCKS.register("diorite_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> DIORITE_TRIPLE = BLOCKS.register("diorite_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> GRANITE_SINGLE = BLOCKS.register("granite_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> GRANITE_DOUBLE = BLOCKS.register("granite_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> GRANITE_TRIPLE = BLOCKS.register("granite_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> NETHERRACK_SINGLE = BLOCKS.register("netherrack_single", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> NETHERRACK_DOUBLE = BLOCKS.register("netherrack_double", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
	public static final RegistryObject<Block> NETHERRACK_TRIPLE = BLOCKS.register("netherrack_triple", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(1.0F, 1.0F).sound(SoundType.GROUND)));
}