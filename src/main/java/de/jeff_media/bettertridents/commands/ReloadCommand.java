package de.jeff_media.bettertridents.commands;

import de.jeff_media.bettertridents.Main;
import de.jeff_media.bettertridents.config.Permissions;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {

    private final Main main = Main.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {

        if(!sender.hasPermission(Permissions.RELOAD)) {
            sender.sendMessage(command.getPermissionMessage());
            return true;
        }

        main.reload();
        sender.sendMessage(ChatColor.DARK_GREEN + main.getDescription().getName() + " v" + main.getDescription().getVersion() + ChatColor.GREEN + " has been reloaded.");
        return true;
    }
}
