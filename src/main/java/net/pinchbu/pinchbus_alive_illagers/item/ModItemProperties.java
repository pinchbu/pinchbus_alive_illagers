package net.pinchbu.pinchbus_alive_illagers.item;


import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItemProperties {
    public static void addCustomItemProperties() {

    makeCrossBow(ModItems.ADVANCED_CROSSBOW.get());
    }
    private static void makeCrossBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (ClampedItemPropertyFunction) ((p_174610_, p_174611_, p_174612_, p_174613_) -> {
            if (p_174612_ == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(p_174610_) ? 0.0F : (float) (p_174610_.getUseDuration() - p_174612_.getUseItemRemainingTicks()) / (float) CrossbowItem.getChargeDuration(p_174610_);
            }
        }));
        ItemProperties.register(item, new ResourceLocation("pulling"), (ClampedItemPropertyFunction) ((p_174605_, p_174606_, p_174607_, p_174608_) -> p_174607_ != null && p_174607_.isUsingItem() && p_174607_.getUseItem() == p_174605_ && !CrossbowItem.isCharged(p_174605_) ? 1.0F : 0.0F));
        ItemProperties.register(item, new ResourceLocation("charged"), (ClampedItemPropertyFunction) ((p_275891_, p_275892_, p_275893_, p_275894_) -> CrossbowItem.isCharged(p_275891_) ? 1.0F : 0.0F));
        ItemProperties.register(item, new ResourceLocation("firework"), (ClampedItemPropertyFunction) ((p_275887_, p_275888_, p_275889_, p_275890_) -> CrossbowItem.isCharged(p_275887_) && CrossbowItem.containsChargedProjectile(p_275887_, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F));
    }
}
