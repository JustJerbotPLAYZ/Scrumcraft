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
        translationBuilder.add(ModItems.SCRUM_KAART_1, "Scrum Kaart 1");
        translationBuilder.add(ModItems.SCRUM_KAART_2, "Scrum Kaart 2");
        translationBuilder.add(ModItems.SCRUM_KAART_3, "Scrum Kaart 3");
        translationBuilder.add(ModItems.SCRUM_KAART_5, "Scrum Kaart 5");
        translationBuilder.add(ModItems.SCRUM_KAART_8, "Scrum Kaart 8");
        translationBuilder.add(ModItems.SCRUM_KAART_13, "Scrum Kaart 13");
        translationBuilder.add(ModItems.SCRUM_KAART_40, "Scrum Kaart 40");
        translationBuilder.add(ModItems.SCRUM_KAART_INFINITY, "De infinity kaart");
        translationBuilder.add(ModItems.JONGLEER_BAL, "Jongleerbal");

        // Blocks

        // ItemGroups
        translationBuilder.add("itemGroup.scrumcraft", "Scrumcraft");

        // ItemTags

        // Sounds
        translationBuilder.add("sound.scrumcraft.rubber_ducky_squeak", "Quack!");
        translationBuilder.add("sound.scrumcraft.rubber_ducky_throw", "Duck yeeteth");
        translationBuilder.add("sound.scrumcraft.ball_hit", "Ball hit");
        translationBuilder.add("sound.scrumcraft.ball_throw", "Ball thrown");
    }
}
