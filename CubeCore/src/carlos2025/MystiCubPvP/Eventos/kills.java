package carlos2025.MystiCubPvP.Eventos;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import carlos2025.MystiCubPvP.MystiCub;

public class kills implements Listener{
	private MystiCub plugin;
	
	public kills(MystiCub plugin){
		this.plugin = plugin;
	}
	@EventHandler
	public void matarJugadores(EntityDeathEvent event) {
		Player killer = event.getEntity().getKiller();
		EntityType entidad = event.getEntityType();
		if(killer != null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PLAYER)) {
			FileConfiguration kills = plugin.getKills();
			kills.set("Players."+killer.getUniqueId()+".name", killer.getName());
			if(kills.contains("Players."+killer.getUniqueId()+".Playerskills")) {
				int cantidadkills = Integer.valueOf(kills.getString("Players."+killer.getUniqueId()+".Playerskills"));
				kills.set("Players."+killer.getUniqueId()+".Playerskills", cantidadkills+1);
				plugin.saveKills();
				return;
			}else {
				kills.set("Players."+killer.getUniqueId()+".Playerskills", 1);
				plugin.saveKills();
				return;
			}
		}
	}
}