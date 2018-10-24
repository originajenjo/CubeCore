package carlos2025.MystiCubPvP;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import carlos2025.MystiCubPvP.Eventos.AntiCraft;
import carlos2025.MystiCubPvP.Eventos.DropIngots;
//import carlos2025.MystiCubPvP.Eventos.DropIngots;
import carlos2025.MystiCubPvP.Eventos.Entrar;
import carlos2025.MystiCubPvP.Eventos.kills;
import carlos2025.MystiCubPvP.Inventarios.Potis;
import carlos2025.MystiCubPvP.Inventarios.PvP;
import carlos2025.MystiCubPvP.Inventarios.Yunque;
import carlos2025.MystiCubPvP.comandos.Commands;
import carlos2025.MystiCubPvP.comandos.mystery;
import carlos2025.MystiCubPvP.otros.ScoreBoard;
import me.clip.placeholderapi.PlaceholderAPI;

public class MystiCub extends JavaPlugin implements Listener{
	private FileConfiguration Kills = null;
	private File KillsFile = null;
	public String rutaMessages;
	public String rutaConfig;
	private FileConfiguration messages = null;
	private File messagesFile = null;
	private Potis Potis;
	
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String latestversion;
	public String nombre = ChatColor.GOLD+"["+ChatColor.AQUA+pdffile.getName()+ChatColor.GOLD+"]"; //getConfig().getString("prefix").replace("&", "§");
    
	private static Plugin instance;
	
	public static Plugin getInstance() {
		   return instance;
		}
	
	public static ArrayList<Player> jugador = new ArrayList<Player>();
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+" ---------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+" "+nombre+""+" Ha sido activado version: "+version+"");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+" Plugin creador por MystiCub NETWORK - Carlos2025");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+" ---------------------------------------------------");
	    Bukkit.getServer().getPluginManager().registerEvents(this, this);
        Potis = new Potis();
        instance = this;
		registrarComandos();
		registerConfig();
		registerKills();
		registerMessages();
		checkearMessages();
		registerEvents();
		checkeoUpdate();
		
		//Esto es para hacer la goldenhead
		ItemStack apple = new ItemStack(Material.GOLDEN_APPLE, 1);
		ItemMeta applem = apple.getItemMeta();
		applem.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lGolden Head"));
		apple.setItemMeta(applem);
		
		ShapedRecipe goldenhead = new ShapedRecipe(apple);
		goldenhead.shape(new String[] {"@@@", "@#@","@@@"});
		goldenhead.setIngredient('@', Material.GOLD_INGOT);
		goldenhead.setIngredient('#', Material.SKULL_ITEM, 3);
		Bukkit.getServer().addRecipe(goldenhead);

