package net.sl33pypanda.donut.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DONUT = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.25f).build();
}
