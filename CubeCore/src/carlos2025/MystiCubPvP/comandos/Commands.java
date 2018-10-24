package carlos2025.MystiCubPvP.comandos;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import carlos2025.MystiCubPvP.MystiCub;
import carlos2025.MystiCubPvP.Inventarios.Potis;
import carlos2025.MystiCubPvP.Inventarios.PvP;
import carlos2025.MystiCubPvP.Inventarios.Yunque;
import me.clip.placeholderapi.PlaceholderAPI;

public class Commands implements CommandExecutor{
	
	private MystiCub plugin;
	
	public Commands(MystiCub plugin){
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args){
		if(!(sender instanceof Player)){
			Bukkit.getConsoleSender().sendMessage(plugin.nombre+" No puedes ejecutar comandos en la consola");
			return false;
			
		}else{
			// /cub (0 args)
		    // /cub help (1 args)
		    // /cub cualquier otra cosa (3 args)
			Player jugador = (Player) sender;
			if(args.length > 0){
				if(args [0].equalsIgnoreCase("help")){
					if (jugador.hasPermission("cub.help")){
						FileConfiguration messages = plugin.getMessages();
						List<String> mensaje = messages.getStringList("Messages.Help");
						for(int i=0;i<mensaje.size();i++){
							String texto = mensaje.get(i);
							jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(jugador,  texto)));
							}
						return true;
					
					}else{
						FileConfiguration messages = plugin.getMessages();
						String mensaje1 = "Messages.Nopermiso";
						jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje1)));
						jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
						return false;
					}
				}
				
				 if(args [0].equalsIgnoreCase("mystery")){
						jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Scooby dooby doo, where are you?"));
						return true;
					}
				
				if(args [0].equalsIgnoreCase("reload")){
					if (jugador.hasPermission("cub.reload")){
					plugin.reloadConfig();
					plugin.reloadKills();
					plugin.reloadMessages();
					FileConfiguration messages = plugin.getMessages();
					String mensaje = "Messages.Reload";
					jugador.playSound(jugador.getLocation(), Sound.LEVEL_UP, 1, 1);
					jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje)));
						return true;
					}else{
						FileConfiguration messages = plugin.getMessages();
						String mensaje1 = "Messages.Nopermiso";
						jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje1)));
						jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
						return false;
					}
			}
				
			if(args [0].equalsIgnoreCase("kills")){
				FileConfiguration Kills = plugin.getKills();
				if(jugador.hasPermission("cub.kills")){
					if(!Kills.contains("Players")){
						jugador.playSound(jugador.getLocation(), Sound.BURP, 1, 1);
						FileConfiguration messages = plugin.getMessages();
						List<String> mensaje = messages.getStringList("Messages.Kills-None");
						for(int i=0;i<mensaje.size();i++){
							String texto = mensaje.get(i);
							jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(jugador,  texto)));
							}
						return true;
					}else{
					if(Kills.contains("Players."+jugador.getUniqueId()+".Playerskills")) {
						int cantidadkills = Integer.valueOf(Kills.getString("Players."+jugador.getUniqueId()+".Playerskills"));
						jugador.playSound(jugador.getLocation(), Sound.BURP, 1, 1);
						FileConfiguration messages = plugin.getMessages();
						List<String> mensaje = messages.getStringList("Messages.Kills-Cantidad");
						for(int i=0;i<mensaje.size();i++){
							String texto = mensaje.get(i);
							jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(jugador, texto.replace("%kills%", String.valueOf(cantidadkills)))));
							}
							return true;
					}else {
						jugador.playSound(jugador.getLocation(), Sound.BURP, 1, 1);
						FileConfiguration messages = plugin.getMessages();
						List<String> mensaje = messages.getStringList("Messages.Kills-None");
						for(int i=0;i<mensaje.size();i++){
							String texto = mensaje.get(i);
							jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(jugador,  texto)));
							}
							return true;
						}
					}
				}else{
					FileConfiguration messages = plugin.getMessages();
					String mensaje1 = "Messages.Nopermiso";
					jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje1)));
					jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
					return false;
				}
			}
				
				 if(args [0].equalsIgnoreCase("pvp")){
					if(jugador.hasPermission("cub.use")){
					PvP Inv = new PvP(plugin);
					Inv.crearInventario(jugador);
					jugador.playSound(jugador.getLocation(), Sound.CHEST_OPEN, 10, 0);
					return true;
					}else{
						FileConfiguration messages = plugin.getMessages();
						String mensaje1 = "Messages.Nopermiso";
						jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje1)));
						jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
						return false;
					}
				}
				 
				 if(args [0].equalsIgnoreCase("potis")){
					if(jugador.hasPermission("cub.use")){
					Potis Inv = new Potis();
					jugador.playSound(jugador.getLocation(), Sound.SLIME_ATTACK, 10, 0);
					Inv.show(jugador);
					return true;
					}else{
						FileConfiguration messages = plugin.getMessages();
						String mensaje1 = "Messages.Nopermiso";
						jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje1)));
						jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
						return false;
						}
					
					}
					
				 if(args [0].equalsIgnoreCase("guardar")){
					if(jugador.hasPermission("cub.use")){
					Yunque Inv = new Yunque();
					jugador.playSound(jugador.getLocation(), Sound.ANVIL_LAND, 3, 5);
					Inv.crearInventario(jugador);
					return true;
					
					}else{
						
						FileConfiguration messages = plugin.getMessages();
						String mensaje1 = "Messages.Nopermiso";
						jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString(mensaje1)));
						jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
						return false;
					}
					
			}else{
				jugador.sendMessage(plugin.nombre+ChatColor.RED+" Ese comando no existe!");
				jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
				return true;
				
			}
				
			}else{
			jugador.sendMessage(plugin.nombre+" Usa /cub help para ver la lista de comandos");
			return true;
			
			}
		}
	}
}