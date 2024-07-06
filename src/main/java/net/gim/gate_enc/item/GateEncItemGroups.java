package net.gim.gate_enc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gim.gate_enc.GateEncounters;
import net.gim.gate_enc.block.GateEncBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GateEncItemGroups {

    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GateEncounters.MOD_ID, "test"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.test"))
                    .icon(() -> new ItemStack(GateEncItems.TEST_ITEM_ANIM)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(GateEncItems.TEST_ITEM);
                        entries.add(GateEncItems.TEST_ITEM_ANIM);
                        // Blocks
                        entries.add(GateEncBlocks.TEST_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        GateEncounters.LOGGER.info("Registering Item Groups for " + GateEncounters.MOD_ID);
    }
}
