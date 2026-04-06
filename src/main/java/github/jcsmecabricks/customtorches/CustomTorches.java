package github.jcsmecabricks.customtorches;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import github.jcsmecabricks.customtorches.item.ModItemGroups;
import github.jcsmecabricks.customtorches.item.ModItems;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomTorches implements ModInitializer {
	public static final String MOD_ID = "custom-torches";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.load();
		ModItemGroups.load();
		ModParticles.loadParticles();
		ModItems.load();
		LOGGER.info("Hello Fabric world!");

		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
			entries.insertBefore(Blocks.TORCH, ModBlocks.ORANGE_TORCH);
			entries.insertBefore(ModBlocks.ORANGE_TORCH, ModBlocks.RED_TORCH);
			entries.insertAfter(Blocks.TORCH, ModBlocks.YELLOW_TORCH);
			entries.insertAfter(ModBlocks.YELLOW_TORCH, ModBlocks.GREEN_TORCH);
			entries.insertAfter(Blocks.SOUL_TORCH, ModBlocks.BLUE_TORCH);
			entries.insertAfter(ModBlocks.BLUE_TORCH, ModBlocks.PURPLE_TORCH);
		});
	}
}