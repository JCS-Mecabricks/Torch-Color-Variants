package github.jcsmecabricks.customtorches;

import github.jcsmecabricks.customtorches.datagen.ModBlockLootTable;
import github.jcsmecabricks.customtorches.datagen.ModModelProvider;
import github.jcsmecabricks.customtorches.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CustomTorchesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockLootTable::new);
	}
}
