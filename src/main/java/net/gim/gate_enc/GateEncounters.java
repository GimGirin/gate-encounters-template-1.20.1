package net.gim.gate_enc;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanAlphaEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanBetaEntity;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanGammaEntity;
import net.gim.gate_enc.registry.EntityRegistry;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanEntity;
import net.gim.gate_enc.registry.BlockRegistry;
import net.gim.gate_enc.registry.ItemGroupRegistry;
import net.gim.gate_enc.registry.ItemRegistry;
import net.gim.gate_enc.registry.VillagerTradeRegistry;
import net.gim.gate_enc.registry.VillagerRegistry;
import net.gim.gate_enc.world.dimension.CopyEnc00;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.EndPortalBlock;
import net.minecraft.client.particle.PortalParticle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.WorldSavePath;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;
import net.minecraft.world.dimension.NetherPortal;
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
		ItemGroupRegistry.registerItemGroups();

		ItemRegistry.registerModItems();
		BlockRegistry.registerModBlocks();

		VillagerRegistry.registerVillagers();
		VillagerTradeRegistry.registerVillagerTrades();

		EntityRegistry.registerEntities();

		FabricDefaultAttributeRegistry.register(EntityRegistry.CRIMSON_LYCAN, CrimsonLycanEntity.createCrimsonLycanAttributes());
		FabricDefaultAttributeRegistry.register(EntityRegistry.CRIMSON_LYCAN_ALPHA, CrimsonLycanAlphaEntity.createCrimsonLycanAlphaAttributes());
		FabricDefaultAttributeRegistry.register(EntityRegistry.CRIMSON_LYCAN_BETA, CrimsonLycanBetaEntity.createCrimsonLycanBetaAttributes());
		FabricDefaultAttributeRegistry.register(EntityRegistry.CRIMSON_LYCAN_GAMMA, CrimsonLycanGammaEntity.createCrimsonLycanGammaAttributes());

		CustomPortalBuilder.beginPortal()
				.frameBlock(BlockRegistry.TEST_BLOCK)
				.lightWithItem(ItemRegistry.TEST_ITEM_ANIM)
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