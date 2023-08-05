package hu.aquantic.aqualib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Utils {
    public static void AquaLog(Integer level, String message) {
        switch (level) {
            case 0 -> Bukkit.getLogger().log(Level.INFO,    ChatColor.translateAlternateColorCodes('&', message));
            case 1 -> Bukkit.getLogger().log(Level.WARNING, ChatColor.translateAlternateColorCodes('&', message));
            case 2 -> Bukkit.getLogger().log(Level.SEVERE,  ChatColor.translateAlternateColorCodes('&', message));
            default -> throw new IllegalStateException("Nincs megadva a logolási fokozat! -> " + level);
        }
    }
    public static void AquaText(Integer type, String message, CommandSender sender) {
        Player p = (Player) sender;
        switch (type) {
            case 1 -> p.sendMessage(message);
            case 2 -> Bukkit.broadcastMessage(message);
            case 3 -> p.sendPlainMessage(message);
            default -> throw new IllegalStateException("Hibásan lett megadva az 'AquaText' függvény! -> " + type);
        }
    }
}
