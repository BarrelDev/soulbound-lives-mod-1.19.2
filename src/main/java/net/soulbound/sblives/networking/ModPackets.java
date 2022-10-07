package net.soulbound.sblives.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;
import net.soulbound.sblives.LivesMod;
import net.soulbound.sblives.networking.packet.LivesC2SPacket;
import net.soulbound.sblives.networking.packet.LivesS2CPacket;

public class ModPackets
{
    public static Identifier LIVES_ID = new Identifier(LivesMod.MOD_ID, "lives");
    public static Identifier LIVES_SYNC_ID = new Identifier(LivesMod.MOD_ID, "lives");

    public static void registerC2SPackets()
    {
        ServerPlayNetworking.registerGlobalReceiver(LIVES_ID, LivesC2SPacket::receive);
    }

    public static void registerS2CPackets()
    {
        ServerPlayNetworking.registerGlobalReceiver(LIVES_ID, LivesS2CPacket::receive);
    }
}
