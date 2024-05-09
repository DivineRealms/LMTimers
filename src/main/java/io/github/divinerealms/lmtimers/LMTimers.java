package io.github.divinerealms.lmtimers;

import co.aikar.commands.BukkitCommandManager;
import io.github.divinerealms.lmtimers.commands.LMTCommand;
import io.github.divinerealms.lmtimers.commands.timers.OXECommand;
import io.github.divinerealms.lmtimers.commands.timers.ResultCommand;
import io.github.divinerealms.lmtimers.commands.timers.TXFCommand;
import io.github.divinerealms.lmtimers.commands.timers.TimerCommand;
import io.github.divinerealms.lmtimers.configs.Config;
import io.github.divinerealms.lmtimers.configs.Lang;
import io.github.divinerealms.lmtimers.managers.ConfigManager;
import io.github.divinerealms.lmtimers.managers.UtilManager;
import lombok.Getter;
import lombok.Setter;
import net.luckperms.api.LuckPerms;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

@Setter
@Getter
public class LMTimers extends JavaPlugin {
  private ConfigManager messagesFile = new ConfigManager(this, "");
  private YamlConfiguration config;
  private LuckPerms luckPermsAPI = null;
  private UtilManager utilManager;

  @Override
  public void onEnable() {
    setupMessages();
    Config.setup(this);
    config = Config.getConfig("config.yml");

    if (!setupLuckPermsAPI()) {
      getLogger().info("&cDisabled due to no LuckPerms dependency found!");
      getServer().getPluginManager().disablePlugin(this);
    }

    utilManager = new UtilManager(this);

    getUtilManager().getLogger().initializeStrings();
    getLogger().info("Loading commands...");
    setup();
    getLogger().info("Loading listeners...");
    getLogger().info("Successfully enabled!");
  }

  @Override
  public void onDisable() {
    getLogger().info("Cancelling all tasks from this plugin...");
    getServer().getScheduler().cancelTasks(this);
  }

  public void setup() {
    BukkitCommandManager commandManager = new BukkitCommandManager(this);
    commandManager.enableUnstableAPI("help");
    commandManager.registerCommand(new LMTCommand(getUtilManager(), this));
    commandManager.registerCommand(new ResultCommand(this, getUtilManager()));
    commandManager.registerCommand(new TimerCommand(this, getUtilManager()));
    commandManager.registerCommand(new OXECommand(this, getUtilManager()));
    commandManager.registerCommand(new TXFCommand(this, getUtilManager()));
  }

  public void setupMessages() {
    getMessagesFile().createNewFile("messages.yml", "Loading messages.yml", "LMTimers Messages");
    loadMessages();
  }

  private boolean setupLuckPermsAPI() {
    RegisteredServiceProvider<LuckPerms> lpp = getServer().getServicesManager().getRegistration(LuckPerms.class);
    if (lpp != null) setLuckPermsAPI(lpp.getProvider());
    return getLuckPermsAPI() != null;
  }

  private void loadMessages() {
    Lang.setFile(getMessagesFile().getConfig("messages.yml"));

    for (final Lang value : Lang.values())
      getMessagesFile().getConfig("messages.yml").addDefault(value.getPath(), value.getDefault());

    getMessagesFile().getConfig("messages.yml").options().copyDefaults(true);
    getMessagesFile().saveConfig("messages.yml");
  }
}
