package com.username.plugintemplate.api;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

/**
 * @author username
 * @since 2025-01-01
 */

public interface iCommandsRegister {

    /**
     * @param sender The object of the actor that send the command
     * @param command The actual command argument
     * @param alias the alias being used
     * @param args All arguments passed to the command, split via ' '
     * @return A list of possible and avaiable commands
     *
     */
    public List<String> tabComplete(CommandSender sender, Command command, String alias, String[] args);

    /**
     * @param sender The object of the actor that send the command
     * @param command The actual command argument
     * @param label The alias of the command used
     * @param args All arguments passed to the command, split via ' '
     * @return {@code true} if the command execute was successful
     *
     */
    public boolean execute(CommandSender sender, Command command, String label, String[] args);
}