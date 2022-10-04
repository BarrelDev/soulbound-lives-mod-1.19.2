package net.soulbound.sblives;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LivesMod implements ModInitializer
{
	public static final String MOD_ID = "sblives";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Soulbound Lives Mod!");
	}
}
