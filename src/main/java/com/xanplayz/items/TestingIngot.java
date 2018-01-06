package com.xanplayz.items;

import com.xanplayz.init.ItemInit;
import com.xanplayz.util.IHasModel;
import com.xanplayz.util.Main;
import net.minecraft.item.Item;

public class TestingIngot extends Item implements IHasModel
{
    public TestingIngot(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TestingTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer((this), 0, "inventory");
    }



}
