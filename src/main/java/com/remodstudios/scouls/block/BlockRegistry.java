package com.remodstudios.scouls.block;

import com.remodstudios.scouls.ScorchedSouls;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    // Bwocks go here



    // Methods to register and stuff
    public static void init(){
        // Just loads the class
    }
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(ScorchedSouls.MOD_ID, name), block);
    }
}