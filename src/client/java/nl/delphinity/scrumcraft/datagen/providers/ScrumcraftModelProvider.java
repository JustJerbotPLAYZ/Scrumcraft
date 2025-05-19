package nl.delphinity.scrumcraft.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

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

    }
}