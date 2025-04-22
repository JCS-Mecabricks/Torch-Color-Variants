package github.jcsmecabricks.customtorches.datagen;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTable extends FabricBlockLootTableProvider {
    public ModBlockLootTable(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RED_TORCH);
        addDrop(ModBlocks.BLUE_TORCH);
        addDrop(ModBlocks.ORANGE_TORCH);
        addDrop(ModBlocks.YELLOW_TORCH);
        addDrop(ModBlocks.GREEN_TORCH);
        addDrop(ModBlocks.PURPLE_TORCH);
    }
}
