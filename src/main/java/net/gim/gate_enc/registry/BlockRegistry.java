package net.gim.gate_enc.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gim.gate_enc.GateEncounters;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    public static final Block TEST_BLOCK = registerBlock("test/test_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 6.0F)));


    public static final Block GUILD_RELIC_TABLE_BLOCK = registerBlock("guild/guild_relic_table_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE)));
    public static final Block GUILD_RECEPTION_DESK_BLOCK = registerBlock("guild/guild_reception_desk_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CARTOGRAPHY_TABLE).sounds(BlockSoundGroup.BAMBOO_WOOD)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GateEncounters.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(GateEncounters.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        GateEncounters.LOGGER.info("Registering Mod Blocks for " + GateEncounters.MOD_ID);
    }
}