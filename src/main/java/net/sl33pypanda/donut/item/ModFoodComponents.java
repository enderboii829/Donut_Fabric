package net.sl33pypanda.donut.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DONUT = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.25f).build();
    public static final FoodComponent CHRISTMAS_COOKIE = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 180),1f).build();
}
