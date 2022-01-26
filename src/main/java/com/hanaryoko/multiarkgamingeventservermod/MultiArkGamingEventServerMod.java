package com.hanaryoko.multiarkgamingeventservermod;

import com.hanaryoko.multiarkgamingeventservermod.reference.Reference;
import com.hanaryoko.multiarkgamingeventservermod.utils.LogHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class MultiArkGamingEventServerMod {
    public MultiArkGamingEventServerMod(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event){
        LogHelper.info("Hello from PreInit!");
    }

    private void doClientStuff(final FMLClientSetupEvent event){
        LogHelper.info("Got game settings {" + event.getMinecraftSupplier().get().options + "}");
    }

    private void enqueueIMC(final InterModEnqueueEvent event){

    }

    private void processIMC(final InterModProcessEvent event){

    }

    @SubscribeEvent
    public void  onServerStart(FMLServerStartingEvent event){

    }
}
