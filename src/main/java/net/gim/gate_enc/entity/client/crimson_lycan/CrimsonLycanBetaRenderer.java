package net.gim.gate_enc.entity.client.crimson_lycan;

import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.entity.client.ModelLayerManager;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanBetaEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanBetaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CrimsonLycanBetaRenderer extends MobEntityRenderer<CrimsonLycanBetaEntity, CrimsonLycanBetaModel<CrimsonLycanBetaEntity>> {
    public static final Identifier TEXTURE = new Identifier(GateEncounters.MOD_ID, "textures/entity/encounters/crimson_lycan_b_texture.png");

    public CrimsonLycanBetaRenderer(EntityRendererFactory.Context context) {
        super(context, new CrimsonLycanBetaModel<>(context.getPart(ModelLayerManager.CRIMSON_LYCAN_BETA)), 0.06F);
    }

    @Override
    public Identifier getTexture(CrimsonLycanBetaEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CrimsonLycanBetaEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
