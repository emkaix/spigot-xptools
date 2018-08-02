package plugin

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(EXPListener(), this)
    }
}
