/**
 * 
 */
package com.robolawrence.bukkit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author ron
 *
 */
public class StrongZombiePlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		Entity
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (command.getName().equals("zspeed")) {
		    getLogger().info("Got a "+ command.getName() + " command");
			return true;
		} else if (command.getName().equals("zspeed")) {
		    getLogger().info("Got a "+ command.getName() + " command");
			return true;
		}
		return false;
	}
}
