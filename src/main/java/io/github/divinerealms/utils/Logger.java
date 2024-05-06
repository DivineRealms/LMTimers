package io.github.divinerealms.utils;

import lombok.Getter;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

import java.util.stream.Collectors;

@Getter
public class Logger {
  private final Server server;
  private final PluginDescriptionFile description;
  private final ConsoleCommandSender consoleSender;
  private String pluginName, authors, serverVersion;

  public Logger(final Plugin plugin) {
    this.server = plugin.getServer();
    this.description = plugin.getDescription();
    this.consoleSender = server.getConsoleSender();
  }

  public void send(final CommandSender sender, final String message) {
    if (sender instanceof Player) sender.sendMessage(message);
    else getConsoleSender().sendMessage(message);
  }

  public void send(final String rank, final String message) {
    getServer().broadcast(message, "group." + rank);
    getConsoleSender().sendMessage(message);
  }

  public void broadcastBar(final String message) {
    IChatBaseComponent iChatBaseComponent = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message + "\"}");
    PacketPlayOutChat packetPlayOutChat = new PacketPlayOutChat(iChatBaseComponent, (byte) 2);
    for (Player player : getServer().getOnlinePlayers())
      ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOutChat);
  }

  public void initializeStrings() {
    pluginName = getDescription().getFullName();
    authors = getDescription().getAuthors().stream().map(String::valueOf).collect(Collectors.joining(", "));
    serverVersion = getServer().getName() + " - " + getServer().getBukkitVersion();
  }
}
