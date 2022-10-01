package io.github.shixinzia.xinzitech.categories;

import org.bukkit.Material;

import io.github.shixinzia.xinzitech.XinziTech;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

/**
 * Categories for this addon
 *
 * @author Mooy1
 */
public final class Groups {

    public static final ItemGroup XINZI_MATERIALS = new SubGroup("xinzi_materials",
            new CustomItemStack(Material.NETHERITE_BLOCK, "&b材料"));
    public static final ItemGroup XINZI_MACHINES = new SubGroup("xinzi_machines",
        new CustomItemStack(Material.NETHERITE_BLOCK, "&b机器"));
    public static final ItemGroup XINZI_MAIN_CATEGORY = new MultiGroup("xinzi_main",
            new CustomItemStack(Material.NETHER_STAR, "&b心孜科技-WIP"), 3,
             XINZI_MATERIALS ,XINZI_MACHINES);
    public static final ItemGroup XINZI_CHEAT = new SubGroup("xinzi_cheat",
            new CustomItemStack(Material.RESPAWN_ANCHOR, "&b拓芙物品 &c- 作弊模式"));

    public static void setup(XinziTech inst) {
        XINZI_MAIN_CATEGORY.register(inst);
        XINZI_CHEAT.register(inst);
    }

}
