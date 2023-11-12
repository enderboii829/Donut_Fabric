package net.sl33pypanda.donut.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sl33pypanda.donut.Donut;

public class ModItems {
    public static final Item DONUT = registerItem("donut", new Item(new FabricItemSettings().food(ModFoodComponents.DONUT)));
    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie", new Item(new FabricItemSettings()));

    public static final Item CHRISTMAS_COOKIE = registerItem("christmas_cookie", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(DONUT);
        entries.add(SUGAR_COOKIE);
        entries.add(CHRISTMAS_COOKIE);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Donut.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Donut.LOGGER.info("Registering mod items for" + Donut.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
