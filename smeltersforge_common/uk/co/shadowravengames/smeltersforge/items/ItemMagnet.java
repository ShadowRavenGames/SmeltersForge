package uk.co.shadowravengames.smeltersforge.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import uk.co.shadowravengames.smeltersforge.SmeltersForge;
import uk.co.shadowravengames.smeltersforge.helpers.magnetHelper;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMagnet extends Item {
    public ItemMagnet(int par1) {
        super(par1);
        setMaxStackSize(1);
        setMaxDamage(16);
        setCreativeTab(SmeltersForge.smeltersForgeTab);
    }
  
    @SideOnly(Side.CLIENT)
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int l, float f1, float f2, float f3) {
    		return magnetHelper.magnetAction(world, entityPlayer, itemStack, x, y, z);
    }
	
    public boolean isDamageable() {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "magnet");
    }
    
}
