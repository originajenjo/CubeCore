package carlos2025.MystiCubPvP.Eventos;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import carlos2025.MystiCubPvP.MystiCub;

public class Entrar implements Listener{
	private MystiCub plugin;
	
	public Entrar(MystiCub plugin){
		this.plugin = plugin;
		
	}
	
	@EventHandler
	public void alEntrar(PlayerJoinEvent event){
		Player jugador = event.getPlayer();
		
		if (jugador.isOp() && !(plugin.getVersion().equals(plugin.getLastestVersion()))){
			jugador.sendMessage(plugin.nombre+" Hay una nueva versión disponible. "+ChatColor.YELLOW+"("+ChatColor.GRAY+plugin.getLastestVersion()+ChatColor.YELLOW+")");
            jugador.sendMessage(plugin.nombre+" Puedes descargarlo en: "+ChatColor.WHITE+"https://goo.gl/Q5jrB1");
		}
		return;
	}
}