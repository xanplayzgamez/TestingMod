package com.xanplayz.init;

import java.util.ArrayList;
import java.util.List;

import com.xanplayz.blocks.BlockOres;
import com.xanplayz.blocks.BlockTesting;
import com.xanplayz.blocks.Fun;
import com.xanplayz.blocks.Think;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_THINK = new Think("block_think",Material.IRON);
	public static final Block BLOCK_FUN = new Fun("block_fun",Material.IRON);
	public static final Block BLOCK_TESTING = new BlockTesting("block_testing",Material.IRON);

	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
}
