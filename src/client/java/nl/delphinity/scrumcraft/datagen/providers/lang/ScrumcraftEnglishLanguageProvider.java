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
        translationBuilder.add(ModItems.Scrum_Kaart_1, "Scrum Kaart 1");
        translationBuilder.add(ModItems.Scrum_Kaart_2, "Scrum Kaart 2");
        translationBuilder.add(ModItems.Scrum_Kaart_3, "Scrum Kaart 3");
        translationBuilder.add(ModItems.Scrum_Kaart_5, "Scrum Kaart 5");
        translationBuilder.add(ModItems.Scrum_Kaart_8, "Scrum Kaart 8");
        translationBuilder.add(ModItems.Scrum_Kaart_13, "Scrum Kaart 13");
        translationBuilder.add(ModItems.Scrum_Kaart_40, "Scrum Kaart 40");
        translationBuilder.add(ModItems.Scrum_Kaart_infinity, "De infinity kaart");

        // Blocks

        // ItemGroups

        // ItemTags

        // Sounds
        translationBuilder.add("sound.scrumcraft.rubber_ducky_squeak", "Quack!");
        translationBuilder.add("sounds.scumcraft.rubber_ducky_throw", "Duck yeeteth");
    }
}
