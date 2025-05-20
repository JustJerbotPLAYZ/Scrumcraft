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
     modelGen.register(ModItems.SCRUM_KAART_INFINITY, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_1, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_2, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_3, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_5, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_8, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_13, Models.GENERATED);
        modelGen.register(ModItems.SCRUM_KAART_40, Models.GENERATED);
        modelGen.register(ModItems.JONGLEER_BAL, Models.GENERATED);

    }
}