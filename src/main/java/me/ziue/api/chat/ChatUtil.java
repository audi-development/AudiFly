package me.ziue.api.chat;

import lombok.experimental.UtilityClass;
import net.audidevelopment.fly.AudiFly;
import org.apache.commons.lang.WordUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class ChatUtil {

    public String LONG_LINE = "&7&m----------------------------------------";
    public String NORMAL_LINE = "&7&m-----------------------------";
    public String SHORT_LINE = "&7&m---------------";

    public String translate(String in) {
        return ChatColor.translateAlternateColorCodes('&', in);
    }

    public List<String> translate(List<String> in) {
        return in.stream().map(ChatUtil::translate).collect(Collectors.toList());
    }

    public String strip(String in) {
        return ChatColor.stripColor(in);
    }

    public void sender(CommandSender sender, String in) {
        sender.sendMessage(translate(in));
    }

    public void message(Player player, String in) {
        player.sendMessage(translate(in));
    }

    public void broadcast(String in) {
        Bukkit.broadcastMessage(translate(in));
    }

    public void log(String in) {
        Bukkit.getConsoleSender().sendMessage(translate(in));
    }

    public String capitalize(String str) {
        return WordUtils.capitalize(str);
    }

    public String toReadable(Enum<?> enu) {
        return WordUtils.capitalize(enu.name().replace("_", " ").toLowerCase());
    }

    public static void loadPlugin() {
        Bukkit.getConsoleSender().sendMessage(translate(" "));
        Bukkit.getConsoleSender().sendMessage(translate("     &4\u2764 &9&l" + AudiFly.get().getName() + " &4\u2764"));
        Bukkit.getConsoleSender().sendMessage(translate(""));
        Bukkit.getConsoleSender().sendMessage(translate(" &7\u27A5 &9Author&7: &f" + AudiFly.get().getDescription().getAuthors().toString().replace("[", "").replace("]", "")));
        Bukkit.getConsoleSender().sendMessage(translate(" &7\u27A5 &9Version&7: &f" + AudiFly.get().getDescription().getVersion()));
        Bukkit.getConsoleSender().sendMessage(translate(" "));
        Bukkit.getConsoleSender().sendMessage(translate(" &7\u27A5 &9Spigot&7: &f" + AudiFly.get().getServer().getName()));
        Bukkit.getConsoleSender().sendMessage(translate(" "));
        Bukkit.getConsoleSender().sendMessage(ChatUtil.NORMAL_LINE);
    }

}
