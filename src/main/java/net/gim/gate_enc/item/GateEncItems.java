package net.gim.gate_enc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gim.gate_enc.GateEncounters;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GateEncItems {

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));
    public static final Item TEST_ITEM_ANIM = registerItem("test_item_anim", new Item(new FabricItemSettings()));



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
