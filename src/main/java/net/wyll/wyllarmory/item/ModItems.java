package net.wyll.wyllarmory.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wyll.wyllarmory.WyllArmory;
import net.wyll.wyllarmory.item.custom.HammerItem;
import net.wyll.wyllarmory.item.custom.ModArmorItem;
import net.wyll.wyllarmory.item.custom.SlowingSwordItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, WyllArmory.MOD_ID);

    public static final RegistryObject<Item> PRIMORDIAL_GEM = ITEMS.register("primordial_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRIMORDIAL_SWORD = ITEMS.register("primordial_sword",
            () -> new SlowingSwordItem(ModToolTiers.PRIMORDIAL, 5,-2.1f,new Item.Properties().durability(2750)));
    public static final RegistryObject<Item> PRIMORDIAL_PICKAXE = ITEMS.register("primordial_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PRIMORDIAL, 2,-2.7f,new Item.Properties().durability(2900)));
    public static final RegistryObject<Item> PRIMORDIAL_AXE = ITEMS.register("primordial_axe",
            () -> new AxeItem(ModToolTiers.PRIMORDIAL, 4,-2.5f,new Item.Properties().durability(2850)));
    public static final RegistryObject<Item> PRIMORDIAL_SHOVEL = ITEMS.register("primordial_shovel",
            () -> new ShovelItem(ModToolTiers.PRIMORDIAL, 2,-2.7f,new Item.Properties().durability(2600)));
    public static final RegistryObject<Item> PRIMORDIAL_HOE = ITEMS.register("primordial_hoe",
            () -> new HoeItem(ModToolTiers.PRIMORDIAL, -4,-2.7f,new Item.Properties().durability(2600)));

    public static final RegistryObject<Item> PRIMORDIAL_HAMMER = ITEMS.register("primordial_hammer",
            () -> new HammerItem(ModToolTiers.PRIMORDIAL, 2,-2.9f,new Item.Properties().durability(3000)));

    public static final RegistryObject<Item> PRIMORDIAL_HELMET = ITEMS.register("primordial_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PRIMORDIAL,ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> PRIMORDIAL_CHESTPLATE = ITEMS.register("primordial_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.PRIMORDIAL,ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> PRIMORDIAL_LEGGINGS = ITEMS.register("primordial_leggings",
            () -> new ModArmorItem(ModArmorMaterials.PRIMORDIAL,ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> PRIMORDIAL_BOOTS = ITEMS.register("primordial_boots",
            () -> new ModArmorItem(ModArmorMaterials.PRIMORDIAL,ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> PRIMORDIAL_BOW = ITEMS.register("primordial_bow",
            () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> PRIMORDIAL_SHIELD = ITEMS.register("primordial_shield",
            () -> new ShieldItem(new Item.Properties().durability(900)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
