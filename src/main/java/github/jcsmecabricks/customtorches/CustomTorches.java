package github.jcsmecabricks.customtorches;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import github.jcsmecabricks.customtorches.item.ModItemGroups;
import github.jcsmecabricks.customtorches.item.ModItems;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
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

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.addBefore(Blocks.TORCH, ModBlocks.ORANGE_TORCH);
			entries.addBefore(ModBlocks.ORANGE_TORCH, ModBlocks.RED_TORCH);
			entries.addAfter(Blocks.TORCH, ModBlocks.YELLOW_TORCH);
			entries.addAfter(ModBlocks.YELLOW_TORCH, ModBlocks.GREEN_TORCH);
			entries.addAfter(Blocks.SOUL_TORCH, ModBlocks.BLUE_TORCH);
			entries.addAfter(ModBlocks.BLUE_TORCH, ModBlocks.PURPLE_TORCH);
		});
	}
}