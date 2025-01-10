package ru.moose23967.obrikosovo

import org.bukkit.Particle
import org.bukkit.Sound
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class EnderChestCommandExecutor : CommandExecutor {
    override fun onCommand(
        commandSender: CommandSender, command: Command, label: String, args: Array<out String>?
    ): Boolean {
        if (commandSender !is Player) {
            return false;
        }

        commandSender.openInventory(commandSender.enderChest);
        commandSender.playSound(commandSender.location, Sound.BLOCK_ENDER_CHEST_OPEN, 10.toFloat(), 1.toFloat());

        return true;
    }
}