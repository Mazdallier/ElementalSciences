package me.jezzadabomb.es.items;

import me.jezzadabomb.es.ElementalSciences;
import me.jezzadabomb.es.core.util.ESLogger;
import me.jezzadabomb.es.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemES extends Item{
    
    protected ESLogger log = new ESLogger();
    
    public ItemES(int id, String name) {
        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        maxStackSize = 1;
        setNoRepair();
        setUnlocalizedName(name);
        setCreativeTab(ElementalSciences.machineTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().replace("item.", ""));
    }
    
}
