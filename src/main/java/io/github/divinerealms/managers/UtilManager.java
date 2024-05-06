package io.github.divinerealms.result.managers;

import io.github.divinerealms.result.Result;
import io.github.divinerealms.result.utils.Logger;
import lombok.Getter;
import org.bukkit.ChatColor;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Getter
public class UtilManager {
  private final Result plugin;
  private final Logger logger;

  public UtilManager(final Result plugin) {
    this.plugin = plugin;
    this.logger = new Logger(plugin);
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
