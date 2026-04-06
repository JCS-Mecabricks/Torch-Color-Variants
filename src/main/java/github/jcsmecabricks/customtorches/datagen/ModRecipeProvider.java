package github.jcsmecabricks.customtorches.datagen;

import github.jcsmecabricks.customtorches.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {
                shapeless(RecipeCategory.MISC, ModItems.RED_TORCH_ITEM)
                        .requires(Items.REDSTONE)
                        .requires(Items.TORCH)
                        .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                        .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.ORANGE_TORCH_ITEM)
                        .requires(Items.RESIN_BRICK)
                        .requires(Items.TORCH)
                        .unlockedBy(getHasName(Items.RESIN_BRICK), has(Items.RESIN_BRICK))
                        .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.YELLOW_TORCH_ITEM)
                        .requires(Items.GOLD_INGOT)
                        .requires(Items.TORCH)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.GREEN_TORCH_ITEM)
                        .requires(Items.EMERALD)
                        .requires(Items.TORCH)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.BLUE_TORCH_ITEM)
                        .requires(Items.LAPIS_LAZULI)
                        .requires(Items.TORCH)
                        .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                        .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.PURPLE_TORCH_ITEM)
                        .requires(Items.AMETHYST_SHARD)
                        .requires(Items.TORCH)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .unlockedBy(getHasName(Items.TORCH), has(Items.TORCH))
                        .save(output);
            }
            private static String hasTag(TagKey<Item> tag) {
                return "has_" + tag.location().toString();
            }
        };
    }

    @Override
    public String getName() {
        return "Custom Torches Recipes";
    }
}
