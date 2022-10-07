package net.soulbound.sblives.util;

import net.minecraft.nbt.NbtCompound;

public class LivesData
{
    public static int addLives(IEntityDataSaver player, int amount)
    {
        NbtCompound nbt = player.getPersistentData();
        int lives = nbt.getInt("lives");

        if(lives + amount >= 5)
        {
            lives = 5;
        }else
        {
            lives += amount;
        }
        nbt.putInt("lives", lives);

        //sync the data
        return lives;
    }
    public static int removeLives(IEntityDataSaver player, int amount)
    {
        NbtCompound nbt = player.getPersistentData();
        int lives = nbt.getInt("lives");

        if(lives - amount <= 0)
        {
            lives = 0;
        }else
        {
            lives -= amount;
        }
        nbt.putInt("lives", lives);

        //sync the data
        return lives;
    }

    public static int getLives(IEntityDataSaver player)
    {
        NbtCompound nbt = player.getPersistentData();

        return nbt.getInt("lives");
    }
}
