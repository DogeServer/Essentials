package com.dogeserver;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author HowAboutDoge
 * The main class.
 */
public class Main extends JavaPlugin {

	private static Main main;
	private PluginDescriptionFile pdf;
	private Logger l;
	
	/**
	 * Runs when plugin is enabled
	 */
	public void onEnable() {
		
		l = getLogger();
		pdf = getDescription();
		main = this;
		
		commands();
		listeners();
		
		l.info(pdf.getName() + " version " + pdf.getVersion() + " enabled");
	}
	
	/**
	 * Runs when plugin is disabled
	 */
	public void onDisable() {
		
		l.info(pdf.getName() + " version " + pdf.getVersion() + " enabled");
	}
	/**
	 * Registers classes that implements CommandExecutor 
	 */
	private void commands() {
		
		
	}
	
	/**
	 * Registers classes that implements Listener
	 */
	private void listeners() {
		
		
	}
	
	/**
	 * 
	 * @return Returns the main instance of this class
	 */
	public static Main getMain() {
		
		return main;
	}
}
