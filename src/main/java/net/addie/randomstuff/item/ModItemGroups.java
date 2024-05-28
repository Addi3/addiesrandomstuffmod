package net.addie.randomstuff.item;

import net.addie.randomstuff.AddiesRandomStuff;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup ADDIESRANDOMSTUFF = Registry.register(Registries.ITEM_GROUP, new Identifier
        (AddiesRandomStuff.MOD_ID, "addiesrandomstuff" ),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.AddiesRandomStuff"))
                .icon(() -> new ItemStack(ModItems.CRYSTALIZEDZEITON)).entries((displayContext, entries) -> {
entries.add(ModItems.CRYSTALIZEDZEITON);







                }).build());

    public static void registerItemGroups(){
        AddiesRandomStuff.LOGGER.info("Registering Item Groups for" + AddiesRandomStuff.MOD_ID);
    }
}
