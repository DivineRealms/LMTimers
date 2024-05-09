package io.github.divinerealms.lmtimers.utils;

import io.github.divinerealms.lmtimers.LMTimers;
import lombok.Getter;
import lombok.Setter;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.cacheddata.CachedMetaData;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.group.GroupManager;
import net.luckperms.api.model.user.UserManager;

@Getter
public class Helper {
  private final LMTimers plugin;
  private final UserManager userManager;
  private final GroupManager groupManager;
  @Setter
  private LuckPerms luckPermsAPI;

  public Helper(final LMTimers plugin) {
    this.plugin = plugin;
    this.luckPermsAPI = plugin.getLuckPermsAPI();
    this.userManager = getLuckPermsAPI().getUserManager();
    this.groupManager = getLuckPermsAPI().getGroupManager();
  }

  public Group getGroup(final String groupName) {
    return getGroupManager().getGroup(groupName);
  }

  public String getGroupMeta(final String groupName, final String metaType) {
    final Group group = getGroup(groupName);
    return group.getCachedData().getMetaData().getMetaValue(metaType);
  }

  public boolean groupExists(final String groupName) {
    return getGroup(groupName) != null;
  }

  public boolean groupHasMeta(final String groupName, final String metaType) {
    final Group group = getGroup(groupName);
    final CachedMetaData metaData = group.getCachedData().getMetaData();
    return metaData.getMeta().containsKey(metaType);
  }
}
