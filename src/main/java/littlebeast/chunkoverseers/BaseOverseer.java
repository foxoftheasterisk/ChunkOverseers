package littlebeast.chunkoverseers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

//I'm not sure if to use separate tile entities with one Block class,
//or to make separate (child) Block classes
//shrug
public class BaseOverseer extends Block
{

   public BaseOverseer(String name, Material materialIn)
   {
      super(materialIn);
      setUnlocalizedName(name);
      setHardness(10);
      setCreativeTab(CreativeTabs.BUILDING_BLOCKS); //I guess?  I think there's some creative tab rearranging in modding...
      
   }

}
