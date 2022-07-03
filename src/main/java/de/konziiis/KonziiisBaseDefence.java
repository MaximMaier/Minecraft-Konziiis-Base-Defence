package de.konziiis;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class KonziiisBaseDefence extends JavaPlugin
{
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        new HelloCommand(this);
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
