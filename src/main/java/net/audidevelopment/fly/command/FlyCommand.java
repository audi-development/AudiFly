package net.audidevelopment.fly.command;

import me.ziue.api.command.BaseCommand;
import me.ziue.api.command.Command;
import me.ziue.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class FlyCommand extends BaseCommand {

    @Command(name = "fly", permission = "audi.fly")
    @Override
    public void onCommand(CommandArgs command) {
        Player player = command.getPlayer();

        if(player.getAllowFlight()) {
            player.setFlying(false);
            player.setAllowFlight(false);
        } else {
            player.setAllowFlight(true);
        }
    }
}
