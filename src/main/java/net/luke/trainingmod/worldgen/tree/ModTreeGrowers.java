package net.luke.trainingmod.worldgen.tree;

import net.luke.trainingmod.TrainingMod;
import net.luke.trainingmod.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLOODWOOD = new TreeGrower(TrainingMod.MODID + ":bloodwood", Optional.empty(), Optional.of(ModConfiguredFeatures.BLOODWOOD_KEY), Optional.empty());
}
