package nl.delphinity.scrumcraft.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> SCRUMCRAFT_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Scrumcraft.MOD_ID, "item_group"));
    public static final ItemGroup SCRUMCRAFT_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SCRUM_KAART_INFINITY))
            .displayName(Text.translatable("itemGroup.scrumcraft"))
            .build();

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, SCRUMCRAFT_ITEM_GROUP_KEY, SCRUMCRAFT_ITEM_GROUP);
    }
}
