package com.github.ustc_zzzz.fmltutor.common;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryLoader
{
    public OreDictionaryLoader()
    {
        List<ItemStack> dustRedstones = OreDictionary.getOres("dustRedstone");
        List<ItemStack> dustGlowstones = OreDictionary.getOres("dustGlowstone");
        for (ItemStack itemStack : dustGlowstones)
        {
            OreDictionary.registerOre("dustRedstone", itemStack);
        }
        for (ItemStack itemStack : dustRedstones)
        {
            OreDictionary.registerOre("dustGlowstone", itemStack);
        }
    }
}
