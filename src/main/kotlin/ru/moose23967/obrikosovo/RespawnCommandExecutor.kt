package ru.moose23967.obrikosovo

import org.bukkit.ChatColor
import org.bukkit.Sound
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class RespawnCommandExecutor : CommandExecutor {
    override fun onCommand(
        commandSender: CommandSender, command: Command, label: String, args: Array<out String>?
    ): Boolean {
        if (commandSender !is Player) {
            return false;
        }

        val location = commandSender.respawnLocation;

        if (location == null) {
            commandSender.sendMessage("${ChatColor.RED}У тебя не установлена точка возрождения");

            return false;
        }

        commandSender.teleport(location);
        commandSender.playSound(location, Sound.ENTITY_ENDER_EYE_DEATH, 10.toFloat(), 1.toFloat());

        return true;
    }
}