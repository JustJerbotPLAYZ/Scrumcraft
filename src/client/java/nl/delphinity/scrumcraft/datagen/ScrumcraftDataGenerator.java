package nl.delphinity.scrumcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import nl.delphinity.scrumcraft.datagen.providers.ScrumcraftModelProvider;
import nl.delphinity.scrumcraft.datagen.providers.ScrumcraftRecipeProvider;
import nl.delphinity.scrumcraft.datagen.providers.lang.ScrumcraftEnglishLanguageProvider;
import nl.delphinity.scrumcraft.datagen.providers.tagproviders.ScrumcraftBlockTagProvider;
import nl.delphinity.scrumcraft.datagen.providers.tagproviders.ScrumcraftItemTagProvider;

public class ScrumcraftDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // Language providers
        pack.addProvider(ScrumcraftEnglishLanguageProvider::new);

        // Model and recipe provider
        pack.addProvider(ScrumcraftModelProvider::new);
        pack.addProvider(ScrumcraftRecipeProvider::new);

        // Tag providers
        pack.addProvider(ScrumcraftItemTagProvider::new);
        pack.addProvider(ScrumcraftBlockTagProvider::new);
    }
}
