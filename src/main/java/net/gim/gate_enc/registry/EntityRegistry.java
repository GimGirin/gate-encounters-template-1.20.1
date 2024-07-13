package net.gim.gate_enc.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanAlphaEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanEntity;
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

    public static void registerEntities() {
        GateEncounters.LOGGER.info("Registering Entities for " + GateEncounters.MOD_ID);
    }
}
