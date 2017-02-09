package midnight.bugblox;

import init.ModBlocks;
import init.ModItems;
import midnight.bugblox.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION, acceptedMinecraftVersions = Refrence.ACCEPTED_VERSIONS)
public class BugBlox 
{
	@Instance
	public static BugBlox instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY, serverSide = Refrence.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//For initialising Blocks and Items
		//Items
		ModItems.init();
		ModItems.register();
		
		//Blocks
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		//Proxy Init
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}

