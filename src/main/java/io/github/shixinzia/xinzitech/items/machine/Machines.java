package io.github.shixinzia.xinzitech.items.machine;

import java.util.EnumMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.shixinzia.xinzitech.XinziTech;
import io.github.shixinzia.xinzitech.categories.Groups;
import io.github.shixinzia.xinzitech.items.materials.Materials;
import io.github.mooy1.infinitylib.machines.MachineBlock;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@UtilityClass
public final class Machines {
    public static final SlimefunItemStack TEST_MACHINE = new SlimefunItemStack(
        "TEST_MACHINE",
        Material.SMOOTH_STONE,
        "&8测试机器",
        "&7压块",
        "",
        MachineLore.energyPerSecond(120)
    );
    public static void setup(XinziTech plugin) {
        new MachineBlock(Groups.XINZI_MACHINES, TEST_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            Materials.XINZI_COBBLE_1, Materials.XINZI_COBBLE_1, Materials.XINZI_COBBLE_1,
            Materials.XINZI_COBBLE_1, SlimefunItems.FLUID_PUMP, Materials.XINZI_COBBLE_1,
            SlimefunItems.AUTO_DRIER, SlimefunItems.BIG_CAPACITOR, SlimefunItems.AUTO_DRIER
        }).addRecipe(new ItemStack(Material.WHITE_CONCRETE, 8), new ItemStack(Material.WHITE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.ORANGE_CONCRETE, 8), new ItemStack(Material.ORANGE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.MAGENTA_CONCRETE, 8), new ItemStack(Material.MAGENTA_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.LIGHT_BLUE_CONCRETE, 8), new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.YELLOW_CONCRETE, 8), new ItemStack(Material.YELLOW_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.LIME_CONCRETE, 8), new ItemStack(Material.LIME_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.PINK_CONCRETE, 8), new ItemStack(Material.PINK_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.GRAY_CONCRETE, 8), new ItemStack(Material.GRAY_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.LIGHT_GRAY_CONCRETE, 8), new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.CYAN_CONCRETE, 8), new ItemStack(Material.CYAN_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.PURPLE_CONCRETE, 8), new ItemStack(Material.PURPLE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.BLUE_CONCRETE, 8), new ItemStack(Material.BLUE_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.BROWN_CONCRETE, 8), new ItemStack(Material.BROWN_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.GREEN_CONCRETE, 8), new ItemStack(Material.GREEN_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.RED_CONCRETE, 8), new ItemStack(Material.RED_CONCRETE_POWDER, 8))
            .addRecipe(new ItemStack(Material.BLACK_CONCRETE, 8), new ItemStack(Material.BLACK_CONCRETE_POWDER, 8))
            .ticksPerOutput(1).energyPerTick(60).register(plugin);
    }

}
