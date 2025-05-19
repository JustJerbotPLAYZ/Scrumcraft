package nl.delphinity.scrumcraft.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ScrumcraftRecipeProvider extends FabricRecipeProvider {
    public ScrumcraftRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    /**
     * <a href="https://docs.fabricmc.net/develop/data-generation/recipes">documentation</a>
     *
     * @param wrapperLookup  WrapperLookup
     * @param recipeExporter RecipeExporter
     * @return RecipeGenerator
     */
    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

            }
        };
    }

    @Override
    public String getName() {
        return "Recipe Provider";
    }
}
