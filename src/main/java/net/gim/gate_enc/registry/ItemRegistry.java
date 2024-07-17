package net.gim.gate_enc.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.object.item.TestToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {

    public static final Item TEST_ITEM = registerItem("test/test_item", new Item(new FabricItemSettings()));
    public static final Item TEST_ITEM_ANIM = registerItem("test/test_item_anim", new Item(new FabricItemSettings()));

    // damage = 1 + tool damage + material damage
    // attack speed = 4 + tool attack speed

    // GATE ENCOUNTERS ASSOCIATION GUILD ITEMS
    public static final Item GUILD_COIN = registerItem("guild/guild_coin_anim", new Item(new FabricItemSettings().maxCount(64)));

    // ENCOUNTER_00: CRIMSON LYCAN GATE ITEMS
    public static final Item CRIMSON_LYCAN_SPAWN_EGG = registerItem("encounters/crimson_lycan_spawn_egg",
            new SpawnEggItem(EntityRegistry.CRIMSON_LYCAN, 1, 0, new FabricItemSettings()));

    public static final Item CRIMSON_LYCAN_ALPHA_SPAWN_EGG = registerItem("encounters/crimson_lycan_a_spawn_egg",
            new SpawnEggItem(EntityRegistry.CRIMSON_LYCAN_ALPHA, 2, 0, new FabricItemSettings()));

    public static final Item CRIMSON_LYCAN_BETA_SPAWN_EGG = registerItem("encounters/crimson_lycan_b_spawn_egg",
            new SpawnEggItem(EntityRegistry.CRIMSON_LYCAN_BETA, 3, 0, new FabricItemSettings()));

    public static final Item CRIMSON_LYCAN_GAMMA_SPAWN_EGG = registerItem("encounters/crimson_lycan_g_spawn_egg",
            new SpawnEggItem(EntityRegistry.CRIMSON_LYCAN_GAMMA, 4, 0, new FabricItemSettings()));


    // ADVENTURER'S SET ITEMS
    public static final Item ADVENTURERS_SCALE = registerItem("advent/adventurers_scale_anim", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item ADVENT_PLATE = registerItem("advent/advent_plate_anim", new Item(new FabricItemSettings().maxCount(8)));

    public static final Item ADVENTURERS_SWORD = registerItem("advent/adventurers_sword_anim", new SwordItem(
            TestToolMaterial.ADVENT, 20, -3, new FabricItemSettings()));
    public static final Item ADVENT_SWORD = registerItem("advent/advent_sword_anim", new SwordItem(
            TestToolMaterial.ADVENT, 24, -2, new FabricItemSettings()));



    // Adds items to the vanilla ingredients group (to use, uncomment below and in registerModItems class)
//    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        entries.add(TEST_ITEM);
//        entries.add(TEST_ITEM_ANIM);
//    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GateEncounters.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GateEncounters.LOGGER.info("Registering Mod Items for " + GateEncounters.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(GateEncItems::addItemsToIngredientItemGroup);
    }
}
