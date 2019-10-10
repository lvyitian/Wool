package io.github.woolmc.wool;

import org.bukkit.Server;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.MinecraftServer;

public final class Wool {
	
	private static Wool instance = new Wool();
	private Server server;
	
	private Wool() {}
	
	public static Wool getInstance() {
		return instance;
	}

	public WoolServerImpl getBukkitServer() {
		return (WoolServerImpl) server;
	}

	public MinecraftServer getNMSServer() {
		return ((WoolServerImpl) server).getHandle();
	}

	public void setServer(Server bukkitServerInst) {
		this.server = bukkitServerInst;
	}

	/**
	 * checks whether or not the mod is loaded on a client
	 * @return
	 */
	public boolean isClient() {
		return FabricLoader.getInstance().getEnvironmentType()==EnvType.CLIENT;
	}
}
