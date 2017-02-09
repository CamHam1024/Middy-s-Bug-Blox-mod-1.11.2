package init;

import items.ItemBugTablet;
import midnight.bugblox.Refrence;
import midnight.bugblox.blocks.SolidBlox;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item bugtablet;
	public static Item solidblox;
	
	public static void init()
	{
		//New Items
		bugtablet = new ItemBugTablet();
		
	}
	
	public static void register()
	{
		//Register Items
		GameRegistry.register(bugtablet);
	}
	
	public static void registerRenders()
	{
		//Register Item Renders
		registerRenders(bugtablet);
	}
	
	private static void registerRenders(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
