package carlos2025.MystiCubPvP.Inventarios;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import carlos2025.MystiCubPvP.MystiCub;

public class PvP implements Listener{
	
	private MystiCub main;

	public PvP(MystiCub main) {
		this.main = main;
		
	}
	
	@SuppressWarnings("deprecation")
	public void crearInventario(Player Jugador){
		Inventory inv = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKit Armor"));
		ItemStack item = new ItemStack(264, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bArmadura de Diamante"));
		item.setItemMeta(meta);
		inv.setItem(0, item);
		
		item = new ItemStack(310, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(1, item);
		
		item = new ItemStack(311, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(2, item);
		
		item = new ItemStack(312, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(3, item);
		
		item = new ItemStack(313, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(4, item);
		
		item = new ItemStack(368, 16);
		inv.setItem(5, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(6, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(7, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(8, item);
		
		item = new ItemStack(Material.IRON_FENCE, 1);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eArmadura de Malla"));
		item.setItemMeta(meta);
		inv.setItem(9, item);
		
		item = new ItemStack(302, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(10, item);
		
		item = new ItemStack(303, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(11, item);
		
		item = new ItemStack(304, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(12, item);
		
		item = new ItemStack(305, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(13, item);
		
		item = new ItemStack(353, 64);
		inv.setItem(14, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(15, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(16, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(17, item);
		
		item = new ItemStack(334, 1);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eArmadura de Cuero"));
		item.setItemMeta(meta);
		inv.setItem(18, item);
		
		item = new ItemStack(298, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(19, item);
		
		item = new ItemStack(299, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(20, item);
		
		item = new ItemStack(300, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(21, item);
		
		item = new ItemStack(301, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(22, item);
		
		item = new ItemStack(278, 1);
		item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
		inv.setItem(23, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(24, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(25, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(26, item);
		
		item = new ItemStack(Material.GOLD_INGOT, 1);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eArmadura de Oro"));
		item.setItemMeta(meta);
		inv.setItem(27, item);
		
		item = new ItemStack(314, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(28, item);
		
		item = new ItemStack(315, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(29, item);
		
		item = new ItemStack(316, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(30, item);
		
		item = new ItemStack(317, 1);
		item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		inv.setItem(31, item);
		
		item = new ItemStack(279, 1);
		item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
		inv.setItem(32, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(33, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(34, item);
		
		item = new ItemStack(283, 1);
		inv.setItem(35, item);
		
		item = new ItemStack(396, 64);
		inv.setItem(36, item);
		
		item = new ItemStack(364, 64);
		inv.setItem(37, item);
		
		item = new ItemStack(393, 64);
		inv.setItem(38, item);
		
		item = new ItemStack(262, 64);
		inv.setItem(39, item);
		
		item = new ItemStack(261, 1);
		item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
		item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
		item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		inv.setItem(40, item);
		
		item = new ItemStack(276, 1);
		item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
		inv.setItem(41, item);
		
		item = new ItemStack(172, 64);
		inv.setItem(42, item);
		
		item = new ItemStack(159, 64, (short) 1);
		inv.setItem(43, item);
		
		item = new ItemStack(159, 64, (short) 9);
		inv.setItem(44, item);
		
		item = new ItemStack(288, 64);
		inv.setItem(45, item);
		
		item = new ItemStack(370, 64);
		inv.setItem(46, item);
		
		item = new ItemStack(Material.BLAZE_ROD, 64);
		inv.setItem(47, item);
		
		item = new ItemStack(Material.IRON_INGOT, 64);
		inv.setItem(48, item);
		
		item = new ItemStack(378, 64);
		inv.setItem(49, item);
		
		item = new ItemStack(376, 64);
		inv.setItem(50, item);
		
		item = new ItemStack(24, 64, (short) 1);
		inv.setItem(51, item);
		
		item = new ItemStack(24, 64, (short) 2);
		inv.setItem(52, item);
		
		item = new ItemStack(17, 64);
		inv.setItem(53, item);
		
		Jugador.openInventory(inv);
		return;
		
	}

    @EventHandler
	@SuppressWarnings("deprecation")
	public void Interactuar(PlayerInteractEvent event) {
    	if((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock() != null && event.getClickedBlock().getType() == Material.CHEST)) {
			event.setCancelled(true);
			Inventory inv = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&3&lCube&e&lCore &7- &fKit Armor"));
				Player jugador = (Player) event.getPlayer();
				jugador.playSound(jugador.getLocation(), Sound.CHEST_OPEN, 10, 0);
				ItemStack item = new ItemStack(264, 1);
				ItemMeta meta = item.getItemMeta();
				meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bArmadura de Diamante"));
				item.setItemMeta(meta);
				inv.setItem(0, item);
				
				item = new ItemStack(310, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(1, item);
				
				item = new ItemStack(311, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(2, item);
				
				item = new ItemStack(312, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(3, item);
				
				item = new ItemStack(313, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(4, item);
				
				item = new ItemStack(368, 16);
				inv.setItem(5, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(6, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(7, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(8, item);
				
				item = new ItemStack(Material.IRON_FENCE, 1);
				meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eArmadura de Malla"));
				item.setItemMeta(meta);
				inv.setItem(9, item);
				
				item = new ItemStack(302, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(10, item);
				
				item = new ItemStack(303, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(11, item);
				
				item = new ItemStack(304, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(12, item);
				
				item = new ItemStack(305, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(13, item);
				
				item = new ItemStack(353, 64);
				inv.setItem(14, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(15, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(16, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(17, item);
				
				item = new ItemStack(334, 1);
				meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eArmadura de Cuero"));
				item.setItemMeta(meta);
				inv.setItem(18, item);
				
				item = new ItemStack(298, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(19, item);
				
				item = new ItemStack(299, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(20, item);
				
				item = new ItemStack(300, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(21, item);
				
				item = new ItemStack(301, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(22, item);
				
				item = new ItemStack(278, 1);
				item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
				inv.setItem(23, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(24, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(25, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(26, item);
				
				item = new ItemStack(Material.GOLD_INGOT, 1);
				meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eArmadura de oro"));
				item.setItemMeta(meta);
				inv.setItem(27, item);
				
				item = new ItemStack(314, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(28, item);
				
				item = new ItemStack(315, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(29, item);
				
				item = new ItemStack(316, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(30, item);
				
				item = new ItemStack(317, 1);
				item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				inv.setItem(31, item);
				
				item = new ItemStack(279, 1);
				item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
				inv.setItem(32, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(33, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(34, item);
				
				item = new ItemStack(283, 1);
				inv.setItem(35, item);
				
				item = new ItemStack(396, 64);
				inv.setItem(36, item);
				
				item = new ItemStack(364, 64);
				inv.setItem(37, item);
				
				item = new ItemStack(393, 64);
				inv.setItem(38, item);
				
				item = new ItemStack(262, 64);
				inv.setItem(39, item);
				
				item = new ItemStack(261, 1);
				item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
				item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
				item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
				inv.setItem(40, item);
				
				item = new ItemStack(276, 1);
				item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
				inv.setItem(41, item);
				
				item = new ItemStack(172, 64);
				inv.setItem(42, item);
				
				item = new ItemStack(159, 64, (short) 1);
				inv.setItem(43, item);
				
				item = new ItemStack(159, 64, (short) 9);
				inv.setItem(44, item);
				
				item = new ItemStack(288, 64);
				inv.setItem(45, item);
				
				item = new ItemStack(370, 64);
				inv.setItem(46, item);
				
				item = new ItemStack(Material.BLAZE_ROD, 64);
				inv.setItem(47, item);
				
				item = new ItemStack(Material.IRON_INGOT, 64);
				inv.setItem(48, item);
				
				item = new ItemStack(378, 64);
				inv.setItem(49, item);
				
				item = new ItemStack(376, 64);
				inv.setItem(50, item);
				
				item = new ItemStack(24, 64, (short) 1);
				inv.setItem(51, item);
				
				item = new ItemStack(24, 64, (short) 2);
				inv.setItem(52, item);
				
				item = new ItemStack(17, 64);
				inv.setItem(53, item);
				
				jugador.openInventory(inv);
				return;
			
		}
	}
    
    @SuppressWarnings("deprecation") //no sacar los item del inv
    @EventHandler
    public void onInteract(InventoryClickEvent event){
        FileConfiguration messages = main.getMessages();
        String titulo = ChatColor.translateAlternateColorCodes('&', messages.getString("Messages.InvPvP"));
        String tituloo = ChatColor.stripColor(titulo);
    if(!ChatColor.stripColor(event.getInventory().getName()).equals(tituloo)) {   
        
    }else if(event.getCurrentItem() == null) return; //Probando el else
        ItemStack click = event.getCurrentItem();
        Player jugador = (Player) event.getWhoClicked();
        
        if(event.getSlotType() == SlotType.ARMOR) {
            for (ItemStack items : event.getWhoClicked().getInventory().getArmorContents()) {
                if (items.getType().name().contains("LEATHER") && !event.getWhoClicked().hasPotionEffect(PotionEffectType.SPEED)) {
                    event.getWhoClicked().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999, 2), true);
                } else if(event.getWhoClicked().hasPotionEffect(PotionEffectType.SPEED)) {
                    event.getWhoClicked().removePotionEffect(PotionEffectType.SPEED);
        
        if(click.getType() == Material.DIAMOND){
        
        jugador.getInventory().setHelmet(null);
        jugador.getInventory().setChestplate(null);
        jugador.getInventory().setLeggings(null);
        jugador.getInventory().setBoots(null);
        jugador.playSound(jugador.getLocation(), Sound.BAT_TAKEOFF, 10, 0);
        for (PotionEffect pt : jugador.getActivePotionEffects()) {
        jugador.removePotionEffect(pt.getType());
        	}
        
        ItemStack item = new ItemStack(310, 1); //Item for test
        //item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        //item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        jugador.getInventory().setHelmet(item);
        ItemMeta meta = item.getItemMeta();
        item.setItemMeta(meta);
        jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Armadura puesta"));
       
        item = new ItemStack(311, 1);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        jugador.getInventory().setChestplate(item);
       
        item = new ItemStack(312, 1);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        jugador.getInventory().setLeggings(item);
       
        item = new ItemStack(313, 1);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
        jugador.getInventory().setBoots(item);
        event.setCancelled(true);
        return;
       
        }else if(click.getType() == Material.IRON_FENCE){
                	
            jugador.getInventory().setHelmet(null);
            jugador.getInventory().setChestplate(null);
            jugador.getInventory().setLeggings(null);
            jugador.getInventory().setBoots(null);
            jugador.playSound(jugador.getLocation(), Sound.BAT_TAKEOFF, 10, 0);
            for (PotionEffect pt : jugador.getActivePotionEffects()) {
         	   jugador.removePotionEffect(pt.getType());
         	}
            
            ItemStack item = new ItemStack(302, 1);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setHelmet(item);
            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Armadura puesta"));
           
            item = new ItemStack(303, 1);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setChestplate(item);
           
            item = new ItemStack(304, 1);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setLeggings(item);
           
            item = new ItemStack(305, 1);
            //jugador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2), true);
            //jugador.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1), true);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setBoots(item);
            event.setCancelled(true);
            return;
           
        }else if(click.getType() == Material.LEATHER) {
            	
            jugador.getInventory().setHelmet(null);
            jugador.getInventory().setChestplate(null);
            jugador.getInventory().setLeggings(null);
            jugador.getInventory().setBoots(null);
            jugador.playSound(jugador.getLocation(), Sound.BAT_TAKEOFF, 10, 0);
            for (PotionEffect pt : jugador.getActivePotionEffects()) {
         	   jugador.removePotionEffect(pt.getType());
         	}
            
            ItemStack item = new ItemStack(298, 1);
            jugador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2), true);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setHelmet(item);
            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Armadura puesta"));
           
            item = new ItemStack(299, 1);
            jugador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2), true);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setChestplate(item);
           
            item = new ItemStack(300, 1);
            jugador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2), true);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setLeggings(item);
           
            item = new ItemStack(301, 1);
            jugador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2), true);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setBoots(item);
            event.setCancelled(true);
            return;
           
        }else if(click.getType() == Material.GOLD_INGOT) {
           
            jugador.getInventory().setHelmet(null);
            jugador.getInventory().setChestplate(null);
            jugador.getInventory().setLeggings(null);
            jugador.getInventory().setBoots(null);
            jugador.playSound(jugador.getLocation(), Sound.BAT_TAKEOFF, 10, 0);
            for (PotionEffect pt : jugador.getActivePotionEffects()) {
         	   jugador.removePotionEffect(pt.getType());
         	}
            
            ItemStack item = new ItemStack(314, 1);
            //jugador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1), true);
            //jugador.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 3), true);
            //jugador.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, 0), true);
            //jugador.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1), true);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setHelmet(item);
            jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9Armadura puesta"));
           
            item = new ItemStack(315, 1);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setChestplate(item);
           
            item = new ItemStack(316, 1);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setLeggings(item);
           
            item = new ItemStack(317, 1);
            item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
            item.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
            jugador.getInventory().setBoots(item);
            event.setCancelled(true);
            return;
        			}
                }
        	}
        }
    }
}