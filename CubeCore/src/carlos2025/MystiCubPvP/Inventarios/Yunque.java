package carlos2025.MystiCubPvP.Inventarios;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Yunque implements Listener{
	
	@SuppressWarnings({ "deprecation"})
	public void crearInventario(Player Jugador){
		
		Inventory inv = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKits"));
		ItemStack item = new ItemStack(160, 1, (short) 5);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &61"));
		item.setItemMeta(meta);
		inv.setItem(0, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &62"));
		item.setItemMeta(meta);
		inv.setItem(1, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &63"));
		item.setItemMeta(meta);
		inv.setItem(2, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &64"));
		item.setItemMeta(meta);
		inv.setItem(3, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &65"));
		item.setItemMeta(meta);
		inv.setItem(4, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &66"));
		item.setItemMeta(meta);
		inv.setItem(5, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &67"));
		inv.setItem(6, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&&aGuardar Inventario &68"));
		item.setItemMeta(meta);
		inv.setItem(7, item);
		
		item = new ItemStack(160, 1, (short) 5);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &69"));
		item.setItemMeta(meta);
		inv.setItem(8, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(9, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(10, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(11, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(12, item);

		item = new ItemStack(102, 1);
		inv.setItem(13, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(14, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(15, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(16, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(17, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &61"));
		item.setItemMeta(meta);
		inv.setItem(18, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &62"));
		item.setItemMeta(meta);
		inv.setItem(19, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &63"));
		item.setItemMeta(meta);
		inv.setItem(20, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &64"));
		item.setItemMeta(meta);
		inv.setItem(21, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &65"));
		item.setItemMeta(meta);
		inv.setItem(22, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &66"));
		item.setItemMeta(meta);
		inv.setItem(23, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &67"));
		item.setItemMeta(meta);
		inv.setItem(24, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &68"));
		item.setItemMeta(meta);
		inv.setItem(25, item);
		
		item = new ItemStack(160, 1, (short) 11);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &69"));
		item.setItemMeta(meta);
		inv.setItem(26, item);

		item = new ItemStack(102, 1);
		inv.setItem(27, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(28, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(29, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(30, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(31, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(32, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(33, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(34, item);
		
		item = new ItemStack(102, 1);
		inv.setItem(35, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &61"));
		item.setItemMeta(meta);
		inv.setItem(36, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &62"));
		item.setItemMeta(meta);
		inv.setItem(37, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &63"));
		item.setItemMeta(meta);
		inv.setItem(38, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &64"));
		item.setItemMeta(meta);
		inv.setItem(39, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &65"));
		item.setItemMeta(meta);
		inv.setItem(40, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &66"));
		item.setItemMeta(meta);
		inv.setItem(41, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &67"));
		item.setItemMeta(meta);
		inv.setItem(42, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &68"));
		item.setItemMeta(meta);
		inv.setItem(43, item);
		
		item = new ItemStack(160, 1, (short) 14);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &69"));
		item.setItemMeta(meta);
		inv.setItem(44, item);
		
		Jugador.openInventory(inv);
		return;
	}
    @EventHandler
	@SuppressWarnings("deprecation")
	public void Interactuar(PlayerInteractEvent event) {
    	if((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock() != null && event.getClickedBlock().getType() == Material.ANVIL)) {
			event.setCancelled(true);
			Player jugador = (Player) event.getPlayer();
			Inventory inv = Bukkit.createInventory(null, 45, ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKits"));
			ItemStack item = new ItemStack(160, 1, (short) 5);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &61"));
			item.setItemMeta(meta);
			inv.setItem(0, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &62"));
			item.setItemMeta(meta);
			inv.setItem(1, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &63"));
			item.setItemMeta(meta);
			inv.setItem(2, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &64"));
			item.setItemMeta(meta);
			inv.setItem(3, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &65"));
			item.setItemMeta(meta);
			inv.setItem(4, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &66"));
			item.setItemMeta(meta);
			inv.setItem(5, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &67"));
			inv.setItem(6, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&&aGuardar Inventario &68"));
			item.setItemMeta(meta);
			inv.setItem(7, item);
			
			item = new ItemStack(160, 1, (short) 5);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aGuardar Inventario &69"));
			item.setItemMeta(meta);
			inv.setItem(8, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(9, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(10, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(11, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(12, item);

			item = new ItemStack(102, 1);
			inv.setItem(13, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(14, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(15, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(16, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(17, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &61"));
			item.setItemMeta(meta);
			inv.setItem(18, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &62"));
			item.setItemMeta(meta);
			inv.setItem(19, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &63"));
			item.setItemMeta(meta);
			inv.setItem(20, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &64"));
			item.setItemMeta(meta);
			inv.setItem(21, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &65"));
			item.setItemMeta(meta);
			inv.setItem(22, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &66"));
			item.setItemMeta(meta);
			inv.setItem(23, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &67"));
			item.setItemMeta(meta);
			inv.setItem(24, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &68"));
			item.setItemMeta(meta);
			inv.setItem(25, item);
			
			item = new ItemStack(160, 1, (short) 11);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9Cargar Inventario &69"));
			item.setItemMeta(meta);
			inv.setItem(26, item);

			item = new ItemStack(102, 1);
			inv.setItem(27, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(28, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(29, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(30, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(31, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(32, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(33, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(34, item);
			
			item = new ItemStack(102, 1);
			inv.setItem(35, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &61"));
			item.setItemMeta(meta);
			inv.setItem(36, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &62"));
			item.setItemMeta(meta);
			inv.setItem(37, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &63"));
			item.setItemMeta(meta);
			inv.setItem(38, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &64"));
			item.setItemMeta(meta);
			inv.setItem(39, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &65"));
			item.setItemMeta(meta);
			inv.setItem(40, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &66"));
			item.setItemMeta(meta);
			inv.setItem(41, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &67"));
			item.setItemMeta(meta);
			inv.setItem(42, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &68"));
			item.setItemMeta(meta);
			inv.setItem(43, item);
			
			item = new ItemStack(160, 1, (short) 14);
			meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Borrar Inventario &69"));
			item.setItemMeta(meta);
			inv.setItem(44, item);
			
			jugador.openInventory(inv);
			return;
    	}
    }
        @EventHandler
        public void Inventory(InventoryClickEvent event){
            Inventory inv = event.getInventory();
            if(inv.getName().equals(ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKits"))){
            	if(event.getCurrentItem() == null || event.getSlotType() == null || event.getCurrentItem().getType() == Material.AIR) {
            		event.setCancelled(true);
            		return;
            	}else{
            		event.setCancelled(true);
            		return;
            	}
            	
            }
          
    }
}