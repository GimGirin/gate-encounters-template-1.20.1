package net.gim.gate_enc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gim.gate_enc.block.GateEncBlocks;
import net.gim.gate_enc.item.GateEncItems;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class GateEncBlockTagProvider extends FabricTagProvider {
    public GateEncBlockTagProvider(FabricDataOutput output, RegistryKey registryKey, CompletableFuture registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//                .add(GateEncBlocks.TEST_BLOCK);
    }
}
