package carlos2025.MystiCubPvP.otros;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import com.mysql.jdbc.Connection;

public class ConnectionMysql {

	private Connection connection;
	private String host;
	private int puerto;
	private String database;
	private String usuario;
	private String password;
	
	public void ConnectionSQL(String host, int puerto, String database, String usuario, String password) {
		this.host = host;
		this.puerto = puerto;
		this.database = database;
		this.usuario = usuario;
		this.password = password;
		
		try {
			synchronized(this) {
				if(connection != null && !connection.isClosed()) {
					Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4[&cCubeCoreSQL&4] &cError al conectar con MySQL"));
					return;
				}
				Class.forName("com.mysql.jdbc.Driver");
				this.connection = DriverManager.getConnection("jdbc:mysql://"+this.host+":"+this.puerto+"/"+this.database,this.usuario,this.password);
				
				Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&3[&aCubecoreSQL&3] &aPlugin conectado con SQL!"));
			}
		}catch(SQLException e) {
			
		}catch(ClassNotFoundException e) {
			
		}
		
	}
	
	public Connection getConnection() {
		return connection;
	}
}
