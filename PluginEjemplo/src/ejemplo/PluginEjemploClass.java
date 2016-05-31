package ejemplo;

import javax.jws.HandlerChain;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginEjemploClass extends JavaPlugin implements Listener{

	
	int contador = 0;
	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		ChatColor r =   ChatColor.RED;
		
		String name = e.getPlayer().getName();
		getServer().broadcastMessage(ChatColor.BLUE + "se ha unido un"+r+" jugador y se llama: "+ChatColor.GOLD+name);
		
		
	}
	
	@EventHandler
	public void onBlockBreakEvent(BlockBreakEvent e){
		if(e.getBlock().getType() == Material.ACACIA_DOOR){
			
		}
	}
	
	@EventHandler
	public void onBlockPlaceEvent(BlockPlaceEvent e){
		
	}
	
	
	
}
