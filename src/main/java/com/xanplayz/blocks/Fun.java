package com.xanplayz.blocks;

import com.xanplayz.init.BlockInit;
import com.xanplayz.init.ItemInit;
import com.xanplayz.util.IHasModel;
import com.xanplayz.util.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Fun extends Block implements IHasModel
{
	public Fun(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TestingTab);
        setHardness(3f);
        setHarvestLevel("pickaxe", 1);




        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }


    

}
