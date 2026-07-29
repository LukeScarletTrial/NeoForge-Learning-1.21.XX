package net.luke.trainingmod.item;

import net.luke.trainingmod.TrainingMod;
import net.luke.trainingmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrainingMod.MODID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.RAWBISMUTH.get()))
            .title(Component.translatable("creativetab.lukeslearningmod.bismuth_items"))
            .displayItems(((parameters, output) -> {
                output.accept(ModItems.BISMUTH.get());
                output.accept(ModItems.RAWBISMUTH.get());
            })).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCKS_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TrainingMod.MODID, "bismuth_items_tab"))
            .icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK.get()))
            .title(Component.translatable("creativetab.lukeslearningmod.bismuth_blocks"))
            .displayItems(((parameters, output) -> {
                output.accept(ModBlocks.BISMUTH_BLOCK.get());
                output.accept(ModBlocks.BISMUTH_ORE.get());
                output.accept(ModBlocks.BISMUTH_DEEPSLATE_ORE.get());
            })).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
