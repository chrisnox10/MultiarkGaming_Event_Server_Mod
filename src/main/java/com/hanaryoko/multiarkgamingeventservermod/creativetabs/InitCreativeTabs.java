package com.hanaryoko.multiarkgamingeventservermod.creativetabs;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class InitCreativeTabs extends ItemGroup {

    public static InitCreativeTabs eventServerItemGroup = new InitCreativeTabs("eventservertab");

    public InitCreativeTabs(String label) {
        super(label);
    }

    public InitCreativeTabs(int pId, String pLangId) {
        super(pId, pLangId);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.COBBLESTONE);
    }
}
