package de.konziiis.minecraftkonziiisbasedefence;

import org.bukkit.plugin.java.JavaPlugin;
import de.konziiis.minecraftkonziiisbasedefence.HelloCommand;

public final class MinecraftKonziiisBaseDefence extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("onEnable is called!");
        new HelloCommand(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
