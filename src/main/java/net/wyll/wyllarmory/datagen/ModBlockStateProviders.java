package net.wyll.wyllarmory.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.block.ModBlocks;

public class ModBlockStateProviders extends BlockStateProvider {
    public ModBlockStateProviders(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WyllArmory.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PRIMORDIAL_GEM_ORE);

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
