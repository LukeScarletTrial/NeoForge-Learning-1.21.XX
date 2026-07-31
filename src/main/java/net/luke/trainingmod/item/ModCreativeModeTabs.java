package net.luke.trainingmod.item;

import net.luke.trainingmod.TrainingMod;
import net.luke.trainingmod.block.ModBlocks;
import net.luke.trainingmod.item.custom.ChiselItem;
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
            .icon(() -> new ItemStack(ModItems.BISMUTH.get()))
            .title(Component.translatable("creativetab.lukeslearningmod.bismuth_items"))
            .displayItems(((parameters, output) -> {
                // Regular stuff..

                output.accept(ModItems.BISMUTH.get());
                output.accept(ModItems.RAWBISMUTH.get());

                // TOOLS

                output.accept(ModItems.BISMUTH_SWORD.get());
                output.accept(ModItems.BISMUTH_PICKAXE.get());
                output.accept(ModItems.BISMUTH_HAMMER.get());
                output.accept(ModItems.BISMUTH_AXE.get());
                output.accept(ModItems.BISMUTH_SHOVEL.get());
                output.accept(ModItems.BISMUTH_HOE.get());
                output.accept(ModItems.KAUPEN_BOW.get());

                // ARMOR
                output.accept(ModItems.BISMUTH_HELMET.get());
                output.accept(ModItems.BISMUTH_LEGGINGS.get());
                output.accept(ModItems.BISMUTH_CHESTPLATE.get());
                output.accept(ModItems.BISMUTH_BOOTS.get());

                // HORSE ARMOR
                output.accept(ModItems.BISMUTH_HORSE_ARMOR.get());

            })).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCKS_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TrainingMod.MODID, "bismuth_items_tab"))
            .icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK.get()))
            .title(Component.translatable("creativetab.lukeslearningmod.bismuth_blocks"))
            .displayItems(((parameters, output) -> {
                output.accept(ModBlocks.BISMUTH_BLOCK.get());


                output.accept(ModBlocks.BISMUTH_ORE.get());
                output.accept(ModBlocks.BISMUTH_DEEPSLATE_ORE.get());

                output.accept(ModBlocks.BISMUTH_BUTTON.get());
                output.accept(ModBlocks.BISMUTH_TRAPDOOR.get());

                output.accept(ModBlocks.BISMUTH_PRESSURE_PLATE.get());
                output.accept(ModBlocks.BISMUTH_DOOR.get());
                output.accept(ModBlocks.BISMUTH_FENCE.get());

                output.accept(ModBlocks.BISMUTH_FENCE_GATE.get());
                output.accept(ModBlocks.BISMUTH_SLAB.get());

                output.accept(ModBlocks.BISMUTH_STAIRS.get());
                output.accept(ModBlocks.BISMUTH_WALL.get());

            })).build());

    public static final Supplier<CreativeModeTab> BISMUTH_RANDOM_TAB = CREATIVE_MODE_TAB.register("bismuth_random_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TrainingMod.MODID, "bismuth_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.MAGIC_BLOCK.get()))
            .title(Component.translatable("creativetab.lukeslearningmod.bismuth_random"))
            .displayItems(((parameters, output) -> {
                output.accept(ModBlocks.BISMUTH_LAMP.get());

                // SMITHING TEMPLATES
                output.accept(ModItems.KAUPEN_SMITHING_TEMPLATE.get());

                // MAGICAL/MAGIC BLOCK

                output.accept(ModBlocks.MAGIC_BLOCK.get());

                // Fuel Things

                output.accept(ModItems.STARLIGHT_ASHES.get());
                output.accept(ModItems.FROSTFIRE_ICE.get());

                output.accept(ModItems.CHISEL.get());

                output.accept(ModItems.RADISH.get());

                // SONGS

                output.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
            })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
