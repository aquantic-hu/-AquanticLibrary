package hu.aquantic.aqualib;

import org.bukkit.plugin.java.JavaPlugin;

public class LibComplex {
    private static JavaPlugin plugin;

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    public static void setPlugin(final JavaPlugin plugin) {
        LibComplex.plugin = plugin;
    }
}
