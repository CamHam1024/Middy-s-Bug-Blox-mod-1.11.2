package items;

import midnight.bugblox.Refrence;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public class ItemBugTablet extends Item 
{
	//Sets Unlocalised names and Registry names
	public ItemBugTablet()
	{
		setUnlocalizedName(Refrence.BugBloxItems.BUG_TABLET.getUnlocalizedName());
		setRegistryName(Refrence.BugBloxItems.BUG_TABLET.getRegistryName());
	}
	
	//Name Text Formatting
	@Override
	public String getItemStackDisplayName(ItemStack stack) 
	{
	    return TextFormatting.DARK_RED+""+TextFormatting.BOLD + super.getItemStackDisplayName(stack);
	    
	}
}

