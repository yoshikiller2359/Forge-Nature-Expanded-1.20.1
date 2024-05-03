package net.yoshikiller.natureexpanded.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yoshikiller.natureexpanded.NatureExpanded;
import net.yoshikiller.natureexpanded.block.ModBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NatureExpanded.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NATURE_EXPANDED_TAB = CREATIVE_MODE_TABS.register("natureexpanded_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PLATINUM_DUST.get()))
                    .title(Component.translatable("creativetab.natureexpanded_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PLATINUM_INGOT.get());
                        pOutput.accept(ModItems.PLATINUM_DUST.get());

                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                    })
                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
