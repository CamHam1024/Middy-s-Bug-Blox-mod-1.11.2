package init;

import items.ItemBugTablet;
import midnight.bugblox.blocks.SolidBlox;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static Block solidblox;
	
	public static void init()
	{
		//New Block
		solidblox = new SolidBlox();
	}
	
	public static void register()
	{
		//Register Block
		GameRegistry.register(solidblox);
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(solidblox);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		//Register Block Renders
		registerRenders(solidblox);
	}
	
	private static void registerRenders(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
