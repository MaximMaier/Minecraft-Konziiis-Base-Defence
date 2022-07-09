package de.konziiis.minecraftkonziiisbasedefence;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor {

    @SuppressWarnings("unused")
    private MinecraftKonziiisBaseDefence plugin;

    public HelloCommand(MinecraftKonziiisBaseDefence plugin) {
        this.plugin = plugin;
        plugin.getCommand("hello").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if((commandSender instanceof Player) ) {
            commandSender.sendMessage("Only players may execute this command");
        }
        return false;
    }
}
