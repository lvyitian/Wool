package io.github.woolmc.wool.server.entity.hostile.spider;

import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.EntityType;

import io.github.woolmc.wool.server.entity.WoolMob;
import net.minecraft.entity.mob.CaveSpiderEntity;

public class WoolCaveSpider extends WoolMob implements CaveSpider {

	protected WoolCaveSpider(CaveSpiderEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityType getType() {
		return EntityType.CAVE_SPIDER;
	}

}
