package net.pinchbu.pinchbus_alive_illagers.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_01_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_02_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.pinchbus_alive_illagers;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class level_02_pillagerRenderer extends GeoEntityRenderer<level_02_pillagerEntity> {
    public level_02_pillagerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new level_02_pillagerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(level_02_pillagerEntity animatable) {
        return new ResourceLocation(pinchbus_alive_illagers.MODID, "textures/entity/texture_illager_02.png");
    }

    @Override
    public void render(level_02_pillagerEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
    @Override
    public RenderType getRenderType(level_02_pillagerEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityCutoutNoCull(texture);
    }
}
