package com.kwpugh.resourceful_tools;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("resourceful_tools")
public class ResourcefulTools
{

	public static final String modid = "resourceful_tools";
	public static final Logger logger = LogManager.getLogger(modid);	
	public static final ItemGroup resourceful_tools = new GroupResourcefullTools();

    public ResourcefulTools()
    {
    	Config.loadConfig(Config.config, FMLPaths.CONFIGDIR.get().resolve("resourceful_tools.toml").toString());
    	
    	BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        logger.info("ResourcefulTools setup");
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    	logger.info("ResourcefulTools game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

        InterModComms.sendTo("resourceful_tools", "helloworld", () -> { logger.info("Hello world from ResourcefulTools"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {

    	logger.info("ResourcefulTools IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {

    	logger.info("ResourcefulTools starting");
    }

//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
//    public static class RegistryEvents
//    {
//        @SubscribeEvent
//        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
//        {
//
//        	logger.info("ResourcefulTools blocks registered");
//        }
//    }
}
