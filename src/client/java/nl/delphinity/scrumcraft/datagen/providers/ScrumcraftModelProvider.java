package nl.delphinity.scrumcraft.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import nl.delphinity.scrumcraft.init.ModItems;

public class ScrumcraftModelProvider extends FabricModelProvider {
    public ScrumcraftModelProvider(FabricDataOutput output) {
        super(output);
    }

    /**
     * <a href="https://wiki.fabricmc.net/tutorial:datagen_model">documentation</a>
     *
     * @param blockstateModelGen BlockStateModelGenerator
     */
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockstateModelGen) {

    }

    /**
     * <a href="https://wiki.fabricmc.net/tutorial:datagen_model">documentation</a>
     *
     * @param modelGen ItemModelGenerator
     */
    @Override
    public void generateItemModels(ItemModelGenerator modelGen) {
     modelGen.register(ModItems.Scrum_Kaart_infinity, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_1, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_2, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_3, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_5, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_8, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_13, Models.GENERATED);
        modelGen.register(ModItems.Scrum_Kaart_40, Models.GENERATED);

    }
}