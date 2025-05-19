package nl.delphinity.scrumcraft.client;

import net.fabricmc.api.ClientModInitializer;
import nl.delphinity.scrumcraft.client.init.EntityRenderers;

public class ScrumcraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRenderers.init();
    }
}
