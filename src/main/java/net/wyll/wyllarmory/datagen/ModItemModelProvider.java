package net.wyll.wyllarmory.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WyllArmory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //simple items
        simpleItem(ModItems.PRIMORDIAL_GEM);

        //handheld items
        handheldItem(ModItems.PRIMORDIAL_SHOVEL);
        handheldItem(ModItems.PRIMORDIAL_SWORD);
        handheldItem(ModItems.PRIMORDIAL_AXE);
        handheldItem(ModItems.PRIMORDIAL_PICKAXE);
        handheldItem(ModItems.PRIMORDIAL_HOE);
        handheldItem(ModItems.PRIMORDIAL_HAMMER);

        //armor items
        simpleItem(ModItems.PRIMORDIAL_HELMET);
        simpleItem(ModItems.PRIMORDIAL_CHESTPLATE);
        simpleItem(ModItems.PRIMORDIAL_LEGGINGS);
        simpleItem(ModItems.PRIMORDIAL_BOOTS);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WyllArmory.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(WyllArmory.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WyllArmory.MOD_ID,"item/" + item.getId().getPath()));
    }
}
