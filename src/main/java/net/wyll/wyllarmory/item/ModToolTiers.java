package net.wyll.wyllarmory.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.datagen.ModBlockStateProviders;
import net.wyll.wyllarmory.datagen.ModItemTagGenerator;
import net.wyll.wyllarmory.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier PRIMORDIAL = TierSortingRegistry.registerTier(
            new ForgeTier(4,3000,12.0f, 6.0f, 25,
                    ModTags.Blocks.NEED_PRIMORDIAL_TIER,() -> Ingredient.of(ModItems.PRIMORDIAL_GEM.get())),
            new ResourceLocation(WyllArmory.MOD_ID, "primordial"), List.of(Tiers.NETHERITE), List.of());

}
