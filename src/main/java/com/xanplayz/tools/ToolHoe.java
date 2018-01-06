package com.xanplayz.tools;

import com.xanplayz.init.ItemInit;
import com.xanplayz.util.IHasModel;
import com.xanplayz.util.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{

    public ToolHoe(String name, ToolMaterial material)
    {
        super(material);
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
