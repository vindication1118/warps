package warps;

import java.util.Date;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Warp {

	private Location warploc = null;
	private String creator = null;
	private long lastused = 0;
	
	public Warp(CommandSender sender){
		//should not be modified after construction
		creator = sender.getName();
		Date d = new Date();
		//will be modified
		lastused = d.getTime();
		Player player1 = (Player) sender;
		//should not be modified after creation
		warploc = player1.getLocation();
	}
	
	public Long getLastUsed(){
		
		return this.lastused;
	}
	//Sets date/time of last use to current time
	//when a warp gets used, this will be called
	public void setLastUsed(){
		Date d = new Date();
		this.lastused = d.getTime();
	}
	
	public String getCreator(){
		
		return this.creator;
	}
	
	public Location getLocation(){
		
		return this.warploc;
	}
}
