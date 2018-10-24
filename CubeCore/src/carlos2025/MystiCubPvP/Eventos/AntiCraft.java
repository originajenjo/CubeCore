package carlos2025.MystiCubPvP.Eventos;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import carlos2025.MystiCubPvP.MystiCub;

public class AntiCraft implements Listener{

	private MystiCub plugin;
	
	public AntiCraft(MystiCub plugin){
		this.plugin = plugin;

	}
	
    @EventHandler
    public void craftItem(PrepareItemCraftEvent e) {
    	HumanEntity human =  e.getView().getPlayer();
    	
    	if(human instanceof Player){
    	    Player jugador = (Player)human;
    	
		if (jugador.hasPermission("cub.reload")){
		FileConfiguration messages = plugin.getMessages();
		String mensaje = "Messages.Craft-Complete";
		jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString( mensaje)));
		
        Material itemType = e.getRecipe().getResult().getType();
        if(itemType==Material.CHEST||itemType==Material.WOOD_BUTTON||itemType==Material.STICK||
        itemType==Material.WORKBENCH||itemType==Material.WOOD_PLATE||itemType==Material.HOPPER) {
            e.getInventory().setResult(new ItemStack(Material.AIR));
            for(HumanEntity he:e.getViewers()) {
                if(he instanceof Player) {
                }else{
            		String mensaje1 = "Messages.Nopermiso-Craft";
                    ((Player)he).sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.nombre+messages.getString( mensaje1)));
					jugador.playSound(jugador.getLocation(), Sound.VILLAGER_NO, 1, 1);
                		}
                	}
                }
            }
        }
    }
}