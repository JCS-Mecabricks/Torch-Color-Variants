package github.jcsmecabricks.customtorches.item;

import github.jcsmecabricks.customtorches.CustomTorches;
import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;

public class ModItems {

    public static final Item RED_TORCH_ITEM = register("red_torch_item",
            new StandingAndWallBlockItem(ModBlocks.RED_TORCH, ModBlocks.RED_WALL_TORCH,
                    Direction.DOWN, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "red_torch_item")))));

    public static final Item ORANGE_TORCH_ITEM = register("orange_torch_item",
            new StandingAndWallBlockItem(ModBlocks.ORANGE_TORCH, ModBlocks.ORANGE_WALL_TORCH,
                    Direction.DOWN, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "orange_torch_item")))));

    public static final Item YELLOW_TORCH_ITEM = register("yellow_torch_item",
            new StandingAndWallBlockItem(ModBlocks.YELLOW_TORCH, ModBlocks.YELLOW_WALL_TORCH,
                    Direction.DOWN, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "yellow_torch_item")))));

    public static final Item GREEN_TORCH_ITEM = register("green_torch_item",
            new StandingAndWallBlockItem(ModBlocks.GREEN_TORCH, ModBlocks.GREEN_WALL_TORCH,
                    Direction.DOWN, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "green_torch_item")))));

    public static final Item BLUE_TORCH_ITEM = register("blue_torch_item",
            new StandingAndWallBlockItem(ModBlocks.BLUE_TORCH, ModBlocks.BLUE_WALL_TORCH,
                    Direction.DOWN, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "blue_torch_item")))));

    public static final Item PURPLE_TORCH_ITEM = register("purple_torch_item",
            new StandingAndWallBlockItem(ModBlocks.PURPLE_TORCH, ModBlocks.PURPLE_WALL_TORCH,
                    Direction.DOWN, new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM,
                            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "purple_torch_item")))));


    public static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, name), item);
    }

    public static void load() {}
}