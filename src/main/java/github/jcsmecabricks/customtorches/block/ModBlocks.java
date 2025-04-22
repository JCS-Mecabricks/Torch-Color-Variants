package github.jcsmecabricks.customtorches.block;

import github.jcsmecabricks.customtorches.CustomTorches;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block RED_TORCH = registerBlock(
            "red_torch",
            new TorchBlock(ModParticles.RED_TORCH_PARTICLE, AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "red_torch")))
                    .luminance(state -> 14)
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_WALL_TORCH = registerBlock(
            "red_wall_torch",
            new WallTorchBlock(ModParticles.RED_TORCH_PARTICLE, copyLootTable(RED_TORCH, true)
                    .noCollision()
                    .breakInstantly()
                    .luminance(state -> 14)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "red_wall_torch")))
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_TORCH = registerBlock(
            "orange_torch",
            new TorchBlock(ModParticles.ORANGE_TORCH_PARTICLE, AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "orange_torch")))
                    .luminance(state -> 14)
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_WALL_TORCH = registerBlock(
            "orange_wall_torch",
            new WallTorchBlock(ModParticles.ORANGE_TORCH_PARTICLE, copyLootTable(ORANGE_TORCH, true)
                    .noCollision()
                    .breakInstantly()
                    .luminance(state -> 14)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "orange_wall_torch")))
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_TORCH = registerBlock(
            "yellow_torch",
            new TorchBlock(ModParticles.YELLOW_TORCH_PARTICLE, AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "yellow_torch")))
                    .luminance(state -> 14)
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_WALL_TORCH = registerBlock(
            "yellow_wall_torch",
            new WallTorchBlock(ModParticles.YELLOW_TORCH_PARTICLE, copyLootTable(YELLOW_TORCH, true)
                    .noCollision()
                    .breakInstantly()
                    .luminance(state -> 14)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "yellow_wall_torch")))
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_TORCH = registerBlock(
            "green_torch",
            new TorchBlock(ModParticles.GREEN_TORCH_PARTICLE, AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "green_torch")))
                    .luminance(state -> 14)
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_WALL_TORCH = registerBlock(
            "green_wall_torch",
            new WallTorchBlock(ModParticles.GREEN_TORCH_PARTICLE, copyLootTable(GREEN_TORCH, true)
                    .noCollision()
                    .breakInstantly()
                    .luminance(state -> 14)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "green_wall_torch")))
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_TORCH = registerBlock(
            "blue_torch",
            new TorchBlock(ModParticles.BLUE_TORCH_PARTICLE, AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "blue_torch")))
                    .luminance(state -> 14)
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_WALL_TORCH = registerBlock(
            "blue_wall_torch",
            new WallTorchBlock(ModParticles.BLUE_TORCH_PARTICLE, copyLootTable(BLUE_TORCH, true)
                    .noCollision()
                    .breakInstantly()
                    .luminance(state -> 14)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "blue_wall_torch")))
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_TORCH = registerBlock(
            "purple_torch",
            new TorchBlock(ModParticles.PURPLE_TORCH_PARTICLE, AbstractBlock.Settings.create()
                    .noCollision()
                    .breakInstantly()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "purple_torch")))
                    .luminance(state -> 14)
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_WALL_TORCH = registerBlock(
            "purple_wall_torch",
            new WallTorchBlock(ModParticles.PURPLE_TORCH_PARTICLE, copyLootTable(PURPLE_TORCH, true)
                    .noCollision()
                    .breakInstantly()
                    .luminance(state -> 14)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomTorches.MOD_ID, "purple_wall_torch")))
                    .sounds(BlockSoundGroup.WOOD)
                    .pistonBehavior(PistonBehavior.DESTROY)));


    private static AbstractBlock.Settings copyLootTable(Block block, boolean copyTranslationKey) {
        AbstractBlock.Settings settings = block.getSettings();
        AbstractBlock.Settings settings2 = AbstractBlock.Settings.create().lootTable(block.getLootTableKey());
        if (copyTranslationKey) {
            settings2 = settings2.overrideTranslationKey(block.getTranslationKey());
        }

        return settings2;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CustomTorches.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CustomTorches.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomTorches.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static Block register(RegistryKey<Block> key, AbstractBlock.Settings settings) {
        return register(key, Block::new, settings);
    }

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(id));
    }

    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    private static Block register(String id, AbstractBlock.Settings settings) {
        return register(id, Block::new, settings);
    }
    public static void load() {}
}
