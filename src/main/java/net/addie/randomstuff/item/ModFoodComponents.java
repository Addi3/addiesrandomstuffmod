package net.addie.randomstuff.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CRYSTALIZEDZEITON = new FoodComponent.Builder().hunger(3).saturationModifier(.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 3),1f).build();
}
