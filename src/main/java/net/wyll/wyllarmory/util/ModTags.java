package net.wyll.wyllarmory.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.wyll.wyllarmory.WyllArmory;

public class ModTags {

    public static class Items{

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(WyllArmory.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Blocks{

        public static final TagKey<Block> NEED_PRIMORDIAL_TIER = tag("need_primordial_tier");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(WyllArmory.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }
}
