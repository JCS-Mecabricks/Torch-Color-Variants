package github.jcsmecabricks.customtorches.datagen;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTorch(ModBlocks.RED_TORCH, ModBlocks.RED_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.ORANGE_TORCH, ModBlocks.ORANGE_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.BLUE_TORCH, ModBlocks.BLUE_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.YELLOW_TORCH, ModBlocks.YELLOW_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.GREEN_TORCH, ModBlocks.GREEN_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.PURPLE_TORCH, ModBlocks.PURPLE_WALL_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
