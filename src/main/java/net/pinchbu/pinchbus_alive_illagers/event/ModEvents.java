package net.pinchbu.pinchbus_alive_illagers.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_02_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.pinchbus_alive_illagers;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_01_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.entity.ModEntities;

@Mod.EventBusSubscriber(modid = pinchbus_alive_illagers.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.level_01_pillager.get(),level_01_pillagerEntity.setAttributes());
        event.put(ModEntities.level_02_pillager.get(), level_02_pillagerEntity.setAttributes());
    }
}