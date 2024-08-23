package net.wyll.wyllarmory.datagen.loot;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.wyll.wyllarmory.block.ModBlocks;
import net.wyll.wyllarmory.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider{

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.add(ModBlocks.PRIMORDIAL_GEM_ORE.get(),
                block -> createOreDrop(ModBlocks.PRIMORDIAL_GEM_ORE.get(), ModItems.PRIMORDIAL_GEM.get()));
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
        }
    }
