package io.github.shixinzia.xinzitech;

import java.io.File;

import io.github.shixinzia.xinzitech.categories.Groups;
import io.github.shixinzia.xinzitech.commands.GiveRecipe;
import io.github.shixinzia.xinzitech.commands.PrintItem;
import io.github.shixinzia.xinzitech.commands.SetData;
import io.github.shixinzia.xinzitech.items.machine.Machines;
import io.github.shixinzia.xinzitech.items.materials.Materials;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPluginLoader;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;
import io.github.mooy1.infinitylib.metrics.charts.SimplePie;

import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;

public final class XinziTech extends AbstractAddon {

    public XinziTech(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "shixinzia", "xinzitech", "master", "auto-update");
    }

    public XinziTech() {
        super("shixinzia", "xinzitech", "master", "auto-update");
    }

    @Override
    protected void enable() {
        Metrics metrics = new Metrics(this, 8992);
        String autoUpdates = String.valueOf(false);
        metrics.addCustomChart(new SimplePie("auto_updates", () -> autoUpdates));

        if (getConfig().getBoolean("auto-update") &&
            getDescription().getVersion().startsWith("Build")) {
            new GuizhanBuildsUpdater(this, getFile(), "shixinzia", "xinzitech", "master", false, "zh-CN").start();
        }

        getAddonCommand()
            .addSub(new GiveRecipe())
            .addSub(new SetData())
            .addSub(new PrintItem());

        Groups.setup(this);
        Materials.setup(this);
        Machines.setup(this);

    }

    @Override
    public void disable() {
    }

}
