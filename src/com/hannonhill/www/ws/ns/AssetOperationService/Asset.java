/**
 * Asset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 12, 2007 (02:39:05 EDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class Asset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration;

    private com.hannonhill.www.ws.ns.AssetOperationService.FeedBlock feedBlock;

    private com.hannonhill.www.ws.ns.AssetOperationService.IndexBlock indexBlock;

    private com.hannonhill.www.ws.ns.AssetOperationService.TextBlock textBlock;

    private com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock xhtmlDataDefinitionBlock;

    private com.hannonhill.www.ws.ns.AssetOperationService.XmlBlock xmlBlock;

    private com.hannonhill.www.ws.ns.AssetOperationService.File file;

    private com.hannonhill.www.ws.ns.AssetOperationService.Folder folder;

    private com.hannonhill.www.ws.ns.AssetOperationService.Page page;

    private com.hannonhill.www.ws.ns.AssetOperationService.Reference reference;

    private com.hannonhill.www.ws.ns.AssetOperationService.XsltFormat xsltFormat;

    private com.hannonhill.www.ws.ns.AssetOperationService.ScriptFormat scriptFormat;

    private com.hannonhill.www.ws.ns.AssetOperationService.Symlink symlink;

    private com.hannonhill.www.ws.ns.AssetOperationService.Template template;

    private com.hannonhill.www.ws.ns.AssetOperationService.User user;

    private com.hannonhill.www.ws.ns.AssetOperationService.Group group;

    private com.hannonhill.www.ws.ns.AssetOperationService.Role role;

    private com.hannonhill.www.ws.ns.AssetOperationService.AssetFactory assetFactory;

    private com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryContainer assetFactoryContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.ContentType contentType;

    private com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer contentTypeContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContainer connectorContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.TwitterConnector twitterConnector;

    private com.hannonhill.www.ws.ns.AssetOperationService.WordPressConnector wordPressConnector;

    private com.hannonhill.www.ws.ns.AssetOperationService.GoogleAnalyticsConnector googleAnalyticsConnector;

    private com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSet pageConfigurationSet;

    private com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSetContainer pageConfigurationSetContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.DataDefinition dataDefinition;

    private com.hannonhill.www.ws.ns.AssetOperationService.DataDefinitionContainer dataDefinitionContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet metadataSet;

    private com.hannonhill.www.ws.ns.AssetOperationService.MetadataSetContainer metadataSetContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.PublishSet publishSet;

    private com.hannonhill.www.ws.ns.AssetOperationService.PublishSetContainer publishSetContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.Target target;

    private com.hannonhill.www.ws.ns.AssetOperationService.SiteDestinationContainer siteDestinationContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.Destination destination;

    private com.hannonhill.www.ws.ns.AssetOperationService.FileSystemTransport fileSystemTransport;

    private com.hannonhill.www.ws.ns.AssetOperationService.FtpTransport ftpTransport;

    private com.hannonhill.www.ws.ns.AssetOperationService.DatabaseTransport databaseTransport;

    private com.hannonhill.www.ws.ns.AssetOperationService.TransportContainer transportContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinition workflowDefinition;

    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinitionContainer workflowDefinitionContainer;

    private com.hannonhill.www.ws.ns.AssetOperationService.Site site;

    public Asset() {
    }

    public Asset(
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration,
           com.hannonhill.www.ws.ns.AssetOperationService.FeedBlock feedBlock,
           com.hannonhill.www.ws.ns.AssetOperationService.IndexBlock indexBlock,
           com.hannonhill.www.ws.ns.AssetOperationService.TextBlock textBlock,
           com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock xhtmlDataDefinitionBlock,
           com.hannonhill.www.ws.ns.AssetOperationService.XmlBlock xmlBlock,
           com.hannonhill.www.ws.ns.AssetOperationService.File file,
           com.hannonhill.www.ws.ns.AssetOperationService.Folder folder,
           com.hannonhill.www.ws.ns.AssetOperationService.Page page,
           com.hannonhill.www.ws.ns.AssetOperationService.Reference reference,
           com.hannonhill.www.ws.ns.AssetOperationService.XsltFormat xsltFormat,
           com.hannonhill.www.ws.ns.AssetOperationService.ScriptFormat scriptFormat,
           com.hannonhill.www.ws.ns.AssetOperationService.Symlink symlink,
           com.hannonhill.www.ws.ns.AssetOperationService.Template template,
           com.hannonhill.www.ws.ns.AssetOperationService.User user,
           com.hannonhill.www.ws.ns.AssetOperationService.Group group,
           com.hannonhill.www.ws.ns.AssetOperationService.Role role,
           com.hannonhill.www.ws.ns.AssetOperationService.AssetFactory assetFactory,
           com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryContainer assetFactoryContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.ContentType contentType,
           com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer contentTypeContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContainer connectorContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.TwitterConnector twitterConnector,
           com.hannonhill.www.ws.ns.AssetOperationService.WordPressConnector wordPressConnector,
           com.hannonhill.www.ws.ns.AssetOperationService.GoogleAnalyticsConnector googleAnalyticsConnector,
           com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSet pageConfigurationSet,
           com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSetContainer pageConfigurationSetContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.DataDefinition dataDefinition,
           com.hannonhill.www.ws.ns.AssetOperationService.DataDefinitionContainer dataDefinitionContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet metadataSet,
           com.hannonhill.www.ws.ns.AssetOperationService.MetadataSetContainer metadataSetContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.PublishSet publishSet,
           com.hannonhill.www.ws.ns.AssetOperationService.PublishSetContainer publishSetContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.Target target,
           com.hannonhill.www.ws.ns.AssetOperationService.SiteDestinationContainer siteDestinationContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.Destination destination,
           com.hannonhill.www.ws.ns.AssetOperationService.FileSystemTransport fileSystemTransport,
           com.hannonhill.www.ws.ns.AssetOperationService.FtpTransport ftpTransport,
           com.hannonhill.www.ws.ns.AssetOperationService.DatabaseTransport databaseTransport,
           com.hannonhill.www.ws.ns.AssetOperationService.TransportContainer transportContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinition workflowDefinition,
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinitionContainer workflowDefinitionContainer,
           com.hannonhill.www.ws.ns.AssetOperationService.Site site) {
           this.workflowConfiguration = workflowConfiguration;
           this.feedBlock = feedBlock;
           this.indexBlock = indexBlock;
           this.textBlock = textBlock;
           this.xhtmlDataDefinitionBlock = xhtmlDataDefinitionBlock;
           this.xmlBlock = xmlBlock;
           this.file = file;
           this.folder = folder;
           this.page = page;
           this.reference = reference;
           this.xsltFormat = xsltFormat;
           this.scriptFormat = scriptFormat;
           this.symlink = symlink;
           this.template = template;
           this.user = user;
           this.group = group;
           this.role = role;
           this.assetFactory = assetFactory;
           this.assetFactoryContainer = assetFactoryContainer;
           this.contentType = contentType;
           this.contentTypeContainer = contentTypeContainer;
           this.connectorContainer = connectorContainer;
           this.twitterConnector = twitterConnector;
           this.wordPressConnector = wordPressConnector;
           this.googleAnalyticsConnector = googleAnalyticsConnector;
           this.pageConfigurationSet = pageConfigurationSet;
           this.pageConfigurationSetContainer = pageConfigurationSetContainer;
           this.dataDefinition = dataDefinition;
           this.dataDefinitionContainer = dataDefinitionContainer;
           this.metadataSet = metadataSet;
           this.metadataSetContainer = metadataSetContainer;
           this.publishSet = publishSet;
           this.publishSetContainer = publishSetContainer;
           this.target = target;
           this.siteDestinationContainer = siteDestinationContainer;
           this.destination = destination;
           this.fileSystemTransport = fileSystemTransport;
           this.ftpTransport = ftpTransport;
           this.databaseTransport = databaseTransport;
           this.transportContainer = transportContainer;
           this.workflowDefinition = workflowDefinition;
           this.workflowDefinitionContainer = workflowDefinitionContainer;
           this.site = site;
    }


    /**
     * Gets the workflowConfiguration value for this Asset.
     * 
     * @return workflowConfiguration
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration getWorkflowConfiguration() {
        return workflowConfiguration;
    }


    /**
     * Sets the workflowConfiguration value for this Asset.
     * 
     * @param workflowConfiguration
     */
    public void setWorkflowConfiguration(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowConfiguration workflowConfiguration) {
        this.workflowConfiguration = workflowConfiguration;
    }


    /**
     * Gets the feedBlock value for this Asset.
     * 
     * @return feedBlock
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.FeedBlock getFeedBlock() {
        return feedBlock;
    }


    /**
     * Sets the feedBlock value for this Asset.
     * 
     * @param feedBlock
     */
    public void setFeedBlock(com.hannonhill.www.ws.ns.AssetOperationService.FeedBlock feedBlock) {
        this.feedBlock = feedBlock;
    }


    /**
     * Gets the indexBlock value for this Asset.
     * 
     * @return indexBlock
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.IndexBlock getIndexBlock() {
        return indexBlock;
    }


    /**
     * Sets the indexBlock value for this Asset.
     * 
     * @param indexBlock
     */
    public void setIndexBlock(com.hannonhill.www.ws.ns.AssetOperationService.IndexBlock indexBlock) {
        this.indexBlock = indexBlock;
    }


    /**
     * Gets the textBlock value for this Asset.
     * 
     * @return textBlock
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.TextBlock getTextBlock() {
        return textBlock;
    }


    /**
     * Sets the textBlock value for this Asset.
     * 
     * @param textBlock
     */
    public void setTextBlock(com.hannonhill.www.ws.ns.AssetOperationService.TextBlock textBlock) {
        this.textBlock = textBlock;
    }


    /**
     * Gets the xhtmlDataDefinitionBlock value for this Asset.
     * 
     * @return xhtmlDataDefinitionBlock
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock getXhtmlDataDefinitionBlock() {
        return xhtmlDataDefinitionBlock;
    }


    /**
     * Sets the xhtmlDataDefinitionBlock value for this Asset.
     * 
     * @param xhtmlDataDefinitionBlock
     */
    public void setXhtmlDataDefinitionBlock(com.hannonhill.www.ws.ns.AssetOperationService.XhtmlDataDefinitionBlock xhtmlDataDefinitionBlock) {
        this.xhtmlDataDefinitionBlock = xhtmlDataDefinitionBlock;
    }


    /**
     * Gets the xmlBlock value for this Asset.
     * 
     * @return xmlBlock
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.XmlBlock getXmlBlock() {
        return xmlBlock;
    }


    /**
     * Sets the xmlBlock value for this Asset.
     * 
     * @param xmlBlock
     */
    public void setXmlBlock(com.hannonhill.www.ws.ns.AssetOperationService.XmlBlock xmlBlock) {
        this.xmlBlock = xmlBlock;
    }


    /**
     * Gets the file value for this Asset.
     * 
     * @return file
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.File getFile() {
        return file;
    }


    /**
     * Sets the file value for this Asset.
     * 
     * @param file
     */
    public void setFile(com.hannonhill.www.ws.ns.AssetOperationService.File file) {
        this.file = file;
    }


    /**
     * Gets the folder value for this Asset.
     * 
     * @return folder
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Folder getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this Asset.
     * 
     * @param folder
     */
    public void setFolder(com.hannonhill.www.ws.ns.AssetOperationService.Folder folder) {
        this.folder = folder;
    }


    /**
     * Gets the page value for this Asset.
     * 
     * @return page
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Page getPage() {
        return page;
    }


    /**
     * Sets the page value for this Asset.
     * 
     * @param page
     */
    public void setPage(com.hannonhill.www.ws.ns.AssetOperationService.Page page) {
        this.page = page;
    }


    /**
     * Gets the reference value for this Asset.
     * 
     * @return reference
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Reference getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this Asset.
     * 
     * @param reference
     */
    public void setReference(com.hannonhill.www.ws.ns.AssetOperationService.Reference reference) {
        this.reference = reference;
    }


    /**
     * Gets the xsltFormat value for this Asset.
     * 
     * @return xsltFormat
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.XsltFormat getXsltFormat() {
        return xsltFormat;
    }


    /**
     * Sets the xsltFormat value for this Asset.
     * 
     * @param xsltFormat
     */
    public void setXsltFormat(com.hannonhill.www.ws.ns.AssetOperationService.XsltFormat xsltFormat) {
        this.xsltFormat = xsltFormat;
    }


    /**
     * Gets the scriptFormat value for this Asset.
     * 
     * @return scriptFormat
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ScriptFormat getScriptFormat() {
        return scriptFormat;
    }


    /**
     * Sets the scriptFormat value for this Asset.
     * 
     * @param scriptFormat
     */
    public void setScriptFormat(com.hannonhill.www.ws.ns.AssetOperationService.ScriptFormat scriptFormat) {
        this.scriptFormat = scriptFormat;
    }


    /**
     * Gets the symlink value for this Asset.
     * 
     * @return symlink
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Symlink getSymlink() {
        return symlink;
    }


    /**
     * Sets the symlink value for this Asset.
     * 
     * @param symlink
     */
    public void setSymlink(com.hannonhill.www.ws.ns.AssetOperationService.Symlink symlink) {
        this.symlink = symlink;
    }


    /**
     * Gets the template value for this Asset.
     * 
     * @return template
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Template getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this Asset.
     * 
     * @param template
     */
    public void setTemplate(com.hannonhill.www.ws.ns.AssetOperationService.Template template) {
        this.template = template;
    }


    /**
     * Gets the user value for this Asset.
     * 
     * @return user
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Asset.
     * 
     * @param user
     */
    public void setUser(com.hannonhill.www.ws.ns.AssetOperationService.User user) {
        this.user = user;
    }


    /**
     * Gets the group value for this Asset.
     * 
     * @return group
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Group getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Asset.
     * 
     * @param group
     */
    public void setGroup(com.hannonhill.www.ws.ns.AssetOperationService.Group group) {
        this.group = group;
    }


    /**
     * Gets the role value for this Asset.
     * 
     * @return role
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Role getRole() {
        return role;
    }


    /**
     * Sets the role value for this Asset.
     * 
     * @param role
     */
    public void setRole(com.hannonhill.www.ws.ns.AssetOperationService.Role role) {
        this.role = role;
    }


    /**
     * Gets the assetFactory value for this Asset.
     * 
     * @return assetFactory
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactory getAssetFactory() {
        return assetFactory;
    }


    /**
     * Sets the assetFactory value for this Asset.
     * 
     * @param assetFactory
     */
    public void setAssetFactory(com.hannonhill.www.ws.ns.AssetOperationService.AssetFactory assetFactory) {
        this.assetFactory = assetFactory;
    }


    /**
     * Gets the assetFactoryContainer value for this Asset.
     * 
     * @return assetFactoryContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryContainer getAssetFactoryContainer() {
        return assetFactoryContainer;
    }


    /**
     * Sets the assetFactoryContainer value for this Asset.
     * 
     * @param assetFactoryContainer
     */
    public void setAssetFactoryContainer(com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryContainer assetFactoryContainer) {
        this.assetFactoryContainer = assetFactoryContainer;
    }


    /**
     * Gets the contentType value for this Asset.
     * 
     * @return contentType
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ContentType getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Asset.
     * 
     * @param contentType
     */
    public void setContentType(com.hannonhill.www.ws.ns.AssetOperationService.ContentType contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the contentTypeContainer value for this Asset.
     * 
     * @return contentTypeContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer getContentTypeContainer() {
        return contentTypeContainer;
    }


    /**
     * Sets the contentTypeContainer value for this Asset.
     * 
     * @param contentTypeContainer
     */
    public void setContentTypeContainer(com.hannonhill.www.ws.ns.AssetOperationService.ContentTypeContainer contentTypeContainer) {
        this.contentTypeContainer = contentTypeContainer;
    }


    /**
     * Gets the connectorContainer value for this Asset.
     * 
     * @return connectorContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContainer getConnectorContainer() {
        return connectorContainer;
    }


    /**
     * Sets the connectorContainer value for this Asset.
     * 
     * @param connectorContainer
     */
    public void setConnectorContainer(com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContainer connectorContainer) {
        this.connectorContainer = connectorContainer;
    }


    /**
     * Gets the twitterConnector value for this Asset.
     * 
     * @return twitterConnector
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.TwitterConnector getTwitterConnector() {
        return twitterConnector;
    }


    /**
     * Sets the twitterConnector value for this Asset.
     * 
     * @param twitterConnector
     */
    public void setTwitterConnector(com.hannonhill.www.ws.ns.AssetOperationService.TwitterConnector twitterConnector) {
        this.twitterConnector = twitterConnector;
    }


    /**
     * Gets the wordPressConnector value for this Asset.
     * 
     * @return wordPressConnector
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WordPressConnector getWordPressConnector() {
        return wordPressConnector;
    }


    /**
     * Sets the wordPressConnector value for this Asset.
     * 
     * @param wordPressConnector
     */
    public void setWordPressConnector(com.hannonhill.www.ws.ns.AssetOperationService.WordPressConnector wordPressConnector) {
        this.wordPressConnector = wordPressConnector;
    }


    /**
     * Gets the googleAnalyticsConnector value for this Asset.
     * 
     * @return googleAnalyticsConnector
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.GoogleAnalyticsConnector getGoogleAnalyticsConnector() {
        return googleAnalyticsConnector;
    }


    /**
     * Sets the googleAnalyticsConnector value for this Asset.
     * 
     * @param googleAnalyticsConnector
     */
    public void setGoogleAnalyticsConnector(com.hannonhill.www.ws.ns.AssetOperationService.GoogleAnalyticsConnector googleAnalyticsConnector) {
        this.googleAnalyticsConnector = googleAnalyticsConnector;
    }


    /**
     * Gets the pageConfigurationSet value for this Asset.
     * 
     * @return pageConfigurationSet
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSet getPageConfigurationSet() {
        return pageConfigurationSet;
    }


    /**
     * Sets the pageConfigurationSet value for this Asset.
     * 
     * @param pageConfigurationSet
     */
    public void setPageConfigurationSet(com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSet pageConfigurationSet) {
        this.pageConfigurationSet = pageConfigurationSet;
    }


    /**
     * Gets the pageConfigurationSetContainer value for this Asset.
     * 
     * @return pageConfigurationSetContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSetContainer getPageConfigurationSetContainer() {
        return pageConfigurationSetContainer;
    }


    /**
     * Sets the pageConfigurationSetContainer value for this Asset.
     * 
     * @param pageConfigurationSetContainer
     */
    public void setPageConfigurationSetContainer(com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurationSetContainer pageConfigurationSetContainer) {
        this.pageConfigurationSetContainer = pageConfigurationSetContainer;
    }


    /**
     * Gets the dataDefinition value for this Asset.
     * 
     * @return dataDefinition
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DataDefinition getDataDefinition() {
        return dataDefinition;
    }


    /**
     * Sets the dataDefinition value for this Asset.
     * 
     * @param dataDefinition
     */
    public void setDataDefinition(com.hannonhill.www.ws.ns.AssetOperationService.DataDefinition dataDefinition) {
        this.dataDefinition = dataDefinition;
    }


    /**
     * Gets the dataDefinitionContainer value for this Asset.
     * 
     * @return dataDefinitionContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DataDefinitionContainer getDataDefinitionContainer() {
        return dataDefinitionContainer;
    }


    /**
     * Sets the dataDefinitionContainer value for this Asset.
     * 
     * @param dataDefinitionContainer
     */
    public void setDataDefinitionContainer(com.hannonhill.www.ws.ns.AssetOperationService.DataDefinitionContainer dataDefinitionContainer) {
        this.dataDefinitionContainer = dataDefinitionContainer;
    }


    /**
     * Gets the metadataSet value for this Asset.
     * 
     * @return metadataSet
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet getMetadataSet() {
        return metadataSet;
    }


    /**
     * Sets the metadataSet value for this Asset.
     * 
     * @param metadataSet
     */
    public void setMetadataSet(com.hannonhill.www.ws.ns.AssetOperationService.MetadataSet metadataSet) {
        this.metadataSet = metadataSet;
    }


    /**
     * Gets the metadataSetContainer value for this Asset.
     * 
     * @return metadataSetContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.MetadataSetContainer getMetadataSetContainer() {
        return metadataSetContainer;
    }


    /**
     * Sets the metadataSetContainer value for this Asset.
     * 
     * @param metadataSetContainer
     */
    public void setMetadataSetContainer(com.hannonhill.www.ws.ns.AssetOperationService.MetadataSetContainer metadataSetContainer) {
        this.metadataSetContainer = metadataSetContainer;
    }


    /**
     * Gets the publishSet value for this Asset.
     * 
     * @return publishSet
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PublishSet getPublishSet() {
        return publishSet;
    }


    /**
     * Sets the publishSet value for this Asset.
     * 
     * @param publishSet
     */
    public void setPublishSet(com.hannonhill.www.ws.ns.AssetOperationService.PublishSet publishSet) {
        this.publishSet = publishSet;
    }


    /**
     * Gets the publishSetContainer value for this Asset.
     * 
     * @return publishSetContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PublishSetContainer getPublishSetContainer() {
        return publishSetContainer;
    }


    /**
     * Sets the publishSetContainer value for this Asset.
     * 
     * @param publishSetContainer
     */
    public void setPublishSetContainer(com.hannonhill.www.ws.ns.AssetOperationService.PublishSetContainer publishSetContainer) {
        this.publishSetContainer = publishSetContainer;
    }


    /**
     * Gets the target value for this Asset.
     * 
     * @return target
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Target getTarget() {
        return target;
    }


    /**
     * Sets the target value for this Asset.
     * 
     * @param target
     */
    public void setTarget(com.hannonhill.www.ws.ns.AssetOperationService.Target target) {
        this.target = target;
    }


    /**
     * Gets the siteDestinationContainer value for this Asset.
     * 
     * @return siteDestinationContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.SiteDestinationContainer getSiteDestinationContainer() {
        return siteDestinationContainer;
    }


    /**
     * Sets the siteDestinationContainer value for this Asset.
     * 
     * @param siteDestinationContainer
     */
    public void setSiteDestinationContainer(com.hannonhill.www.ws.ns.AssetOperationService.SiteDestinationContainer siteDestinationContainer) {
        this.siteDestinationContainer = siteDestinationContainer;
    }


    /**
     * Gets the destination value for this Asset.
     * 
     * @return destination
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Destination getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this Asset.
     * 
     * @param destination
     */
    public void setDestination(com.hannonhill.www.ws.ns.AssetOperationService.Destination destination) {
        this.destination = destination;
    }


    /**
     * Gets the fileSystemTransport value for this Asset.
     * 
     * @return fileSystemTransport
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.FileSystemTransport getFileSystemTransport() {
        return fileSystemTransport;
    }


    /**
     * Sets the fileSystemTransport value for this Asset.
     * 
     * @param fileSystemTransport
     */
    public void setFileSystemTransport(com.hannonhill.www.ws.ns.AssetOperationService.FileSystemTransport fileSystemTransport) {
        this.fileSystemTransport = fileSystemTransport;
    }


    /**
     * Gets the ftpTransport value for this Asset.
     * 
     * @return ftpTransport
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.FtpTransport getFtpTransport() {
        return ftpTransport;
    }


    /**
     * Sets the ftpTransport value for this Asset.
     * 
     * @param ftpTransport
     */
    public void setFtpTransport(com.hannonhill.www.ws.ns.AssetOperationService.FtpTransport ftpTransport) {
        this.ftpTransport = ftpTransport;
    }


    /**
     * Gets the databaseTransport value for this Asset.
     * 
     * @return databaseTransport
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.DatabaseTransport getDatabaseTransport() {
        return databaseTransport;
    }


    /**
     * Sets the databaseTransport value for this Asset.
     * 
     * @param databaseTransport
     */
    public void setDatabaseTransport(com.hannonhill.www.ws.ns.AssetOperationService.DatabaseTransport databaseTransport) {
        this.databaseTransport = databaseTransport;
    }


    /**
     * Gets the transportContainer value for this Asset.
     * 
     * @return transportContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.TransportContainer getTransportContainer() {
        return transportContainer;
    }


    /**
     * Sets the transportContainer value for this Asset.
     * 
     * @param transportContainer
     */
    public void setTransportContainer(com.hannonhill.www.ws.ns.AssetOperationService.TransportContainer transportContainer) {
        this.transportContainer = transportContainer;
    }


    /**
     * Gets the workflowDefinition value for this Asset.
     * 
     * @return workflowDefinition
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinition getWorkflowDefinition() {
        return workflowDefinition;
    }


    /**
     * Sets the workflowDefinition value for this Asset.
     * 
     * @param workflowDefinition
     */
    public void setWorkflowDefinition(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinition workflowDefinition) {
        this.workflowDefinition = workflowDefinition;
    }


    /**
     * Gets the workflowDefinitionContainer value for this Asset.
     * 
     * @return workflowDefinitionContainer
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinitionContainer getWorkflowDefinitionContainer() {
        return workflowDefinitionContainer;
    }


    /**
     * Sets the workflowDefinitionContainer value for this Asset.
     * 
     * @param workflowDefinitionContainer
     */
    public void setWorkflowDefinitionContainer(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowDefinitionContainer workflowDefinitionContainer) {
        this.workflowDefinitionContainer = workflowDefinitionContainer;
    }


    /**
     * Gets the site value for this Asset.
     * 
     * @return site
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Site getSite() {
        return site;
    }


    /**
     * Sets the site value for this Asset.
     * 
     * @param site
     */
    public void setSite(com.hannonhill.www.ws.ns.AssetOperationService.Site site) {
        this.site = site;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Asset)) return false;
        Asset other = (Asset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowConfiguration==null && other.getWorkflowConfiguration()==null) || 
             (this.workflowConfiguration!=null &&
              this.workflowConfiguration.equals(other.getWorkflowConfiguration()))) &&
            ((this.feedBlock==null && other.getFeedBlock()==null) || 
             (this.feedBlock!=null &&
              this.feedBlock.equals(other.getFeedBlock()))) &&
            ((this.indexBlock==null && other.getIndexBlock()==null) || 
             (this.indexBlock!=null &&
              this.indexBlock.equals(other.getIndexBlock()))) &&
            ((this.textBlock==null && other.getTextBlock()==null) || 
             (this.textBlock!=null &&
              this.textBlock.equals(other.getTextBlock()))) &&
            ((this.xhtmlDataDefinitionBlock==null && other.getXhtmlDataDefinitionBlock()==null) || 
             (this.xhtmlDataDefinitionBlock!=null &&
              this.xhtmlDataDefinitionBlock.equals(other.getXhtmlDataDefinitionBlock()))) &&
            ((this.xmlBlock==null && other.getXmlBlock()==null) || 
             (this.xmlBlock!=null &&
              this.xmlBlock.equals(other.getXmlBlock()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.xsltFormat==null && other.getXsltFormat()==null) || 
             (this.xsltFormat!=null &&
              this.xsltFormat.equals(other.getXsltFormat()))) &&
            ((this.scriptFormat==null && other.getScriptFormat()==null) || 
             (this.scriptFormat!=null &&
              this.scriptFormat.equals(other.getScriptFormat()))) &&
            ((this.symlink==null && other.getSymlink()==null) || 
             (this.symlink!=null &&
              this.symlink.equals(other.getSymlink()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.assetFactory==null && other.getAssetFactory()==null) || 
             (this.assetFactory!=null &&
              this.assetFactory.equals(other.getAssetFactory()))) &&
            ((this.assetFactoryContainer==null && other.getAssetFactoryContainer()==null) || 
             (this.assetFactoryContainer!=null &&
              this.assetFactoryContainer.equals(other.getAssetFactoryContainer()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.contentTypeContainer==null && other.getContentTypeContainer()==null) || 
             (this.contentTypeContainer!=null &&
              this.contentTypeContainer.equals(other.getContentTypeContainer()))) &&
            ((this.connectorContainer==null && other.getConnectorContainer()==null) || 
             (this.connectorContainer!=null &&
              this.connectorContainer.equals(other.getConnectorContainer()))) &&
            ((this.twitterConnector==null && other.getTwitterConnector()==null) || 
             (this.twitterConnector!=null &&
              this.twitterConnector.equals(other.getTwitterConnector()))) &&
            ((this.wordPressConnector==null && other.getWordPressConnector()==null) || 
             (this.wordPressConnector!=null &&
              this.wordPressConnector.equals(other.getWordPressConnector()))) &&
            ((this.googleAnalyticsConnector==null && other.getGoogleAnalyticsConnector()==null) || 
             (this.googleAnalyticsConnector!=null &&
              this.googleAnalyticsConnector.equals(other.getGoogleAnalyticsConnector()))) &&
            ((this.pageConfigurationSet==null && other.getPageConfigurationSet()==null) || 
             (this.pageConfigurationSet!=null &&
              this.pageConfigurationSet.equals(other.getPageConfigurationSet()))) &&
            ((this.pageConfigurationSetContainer==null && other.getPageConfigurationSetContainer()==null) || 
             (this.pageConfigurationSetContainer!=null &&
              this.pageConfigurationSetContainer.equals(other.getPageConfigurationSetContainer()))) &&
            ((this.dataDefinition==null && other.getDataDefinition()==null) || 
             (this.dataDefinition!=null &&
              this.dataDefinition.equals(other.getDataDefinition()))) &&
            ((this.dataDefinitionContainer==null && other.getDataDefinitionContainer()==null) || 
             (this.dataDefinitionContainer!=null &&
              this.dataDefinitionContainer.equals(other.getDataDefinitionContainer()))) &&
            ((this.metadataSet==null && other.getMetadataSet()==null) || 
             (this.metadataSet!=null &&
              this.metadataSet.equals(other.getMetadataSet()))) &&
            ((this.metadataSetContainer==null && other.getMetadataSetContainer()==null) || 
             (this.metadataSetContainer!=null &&
              this.metadataSetContainer.equals(other.getMetadataSetContainer()))) &&
            ((this.publishSet==null && other.getPublishSet()==null) || 
             (this.publishSet!=null &&
              this.publishSet.equals(other.getPublishSet()))) &&
            ((this.publishSetContainer==null && other.getPublishSetContainer()==null) || 
             (this.publishSetContainer!=null &&
              this.publishSetContainer.equals(other.getPublishSetContainer()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.siteDestinationContainer==null && other.getSiteDestinationContainer()==null) || 
             (this.siteDestinationContainer!=null &&
              this.siteDestinationContainer.equals(other.getSiteDestinationContainer()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.fileSystemTransport==null && other.getFileSystemTransport()==null) || 
             (this.fileSystemTransport!=null &&
              this.fileSystemTransport.equals(other.getFileSystemTransport()))) &&
            ((this.ftpTransport==null && other.getFtpTransport()==null) || 
             (this.ftpTransport!=null &&
              this.ftpTransport.equals(other.getFtpTransport()))) &&
            ((this.databaseTransport==null && other.getDatabaseTransport()==null) || 
             (this.databaseTransport!=null &&
              this.databaseTransport.equals(other.getDatabaseTransport()))) &&
            ((this.transportContainer==null && other.getTransportContainer()==null) || 
             (this.transportContainer!=null &&
              this.transportContainer.equals(other.getTransportContainer()))) &&
            ((this.workflowDefinition==null && other.getWorkflowDefinition()==null) || 
             (this.workflowDefinition!=null &&
              this.workflowDefinition.equals(other.getWorkflowDefinition()))) &&
            ((this.workflowDefinitionContainer==null && other.getWorkflowDefinitionContainer()==null) || 
             (this.workflowDefinitionContainer!=null &&
              this.workflowDefinitionContainer.equals(other.getWorkflowDefinitionContainer()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWorkflowConfiguration() != null) {
            _hashCode += getWorkflowConfiguration().hashCode();
        }
        if (getFeedBlock() != null) {
            _hashCode += getFeedBlock().hashCode();
        }
        if (getIndexBlock() != null) {
            _hashCode += getIndexBlock().hashCode();
        }
        if (getTextBlock() != null) {
            _hashCode += getTextBlock().hashCode();
        }
        if (getXhtmlDataDefinitionBlock() != null) {
            _hashCode += getXhtmlDataDefinitionBlock().hashCode();
        }
        if (getXmlBlock() != null) {
            _hashCode += getXmlBlock().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getXsltFormat() != null) {
            _hashCode += getXsltFormat().hashCode();
        }
        if (getScriptFormat() != null) {
            _hashCode += getScriptFormat().hashCode();
        }
        if (getSymlink() != null) {
            _hashCode += getSymlink().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getAssetFactory() != null) {
            _hashCode += getAssetFactory().hashCode();
        }
        if (getAssetFactoryContainer() != null) {
            _hashCode += getAssetFactoryContainer().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getContentTypeContainer() != null) {
            _hashCode += getContentTypeContainer().hashCode();
        }
        if (getConnectorContainer() != null) {
            _hashCode += getConnectorContainer().hashCode();
        }
        if (getTwitterConnector() != null) {
            _hashCode += getTwitterConnector().hashCode();
        }
        if (getWordPressConnector() != null) {
            _hashCode += getWordPressConnector().hashCode();
        }
        if (getGoogleAnalyticsConnector() != null) {
            _hashCode += getGoogleAnalyticsConnector().hashCode();
        }
        if (getPageConfigurationSet() != null) {
            _hashCode += getPageConfigurationSet().hashCode();
        }
        if (getPageConfigurationSetContainer() != null) {
            _hashCode += getPageConfigurationSetContainer().hashCode();
        }
        if (getDataDefinition() != null) {
            _hashCode += getDataDefinition().hashCode();
        }
        if (getDataDefinitionContainer() != null) {
            _hashCode += getDataDefinitionContainer().hashCode();
        }
        if (getMetadataSet() != null) {
            _hashCode += getMetadataSet().hashCode();
        }
        if (getMetadataSetContainer() != null) {
            _hashCode += getMetadataSetContainer().hashCode();
        }
        if (getPublishSet() != null) {
            _hashCode += getPublishSet().hashCode();
        }
        if (getPublishSetContainer() != null) {
            _hashCode += getPublishSetContainer().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getSiteDestinationContainer() != null) {
            _hashCode += getSiteDestinationContainer().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getFileSystemTransport() != null) {
            _hashCode += getFileSystemTransport().hashCode();
        }
        if (getFtpTransport() != null) {
            _hashCode += getFtpTransport().hashCode();
        }
        if (getDatabaseTransport() != null) {
            _hashCode += getDatabaseTransport().hashCode();
        }
        if (getTransportContainer() != null) {
            _hashCode += getTransportContainer().hashCode();
        }
        if (getWorkflowDefinition() != null) {
            _hashCode += getWorkflowDefinition().hashCode();
        }
        if (getWorkflowDefinitionContainer() != null) {
            _hashCode += getWorkflowDefinitionContainer().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Asset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-configuration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "feedBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "feedBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "indexBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "textBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "textBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xhtmlDataDefinitionBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xhtmlDataDefinitionBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xhtmlDataDefinitionBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xmlBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xmlBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "file"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "folder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "reference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xsltFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xsltFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "xsltFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "scriptFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "scriptFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symlink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "symlink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "symlink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "template"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "user"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "group"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetFactory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetFactoryContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactoryContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "assetFactoryContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTypeContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypeContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "contentTypeContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectorContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twitterConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "twitterConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "twitterConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wordPressConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "wordPressConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "wordPressConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleAnalyticsConnector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "googleAnalyticsConnector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "googleAnalyticsConnector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurationSetContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSetContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSetContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDefinitionContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinitionContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "dataDefinitionContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metadataSetContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSetContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "metadataSetContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishSetContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSetContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "publishSetContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "target"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDestinationContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteDestinationContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "siteDestinationContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "destination"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSystemTransport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fileSystemTransport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "fileSystemTransport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpTransport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "ftpTransport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "ftpTransport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseTransport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "databaseTransport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "databaseTransport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transportContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "transportContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "transportContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDefinitionContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowDefinitionContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "site"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
