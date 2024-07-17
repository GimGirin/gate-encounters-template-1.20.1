package net.gim.gate_enc.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanAlphaEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanBetaEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanGammaEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntityRegistry {
    public static final EntityType<CrimsonLycanEntity> CRIMSON_LYCAN = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(GateEncounters.MOD_ID, "crimson_lycan"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrimsonLycanEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<CrimsonLycanAlphaEntity> CRIMSON_LYCAN_ALPHA = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(GateEncounters.MOD_ID, "crimson_lycan_alpha"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrimsonLycanAlphaEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<CrimsonLycanBetaEntity> CRIMSON_LYCAN_BETA = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(GateEncounters.MOD_ID, "crimson_lycan_beta"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrimsonLycanBetaEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<CrimsonLycanGammaEntity> CRIMSON_LYCAN_GAMMA = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(GateEncounters.MOD_ID, "crimson_lycan_gamma"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CrimsonLycanGammaEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static void registerEntities() {
        GateEncounters.LOGGER.info("Registering Entities for " + GateEncounters.MOD_ID);
    }
}
