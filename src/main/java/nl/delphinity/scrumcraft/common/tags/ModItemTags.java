package nl.delphinity.scrumcraft.common.tags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;

public class ModItemTags {
    public static final TagKey<Item> DUCKIES = of("duckies");

    private static TagKey<Item> of(String ID) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Scrumcraft.MOD_ID, ID));
    }
}
