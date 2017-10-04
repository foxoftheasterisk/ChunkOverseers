package littlebeast.remoteanchors;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RemoteAnchors.MODID, name=RemoteAnchors.NAME, version=RemoteAnchors.VERSION)
public class RemoteAnchors
{
	public static final String MODID = "RemoteAnchors";
	public static final String NAME = "Remote Anchors";
    public static final String VERSION = "0.0.1";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
       //create and register Blocks and Items (and oreDict)
    }
            
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
       //add recipes and event handlers
    }
    
    //@EventHandler for postInit and @Instance go here... if needed
    //(@instance is basically only if I (somehow) need a parametered constructor...
    // Forge will automatically make an instance with default constructor)
    
    //post-init: for things related to other mods
    //but not oreDict recipes, because oreDict is pre-init
}
