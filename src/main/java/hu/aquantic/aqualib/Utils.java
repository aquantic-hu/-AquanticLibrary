package hu.aquantic.aqualib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

public class Utils {

    public static void AquaLog(@NotNull Integer level, String message) {
        switch (level) {
            case 0 -> Bukkit.getLogger().log(Level.INFO, message);
            case 1 -> Bukkit.getLogger().log(Level.WARNING, message);
            case 2 -> Bukkit.getLogger().log(Level.SEVERE, message);
            default -> throw new IllegalStateException("[!! HIBA !!] Hibásan lett megadva az 'AquaLog' függvény! -> " + level);
        }
    }
    public static void AquaText(@NotNull Integer type, String message, @NotNull CommandSender sender) {
        Player player = (Player) sender;

        switch (type) {
            case 0 -> player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            case 1 -> Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', message));
            default -> throw new IllegalStateException("[!! HIBA !!] Hibásan lett megadva az 'AquaText' függvény! -> " + type);
        }
    }
}
