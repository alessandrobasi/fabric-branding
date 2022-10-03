package net.logandark.branding;

import net.fabricmc.api.ModInitializer;
import net.logandark.branding.config.ConfigManager;

public class Branding implements ModInitializer {

	public final ConfigManager configManager;

	public Branding() {
		configManager = new ConfigManager();

	}
	@Override
	public void onInitialize() {

	}

}
