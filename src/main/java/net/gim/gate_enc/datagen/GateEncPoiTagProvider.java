package net.gim.gate_enc.datagen;

import net.gim.gate_enc.GateEncounters;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;

import java.util.concurrent.CompletableFuture;

public class GateEncPoiTagProvider extends TagProvider<PointOfInterestType> {
    public GateEncPoiTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, RegistryKeys.POINT_OF_INTEREST_TYPE, registryLookupFuture);
    }

    // Adds the "guildmasterpoi" to the poi tag allowing it to be considered a point of interest in Minecraft
    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        this.getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE).
                addOptional(new Identifier(GateEncounters.MOD_ID, "guildmasterpoi"));

        this.getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE).
                addOptional(new Identifier(GateEncounters.MOD_ID, "guildattendantpoi"));
    }
}
