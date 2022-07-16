
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.init;

import ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.item.QDoorKeyItem;
import ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.QiandoorwithlockMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;

public class QiandoorwithlockModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QiandoorwithlockMod.MODID);
	public static final RegistryObject<Item> Q_DOOR_WITH_LOCK = doubleBlock(QiandoorwithlockModBlocks.Q_DOOR_WITH_LOCK,
			QiandoorwithlockModTabs.TAB_Q_DOOR);
	public static final RegistryObject<Item> Q_DOOR_KEY = REGISTRY.register("q_door_key", () -> new QDoorKeyItem());

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
