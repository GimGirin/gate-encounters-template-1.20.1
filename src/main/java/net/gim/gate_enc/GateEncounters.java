package net.gim.gate_enc;

import net.fabricmc.api.ModInitializer;

import net.gim.gate_enc.block.GateEncBlocks;
import net.gim.gate_enc.item.GateEncItemGroups;
import net.gim.gate_enc.item.GateEncItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GateEncounters implements ModInitializer {
	public static final String MOD_ID = "gate_enc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GateEncItemGroups.registerItemGroups();

		GateEncItems.registerModItems();
		GateEncBlocks.registerModBlocks();
	}
}