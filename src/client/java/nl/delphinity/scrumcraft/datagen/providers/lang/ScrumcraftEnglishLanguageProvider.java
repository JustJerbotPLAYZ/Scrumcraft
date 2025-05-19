package nl.delphinity.scrumcraft.datagen.providers.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ScrumcraftEnglishLanguageProvider extends AbstractLanguageProvider{

    public ScrumcraftEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> wrapperLookup) {
        super("en_us", dataOutput, wrapperLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        getExistingLangFile(translationBuilder);

        // Items

        // Blocks

        // ItemGroups

        // ItemTags
    }
}
