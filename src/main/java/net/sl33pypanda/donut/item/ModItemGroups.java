package net.sl33pypanda.donut.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sl33pypanda.donut.Donut;

public class ModItemGroups {

        public static final ItemGroup DONUT_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(Donut.MOD_ID, "donut"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.donut"))
                        .icon(() ->new ItemStack(ModItems.DONUT)).entries((displayContext, entries) -> {
                            entries.add(ModItems.DONUT);


                            entries.add(Items.COOKIE);



                        }).build());
    public static void registerItemGroups(){
        Donut.LOGGER.info("Registering Item Groups for" + Donut.MOD_ID);
    }
}
