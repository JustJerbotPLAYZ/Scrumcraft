package nl.delphinity.scrumcraft.datagen.providers.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;
import nl.delphinity.scrumcraft.init.ModItems;

import java.util.concurrent.CompletableFuture;

public class ScrumcraftEnglishLanguageProvider extends AbstractLanguageProvider{

    public ScrumcraftEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> wrapperLookup) {
        super("en_us", dataOutput, wrapperLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        getExistingLangFile(translationBuilder);

        // Items
        translationBuilder.add(ModItems.RUBBER_DUCKY, "Rubber Ducky");

        // Blocks

        // ItemGroups

        // ItemTags

        // Sounds
        translationBuilder.add("sound.scrumcraft.rubber_ducky_squeak", "Quack!");
        translationBuilder.add("sounds.scumcraft.rubber_ducky_throw", "Duck yeeteth");
    }
}
