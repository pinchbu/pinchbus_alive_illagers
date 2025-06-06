package net.pinchbu.pinchbus_alive_illagers.entity.custom;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.pinchbu.pinchbus_alive_illagers.item.ModItems;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;

import java.util.function.BiFunction;

import static io.netty.util.internal.ThreadExecutorMap.apply;

public class level_01_pillagerEntity extends Pillager implements GeoEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    public level_01_pillagerEntity(EntityType<? extends Pillager> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(ModItems.ADVANCED_CROSSBOW.get()));


    }




    @Override
public ItemStack getItemInHand(InteractionHand hand) {
    return hand == InteractionHand.MAIN_HAND ? super.getMainHandItem() : ItemStack.EMPTY;
}


    public static AttributeSupplier setAttributes() {
        return Pillager.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.ATTACK_DAMAGE, 4.0f)
                .add(Attributes.ATTACK_SPEED, 1.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.4f).build();

    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));

    }


    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if (tAnimationState.isMoving()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.model.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;}
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.model.idle_03", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;}
}





