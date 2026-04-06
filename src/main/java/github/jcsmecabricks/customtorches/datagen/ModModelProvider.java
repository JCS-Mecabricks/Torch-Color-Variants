package github.jcsmecabricks.customtorches.datagen;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createNormalTorch(ModBlocks.RED_TORCH, ModBlocks.RED_WALL_TORCH);
        blockStateModelGenerator.createNormalTorch(ModBlocks.ORANGE_TORCH, ModBlocks.ORANGE_WALL_TORCH);
        blockStateModelGenerator.createNormalTorch(ModBlocks.BLUE_TORCH, ModBlocks.BLUE_WALL_TORCH);
        blockStateModelGenerator.createNormalTorch(ModBlocks.YELLOW_TORCH, ModBlocks.YELLOW_WALL_TORCH);
        blockStateModelGenerator.createNormalTorch(ModBlocks.GREEN_TORCH, ModBlocks.GREEN_WALL_TORCH);
        blockStateModelGenerator.createNormalTorch(ModBlocks.PURPLE_TORCH, ModBlocks.PURPLE_WALL_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
    }
}
