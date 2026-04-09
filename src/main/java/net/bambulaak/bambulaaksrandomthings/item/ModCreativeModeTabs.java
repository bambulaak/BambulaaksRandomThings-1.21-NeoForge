package net.bambulaak.bambulaaksrandomthings.item;

import net.bambulaak.bambulaaksrandomthings.BambulaaksRT;
import net.bambulaak.bambulaaksrandomthings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.bambulaak.bambulaaksrandomthings.item.ModItems.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BambulaaksRT.MOD_ID);

    public static final Supplier<CreativeModeTab> BAMBULAAKS_RANDOM_THINGS_TAB = CREATIVE_MODE_TAB.register("bambulaaks_random_things",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TURQUOISE.get()))
                    .title(Component.translatable("creativetab.bambulaaksrt.bambulaaks_random_things"))
                    .displayItems((parameters, output) -> {
                        output.accept(TURQUOISE.get());
                        output.accept(RAW_TURQUOISE.get());
                        output.accept(CHITIN.get());

                        output.accept(ModBlocks.TURQUOISE_BLOCK);
                        output.accept(ModBlocks.RAW_TURQUOISE_BLOCK);
                        output.accept(ModBlocks.TURQUOISE_ORE);
                        output.accept(ModBlocks.CHITIN_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
