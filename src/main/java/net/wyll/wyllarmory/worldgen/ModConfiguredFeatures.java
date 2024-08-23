package net.wyll.wyllarmory.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.block.ModBlocks;

import java.util.List;


public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?,?>> PRIMORDIAL_GEM_ORE_KEY = registerKey ("primordial_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context){
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> primordialGemOres = List.of(OreConfiguration.target(endReplaceables, ModBlocks.PRIMORDIAL_GEM_ORE.get().defaultBlockState()));

        register(context, PRIMORDIAL_GEM_ORE_KEY, Feature.ORE, new OreConfiguration(primordialGemOres, 3));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(WyllArmory.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
