package net.pinchbu.pinchbus_alive_illagers.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_01_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_02_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.pinchbus_alive_illagers;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class level_02_pillagerModel extends GeoModel<level_02_pillagerEntity> {
    @Override
    public ResourceLocation getModelResource(level_02_pillagerEntity animatable) {
        return new ResourceLocation(pinchbus_alive_illagers.MODID, "geo/level_02_pillager.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(level_02_pillagerEntity animatable) {
        return new ResourceLocation(pinchbus_alive_illagers.MODID, "textures/entity/texture_illager_02.png");
    }

    @Override
    public ResourceLocation getAnimationResource(level_02_pillagerEntity animatable) {
        return new ResourceLocation(pinchbus_alive_illagers.MODID, "animations/illager_02.animation.json");
    }
    @Override
    public void setCustomAnimations(level_02_pillagerEntity animatable, long instanceId, AnimationState<level_02_pillagerEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
}

}