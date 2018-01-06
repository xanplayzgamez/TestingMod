package com.xanplayz.util;

import com.xanplayz.init.BlockInit;
import com.xanplayz.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler
{
    public static void registerSmelting()
    {
        GameRegistry.addSmelting(BlockInit.ORE_END, new ItemStack(ItemInit.INGOT_TEST), 10);
        GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD, new ItemStack(ItemInit.INGOT_TEST), 10);
        GameRegistry.addSmelting(BlockInit.ORE_NETHER, new ItemStack(ItemInit.INGOT_TEST), 10);
    }
}
