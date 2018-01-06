package com.xanplayz.tabs;

import com.xanplayz.init.BlockInit;
import com.xanplayz.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TestingTab extends CreativeTabs
{
    public TestingTab(String label)
    {
        super("testingtab");

    }
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.SWORD_TEST);
    }
}
