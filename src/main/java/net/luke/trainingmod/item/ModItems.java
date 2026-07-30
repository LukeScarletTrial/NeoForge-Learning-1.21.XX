package net.luke.trainingmod.item;

import net.luke.trainingmod.TrainingMod;
import net.luke.trainingmod.item.custom.ChiselItem;
import net.luke.trainingmod.item.custom.FuelItem;
import net.luke.trainingmod.item.custom.HammerItem;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TrainingMod.MODID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAWBISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.lukeslearningmod.radish.tooltip"));

                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice",
            () -> new FuelItem(new Item.Properties(), 800));

    public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes",
            () -> new Item(new Item.Properties()));



    public static final DeferredItem<SwordItem> BISMUTH_SWORD = ITEMS.register("bismuth_sword",
            () -> new SwordItem(ModToolTier.BISMUTH, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTier.BISMUTH, 7, 0f))));

    public static final DeferredItem<PickaxeItem> BISMUTH_PICKAXE = ITEMS.register("bismuth_pickaxe",
            () -> new PickaxeItem(ModToolTier.BISMUTH, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.BISMUTH, 1.0f, -1f))));

    public static final DeferredItem<ShovelItem> BISMUTH_SHOVEL = ITEMS.register("bismuth_shovel",
            () -> new ShovelItem(ModToolTier.BISMUTH, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTier.BISMUTH, 5, 3f))));

    public static final DeferredItem<AxeItem> BISMUTH_AXE= ITEMS.register("bismuth_axe",
            () -> new AxeItem(ModToolTier.BISMUTH, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTier.BISMUTH, 9.0f, 1f))));

    public static final DeferredItem<HoeItem> BISMUTH_HOE = ITEMS.register("bismuth_hoe",
            () -> new HoeItem(ModToolTier.BISMUTH, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTier.BISMUTH, 0, -1.0f))));

    public static final DeferredItem<HammerItem> BISMUTH_HAMMER = ITEMS.register("bismuth_hammer",
            () -> new HammerItem(ModToolTier.BISMUTH, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTier.BISMUTH, 7f, -3.5f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
