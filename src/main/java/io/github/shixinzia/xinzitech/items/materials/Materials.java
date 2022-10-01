package io.github.shixinzia.xinzitech.items.materials;

import java.util.Arrays;

import io.github.shixinzia.xinzitech.categories.Groups;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.shixinzia.xinzitech.XinziTech;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

@UtilityClass
public final class Materials {

    public static final SlimefunItemStack XINZI_COBBLE_1 = new SlimefunItemStack(
            "COBBLESTONE_1",
            Material.ANDESITE,
            "&7一重压缩圆石",
            "&89个圆石压缩而来"
    );

    public static void setup(XinziTech plugin) {
        registerEnhanced(XINZI_COBBLE_1, new ItemStack[] {
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE)
        });
    }

    private static void registerEnhanced(SlimefunItemStack item, ItemStack[] recipe) {
        register(item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    }

    private static void registerSmeltery(SlimefunItemStack itemStack, ItemStack... recipe) {
        register(itemStack, RecipeType.SMELTERY, Arrays.copyOf(recipe, 9));
    }

    private static void register(SlimefunItemStack itemStack, RecipeType type, ItemStack[] recipe) {
        register(Groups.XINZI_MATERIALS, itemStack, type, recipe);
    }

    private static void register(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        new SlimefunItem(category, item, recipeType, recipe).register(XinziTech.instance());
    }

}
