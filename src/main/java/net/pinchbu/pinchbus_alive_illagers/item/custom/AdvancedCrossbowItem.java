package net.pinchbu.pinchbus_alive_illagers.item.custom;


import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;


public class AdvancedCrossbowItem extends CrossbowItem {
    public AdvancedCrossbowItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 30; // You can change this
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.CROSSBOW;
    }

}