package net.gim.gate_enc;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gim.gate_enc.utility.datagen.GateEncPoiTagProvider;
import net.gim.gate_enc.utility.datagen.GateEncWorldGenerator;
import net.gim.gate_enc.world.dimension.GateEncDimensions;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class GateEncountersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(GateEncPoiTagProvider::new);
		pack.addProvider(GateEncWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, GateEncDimensions::bootstrapType);
	}
}
