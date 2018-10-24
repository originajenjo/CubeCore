package carlos2025.MystiCubPvP.otros;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import carlos2025.MystiCubPvP.MystiCub;

public class ScoreBoard implements Listener{

	@EventHandler //Scoreboard
	public void onJoin(PlayerJoinEvent e) {
		
		MystiCub.sendScoreboard(e.getPlayer());
		
		new BukkitRunnable() {
			
			public void run() {
				
				if(e.getPlayer().isOnline()) {
				MystiCub.sendScoreboard(e.getPlayer());
			} else {
				cancel();
				}
			}
		}.runTaskTimer(MystiCub.getInstance(), 100L, 100L);
	}
}
