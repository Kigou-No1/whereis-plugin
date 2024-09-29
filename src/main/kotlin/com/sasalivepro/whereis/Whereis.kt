package com.sasalivepro.whereis

import org.bukkit.plugin.java.JavaPlugin

class Whereis : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        println("Plugin was loaded!")
        getCommand("whereis")?.setExecutor(WhereIsCommand)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
