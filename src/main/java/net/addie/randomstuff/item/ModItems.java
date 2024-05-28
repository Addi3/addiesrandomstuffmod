package net.addie.randomstuff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.addie.randomstuff.AddiesRandomStuff;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CRYSTALIZEDZEITON = registerItem("crystalised_zeiton", new Item(new FabricItemSettings()
            .food(ModFoodComponents.CRYSTALIZEDZEITON)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AddiesRandomStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AddiesRandomStuff.LOGGER.info("Registering Mod Items for " + AddiesRandomStuff.MOD_ID);

    }
}