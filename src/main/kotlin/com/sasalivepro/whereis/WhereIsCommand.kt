package com.sasalivepro.whereis

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object WhereIsCommand: CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        sender.server.onlinePlayers.find { it.name == args?.get(0) }?.let {
            sender.sendMessage(ChatColor.GREEN.toString() + "${it.name} is at ${it.location}")
        } ?: sender.sendMessage(ChatColor.RED.toString() + "[失敗] プレイヤーが見つかりませんでした。")
        return true
    }
}
