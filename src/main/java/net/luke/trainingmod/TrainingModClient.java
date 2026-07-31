package net.luke.trainingmod;

import net.luke.trainingmod.util.ModItemProperties;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = TrainingMod.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = TrainingMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TrainingModClient {
    public TrainingModClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ModItemProperties.addCustomItemProperties();
        });
    }
}