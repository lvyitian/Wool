package io.github.woolmc.wool.entity.hostile.flying;

import org.bukkit.entity.Flying;

import io.github.woolmc.wool.entity.WoolMob;
import net.minecraft.entity.mob.FlyingEntity;

public abstract class WoolFlyingEntity extends WoolMob implements Flying {

	protected WoolFlyingEntity(FlyingEntity handle) {
		super(handle);
		// TODO Auto-generated constructor stub
	}

}
