package carlos2025.MystiCubPvP.Eventos;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import carlos2025.MystiCubPvP.MystiCub;

public class DropIngots implements Listener{
	
	private MystiCub main;
	
	public DropIngots(MystiCub main){
		this.main = main;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void DropHeal(EntityDeathEvent event) {
		Player jugador = event.getEntity().getKiller();
		Entity entidad = event.getEntity();
		
		FileConfiguration config = main.getConfig();
		String path = "Config.Drop-Items";
		if(config.getString(path).equals(true)){
			
		if(entidad.getType().equals(EntityType.PLAYER)){
				List<ItemStack> drops = event.getDrops();
				drops.clear();
				ItemStack item = new ItemStack(397,1,(short) 3);
				item = new ItemStack(Material.GOLD_INGOT, 8);
				SkullMeta meta = (SkullMeta) item.getItemMeta();
				meta.setOwner(jugador.getName());
				drops.add(item);
				for (ItemStack dropitems : event.getDrops()){
				    entidad.getWorld().dropItemNaturally(jugador.getLocation(), dropitems);
				}
			}
		}
	}
}