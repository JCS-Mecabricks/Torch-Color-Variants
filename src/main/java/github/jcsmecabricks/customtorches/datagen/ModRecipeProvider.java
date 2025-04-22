package github.jcsmecabricks.customtorches.datagen;

import github.jcsmecabricks.customtorches.block.ModBlocks;
import github.jcsmecabricks.customtorches.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShapeless(RecipeCategory.MISC, ModItems.RED_TORCH_ITEM)
                        .input(Items.REDSTONE)
                        .input(Items.TORCH)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.ORANGE_TORCH_ITEM)
                        .input(Items.RESIN_BRICK)
                        .input(Items.TORCH)
                        .criterion(hasItem(Items.RESIN_BRICK), conditionsFromItem(Items.RESIN_BRICK))
                        .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.YELLOW_TORCH_ITEM)
                        .input(Items.GOLD_INGOT)
                        .input(Items.TORCH)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.GREEN_TORCH_ITEM)
                        .input(Items.EMERALD)
                        .input(Items.TORCH)
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.BLUE_TORCH_ITEM)
                        .input(Items.LAPIS_LAZULI)
                        .input(Items.TORCH)
                        .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                        .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.PURPLE_TORCH_ITEM)
                        .input(Items.AMETHYST_SHARD)
                        .input(Items.TORCH)
                        .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                        .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                        .offerTo(exporter);
            }
            private static String hasTag(TagKey<Item> tag) {
                return "has_" + tag.id().toString();
            }
        };
    }

    @Override
    public String getName() {
        return "Custom Torches Recipes";
    }
}
