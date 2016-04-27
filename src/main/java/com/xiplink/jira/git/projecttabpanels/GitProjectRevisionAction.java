package com.xiplink.jira.git.projecttabpanels;

import com.atlassian.jira.plugin.projectpanel.ProjectTabPanelModuleDescriptor;
import com.atlassian.jira.web.action.JiraWebActionSupport;
import com.xiplink.jira.git.FileDiff;
import com.xiplink.jira.git.MultipleGitRepositoryManager;
import com.xiplink.jira.git.issuetabpanels.changes.GitRevisionAction;
import org.eclipse.jgit.revwalk.RevCommit;
import org.ofbiz.core.util.UtilMisc;

import java.util.Map;

/**
 * One item in the 'Git Commits' project tab.
 * <p>
 * This class extends {@link GitRevisionAction} (basically, there is no issue to group by here,
 * and we need to use a ProjectTabPanelModuleDescriptor in stead of an IssueTabPanelModuleDescriptor)
 */
public class GitProjectRevisionAction extends GitRevisionAction
{

    protected final ProjectTabPanelModuleDescriptor projectDescriptor;

    public GitProjectRevisionAction(RevCommit logEntry,
                                    MultipleGitRepositoryManager multipleGitRepositoryManager,
                                    ProjectTabPanelModuleDescriptor descriptor, long repoId, String branch)
    {
        super(logEntry, multipleGitRepositoryManager, null, repoId, branch);
        this.projectDescriptor = descriptor;
    }

    public String getHtml(JiraWebActionSupport webAction)
    {
        Map params = UtilMisc.toMap("webAction", webAction, "action", this);
        return descriptor.getHtml("view", params);
    }

    public FileDiff[] getChangedPaths()
    {
        return multipleGitRepositoryManager.getRepository(repoId).getFileDiffs(revision.getId().name());
    }


}
