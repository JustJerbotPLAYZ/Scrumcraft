package nl.delphinity.scrumcraft.client.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import nl.delphinity.scrumcraft.client.model.BrammekeEntityModel;
import nl.delphinity.scrumcraft.client.renderer.BrammekeEntityRenderer;
import nl.delphinity.scrumcraft.init.ModEntities;
import nl.delphinity.scrumcraft.init.ModEntityTypes;

public class EntityRenderers {
    public static void init() {
        EntityRendererRegistry.register(ModEntityTypes.RUBBER_DUCKY_ENTITY, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.BALL_ENTITY, FlyingItemEntityRenderer::new);

        EntityRendererRegistry.register(ModEntities.BRAMMEKE, BrammekeEntityRenderer::new);
    }
}
