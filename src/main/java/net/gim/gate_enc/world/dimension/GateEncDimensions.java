package net.gim.gate_enc.world.dimension;

import net.gim.gate_enc.GateEncounters;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import net.minecraft.world.dimension.NetherPortal;

import java.util.OptionalLong;

public class GateEncDimensions {
    public static final RegistryKey<DimensionOptions> ENCOUNTER_00_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(GateEncounters.MOD_ID, "encounter_00"));
    public static final RegistryKey<World> ENCOUNTER_00_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(GateEncounters.MOD_ID, "encounter_00"));
    public static final RegistryKey<DimensionType> ENCOUNTER_00_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(GateEncounters.MOD_ID, "encounter_00_type"));




    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(ENCOUNTER_00_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkyLight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                false, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
