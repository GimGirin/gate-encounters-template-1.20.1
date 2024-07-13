package net.gim.gate_enc.utility;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gim.gate_enc.utility.datagen.PoiTagDataProvider;
import net.gim.gate_enc.utility.datagen.WorldDataGenerator;
import net.gim.gate_enc.registry.DimensionRegistry;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class GateEncountersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(PoiTagDataProvider::new);
		pack.addProvider(WorldDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, DimensionRegistry::bootstrapType);
	}
}
