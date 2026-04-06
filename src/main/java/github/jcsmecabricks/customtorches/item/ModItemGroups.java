package github.jcsmecabricks.customtorches.item;

import github.jcsmecabricks.customtorches.CustomTorches;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab TORCH_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CustomTorches.MOD_ID, "torch_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_TORCH_ITEM))
                    .title(Component.translatable("itemGroup.custom-torches.torch_group"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ModItems.RED_TORCH_ITEM);
                        entries.accept(ModItems.ORANGE_TORCH_ITEM);
                        entries.accept(ModItems.YELLOW_TORCH_ITEM);
                        entries.accept(ModItems.GREEN_TORCH_ITEM);
                        entries.accept(ModItems.BLUE_TORCH_ITEM);
                        entries.accept(ModItems.PURPLE_TORCH_ITEM);
                    }).build());

    public static void load() {
    }
}