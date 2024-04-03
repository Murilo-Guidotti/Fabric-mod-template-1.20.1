package net.guidotti.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.guidotti.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
            .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RUSSIA);

                    }).build());

    public static final ItemGroup RUSSIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "russia"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.russia"))
                    .icon(() -> new ItemStack(ModItems.RUSSIA)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.RUSSIA);
                        entries.add(Items.DIAMOND);
                        entries.add(Items.TNT);
                    })).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
