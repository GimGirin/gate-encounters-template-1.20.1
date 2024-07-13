package net.gim.gate_enc.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gim.gate_enc.GateEncounters;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroupRegistry {

    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GateEncounters.MOD_ID, "test"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.test"))
                    .icon(() -> new ItemStack(ItemRegistry.TEST_ITEM_ANIM)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(ItemRegistry.TEST_ITEM);
                        entries.add(ItemRegistry.TEST_ITEM_ANIM);
                        // Blocks
                        entries.add(BlockRegistry.TEST_BLOCK);


                    }).build());

    public static final ItemGroup GUILD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GateEncounters.MOD_ID, "guild"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.guild"))
                    .icon(() -> new ItemStack(ItemRegistry.GUILD_COIN)).entries((displayContext, entries) -> {
                        // Weapons
                        entries.add(ItemRegistry.ADVENTURERS_SWORD);
                        entries.add(ItemRegistry.ADVENT_SWORD);
                        // Items
                        entries.add(ItemRegistry.GUILD_COIN);
                        entries.add(ItemRegistry.ADVENTURERS_SCALE);
                        entries.add(ItemRegistry.ADVENT_PLATE);
                        entries.add(ItemRegistry.CRIMSON_LYCAN_SPAWN_EGG);
                        entries.add(ItemRegistry.CRIMSON_LYCAN_ALPHA_SPAWN_EGG);
                        // Blocks
                        entries.add(BlockRegistry.GUILD_RELIC_TABLE_BLOCK);
                        entries.add(BlockRegistry.GUILD_RECEPTION_DESK_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        GateEncounters.LOGGER.info("Registering Item Groups for " + GateEncounters.MOD_ID);
    }
}
