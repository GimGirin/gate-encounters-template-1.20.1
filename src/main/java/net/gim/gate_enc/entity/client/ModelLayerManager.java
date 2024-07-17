package net.gim.gate_enc.entity.client;

import net.gim.gate_enc.GateEncounters;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModelLayerManager {
    public static final EntityModelLayer CRIMSON_LYCAN =
            new EntityModelLayer(new Identifier(GateEncounters.MOD_ID, "crimson_lycan/crimson_lycan"), "main");

    public static final EntityModelLayer CRIMSON_LYCAN_ALPHA =
            new EntityModelLayer(new Identifier(GateEncounters.MOD_ID, "crimson_lycan/crimson_lycan_a"), "main");

    public static final EntityModelLayer CRIMSON_LYCAN_BETA =
            new EntityModelLayer(new Identifier(GateEncounters.MOD_ID, "crimson_lycan/crimson_lycan_b"), "main");

    public static final EntityModelLayer CRIMSON_LYCAN_GAMMA =
            new EntityModelLayer(new Identifier(GateEncounters.MOD_ID, "crimson_lycan/crimson_lycan_g"), "main");
}
