package com.kwpugh.resourceful_tools.config;


import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.kwpugh.resourceful_tools.ResourcefulTools;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
	private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec config;
	
	static
	{
		com.electronwill.nightconfig.core.Config.setInsertionOrderPreserved(true);

		ResourcefulToolsConfig.init(builder);
		
		config = builder.build();
	}
	
	public static void loadConfig(ForgeConfigSpec config, String path)
	{
		ResourcefulTools.logger.info("Loading ResourcefulTools config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		ResourcefulTools.logger.info("Built ResourcefulTools config:" + path);
		
		file.load();
		
		ResourcefulTools.logger.info("Loaded ResourcefulTools config: " + path);
		config.setConfig(file);
		
	}
}