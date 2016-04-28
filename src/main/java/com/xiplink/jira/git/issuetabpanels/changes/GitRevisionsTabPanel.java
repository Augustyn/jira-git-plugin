/*
 * User: Mike
 * Date: Sep 16, 2004
 * Time: 1:57:17 PM
 */
package com.xiplink.jira.git.issuetabpanels.changes;

import com.atlassian.jira.issue.Issue;
import com.atlassian.jira.issue.tabpanels.GenericMessageAction;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanel;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanelModuleDescriptor;
import com.atlassian.jira.user.ApplicationUser;

import java.util.Collections;
import java.util.List;

//public class GitRevisionsTabPanel extends AbstractIssueTabPanel
public class GitRevisionsTabPanel implements IssueTabPanel
{
//    private static Logger log = Logger.getLogger(GitRevisionsTabPanel.class);

//    protected final MultipleGitRepositoryManager multipleGitRepositoryManager;
//    private PermissionManager permissionManager;
//
//    public GitRevisionsTabPanel(MultipleGitRepositoryManager multipleGitRepositoryManager, PermissionManager permissionManager)
//    {
//        this.multipleGitRepositoryManager = multipleGitRepositoryManager;
//        this.permissionManager = permissionManager;
//    }

    public void init(IssueTabPanelModuleDescriptor issueTabPanelModuleDescriptor)
    {

    }

    public List getActions(Issue issue, ApplicationUser remoteUser)
    {
//        try
//        {
//            RevisionIndexer revisionIndexer = multipleGitRepositoryManager.getRevisionIndexer();
//
//            revisionIndexer.updateIndex();
//            List<RevisionInfo> logEntries = revisionIndexer.getLogEntriesByRepository(issue);
//
//            // This is a bit of a hack to get the error message across
//            if (logEntries == null)
//            {
//                GenericMessageAction action = new GenericMessageAction(getText("no.index.error.message"));
//                return EasyList.build(action);
//            } else if (logEntries.size() == 0)
//            {
//                GenericMessageAction action = new GenericMessageAction(getText("no.log.entries.message"));
//                return EasyList.build(action);
//            } else
//            {
//                List<IssueAction> actions = new ArrayList<IssueAction>(logEntries.size());
//                for (RevisionInfo entry : logEntries)
//                {
//                    actions.add(new GitRevisionAction(entry.getCommit(), multipleGitRepositoryManager,
//                            descriptor, entry.getRepositoryId(), entry.getBranch()));
//                }
//                Collections.sort(actions, IssueActionComparator.COMPARATOR);
//                return actions;
//            }
//        } catch (Throwable t)
//        {
//            log.error("Error retrieving actions for : " + issue.getKey(), t);
//        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nothing else maters");
        return Collections.singletonList(new GenericMessageAction(stringBuilder.toString()));
    }

//    private String getText(String key)
//    {
//        return descriptor.getI18nBean().getText(key);
//    }

    public boolean showPanel(Issue issue, ApplicationUser remoteUser)
    {
//        return multipleGitRepositoryManager.isIndexingRevisions() &&
//                permissionManager.hasPermission(Permissions.VIEW_VERSION_CONTROL, issue, remoteUser);
        return true;
    }
}
