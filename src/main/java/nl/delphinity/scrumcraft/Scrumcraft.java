package nl.delphinity.scrumcraft;

import net.fabricmc.api.ModInitializer;
import nl.delphinity.scrumcraft.init.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Scrumcraft implements ModInitializer {

    public static final String MOD_ID = "scrumcraft";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID.toUpperCase());


    @Override
    public void onInitialize() {
        ModItems.init();
    }
}
