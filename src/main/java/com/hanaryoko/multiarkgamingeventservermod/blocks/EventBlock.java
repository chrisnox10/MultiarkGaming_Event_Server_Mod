package com.hanaryoko.multiarkgamingeventservermod.blocks;

import com.hanaryoko.multiarkgamingeventservermod.creativetabs.InitCreativeTabs;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class EventBlock extends Block {
    Item item;
    public EventBlock(String registryName) {
        super(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY));
        setRegistryName(registryName);
        item = new BlockItem(this, new Item.Properties().tab(InitCreativeTabs.eventServerItemGroup)).setRegistryName(registryName);
    }

    public Item getItem() {
        return item;
    }
}
