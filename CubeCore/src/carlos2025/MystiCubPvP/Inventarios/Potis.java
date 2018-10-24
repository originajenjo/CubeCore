package carlos2025.MystiCubPvP.Inventarios;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class Potis implements Listener{
	
	public void show(Player Jugador){
		
		Inventory inv = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKit Pociones"));
		ItemStack item = new ItemStack(Material.POTION, 1, (short) 16421);
		ItemMeta meta = item.getItemMeta();
		List<String> lore = new ArrayList<String>();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5Inventario full"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7&lLlena tu inventario de pots"));
		Potion pot = new Potion(1);
		meta.setLore(lore);
		item.setItemMeta(meta);
		pot.setType(PotionType.INSTANT_HEAL);
		pot.setSplash(true);
		pot.apply(item);
		inv.setItem(0, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16426);
		inv.setItem(3, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16388);
		inv.setItem(4, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(5, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(6, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8258);
		inv.setItem(8, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16426);
		inv.setItem(12, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16388);
		inv.setItem(13, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(14, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(15, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16421);
		inv.setItem(18, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16421);
		inv.setItem(19, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16421);
		inv.setItem(20, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16426);
		inv.setItem(21, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16388);
		inv.setItem(22, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(23, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(24, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8259);
		inv.setItem(26, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16421);
		inv.setItem(27, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16421);
		inv.setItem(28, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16421);
		inv.setItem(29, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16426);
		inv.setItem(30, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 16388);
		inv.setItem(31, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(32, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8226);
		inv.setItem(33, item);
		
		item = new ItemStack(Material.POTION, 1, (short) 8259);
		inv.setItem(35, item);
		
		Jugador.openInventory(inv);
		return;
}
    	
    @EventHandler
    public void Interactuar(InventoryClickEvent event) {
        ItemStack click = event.getCurrentItem();
        Player jugador = (Player) event.getWhoClicked();
        Inventory inv = event.getInventory();
        if (inv.getName().equals(ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKit Pociones"))) {
            if (click == null || click.getType() == Material.AIR) {
                return;
            }
            if (event.getSlot() == 0) {
                event.setCancelled(true);
                jugador.playSound(jugador.getLocation(), Sound.GLASS, 10, 0);
                for (int slot = 0; slot < jugador.getInventory().getSize(); slot++) {
                    if (jugador.getInventory().getItem(slot) == null) {
                        jugador.getInventory().setItem(slot, new Potion(PotionType.INSTANT_HEAL, 2).splash().toItemStack(1));
                    }
                }
                jugador.updateInventory();
                return;
            }
            return;
        }
    }
    }