package carlos2025.MystiCubPvP.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import carlos2025.MystiCubPvP.MystiCub;

public class mystery implements CommandExecutor{

	private MystiCub plugin;
	
	public mystery(MystiCub plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args){
		if(!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(plugin.nombre+" No puedes ejecutar comandos en la consola");
			return false;
		}else{
			Player jugador = (Player) sender;
			jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Scooby dooby doo, where are you?"));
			return true;
		}
	}
}