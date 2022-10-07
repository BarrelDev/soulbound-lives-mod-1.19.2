package net.soulbound.sblives;

import net.fabricmc.api.ClientModInitializer;
import net.soulbound.sblives.networking.ModPackets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LivesModClient implements ClientModInitializer
{
    public static final String MOD_ID = "sblives";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitializeClient()
    {
        LOGGER.info("Initialize Soulbound Lives Client");

        ModPackets.registerS2CPackets();
    }
}
