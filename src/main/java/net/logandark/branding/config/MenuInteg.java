package net.logandark.branding.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.text.Text;

public class MenuInteg implements ModMenuApi {
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> {
			ConfigBuilder builder = ConfigBuilder.create()
				.setParentScreen(parent)
				.setTitle(Text.of("Config"));

			ConfigEntryBuilder entryBuilder = builder.entryBuilder();

			builder.getOrCreateCategory(Text.of("TODO"))

				.addEntry(entryBuilder.startStrField(Text.of("Brand"), ConfigManager.getConfig().getBrand())
					.setDefaultValue("vanilla")
					.setSaveConsumer(newVal -> ConfigManager.getConfig().setBrand(newVal))
					.build());



			builder.setSavingRunnable(ConfigManager::save);
			return builder.build();
		};
	}
}