        if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
		Plugin plugin = Bukkit.getPluginManager().getPlugin("PlaceholderAPI");
        if (plugin == null) {
        	}
        }
	}
		@EventHandler
	    public void onConsumeWhileArena(PlayerItemConsumeEvent paramPlayerItemConsumeEvent){
	      if ((paramPlayerItemConsumeEvent.getItem() != null) && (paramPlayerItemConsumeEvent.getItem().getType() == Material.GOLDEN_APPLE) &&
	        (paramPlayerItemConsumeEvent.getItem().hasItemMeta()) && (paramPlayerItemConsumeEvent.getItem().getItemMeta().hasDisplayName()) &&
	        (paramPlayerItemConsumeEvent.getItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&e&lGolden Head"))))
	      {
	        new PotionEffect(PotionEffectType.ABSORPTION, 2400, 0).apply(paramPlayerItemConsumeEvent.getPlayer());
	        new PotionEffect(PotionEffectType.REGENERATION, 180, 1).apply(paramPlayerItemConsumeEvent.getPlayer());
		}
	}
	
	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+" ---------------------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE+" "+nombre+""+" Ha sido desactivado version: "+version+"");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+" Plugin creador por MystiCub NETWORK - Carlos2025");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+" ---------------------------------------------------");
	}

public static void sendScoreboard(Player jugador) {
	
	FileConfiguration config = MystiCub.getInstance().getConfig();
    Scoreboard board =  Bukkit.getScoreboardManager().getNewScoreboard();
    String path = "Config.ScoreBoard.title";
    String title = config.getString(path);

    Objective obj = board.registerNewObjective("dummy", "title");
    obj.setDisplaySlot(DisplaySlot.SIDEBAR);
    obj.setDisplayName(ChatColor.translateAlternateColorCodes('&', title));
   
    List<String> lines = config.getStringList("Config.ScoreBoard.wait");
    int size = lines.size()+1;
    for (String linestring : lines) {
        size--;
        Team line = board.registerNewTeam("line"+size);
        line.addEntry(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(jugador, linestring)));
        obj.getScore(ChatColor.translateAlternateColorCodes('&', PlaceholderAPI.setPlaceholders(jugador, linestring))).setScore(size);
    }
    jugador.setScoreboard(board);
}
	
	public String getVersion(){
		return this.version;
	}
	
	public String getLastestVersion() {
		return this.latestversion;
	}
	
	public void registrarComandos(){
		this.getCommand("cub").setExecutor(new Commands(this));
		this.getCommand("mystery").setExecutor(new mystery(this));
	}
	//Esto es para abrir el estante de pociones
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
    	Player jugador = e.getPlayer();
        	if((e.getAction() == Action.RIGHT_CLICK_BLOCK) && (e.getClickedBlock() != null && e.getClickedBlock().getType() == Material.BREWING_STAND)) {
        		jugador.playSound(jugador.getLocation(), Sound.SLIME_ATTACK, 10, 0);
        		e.setCancelled(true);
        Potis.show(e.getPlayer());
        }
    }
	
	public void registerEvents(){
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		pm.registerEvents(new ScoreBoard(), this);
		pm.registerEvents(new Yunque(), this);
		pm.registerEvents(new Potis(), this);
		pm.registerEvents(new AntiCraft(this), this);
		pm.registerEvents(new DropIngots(this), this);
		pm.registerEvents(new PvP(this), this);
		pm.registerEvents(new kills(this), this);
		pm.registerEvents(new Entrar(this), this);
	}
	
	public void registerConfig(){
		File config = new File(this.getDataFolder(),"config.yml");
		rutaConfig = config.getPath();
		if(!config.exists()){
			this.getConfig().options().copyDefaults(true);
			saveConfig();
			}
	}
	
    public FileConfiguration getKills(){
        if(Kills == null){
            reloadKills();
        }
        return Kills;
    }
   
    public void reloadKills(){
        if(Kills == null){
            KillsFile = new File(getDataFolder(),"kills.yml");
        }
        Kills = YamlConfiguration.loadConfiguration(KillsFile);
        Reader defConfigStream;
        try{
            defConfigStream = new InputStreamReader(this.getResource("kills.yml"),"UTF8");
            if(defConfigStream != null){
                YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                Kills.setDefaults(defConfig);
            }          
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
   
    public void saveKills(){
        try{
            Kills.save(KillsFile);           
        }catch(IOException e){
            e.printStackTrace();
        }
    }
   
    public void registerKills(){
        KillsFile = new File(this.getDataFolder(),"kills.yml");
        if(!KillsFile.exists()){
            this.getKills().options().copyDefaults(true);
            saveKills();
        }
    }
    
    public FileConfiguration getMessages(){
        if(messages == null){
            reloadMessages();
        }
        return messages;
    }
   
    public void reloadMessages(){
        if(messages == null){
            messagesFile = new File(getDataFolder(),"messages.yml");
        }
        messages = YamlConfiguration.loadConfiguration(messagesFile);
        Reader defConfigStream;
        try{
            defConfigStream = new InputStreamReader(this.getResource("messages.yml"),"UTF8");
            if(defConfigStream != null){
                YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
                messages.setDefaults(defConfig);
            }          
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
   
    public void saveMessages(){
        try{
            messages.save(messagesFile);           
        }catch(IOException e){
            e.printStackTrace();
        }
    }
   
    public void registerMessages(){
        messagesFile = new File(this.getDataFolder(),"messages.yml");
        rutaMessages = messagesFile.getPath();
        if(!messagesFile.exists()){
            this.getMessages().options().copyDefaults(true);
            saveMessages();
        }
    }
    
	public void checkearMessages() { //Esto es para verificar si esta en el path lo siguiente
		Path archivo = Paths.get(rutaMessages);
		try {
			String texto = new String(Files.readAllBytes(archivo));
			if(!texto.contains("Craft-Complete:")) {
				getMessages().set("Messages.Craft-Complete", "&4No puedes craftear esto!");
				saveMessages();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

		public void checkeoUpdate(){
		      try {
		          HttpURLConnection con = (HttpURLConnection) new URL(
		                  "http://www.spigotmc.org/api/general.php").openConnection();
		          con.setDoOutput(true);
		          con.setRequestMethod("POST");
		          con.getOutputStream()
		                  .write(("key=98BE0FE67F88AB82B4C197FAF1DC3B69206EFDCC4D3B80FC83A00037510B99B4&resource=" + "52741")
		                          .getBytes("UTF-8"));
		          latestversion = new BufferedReader(new InputStreamReader(
		                  con.getInputStream())).readLine();
		          if (latestversion.length() <= 7) {
		              if(!version.equals(latestversion)){
		                  Bukkit.getConsoleSender().sendMessage(ChatColor.RED +"Hay una nueva version disponible. "+ChatColor.YELLOW+"("+ChatColor.GRAY+latestversion+ChatColor.YELLOW+")");
		                  Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"Puedes descargarlo en: "+ChatColor.WHITE+"https://goo.gl/Q5jrB1");
		              }          
		          }
		      } catch (Exception ex) {
		          Bukkit.getConsoleSender().sendMessage(nombre + ChatColor.RED +"Error al verificar la actualizacion.");
		      }
	}
}