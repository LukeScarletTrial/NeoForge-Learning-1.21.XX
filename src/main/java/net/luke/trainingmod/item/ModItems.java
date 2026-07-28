package net.luke.trainingmod.item;

import net.luke.trainingmod.TrainingMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TrainingMod.MODID);

    public static final DeferredItem<Item> MYITEM = ITEMS.register("myitem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAWMYITEM = ITEMS.register("raw_myitem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
