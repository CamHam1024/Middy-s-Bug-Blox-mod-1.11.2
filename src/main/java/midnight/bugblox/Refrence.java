package midnight.bugblox;

public class Refrence 
{
	//General Mod Refrences
	public static final String MOD_ID = "bb";
	public static final String NAME = "Midnight's Bug Blox Mod";
	public static final String VERSION = "1.0beta";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY = "midnight.bugblox.proxy.ClientProxy";
	public static final String SERVER_PROXY = "midnight.bugblox.proxy.ServerProxy";

	//Item references
	public static enum BugBloxItems
	{
		//Item references
		BUG_TABLET("bugtablet", "ItemBugTablet");
		
		//Unlocalised names
		private String unlocalizedName;
		private String registryName;
		
		BugBloxItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	
	//Block references
		public static enum BugBloxBlocks
		{
			//Block references
			SOLIDBLOX("solidblox","SolidBlox");
			
			//Unlocalised names
			private String unlocalizedName;
			private String registryName;
			
			BugBloxBlocks(String unlocalizedName, String registryName)
			{
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName;
			}
			
			public String getUnlocalizedName()
			{
				return unlocalizedName;
			}
			
			public String getRegistryName()
			{
				return registryName;
			}
		}
}
