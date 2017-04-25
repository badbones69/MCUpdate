package com.songoda.mcupdate;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	private MCUpdate update;

	@Override
	public void onEnable() {
		try {
			update = new MCUpdate(this);
			update.startLogging();
		} catch (IOException e) {
			System.out.println("MCUpdate failed to load.");
		}
	}

	@Override
	public void onDisable() {
		update.stopLogging();
		update = null;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args) {
		if (commandLable.equalsIgnoreCase("mcupdate")) {
			if (sender.hasPermission("mcupdate.admin")) {
				if (update.isLogging()) {
					update.stopLogging();
					sender.sendMessage("You have just stopped the MCUpdate from logging information.");
				} else {
					update.startLogging();
					sender.sendMessage("You have just started to log information with MCUpdate.");
				}
			} else {
				sender.sendMessage("You do not have permission to use this command.");
			}
			return true;
		}
		return false;
	}

}