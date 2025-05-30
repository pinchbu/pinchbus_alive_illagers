package net.pinchbu.pinchbus_alive_illagers;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pinchbu.pinchbus_alive_illagers.entity.ModEntities;
import net.pinchbu.pinchbus_alive_illagers.item.ModItems;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;
import net.pinchbu.pinchbus_alive_illagers.entity.client.level_01_pillagerRenderer;

@Mod(pinchbus_alive_illagers.MODID)
public class pinchbus_alive_illagers
{
    public static final String MODID = "pinchbus_alive_illagers";
    private static final Logger LOGGER = LogUtils.getLogger();
    public pinchbus_alive_illagers(FMLJavaModLoadingContext context)
    {
        GeckoLib.initialize();
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ModEntities.register(modEventBus);
        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.level_01_pillager.get(), level_01_pillagerRenderer::new);
        }
    }
}
