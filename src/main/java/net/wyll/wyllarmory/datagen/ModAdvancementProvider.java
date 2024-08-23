package net.wyll.wyllarmory.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider provider, Consumer<Advancement> consumer, ExistingFileHelper existingFileHelper) {

        Advancement rootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.PRIMORDIAL_GEM.get()),
                        Component.literal("A strange gem"), Component.literal("Unlock the power within the past"),
                        new ResourceLocation(WyllArmory.MOD_ID, "textures/block/primordial_gem_ore.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_primordial_gem", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PRIMORDIAL_GEM.get()))
                .save(consumer, new ResourceLocation(WyllArmory.MOD_ID, "primordial_gem"), existingFileHelper);


    }
}
