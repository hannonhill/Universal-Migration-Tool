/*
 * Created on Nov 24, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.umt.struts;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hannonhill.umt.ContentTypeInformation;
import com.hannonhill.umt.Field;
import com.hannonhill.umt.FieldMapping;
import com.hannonhill.umt.ProjectInformation;
import com.hannonhill.umt.service.JTidy;
import com.hannonhill.umt.service.MappingPersister;
import com.hannonhill.umt.util.XmlUtil;

/**
 * Action responsible for assigning metadata and structured data fields.
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class AssignFieldsAction extends BaseAction
{
    private static final long serialVersionUID = -4363153939547280598L;

    // These are the available Cascade fields
    private final List<Field> cascadeMetadataFields = new ArrayList<>(); // a list of available Cascade
                                                                         // Metadata Set field
                                                                         // identifiers
    private final List<Field> cascadeDataDefinitionFields = new ArrayList<>(); // a list of available
                                                                               // Cascade Data
                                                                               // Definitnion field paths

    // These are the hidden fields that are generated automatically by javascript. For each assignment, all 4
    // arrays have one element added.
    private String[] selectedXPaths = new String[0];
    private String[] staticValues = new String[0];
    private String[] selectedCascadeMetadataFields = new String[0];
    private String[] selectedCascadeDataDefinitionFields = new String[0];

    private String testXPath;
    private String testXml;
    private Boolean testMultiple;
    private InputStream inputStream;

    @Override
    public String execute() throws Exception
    {
        if (isSubmit())
            return processSubmit();

        return processView();
    }

    public String testXPath() throws Exception
    {
        String result = "";
        String cleanXml = JTidy.tidyContentConditionallyFullHtml(testXml);
        if (testMultiple == null || testMultiple == false)
            result += XmlUtil.evaluateXPathExpression(cleanXml, testXPath);
        else
            result += String.join("\r\n\r\n-----------------------------------\r\n\r\n",
                    XmlUtil.evaluateXPathExpressionForMultipleField(cleanXml, testXPath));

        if (!cleanXml.equals(testXml))
            result += "\r\n\r\n-----------------------------------\r\n\r\nTIDIED XHTML:\r\n" + cleanXml;

        inputStream = new ByteArrayInputStream(result.getBytes("UTF-8"));
        return SUCCESS;
    }

    /**
     * @return Returns the input stream for AJAX
     */
    public InputStream getInputStream()
    {
        return inputStream;
    }

    /**
     * Processes the form submission
     * 
     * @return
     */
    private String processSubmit()
    {
        ProjectInformation projectInformation = getProjectInformation();

        // Clear out the old information
        projectInformation.getFieldMappings().clear();
        projectInformation.getStaticValueMapping().clear();

        String contentTypePath = projectInformation.getContentTypePath();
        ContentTypeInformation contentType = projectInformation.getContentTypes().get(contentTypePath);

        // Go through each field assignment submitted by the form
        try
        {
            for (int i = 0; i < selectedXPaths.length; i++)
                addFieldMapping(i, contentType, projectInformation);
            MappingPersister.persistMappings(projectInformation);
        }
        catch (Exception e)
        {
            addActionError("An error occured: " + e.getMessage());
            return processView();
        }

        return SUCCESS;
    }

    /**
     * Sets appropriate information to be able to display the form
     * 
     * @return
     */
    private String processView()
    {
        ProjectInformation projectInformation = getProjectInformation();
        String contentTypePath = projectInformation.getContentTypePath();

        ContentTypeInformation contentType = projectInformation.getContentTypes().get(contentTypePath);
        cascadeMetadataFields.addAll(contentType.getMetadataFields().values());
        cascadeDataDefinitionFields.addAll(contentType.getDataDefinitionFields().values());

        return INPUT;
    }

    /**
     * Given field identifiers of fields with given index i (selectedXPaths, selectedCascadeMetadataFields,
     * selectedCascadeDataDefinitionFields) it picks two that are not "null" and creates a mapping for them.
     * The mapping is XPath -> cascade field or cascade field -> static value. The cascade field is retrieved
     * from the contentType. The created mapping is added to the projectInformation's appropriate mapping.
     * 
     * @param i
     * @param contentType
     * @param projectInformation
     * @throws Exception
     */
    private void addFieldMapping(int i, ContentTypeInformation contentType, ProjectInformation projectInformation) throws Exception
    {
        String selectedXPath = selectedXPaths[i];
        String staticValue = staticValues[i];
        String cascadeMetadataFieldIdentifier = selectedCascadeMetadataFields[i];
        String cascadeDataDefinitionFieldIdentifier = selectedCascadeDataDefinitionFields[i];

        // JavaScript generates word "null" for null assignments, so we get the Cascade field name and field
        // type by looking for the "null" word
        boolean isDataDefinition = cascadeMetadataFieldIdentifier.equals("null");
        boolean isStaticValue = !staticValue.equals("null");
        String cascadeFieldIdentifier = isDataDefinition ? cascadeDataDefinitionFieldIdentifier : cascadeMetadataFieldIdentifier;

        // Get the actual field from the content type
        Field field = isDataDefinition ? contentType.getDataDefinitionFields().get(cascadeFieldIdentifier)
                : contentType.getMetadataFields().get(cascadeFieldIdentifier);

        if (field == null)
            throw new Exception("Data Definition or Metadata has been updated in meantime. Please re-assign Content Types again.");

        // Similar way, by checking which field is "null", we can add the mapping to correct type of map
        if (!isStaticValue)
            projectInformation.getFieldMappings().add(new FieldMapping(selectedXPath, field));
        else
            projectInformation.getStaticValueMapping().put(field, staticValue);
    }

    /**
     * @return Returns the selectedCascadeMetadataFields.
     */
    public String[] getSelectedCascadeMetadataFields()
    {
        return selectedCascadeMetadataFields;
    }

    /**
     * @param selectedCascadeMetadataFields the selectedCascadeMetadataFields to set
     */
    public void setSelectedCascadeMetadataFields(String[] selectedCascadeMetadataFields)
    {
        this.selectedCascadeMetadataFields = selectedCascadeMetadataFields;
    }

    /**
     * @return Returns the cascadeMetadataFields.
     */
    public List<Field> getCascadeMetadataFields()
    {
        return cascadeMetadataFields;
    }

    /**
     * @return Returns the cascadeDataDefinitionFields.
     */
    public List<Field> getCascadeDataDefinitionFields()
    {
        return cascadeDataDefinitionFields;
    }

    /**
     * @return Returns the selectedCascadeDataDefinitionFields.
     */
    public String[] getSelectedCascadeDataDefinitionFields()
    {
        return selectedCascadeDataDefinitionFields;
    }

    /**
     * @param selectedCascadeDataDefinitionFields the selectedCascadeDataDefinitionFields to set
     */
    public void setSelectedCascadeDataDefinitionFields(String[] selectedCascadeDataDefinitionFields)
    {
        this.selectedCascadeDataDefinitionFields = selectedCascadeDataDefinitionFields;
    }

    /**
     * @return Returns the fieldMap.
     */
    public List<FieldMapping> getFieldMappings()
    {
        return getProjectInformation().getFieldMappings();
    }

    /**
     * @return Returns the staticValueMap
     */
    public Map<Field, String> getStaticValueMap()
    {
        return getProjectInformation().getStaticValueMapping();
    }

    /**
     * @return Returns the staticValues.
     */
    public String[] getStaticValues()
    {
        return staticValues;
    }

    /**
     * @param staticValues the staticValues to set
     */
    public void setStaticValues(String[] staticValues)
    {
        this.staticValues = staticValues;
    }

    /**
     * @return Returns the selectedXPaths.
     */
    public String[] getSelectedXPaths()
    {
        return selectedXPaths;
    }

    /**
     * @param selectedXPaths the selectedXPaths to set
     */
    public void setSelectedXPaths(String[] selectedXPaths)
    {
        this.selectedXPaths = selectedXPaths;
    }

    /**
     * @return Returns the testXPath.
     */
    public String getTestXPath()
    {
        return testXPath;
    }

    /**
     * @param testXPath the testXPath to set
     */
    public void setTestXPath(String testXPath)
    {
        this.testXPath = testXPath;
    }

    /**
     * @return Returns the testXml.
     */
    public String getTestXml()
    {
        return testXml;
    }

    /**
     * @param testXml the testXml to set
     */
    public void setTestXml(String testXml)
    {
        this.testXml = testXml;
    }

    /**
     * @return Returns the testMultiple.
     */
    public Boolean getTestMultiple()
    {
        return testMultiple;
    }

    /**
     * @param testMultiple the testMultiple to set
     */
    public void setTestMultiple(Boolean testMultiple)
    {
        this.testMultiple = testMultiple;
    }

}
