package nl.delphinity.scrumcraft.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.DeathProtectionComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.common.items.Ball;
import nl.delphinity.scrumcraft.common.items.RubberDucky;

import java.util.function.Function;

public class ModItems {
    public static final RubberDucky RUBBER_DUCKY = (RubberDucky) register("rubber_ducky", RubberDucky::new, new Item.Settings());
    public static final Item SCRUM_KAART_1 = register("scrum_kaart_1", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_2 = register("scrum_kaart_2", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_3 = register("scrum_kaart_3", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_5 = register("scrum_kaart_5", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_8 = register("scrum_kaart_8", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_13 = register("scrum_kaart_13", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_40 = register("scrum_kaart_40", Item::new, new Item.Settings());
    public static final Item SCRUM_KAART_INFINITY = register("scrum_kaart_infinity", Item::new, new Item.Settings().component(DataComponentTypes.DEATH_PROTECTION, DeathProtectionComponent.TOTEM_OF_UNDYING));
    public static final Ball JONGLEER_BAL = (Ball) register("ball", Ball::new, new Item.Settings());


    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.SCRUMCRAFT_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(RUBBER_DUCKY);
            itemGroup.add(SCRUM_KAART_1);
            itemGroup.add(SCRUM_KAART_2);
            itemGroup.add(SCRUM_KAART_3);
            itemGroup.add(SCRUM_KAART_5);
            itemGroup.add(SCRUM_KAART_8);
            itemGroup.add(SCRUM_KAART_13);
            itemGroup.add(SCRUM_KAART_40);
            itemGroup.add(SCRUM_KAART_INFINITY);
            itemGroup.add(JONGLEER_BAL);
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
