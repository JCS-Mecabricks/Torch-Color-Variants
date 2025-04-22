package github.jcsmecabricks.customtorches.item;

import github.jcsmecabricks.customtorches.CustomTorches;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TORCH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CustomTorches.MOD_ID, "torch_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_TORCH_ITEM))
                    .displayName(Text.translatable("itemGroup.custom-torches.torch_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_TORCH_ITEM);
                        entries.add(ModItems.ORANGE_TORCH_ITEM);
                        entries.add(ModItems.YELLOW_TORCH_ITEM);
                        entries.add(ModItems.GREEN_TORCH_ITEM);
                        entries.add(ModItems.BLUE_TORCH_ITEM);
                        entries.add(ModItems.PURPLE_TORCH_ITEM);
                    }).build());

    public static void load() {
    }
}