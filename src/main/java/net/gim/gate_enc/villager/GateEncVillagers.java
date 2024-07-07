package net.gim.gate_enc.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.block.GateEncBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class GateEncVillagers {

    public static final RegistryKey<PointOfInterestType> GUILD_MASTER_POI_KEY = poiKey("guildmasterpoi");
    public static final PointOfInterestType GUILD_MASTER_POI = registerPoi("guildmasterpoi", GateEncBlocks.GUILD_RELIC_TABLE_BLOCK);

    public static final VillagerProfession GUILD_MASTER = registerProfession("guild_master", GUILD_MASTER_POI_KEY);


    public static final RegistryKey<PointOfInterestType> GUILD_ATTENDANT_POI_KEY = poiKey("guildattendantpoi");
    public static final PointOfInterestType GUILD_ATTENDANT_POI = registerPoi("guildattendantpoi", GateEncBlocks.GUILD_RECEPTION_DESK_BLOCK);

    public static final VillagerProfession GUILD_ATTENDANT = registerProfession("guild_attendant", GUILD_ATTENDANT_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(GateEncounters.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CARTOGRAPHER));
    }

    // ticketCount is how many villagers can receive a profession from the poi block
    // searchDistance is how far from the block they can be to receive the profession from the block
    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(GateEncounters.MOD_ID, name), 1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey (String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(GateEncounters.MOD_ID, name));
    }


    public static void registerVillagers() {
        GateEncounters.LOGGER.info("Registering villagers for " + GateEncounters.MOD_ID);
    }
}
