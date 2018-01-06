package com.xanplayz.util;

        import com.xanplayz.tabs.TestingTab;
        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.SidedProxy;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
    public static final CreativeTabs TestingTab = new TestingTab("testingtab");

    @SidedProxy(clientSide = Main.CLIENT, serverSide = Main.COMMON)
    public static CommonProxy proxy;
    public static final String MODID = "test";
    public static final String VERSION = "1.0";
    public static final String NAME = "Test Mod";
    public static final String CLIENT = "com.xanplayz.util.ClientProxy";
    public static final String COMMON = "com.xanplayz.util.CommonProxy";

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {
        RecipeHandler.registerSmelting();
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.otherRegistries();
    }
}
