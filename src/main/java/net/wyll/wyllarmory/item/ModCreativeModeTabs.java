package net.wyll.wyllarmory.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.block.ModBlocks;
import net.wyll.wyllarmory.enchantment.ModEnchantments;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WyllArmory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WYLL_ARMORY = CREATIVE_MODE_TABS.register("wyll_armory",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.PRIMORDIAL_GEM.get()))
                    .title(Component.translatable("creativetab.wyll_armory"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PRIMORDIAL_GEM.get());

                        output.accept(ModItems.PRIMORDIAL_SWORD.get());
                        output.accept(ModItems.PRIMORDIAL_PICKAXE.get());
                        output.accept(ModItems.PRIMORDIAL_AXE.get());
                        output.accept(ModItems.PRIMORDIAL_SHOVEL.get());
                        output.accept(ModItems.PRIMORDIAL_HOE.get());
                        output.accept(ModItems.PRIMORDIAL_HAMMER.get());
                        output.accept(ModItems.PRIMORDIAL_BOW.get());
                        output.accept(ModItems.PRIMORDIAL_SHIELD.get());

                        output.accept((ModItems.PRIMORDIAL_HELMET.get()));
                        output.accept((ModItems.PRIMORDIAL_CHESTPLATE.get()));
                        output.accept((ModItems.PRIMORDIAL_LEGGINGS.get()));
                        output.accept((ModItems.PRIMORDIAL_BOOTS.get()));

                        output.accept(ModBlocks.PRIMORDIAL_GEM_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
