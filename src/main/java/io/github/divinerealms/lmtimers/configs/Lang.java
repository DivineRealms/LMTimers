package io.github.divinerealms.lmtimers.configs;

import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

@Getter
public enum Lang {
  RELOAD("reload", "&a▎ &fPlugin reloaded!"),
  UNKNOWN_COMMAND("unknown-command", "&4▎ &cNepoznata komanda."),
  INVALID_TIME("invalid-time", String.join(System.lineSeparator(),
      "&4▎ &cArgument za vreme \"&e{0}&c\" nije validan.",
      "&4▎ &cPrimer: &e20min")),
  HELP("help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&f Pomoćnik za LMTimers Komande",
      "&r &r",
      "&6 /&elmt reload &7- &fOsvežite plugin.",
      "&r &r",
      "&e &lResult Komande:&r",
      "&6 /&ers help &7- &fPomoćnik za rezultat.",
      "&e &lTimer Komande:&r",
      "&6 /&etimer help &7- &fPomoćnik za timer.",
      "&e &l2x4 Komande:&r",
      "&6 /&e2x4 help &7- &fPomoćnik za 2x4 Event.",
      "&e &l1x8 Komande:&r",
      "&6 /&e1x8 help &7- &fPomoćnik za 1x8 Event.",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TIMER_HELP("timer.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&f Pomoćnik za Timer Komande.",
      "&r &r",
      "&6 /&etimer start &2<&avreme&2> &3[&bprefix&3]",
      "&6 /&etimer stop",
      "&r &r",
      "&7 &oSve komande imaju [TAB] completion, koristite ovo za pomoć!",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TIMER_CREATE("timer.create", "&a▎ &fUspešno pokrenut timer sa ID-em &e{0}&f."),
  TIMER_STOP("timer.stop", "&a▎ &fIsključen timer sa ID-em &e{0}&f."),
  TIMER_STARTING("timer.starting", String.join(System.lineSeparator(),
      "&6▎ &r",
      "&6▎ &r    &l{0} &8- &e&lMEČ POČINJE!",
      "&6▎ &r")),
  TIMER_END("timer.end", "{0} &6┃ &fTimer završen!"),
  TIMER_OVER("timer.over", "&a▎ &fTimer sa ID-em &e{0} &fje završen!"),
  TIMER_CURRENT_TIME("timer.current-time", "{0} &7┃ &fTrenutno vreme: &e{1}/{2}"),
  TIMER_NOT_AVAILABLE("timer.not-available", "&4▎ &cNijedan timer ne radi trenutno."),
  TIMER_ALREADY_RUNNING("timer.already-running", String.join(System.lineSeparator(),
      "&4▎ &cVeć postoji jedan timer ili niste podesili sve.",
      "&4▎ &cPodesite &6/&ers teams &ci &6/&ers time 20min&c.")),
  TIMER_PREFIX_SET("timer.prefix-set", "&a▎ &fPrefix podešen na {0}&f."),
  TIMER_TEAMS_SET("timer.teams-set", "&a▎ &fTimovi podešeni na {0} &f(home) i {1}&f (away)."),
  TIMER_TIME_SET("timer.time-set", "&a▎ &fVreme podešeno na {0}&f."),
  RESULT_HELP("result.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&fPomoćnik za Result Komande:",
      "&r &r",
      "&f &lKomande Podešavanja:",
      "&6 /&ers prefix &2<&aprefix&2> &7(&f/rs prefix &b&lEvent&7)",
      "&6 /&ers teams &2<&ahome&2> <&aaway&2> &7(&f/rs teams nkp vtz&7)",
      "&6 /&ers time &2<&atime&2> &7(&f/rs time 20min&7)",
      "&r &r",
      "&e &lKomande Kontrole:",
      "&6 /&ers start&6|&estop",
      "&6 /&ers pause&6|&eresume",
      "&7 - &fKoristite &epause &fna kraju prvog poluvremena.",
      "&7 - &fKoristite &eresume &fza početak drugog poluvremena.",
      "&6 /&ers extend &2<&atime&2> &7(&f/rs extend 2min30s&7)",
      "&6 /&ers add&6|&erem&6(&e&oove&6) &ehome&6|&eaway &7(&f/rs add vtz&7)",
      "&r &r",
      "&7 &oSve komande imaju [TAB] completion, koristite ovo za pomoć!",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  RESULT_ADD("result.add", String.join(System.lineSeparator(),
      "&6▎ &r",
      "&6▎ &e  &lGOOOOOOOOOOOOL!",
      "&6▎ &b  {0} &rje postigao gol za {1} &rtim!",
      "&6▎ &r")),
  RESULT_ADD_ASSIST("result.add-assist", String.join(System.lineSeparator(),
      "    &6▎ &r",
      "&6▎ &e  &lGOOOOOOOOOOOOL!",
      "&6▎ &b  {0} &rje postigao gol za {1} &rtim!",
      "&6▎ &f  Asistent: &b{2}",
      "&6▎ &r")),
  RESULT_CAPTAINS_SET("result.captains-set", "&a▎ &fKapiten home &b{0}&f, away &b{1}&f. Podešeno uspešno."),
  RESULT_FULL_LIVES("result.full-lives", "&4▎ &f{0} &cveć ima sve živote."),
  RESULT_ELIMINATED("result.eliminated", "&4▎ &f{0} &cje već eliminisan."),
  RESULT_ADDED_LIFE("result.added-life", "&a▎ &fDodat jedan život za tim {0}&f!"),
  RESULT_REMOVED_LIFE("result.removed-life", "&a▎ &fSkinut jedan život za tim {0}&f!"),
  RESULT_REMOVE("result.remove", "&a▎ &fSkinut jedan gol za tim {0}&f."),
  RESULT_USAGE("result.add-usage", "&4▎ &cMorate navesti tim."),
  RESULT_STARTING("result.starting", "{0} &7┃ &fMeč počinje!"),
  RESULT_ACTIONBAR("result.actionbar", "{0} &7┃ &f{1} &e{2} - {3} &f{4} &7┃ &f{5}{6}/{7}{8}"),
  RESULT_ACTIONBAR_HT("result.actionbar-ht", "{0} &7┃ &f{1} &e{2} - {3} &f{4} &7┃ &fPoluvreme!"),
  RESULT_END("result.end", "{0} &7┃ &fMeč završen! Rezultat: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_HALFTIME("result.halftime", String.join(System.lineSeparator(),
      "&6▎ &r",
      "&6▎ &e  &lPOLUVREME!",
      "&6▎ &f  Rezultat: &f{1} &e{2} &f- &e{3} &f{4}",
      "&6▎ &r")),
  RESULT_SECONDHALF("result.secondhalf", String.join(System.lineSeparator(),
      "&6▎ &r",
      "&6▎ &e  &lDRUGO POLUVREME!",
      "&6▎ &f  Rezultat: &f{1} &e{2} &f- &e{3} &f{4}",
      "&6▎ &r")),
  RESULT_OVER("result.over", String.join(System.lineSeparator(),
      "&6▎ &r",
      "&6▎ &e  &lMEČ ZAVRŠEN!",
      "&6▎ &f  Rezultat: &f{1} &e{2} &f- &e{3} &f{4}",
      "&6▎ &r")),
  TWO_TIMES_FOUR_HELP("result.2x4.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&6 /&e2x4 start&6|&estop",
      "&6 /&e2x4 type &2<&atype&2> &7- &fEvent type (&o2x4/3x4/...&f).",
      "&6 /&e2x4 add&6/&erem team_color &7(&f/2x4 add blue&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TWO_TIMES_FOUR_ACTIONBAR("result.2x4.actionbar", "{0} &7┃ &fRezultat: &b{1} &c{2} &a{3} &e{4} &7┃ &fVreme: &e{5}"),
  TWO_TIMES_FOUR_RESULT_OVER("result.2x4.over", "&6▎ {0} &6┃ &fMeč završen! Rezultat: &b{1} &c{2} &a{3} &e{4}&f!"),
  TWO_TIMES_FOUR_RESULT_END("result.2x4.end", "{0} &6┃ &fMeč završen! Rezultat: &b{1} &c{2} &a{3} &e{4}"),
  ONE_TIMES_EIGHT_HELP("result.1x8.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&6 /&e1x8 start&6|&estop",
      "&6 /&e1x8 type &2<&atype&2> &7- &fEvent type (1x8/2x8/...&f).",
      "&6 /&e1x8 add&6/&erem team_color &7(&f/1x8 rem red&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  ONE_TIMES_EIGHT_ACTIONBAR("result.1x8.actionbar", "{0} &7┃ &fRezultat: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8} &7┃ &fVreme: &e{9}"),
  ONE_TIMES_EIGHT_RESULT_OVER("result.1x8.over", "&6▎ {0} &6┃ &fMeč završen! Rezultat: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8}&f!"),
  ONE_TIMES_EIGHT_RESULT_END("result.1x8.end", "{0} &6┃ &fMeč završen! Rezultat: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8}"),
  WEBHOOK_NOT_SETUP("webhook.not-setup", "&4▎ &cNiste dodali URL za Discord Webhook u config.yml!"),
  WEBHOOK_PREFIX_NOT_SETUP("webhook.not-setup-prefix", "&4▎ &cNamestite prefix prvo."),
  WEBHOOK_TEAMS_SET("webhook.teams-set", "{0} Podešeni timovi: **{1} - {2}**."),
  WEBHOOK_MATCH_START("webhook.match-start", "Početak utakmice **{0} - {1}**."),
  WEBHOOK_MATCH_ENDED("webhook.match-ended", "Kraj utakmice, rezultat: **{0} {1} - {2} {3}**. Trajanje: **`{4}`**."),
  WEBHOOK_MATCH_HALFTIME("webhook.match-halftime", "Poluvreme, rezultat: **{0} {1} - {2} {3}**."),
  WEBHOOK_MATCH_SECONDHALF("webhook.match-secondhalf", "Početak drugog poluvremena, rezultat: **{0} {1} - {2} {3}**."),
  WEBHOOK_MATCH_SCORE_COLOR("webhook.match-score.color", "#ffb80c"),
  WEBHOOK_MATCH_SCORE_AUTHOR_NAME("webhook.match-score.author.name", "GOOOOL za {0}"),
  WEBHOOK_MATCH_SCORE_AUTHOR_ICON("webhook.match-score.author.icon", "https://cdn.discordapp.com/emojis/1067135709644865637.webp"),
  WEBHOOK_MATCH_SCORE_DESC("webhook.match-score.description", "<:ArrowRightGray:813815804768026705>Strelac: **{0}**{7}<:ArrowRightGray:813815804768026705>Rezultat: **{3} {4} - {5} {6}**\\n<:ArrowRightGray:813815804768026705>Vreme: `{2}`"),
  WEBHOOK_MATCH_ASSIST("webhook.match-assist", "<:ArrowRightGray:813815804768026705>Strelac: **{0}**\\n<:ArrowRightGray:813815804768026705>Asistent: **{3}**\\n<:ArrowRightGray:813815804768026705>Rezultat: **{4} {5} - {6} {7}**\\n<:ArrowRightGray:813815804768026705>Vreme: `{2}`");

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
