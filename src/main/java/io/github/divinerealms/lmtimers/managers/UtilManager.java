package io.github.divinerealms.lmtimers.managers;

import io.github.divinerealms.lmtimers.LMTimers;
import io.github.divinerealms.lmtimers.utils.Helper;
import io.github.divinerealms.lmtimers.utils.Logger;
import lombok.Getter;
import org.bukkit.ChatColor;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Getter
public class UtilManager {
  private final LMTimers plugin;
  private Logger logger;
  private Helper helper;

  public UtilManager(final LMTimers plugin) {
    this.plugin = plugin;
    this.logger = new Logger(plugin);
    this.helper = new Helper(plugin);
  }

  public boolean isTaskQueued(final Integer taskId) {
    if (taskId != null) return getPlugin().getServer().getScheduler().isQueued(taskId);
    else return false;
  }

  public String color(final String string) {
    return ChatColor.translateAlternateColorCodes('&', string);
  }

  public static String formatTime(int time) {
    return LocalTime.MIDNIGHT.plus(Duration.ofSeconds(time)).format(DateTimeFormatter.ofPattern("mm:ss"));
  }
}
