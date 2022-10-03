package net.logandark.branding.mixin;

import net.logandark.branding.config.ConfigManager;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.obfuscate.DontObfuscate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ClientBrandRetriever.class)
public abstract class MixinClientBrandRetriever {
	@Overwrite(remap = false)
	@DontObfuscate
	public static String getClientModName() {
		return ConfigManager.getConfig().getBrand();
	}
}
