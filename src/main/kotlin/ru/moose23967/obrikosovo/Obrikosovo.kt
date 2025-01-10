package ru.moose23967.obrikosovo

import org.bukkit.plugin.java.JavaPlugin

class Obrikosovo : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        this.getCommand("enderchest")?.setExecutor(EnderChestCommandExecutor());
        this.getCommand("respawn")?.setExecutor(RespawnCommandExecutor());
        this.getCommand("spawn")?.setExecutor(SpawnCommandExecutor());
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
