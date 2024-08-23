package net.wyll.wyllarmory.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.data.ForgeItemTagsProvider;
import net.wyll.wyllarmory.item.ModItemProperties;
import net.wyll.wyllarmory.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput){
        super(pOutput);
    }



    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //SMITHING RECIPES

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_SWORD}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_SWORD.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_SWORD.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_PICKAXE}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_PICKAXE.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_PICKAXE.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_AXE}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_AXE.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_AXE.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_SHOVEL}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_SHOVEL.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_SHOVEL.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_HOE}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_HOE.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_HOE.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_HELMET}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_HELMET.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_HELMET.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_CHESTPLATE}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_CHESTPLATE.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_CHESTPLATE.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_LEGGINGS}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_LEGGINGS.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_LEGGINGS.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.NETHERITE_BOOTS}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_BOOTS.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_BOOTS.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.SHIELD}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_SHIELD.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_SHIELD.get()) + "_smithing");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(new ItemLike[]{Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE}),
                        Ingredient.of(new ItemLike[]{Items.BOW}), Ingredient.of(new ItemLike[]{ModItems.PRIMORDIAL_GEM.get()}),
                        RecipeCategory.MISC, ModItems.PRIMORDIAL_BOW.get())
                .unlocks("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter, getItemName(ModItems.PRIMORDIAL_BOW.get()) + "_smithing");

        //SHAPED RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PRIMORDIAL_HAMMER.get())
                .pattern("ABA")
                .pattern("AAA")
                .pattern(" C ")
                .define('A', Items.NETHERITE_INGOT)
                .define('B', ModItems.PRIMORDIAL_GEM.get())
                .define('C', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_primordial_gem", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PRIMORDIAL_GEM.get()).build()))
                .save(pWriter);

    }

}
