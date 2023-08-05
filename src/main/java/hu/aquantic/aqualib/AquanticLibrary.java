package hu.aquantic.aqualib;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import static hu.aquantic.aqualib.Utils.tell;

public final class AquanticLibrary extends JavaPlugin {

    @Override
    public void onEnable() {
        tell(Bukkit.getConsoleSender(), "[" + LibComplex.getPlugin().getName() + "] " + "&aAquanticLibrary betöltve!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}