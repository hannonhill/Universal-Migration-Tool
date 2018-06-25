/*
 * Created on Dec 2, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.struts;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.json.JSONObject;

import com.hannonhill.umt.LinkCheckingStatus;
import com.hannonhill.umt.MigrationStatus;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.TaskStatus;
import com.hannonhill.umt.task.LinkCheckingTask;
import com.hannonhill.umt.task.MigrationTask;

/**
 * Action reponsible for starting the migration and for displaying an ajax-enabled log screen.
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class MigrationAction extends BaseAction
{
    private static final long serialVersionUID = 7623856132054947522L;
    private InputStream inputStream;

    @Override
    public String execute() throws Exception
    {
        ProjectInformation projectInformation = getProjectInformation();
        String currentTaskName = projectInformation.getCurrentTask();
        if (currentTaskName == null)
        {
            projectInformation.setMigrationStatus(new MigrationStatus());
            new MigrationTask(getProjectInformation()).start();
        }
        return super.execute();
    }

    /**
     * @return Returns the input stream for AJAX
     */
    public InputStream getInputStream()
    {
        return inputStream;
    }

    /**
     * Handles an AJAX request and sends the task status information to the input stream
     * 
     * @return
     */
    public String getTaskStatusByAjax()
    {
        try
        {
            ProjectInformation projectInformation = getProjectInformation();

            JSONObject object;
            String currentTask = projectInformation.getCurrentTask();
            if (MigrationTask.TASK_NAME.equals(currentTask))
            {
                MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
                object = createJSONObject(migrationStatus, currentTask);

                int totalProgress = (projectInformation.getFilesToProcess().size()) * 2;
                object.put("progress", totalProgress == 0 ? 0 : 1000.0 * migrationStatus.getProgress() / totalProgress);
                object.put("created", migrationStatus.getAssetsCreated());
                object.put("skipped", migrationStatus.getAssetsSkipped());
                object.put("withErrors", migrationStatus.getAssetsWithErrors());
                object.put("aligned", migrationStatus.getAssetsAligned());
                object.put("notAligned", migrationStatus.getAssetsNotAligned());
            }
            else if (LinkCheckingTask.TASK_NAME.equals(currentTask))
            {
                MigrationStatus migrationStatus = projectInformation.getMigrationStatus();
                LinkCheckingStatus linkCheckingStatus = projectInformation.getLinkCheckingStatus();
                object = createJSONObject(linkCheckingStatus, currentTask);

                int totalProgress = migrationStatus.getCreatedPages().size() + migrationStatus.getCreatedBlocks().size();
                object.put("progress", 1000.0 * linkCheckingStatus.getProgress() / totalProgress);
                object.put("checked", linkCheckingStatus.getAssetsChecked());
                object.put("withErrors", linkCheckingStatus.getAssetsWithErrors());
                object.put("correctLinks", linkCheckingStatus.getCorrectLinks());
                object.put("brokenLinks", linkCheckingStatus.getBrokenLinks());
            }
            else
                return SUCCESS;

            String returnString = object.toString();
            inputStream = new ByteArrayInputStream(returnString.getBytes("UTF-8"));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * Stops the migration. Should be called through AJAX.
     * 
     * @return
     */
    public String stopTaskByAjax()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String currentTask = projectInformation.getCurrentTask();
        if (MigrationTask.TASK_NAME.equals(currentTask))
            projectInformation.getMigrationStatus().setShouldStop(true);
        else if (LinkCheckingTask.TASK_NAME.equals(currentTask))
            projectInformation.getLinkCheckingStatus().setShouldStop(true);
        return SUCCESS;
    }

    /**
     * Starts a link checker if it is not running. Should be called through AJAX.
     * 
     * @return
     */
    public String startLinkCheckerByAjax()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String currentTask = projectInformation.getCurrentTask();
        if (!LinkCheckingTask.TASK_NAME.equals(currentTask) || projectInformation.getLinkCheckingStatus().isCompleted())
            new LinkCheckingTask(getProjectInformation()).start();
        return SUCCESS;
    }

    /**
     * Restarts a migration if it is not running and if the link checker is not running. Should be called
     * through AJAX.
     * 
     * @return
     */
    public String restartMigrationByAjax()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String currentTask = projectInformation.getCurrentTask();
        if (LinkCheckingTask.TASK_NAME.equals(currentTask) && !projectInformation.getLinkCheckingStatus().isCompleted())
            return SUCCESS;

        if (MigrationTask.TASK_NAME.equals(currentTask) && !projectInformation.getMigrationStatus().isCompleted())
            return SUCCESS;

        new MigrationTask(getProjectInformation()).start();
        return SUCCESS;
    }

    /**
     * Creates a JSON object and fills it out with values from the TaskStatus
     * 
     * @param taskStatus
     * @param currentTask
     * @return
     * @throws Exception
     */
    private JSONObject createJSONObject(TaskStatus taskStatus, String currentTask) throws Exception
    {
        JSONObject object = new JSONObject();
        object.put("log", taskStatus.getLog().toString());
        object.put("completed", taskStatus.isCompleted());
        object.put("currentTask", currentTask);
        // clean up the log
        taskStatus.setLog(new StringBuilder());
        return object;
    }
}
