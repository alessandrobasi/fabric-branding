package net.logandark.branding.mixin;

import net.logandark.branding.config.ConfigManager;
import net.minecraft.obfuscate.DontObfuscate;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MinecraftServer.class)
public abstract class MixinMinecraftServer {
	@Overwrite(remap = false)
	@DontObfuscate
	public String getServerModName() {
		return ConfigManager.getConfig().getBrand();
	}
}
