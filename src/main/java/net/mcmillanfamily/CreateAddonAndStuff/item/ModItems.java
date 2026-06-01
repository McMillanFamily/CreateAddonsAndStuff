package net.mcmillanfamily.CreateAddonAndStuff.item;

import net.mcmillanfamily.CreateAddonAndStuff.CreateAddonAndStuff;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;

public class ModItems {
    //this is where all normal items for the mod will be stored
     public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAddonAndStuff.MOD_ID);

     public static final DeferredItem<Item> TITANIUMINGOT = ITEMS.register("titanium_ingot",
             () -> new Item(new Item.Properties()));

     public static  final DeferredItem<Item> ANOTITANIUMINGOT = ITEMS.register("anodized_titanium_ingot",
             () -> new Item(new Item.Properties()));



     public static void register(IEventBus eventBus){
         ITEMS.register(eventBus);
     }
}
