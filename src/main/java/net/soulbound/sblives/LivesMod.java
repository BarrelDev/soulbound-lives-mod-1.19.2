package net.soulbound.sblives;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.minecraft.server.network.ServerPlayerEntity;
import net.soulbound.sblives.networking.ModPackets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LivesMod implements ModInitializer
{
	public static final String MOD_ID = "sblives";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Initializing Soulbound Lives Mod!");

		ModPackets.registerC2SPackets();
	}
}
