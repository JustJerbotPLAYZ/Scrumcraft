package nl.delphinity.scrumcraft.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.common.items.RubberDucky;

import java.util.function.Function;

public class ModItems {
    public static final RubberDucky RUBBER_DUCKY = (RubberDucky) register("rubber_ducky", RubberDucky::new, new Item.Settings());
    public static final Item Scrum_Kaart_1 = register("scrum_kaart_1", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_2 = register("scrum_kaart_2", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_3 = register("scrum_kaart_3", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_5 = register("scrum_kaart_5", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_8 = register("scrum_kaart_8", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_13 = register("scrum_kaart_13", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_40 = register("scrum_kaart_40", Item::new, new Item.Settings());
    public static final Item Scrum_Kaart_infinity = register("scrum_kaart_infinity", Item::new, new Item.Settings());


    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(itemGroup -> {
            itemGroup.add(RUBBER_DUCKY);
        });
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Scrumcraft.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }


}
