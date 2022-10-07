package net.soulbound.sblives.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class LivesS2CPacket
{
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender sender){
        //Happens only on the client
        NbtCompound nbt = new NbtCompound();
        nbt.putInt("playerGameType", 3);
        player.setGameMode(nbt);
    }
}
