package net.gim.gate_enc.entity.client.crimson_lycan;

import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.entity.client.ModelLayerManager;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CrimsonLycanRenderer extends MobEntityRenderer<CrimsonLycanEntity, CrimsonLycanModel<CrimsonLycanEntity>> {
    public static final Identifier TEXTURE = new Identifier(GateEncounters.MOD_ID, "textures/entity/encounters/crimson_lycan_texture.png");

    public CrimsonLycanRenderer(EntityRendererFactory.Context context) {
        super(context, new CrimsonLycanModel<>(context.getPart(ModelLayerManager.CRIMSON_LYCAN)), 0.06F);
    }

    @Override
    public Identifier getTexture(CrimsonLycanEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CrimsonLycanEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
