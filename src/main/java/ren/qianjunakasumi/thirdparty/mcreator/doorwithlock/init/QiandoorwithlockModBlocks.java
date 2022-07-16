
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.init;

import ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.block.QDoorWithLockBlock;
import ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.QiandoorwithlockMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class QiandoorwithlockModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, QiandoorwithlockMod.MODID);
	public static final RegistryObject<Block> Q_DOOR_WITH_LOCK = REGISTRY.register("q_door_with_lock", () -> new QDoorWithLockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			QDoorWithLockBlock.registerRenderLayer();
		}
	}
}
