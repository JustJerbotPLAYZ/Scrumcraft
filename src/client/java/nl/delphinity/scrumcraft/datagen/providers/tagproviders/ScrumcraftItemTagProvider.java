package nl.delphinity.scrumcraft.datagen.providers.tagproviders;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import nl.delphinity.scrumcraft.common.tags.ModItemTags;
import nl.delphinity.scrumcraft.init.ModItems;

import java.util.concurrent.CompletableFuture;

public class ScrumcraftItemTagProvider extends FabricTagProvider<Item> {
    public ScrumcraftItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.DUCKIES)
                .add(ModItems.RUBBER_DUCKY);

        getOrCreateTagBuilder(ModItemTags.SCRUM_KAARTEN)
                .add(ModItems.SCRUM_KAART_1)
                .add(ModItems.SCRUM_KAART_2)
                .add(ModItems.SCRUM_KAART_3)
                .add(ModItems.SCRUM_KAART_5)
                .add(ModItems.SCRUM_KAART_8)
                .add(ModItems.SCRUM_KAART_13)
                .add(ModItems.SCRUM_KAART_40)
                .add(ModItems.SCRUM_KAART_INFINITY);
    }
}
