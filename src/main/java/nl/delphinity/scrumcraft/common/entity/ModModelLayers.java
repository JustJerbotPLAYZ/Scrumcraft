package nl.delphinity.scrumcraft.common.entity;
import com.nimbusds.oauth2.sdk.id.Identifier;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import nl.delphinity.scrumcraft.Scrumcraft;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import nl.delphinity.scrumcraft.Scrumcraft;

public class ModModelLayers {
    public static final EntityModelLayer rens =
            new EntityModelLayer(new Identifier(Scrumcraft.MOD_ID, "porcupine"), "main");
}
