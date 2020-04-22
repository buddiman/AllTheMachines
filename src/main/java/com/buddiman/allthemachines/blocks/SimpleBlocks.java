package com.buddiman.allthemachines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SimpleBlocks extends Block {

    public SimpleBlocks() {
        super(Properties.create(Material.IRON)
        .sound(SoundType.SAND)
        .hardnessAndResistance(2.0f)
        .lightValue(14)
        );
        setRegistryName("firstblock");
    }
}
