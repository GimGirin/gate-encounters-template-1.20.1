package net.gim.gate_enc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gim.gate_enc.entity.client.ModelLayerManager;
import net.gim.gate_enc.entity.client.crimson_lycan.CrimsonLycanAlphaModel;
import net.gim.gate_enc.entity.client.crimson_lycan.CrimsonLycanAlphaRenderer;
import net.gim.gate_enc.entity.client.crimson_lycan.CrimsonLycanModel;
import net.gim.gate_enc.entity.client.crimson_lycan.CrimsonLycanRenderer;
import net.gim.gate_enc.registry.EntityRegistry;

public class GateEncountersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        EntityRendererRegistry.register(EntityRegistry.CRIMSON_LYCAN, CrimsonLycanRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModelLayerManager.CRIMSON_LYCAN, CrimsonLycanModel::getTexturedModelData);

        EntityRendererRegistry.register(EntityRegistry.CRIMSON_LYCAN_ALPHA, CrimsonLycanAlphaRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModelLayerManager.CRIMSON_LYCAN_ALPHA, CrimsonLycanAlphaModel::getTexturedModelData);
    }
}
