package io.github.divinerealms.configs;

import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

@Getter
public enum Lang {
  RELOAD("reload", "&a▎ &fPlugin reloaded!"),
  UNKNOWN_COMMAND("unknown-command", "&4▎ &cUnknown command."),
  INVALID_TIME("invalid-time", "&4▎ &cYour time argument \"&e{0}&c\" is invalid."),
  HELP("help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&d &lL&e&lM&3&lTimers &7- &rHelp command.",
      "&r &r",
      "&6 /&elm reload &7- &fReloads the plugin.",
      "&r &r",
      "&e &lResult Commands:&r",
      "&6 /&ers help &7- &fList of commands for result.",
      "&e &lTimer Commands:&r",
      "&6 /&etimer help &7- &fList of commands for timer.",
      "&e &l2x4 Commands:&r",
      "&6 /&e2x4 help &7- &fList of commands for 2x4 Event.",
      "&e &l1x8 Commands:&r",
      "&6 /&e1x8 help &7- &fList of commands for 1x8 Event.",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TIMER_HELP("timer.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&d &lL&e&lM&3&lTimers &7- &rTimer Commands.",
      "&r &r",
      "&6 /&etimer start &2<&atime&2> &3[&bprefix&3]",
      "&6 /&etimer stop",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TIMER_CREATE("timer.create", "&a▎ &fSuccessfully started timer with id &e{0}&f."),
  TIMER_STOP("timer.stop", "&a▎ &fSuccessfully stopped timer with id &e{0}&f."),
  TIMER_STARTING("timer.starting", "&6▎ {0} &6┃ &fHost starting!"),
  TIMER_END("timer.end", "{0} &6┃ &fTimer finished!"),
  TIMER_OVER("timer.over", "&a▎ &fTimer with id &e{0} &fis over!"),
  TIMER_CURRENT_TIME("timer.current-time", "{0} &7┃ &fCurrent Time: &e{1}/{2}"),
  TIMER_NOT_AVAILABLE("timer.not-available", "&4▎ &cThere aren't any timers running."),
  TIMER_ALREADY_RUNNING("timer.already-running", "&4▎ &cThere already is a timer running."),
  TIMER_PREFIX_SET("timer.prefix-set", "&a▎ &fPrefix successfully set to {0}&f."),
  TIMER_TEAMS_SET("timer.teams-set", "&a▎ &fTeams successfully set to {0} &fand {1}&f."),
  TIMER_TIME_SET("timer.time-set", "&a▎ &fTime successfully set to {0}&f."),
  RESULT_HELP("result.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&f &lSetup Commands:",
      "&6 /&ers prefix &2<&aprefix&2> &7(&f/rs prefix &b&lEvent&7)",
      "&6 /&ers teams &2<&ahome&2> <&aaway&2> &7(&f/rs teams nkp vtz&7)",
      "&6 /&ers time &2<&atime&2> &7(&f/rs time 20min&7)",
      "&r &r",
      "&e &lControl Commands:",
      "&6 /&ers start&6|&estop",
      "&6 /&ers pause&6|&eresume",
      "&7 - &fUse &epause &fat the end of the First Half.",
      "&7 - &fUse &eresume &fat the beginning of the Second Half.",
      "&6 /&ers extend &2<&atime&2> &7(&f/rs extend 2min30s&7)",
      "&6 /&ers add&6|&erem&6(&e&oove&6) &ehome&6|&eaway &7(&f/rs add vtz&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  RESULT_ADD("result.add", "&a▎ &fTeam {1}&f has scored! Scorer: &b{0}&f."),
  RESULT_ADD_ASSIST("result.add-assist", "&a▎ &fTeam {1}&f has scored! Scorer: &b{0}&f, Assist: &b{2}&f."),
  RESULT_CAPTAINS_SET("result.captains-set", "&a▎ &fKapiten home &b{0}&f, away &b{1}&f. Podešeno uspešno."),
  RESULT_FULL_LIVES("result.full-lives", "&4▎ &cTeam {0} &calready has all lives."),
  RESULT_ELIMINATED("result.eliminated", "&4▎ &cTeam {0} &cis already eliminated."),
  RESULT_ADDED_LIFE("result.added-life", "&a▎ &fAdded one life for team {0}&f!"),
  RESULT_REMOVED_LIFE("result.removed-life", "&a▎ &fRemoved one life from the team {0}&f!"),
  RESULT_REMOVE("result.remove", "&a▎ &fRemoved one goal for the team {0}&f."),
  RESULT_USAGE("result.add-usage", "&4▎ &cYou need to specify a team."),
  RESULT_STARTING("result.starting", "{0} &7┃ &fHost starting!"),
  RESULT_ACTIONBAR("result.actionbar", "{0} &7┃ &f{1} &e{2} - {3} &f{4} &7┃ &f{5}{6}/{7}{8}"),
  RESULT_ACTIONBAR_HT("result.actionbar-ht", "{0} &7┃ &f{1} &e{2} - {3} &f{4} &7┃ &fHalf Time!"),
  RESULT_END("result.end", "{0} &7┃ &fMatch finished! LMTimers: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_HALFTIME("result.halftime", "&6▎ {0} &6┃ &fHalf Time! LMTimers: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_SECONDHALF("result.secondhalf", "&6▎ {0} &6┃ &fMatch continuing - Second Half! LMTimers: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_OVER("result.over", "&6▎ {0} &6┃ &fMatch finished! LMTimers: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  TWO_TIMES_FOUR_HELP("result.2x4.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&6 /&e2x4 start&6|&estop",
      "&6 /&e2x4 type &2<&atype&2> &7- &fEvent type (&o2x4/3x4/...&f).",
      "&6 /&e2x4 add&6/&erem team_color &7(&f/2x4 add blue&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TWO_TIMES_FOUR_ACTIONBAR("result.2x4.actionbar", "{0} &7┃ &fResult: &b{1} &c{2} &a{3} &e{4} &7┃ &fTime: &e{5}"),
  TWO_TIMES_FOUR_RESULT_OVER("result.2x4.over", "&6▎ {0} &6┃ &fMatch over! LMTimers: &b{1} &c{2} &a{3} &e{4}&f!"),
  TWO_TIMES_FOUR_RESULT_END("result.2x4.end", "{0} &6┃ &fMatch over! LMTimers: &b{1} &c{2} &a{3} &e{4}"),
  ONE_TIMES_EIGHT_HELP("result.1x8.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&6 /&e1x8 start&6|&estop",
      "&6 /&e1x8 type &2<&atype&2> &7- &fEvent type (1x8/2x8/...&f).",
      "&6 /&e1x8 add&6/&erem team_color &7(&f/1x8 rem red&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  ONE_TIMES_EIGHT_ACTIONBAR("result.1x8.actionbar", "{0} &7┃ &fResult: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8} &7┃ &fTime: &e{9}"),
  ONE_TIMES_EIGHT_RESULT_OVER("result.1x8.over", "&6▎ {0} &6┃ &fMatch over! LMTimers: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8}&f!"),
  ONE_TIMES_EIGHT_RESULT_END("result.1x8.end", "{0} &6┃ &fMatch over! LMTimers: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8}"),
  WEBHOOK_NOT_SETUP("webhook.not-setup", "&4▎ &cNiste dodali URL za Discord Webhook u config.yml!"),
  WEBHOOK_TEAMS_SET("webhook.teams-set", "Podešeni timovi: **{0} - {1}**."),
  WEBHOOK_MATCH_START("webhook.match-start", "Početak utakmice **{0} - {1}**."),
  WEBHOOK_MATCH_ENDED("webhook.match-ended", "Kraj utakmice, rezultat: **{0} {1} - {2} {3}**. Trajanje: **`{4}`**."),
  WEBHOOK_MATCH_HALFTIME("webhook.match-halftime", "Poluvreme, rezultat: **{0} {1} - {2} {3}**."),
  WEBHOOK_MATCH_SECONDHALF("webhook.match-secondhalf", "Početak drugog poluvremena, rezultat: **{0} {1} - {2} {3}**."),
  WEBHOOK_MATCH_SCORE("webhook.match-score", "**GOOL!** Scorer: **{0}** (**{1}** - **`{2}`**)!"),
  WEBHOOK_MATCH_ASSIST("webhook.match-assist", "**GOOL!** Scorer: **{0}** (**{1}** - **`{2}`**)! Asistent: **{3}**.");

  private static FileConfiguration LANG;
  private final String path, def;

  Lang(final String path, final String start) {
    this.path = path;
    this.def = start;
  }

  public static void setFile(final FileConfiguration config) {
    LANG = config;
  }

  public String getDefault() {
    return this.def;
  }

  public String getConfigValue(final String[] args) {
    String value = ChatColor.translateAlternateColorCodes('&', LANG.getString(this.path, this.def));

    if (args == null) return value;
    else {
      if (args.length == 0) return value;
      for (int i = 0; i < args.length; i++) value = value.replace("{" + i + "}", args[i]);
      value = ChatColor.translateAlternateColorCodes('&', value);
    }

    return value;
  }
}
