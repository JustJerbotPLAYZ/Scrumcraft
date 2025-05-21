package nl.delphinity.scrumcraft.init;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;


import java.util.function.Function;

public class ModBlocks {

public static void  init() {
    ItemGroupEvents.modifyEntriesEvent(ModItemGroups.SCRUMCRAFT_ITEM_GROUP_KEY).register((itemGroup) -> {
        itemGroup.add(ModBlocks.THE_ALMIGHTY_BELL.asItem());
    });
}



    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Scrumcraft.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Scrumcraft.MOD_ID, name));
    }

    public static final Block THE_ALMIGHTY_BELL = register(
            "the_almighty_bell",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.CHAIN),
            true
    );
}
