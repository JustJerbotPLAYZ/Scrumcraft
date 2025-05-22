package nl.delphinity.scrumcraft.client.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.client.model.BrammekeEntityModel;
import nl.delphinity.scrumcraft.common.entity.BrammekeEntity;
import nl.delphinity.scrumcraft.entity.renderstates.BrammekeEntityRenderState;

public class BrammekeEntityRenderer extends MobEntityRenderer<BrammekeEntity, BrammekeEntityRenderState, BrammekeEntityModel> {
    public static final Identifier TEXTURE = Identifier.of(Scrumcraft.MOD_ID, "textures/entity/brammeke.png");

    public BrammekeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BrammekeEntityModel(BrammekeEntityModel.getTexturedModelData().createModel()), 0.5f);
    }

    @Override
    public BrammekeEntityRenderState createRenderState() {
        return new BrammekeEntityRenderState();
    }

    @Override
    public Identifier getTexture(BrammekeEntityRenderState state) {
        return TEXTURE;
    }
}
