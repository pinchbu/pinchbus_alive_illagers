package net.pinchbu.pinchbus_alive_illagers.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinchbu.pinchbus_alive_illagers.entity.custom.level_01_pillagerEntity;
import net.pinchbu.pinchbus_alive_illagers.pinchbus_alive_illagers;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, pinchbus_alive_illagers.MODID);

    public static final RegistryObject<EntityType<level_01_pillagerEntity>> level_01_pillager=
            ENTITY_TYPES.register("level_01_pillager",
                    () -> EntityType.Builder.of(level_01_pillagerEntity::new, MobCategory.MONSTER)
                            .sized(0.6f, 1.95f)
                            .build(new ResourceLocation(pinchbus_alive_illagers.MODID, "level_01_pillager").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}