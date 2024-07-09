package net.gim.gate_enc;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.gim.gate_enc.object.block.GateEncBlocks;
import net.gim.gate_enc.object.item.GateEncItemGroups;
import net.gim.gate_enc.object.item.GateEncItems;
import net.gim.gate_enc.utility.GateEncVillagerTrades;
import net.gim.gate_enc.entity.villager.GateEncVillagers;
import net.gim.gate_enc.world.dimension.CopyEnc00;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.WorldSavePath;
import net.minecraft.world.World;
import net.minecraft.world.storage.RegionFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class GateEncounters implements ModInitializer {
	public static final String MOD_ID = "gate_enc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GateEncItemGroups.registerItemGroups();

		GateEncItems.registerModItems();
		GateEncBlocks.registerModBlocks();
		GateEncVillagers.registerVillagers();
		GateEncVillagerTrades.registerVillagerTrades();

		CustomPortalBuilder.beginPortal()
				.frameBlock(GateEncBlocks.TEST_BLOCK)
				.lightWithItem(GateEncItems.TEST_ITEM_ANIM)
				.destDimID(new Identifier(GateEncounters.MOD_ID, "encounter_00"))
				.tintColor(217, 245, 220)
				.registerPortal();

		ServerWorldEvents.LOAD.register(this::onWorldLoad);
	}
	private void onWorldLoad(MinecraftServer server, ServerWorld world) {
		if (world.getRegistryKey() == World.OVERWORLD) {
			try {
				File regionFolder = new File(server.getSavePath(WorldSavePath.ROOT).resolve("dimensions/gate_enc/encounter_00/region").toString());
				if (!regionFolder.exists()) {
					CopyEnc00.copyRegionToWorld(server);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				throw new RuntimeException(e);
			}
		}

	}
}