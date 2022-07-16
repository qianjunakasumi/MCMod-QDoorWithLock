
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ren.qianjunakasumi.thirdparty.mcreator.doorwithlock.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class QiandoorwithlockModTabs {
	public static CreativeModeTab TAB_Q_DOOR;

	public static void load() {
		TAB_Q_DOOR = new CreativeModeTab("tabq_door") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.IRON_DOOR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
