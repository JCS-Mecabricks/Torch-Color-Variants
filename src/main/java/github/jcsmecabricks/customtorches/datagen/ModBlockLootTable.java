package github.jcsmecabricks.customtorches.datagen;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTable extends FabricBlockLootSubProvider {
    public ModBlockLootTable(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.RED_TORCH);
        dropSelf(ModBlocks.BLUE_TORCH);
        dropSelf(ModBlocks.ORANGE_TORCH);
        dropSelf(ModBlocks.YELLOW_TORCH);
        dropSelf(ModBlocks.GREEN_TORCH);
        dropSelf(ModBlocks.PURPLE_TORCH);
    }
}
