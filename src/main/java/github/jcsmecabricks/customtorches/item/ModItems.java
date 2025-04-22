package github.jcsmecabricks.customtorches.item;

import github.jcsmecabricks.customtorches.CustomTorches;
import github.jcsmecabricks.customtorches.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems {

    public static final Item RED_TORCH_ITEM = register("red_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.RED_TORCH, ModBlocks.RED_WALL_TORCH,
                    Direction.DOWN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(CustomTorches.MOD_ID, "red_torch_item")))));

    public static final Item ORANGE_TORCH_ITEM = register("orange_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.ORANGE_TORCH, ModBlocks.ORANGE_WALL_TORCH,
                    Direction.DOWN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(CustomTorches.MOD_ID, "orange_torch_item")))));

    public static final Item YELLOW_TORCH_ITEM = register("yellow_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.YELLOW_TORCH, ModBlocks.YELLOW_WALL_TORCH,
                    Direction.DOWN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(CustomTorches.MOD_ID, "yellow_torch_item")))));

    public static final Item GREEN_TORCH_ITEM = register("green_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.GREEN_TORCH, ModBlocks.GREEN_WALL_TORCH,
                    Direction.DOWN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(CustomTorches.MOD_ID, "green_torch_item")))));

    public static final Item BLUE_TORCH_ITEM = register("blue_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.BLUE_TORCH, ModBlocks.BLUE_WALL_TORCH,
                    Direction.DOWN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(CustomTorches.MOD_ID, "blue_torch_item")))));

    public static final Item PURPLE_TORCH_ITEM = register("purple_torch_item",
            new VerticallyAttachableBlockItem(ModBlocks.PURPLE_TORCH, ModBlocks.PURPLE_WALL_TORCH,
                    Direction.DOWN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            Identifier.of(CustomTorches.MOD_ID, "purple_torch_item")))));


    public static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CustomTorches.MOD_ID, name), item);
    }

    public static void load() {}
}