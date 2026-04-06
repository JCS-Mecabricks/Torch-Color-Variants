package github.jcsmecabricks.customtorches.block;

import github.jcsmecabricks.customtorches.CustomTorches;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

public class ModBlocks {

    public static final Block RED_TORCH = registerBlock(
            "red_torch",
            new TorchBlock(ModParticles.RED_TORCH_PARTICLE, BlockBehaviour.Properties.of()
                    .noCollision()
                    .instabreak()
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "red_torch")))
                    .lightLevel(state -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block RED_WALL_TORCH = registerBlock(
            "red_wall_torch",
            new WallTorchBlock(ModParticles.RED_TORCH_PARTICLE, copyLootTable(RED_TORCH, true)
                    .noCollision()
                    .instabreak()
                    .lightLevel(state -> 14)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "red_wall_torch")))
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block ORANGE_TORCH = registerBlock(
            "orange_torch",
            new TorchBlock(ModParticles.ORANGE_TORCH_PARTICLE, BlockBehaviour.Properties.of()
                    .noCollision()
                    .instabreak()
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "orange_torch")))
                    .lightLevel(state -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block ORANGE_WALL_TORCH = registerBlock(
            "orange_wall_torch",
            new WallTorchBlock(ModParticles.ORANGE_TORCH_PARTICLE, copyLootTable(ORANGE_TORCH, true)
                    .noCollision()
                    .instabreak()
                    .lightLevel(state -> 14)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "orange_wall_torch")))
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block YELLOW_TORCH = registerBlock(
            "yellow_torch",
            new TorchBlock(ModParticles.YELLOW_TORCH_PARTICLE, BlockBehaviour.Properties.of()
                    .noCollision()
                    .instabreak()
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "yellow_torch")))
                    .lightLevel(state -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block YELLOW_WALL_TORCH = registerBlock(
            "yellow_wall_torch",
            new WallTorchBlock(ModParticles.YELLOW_TORCH_PARTICLE, copyLootTable(YELLOW_TORCH, true)
                    .noCollision()
                    .instabreak()
                    .lightLevel(state -> 14)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "yellow_wall_torch")))
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block GREEN_TORCH = registerBlock(
            "green_torch",
            new TorchBlock(ModParticles.GREEN_TORCH_PARTICLE, BlockBehaviour.Properties.of()
                    .noCollision()
                    .instabreak()
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "green_torch")))
                    .lightLevel(state -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block GREEN_WALL_TORCH = registerBlock(
            "green_wall_torch",
            new WallTorchBlock(ModParticles.GREEN_TORCH_PARTICLE, copyLootTable(GREEN_TORCH, true)
                    .noCollision()
                    .instabreak()
                    .lightLevel(state -> 14)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "green_wall_torch")))
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block BLUE_TORCH = registerBlock(
            "blue_torch",
            new TorchBlock(ModParticles.BLUE_TORCH_PARTICLE, BlockBehaviour.Properties.of()
                    .noCollision()
                    .instabreak()
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "blue_torch")))
                    .lightLevel(state -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block BLUE_WALL_TORCH = registerBlock(
            "blue_wall_torch",
            new WallTorchBlock(ModParticles.BLUE_TORCH_PARTICLE, copyLootTable(BLUE_TORCH, true)
                    .noCollision()
                    .instabreak()
                    .lightLevel(state -> 14)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "blue_wall_torch")))
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block PURPLE_TORCH = registerBlock(
            "purple_torch",
            new TorchBlock(ModParticles.PURPLE_TORCH_PARTICLE, BlockBehaviour.Properties.of()
                    .noCollision()
                    .instabreak()
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "purple_torch")))
                    .lightLevel(state -> 14)
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));

    public static final Block PURPLE_WALL_TORCH = registerBlock(
            "purple_wall_torch",
            new WallTorchBlock(ModParticles.PURPLE_TORCH_PARTICLE, copyLootTable(PURPLE_TORCH, true)
                    .noCollision()
                    .instabreak()
                    .lightLevel(state -> 14)
                    .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "purple_wall_torch")))
                    .sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY)));


    private static BlockBehaviour.Properties copyLootTable(Block block, boolean copyTranslationKey) {
        BlockBehaviour.Properties settings = block.properties();
        BlockBehaviour.Properties settings2 = BlockBehaviour.Properties.of().overrideLootTable(block.getLootTable());
        if (copyTranslationKey) {
            settings2 = settings2.overrideDescription(block.getDescriptionId());
        }

        return settings2;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, name),
                new BlockItem(block, new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, name))).useBlockDescriptionPrefix()));
    }

    public static Block register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    public static Block register(ResourceKey<Block> key, BlockBehaviour.Properties settings) {
        return register(key, Block::new, settings);
    }

    private static ResourceKey<Block> keyOf(String id) {
        return ResourceKey.create(Registries.BLOCK, Identifier.withDefaultNamespace(id));
    }

    private static Block register(String id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return register(keyOf(id), factory, settings);
    }

    private static Block register(String id, BlockBehaviour.Properties settings) {
        return register(id, Block::new, settings);
    }
    public static void load() {}
}
