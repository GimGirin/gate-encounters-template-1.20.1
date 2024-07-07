package net.gim.gate_enc.utility;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.gim.gate_enc.item.GateEncItems;
import net.gim.gate_enc.villager.GateEncVillagers;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class GateEncVillagerTrades {
    public static void registerVillagerTrades() {

        TradeOfferHelper.registerVillagerOffers(GateEncVillagers.GUILD_ATTENDANT, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 8),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            3, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 16),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 32),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            12, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 64),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            24, 5, 0.05f));
                });


        TradeOfferHelper.registerVillagerOffers(GateEncVillagers.GUILD_ATTENDANT, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 8),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            3, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 16),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            6, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 32),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            12, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 64),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            24, 5, 0.05f));
                });



        TradeOfferHelper.registerVillagerOffers(GateEncVillagers.GUILD_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GateEncItems.GUILD_COIN, 32),
                            new ItemStack(Items.NETHERITE_SCRAP, 2),
                            new ItemStack(GateEncItems.ADVENTURERS_SCALE, 1),
                            8, 7, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.GOLD_INGOT, 3),
                            64, 3, 0.05f));
                });


        TradeOfferHelper.registerVillagerOffers(GateEncVillagers.GUILD_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GateEncItems.GUILD_COIN, 32),
                            new ItemStack(Items.NETHERITE_INGOT, 2),
                            new ItemStack(GateEncItems.ADVENT_PLATE, 1),
                            4, 9, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.POWER, 2)),
                            new ItemStack(GateEncItems.ADVENTURERS_SCALE, 1),
                            new ItemStack(GateEncItems.ADVENT_PLATE, 1),
                            3, 12, 0.05f));
                });


        // Wandering Trader's Level is presumed to be trade rarity
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(GateEncItems.GUILD_COIN, 1),
                            4, 9, 0.05f));
                });
    }
}
