package com.xanplayz.init;

import java.util.List;
import java.util.ArrayList;

import com.xanplayz.armor.ArmorBase;
import com.xanplayz.items.TestingIngot;
import com.xanplayz.tools.*;
import com.xanplayz.util.Main;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item INGOT_TEST = new TestingIngot("ingot_testing");

    public static final Item.ToolMaterial TOOL_TESTING = EnumHelper.addToolMaterial("tool_testing", 2, 180, 5.0F, 1.5F, 5);
    public static final ItemArmor.ArmorMaterial ARMOUR_TESTING = EnumHelper.addArmorMaterial("armour_testing", Main.MODID + ":testing", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item SWORD_TEST = new ToolSword("sword_testing", TOOL_TESTING);
	public static final Item AXE_TEST = new ToolAxe("axe_testing", TOOL_TESTING);
	public static final Item SHOVEL_TEST = new ToolShovel("shovel_testing", TOOL_TESTING);
	public static final Item HOE_TEST = new ToolHoe("hoe_testing", TOOL_TESTING);
	public static final Item PICKAXE_TEST = new ToolPickaxe("pickaxe_testing", TOOL_TESTING);

    public static final Item HELMET_TEST = new ArmorBase("helmet_testing", ARMOUR_TESTING, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_TEST = new ArmorBase("chestplate_testing", ARMOUR_TESTING, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_TEST = new ArmorBase("leggings_testing", ARMOUR_TESTING, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_TEST = new ArmorBase("boots_testing", ARMOUR_TESTING, 1, EntityEquipmentSlot.FEET);
}
