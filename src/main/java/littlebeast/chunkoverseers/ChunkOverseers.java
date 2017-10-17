package littlebeast.chunkoverseers;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = ChunkOverseers.MODID, name=ChunkOverseers.NAME, version=ChunkOverseers.VERSION)
public class ChunkOverseers
{
	public static final String MODID = "ChunkOverseers";
	public static final String NAME = "Chunk Overseers";
	public static final String DOMAIN = "chunkoverseers";
    public static final String VERSION = "0.0.1";
    
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> e)
    {
       IForgeRegistry<Block> registry = e.getRegistry();
       //registry.register(value);
    }
    
    //@EventHandlers for pre-/post-/Init, and @Instance go here... if needed
    //(@instance is basically only if I (somehow) need a parametered constructor...
    // Forge will automatically make an instance with default constructor)
    //pre-, post-, and init are now no longer the recommended method for registering things
    //therefore, I likely will not have use of them
    //like honestly I don't really know what they'd be for
}
