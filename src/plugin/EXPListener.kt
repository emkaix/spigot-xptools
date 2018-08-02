package plugin

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerExpChangeEvent
import org.bukkit.event.player.PlayerJoinEvent

class EXPListener : Listener {
    @EventHandler
    fun onEvent(event: PlayerExpChangeEvent) {
        event.amount *= 2
        event.player.sendMessage("${ChatColor.GRAY}+${event.amount}XP")
    }
    @EventHandler
    fun onEvent(event: PlayerJoinEvent) {
        event.player.sendMessage("[XPTools 1.0]\n[Erhaltene XP verdoppelt]")
    }
}