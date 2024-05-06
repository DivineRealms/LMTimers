package io.github.divinerealms.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import io.github.divinerealms.LMTimers;
import io.github.divinerealms.configs.Lang;
import io.github.divinerealms.managers.UtilManager;
import io.github.divinerealms.utils.Logger;
import lombok.Getter;
import org.bukkit.command.CommandSender;

@Getter
@CommandAlias("lmtimers|lmt")
public class LMTCommand extends BaseCommand {
  private final LMTimers instance;
  private final UtilManager utilManager;
  private final Logger logger;

  public LMTCommand(final UtilManager utilManager, final LMTimers instance) {
    this.instance = instance;
    this.utilManager = utilManager;
    this.logger = utilManager.getLogger();
  }

  @CatchUnknown
  public void onUnknown(CommandSender sender) {
    getLogger().send(sender, Lang.UNKNOWN_COMMAND.getConfigValue(null));
  }

  @Default
  @Subcommand("help")
  @CommandPermission("leaguemanager.command.help")
  public void onHelp(CommandSender sender) {
    getLogger().send(sender, Lang.HELP.getConfigValue(null));
  }

  @Subcommand("reload")
  @CommandPermission("leaguemanager.command.reload")
  public void onReload(CommandSender sender) {
    getInstance().setupMessages();
    getInstance().setup();
    getUtilManager().reload();
    getLogger().send(sender, Lang.RELOAD.getConfigValue(null));
  }
}
