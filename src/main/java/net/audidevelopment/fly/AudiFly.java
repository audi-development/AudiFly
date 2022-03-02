package net.audidevelopment.fly;

import me.ziue.api.chat.ChatUtil;
import me.ziue.api.command.CommandManager;
import net.audidevelopment.fly.command.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AudiFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadCommands();

        ChatUtil.loadPlugin();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadCommands() {
        new CommandManager(this);
        new FlyCommand();
    }

    public static AudiFly get(){
        return getPlugin(AudiFly.class);
    }
}
