/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateTemplateSyncConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTemplateSyncConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository branch.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The name of the repository, for example <code>myrepos/myrepo</code>.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The repository provider.
     * </p>
     */
    private String repositoryProvider;
    /**
     * <p>
     * A subdirectory path to your template bundle version. When included, limits the template bundle search to this
     * repository directory.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The synced template name.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The synced template type.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @param branch
     *        The repository branch.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @return The repository branch.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @param branch
     *        The repository branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateSyncConfigRequest withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The name of the repository, for example <code>myrepos/myrepo</code>.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository, for example <code>myrepos/myrepo</code>.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository, for example <code>myrepos/myrepo</code>.
     * </p>
     * 
     * @return The name of the repository, for example <code>myrepos/myrepo</code>.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository, for example <code>myrepos/myrepo</code>.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository, for example <code>myrepos/myrepo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateSyncConfigRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param repositoryProvider
     *        The repository provider.
     * @see RepositoryProvider
     */

    public void setRepositoryProvider(String repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @return The repository provider.
     * @see RepositoryProvider
     */

    public String getRepositoryProvider() {
        return this.repositoryProvider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param repositoryProvider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public UpdateTemplateSyncConfigRequest withRepositoryProvider(String repositoryProvider) {
        setRepositoryProvider(repositoryProvider);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param repositoryProvider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public UpdateTemplateSyncConfigRequest withRepositoryProvider(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider.toString();
        return this;
    }

    /**
     * <p>
     * A subdirectory path to your template bundle version. When included, limits the template bundle search to this
     * repository directory.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory path to your template bundle version. When included, limits the template bundle search to
     *        this repository directory.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * A subdirectory path to your template bundle version. When included, limits the template bundle search to this
     * repository directory.
     * </p>
     * 
     * @return A subdirectory path to your template bundle version. When included, limits the template bundle search to
     *         this repository directory.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * A subdirectory path to your template bundle version. When included, limits the template bundle search to this
     * repository directory.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory path to your template bundle version. When included, limits the template bundle search to
     *        this repository directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateSyncConfigRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The synced template name.
     * </p>
     * 
     * @param templateName
     *        The synced template name.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The synced template name.
     * </p>
     * 
     * @return The synced template name.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The synced template name.
     * </p>
     * 
     * @param templateName
     *        The synced template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTemplateSyncConfigRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The synced template type.
     * </p>
     * 
     * @param templateType
     *        The synced template type.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The synced template type.
     * </p>
     * 
     * @return The synced template type.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The synced template type.
     * </p>
     * 
     * @param templateType
     *        The synced template type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public UpdateTemplateSyncConfigRequest withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The synced template type.
     * </p>
     * 
     * @param templateType
     *        The synced template type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public UpdateTemplateSyncConfigRequest withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryProvider() != null)
            sb.append("RepositoryProvider: ").append(getRepositoryProvider()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplateSyncConfigRequest == false)
            return false;
        UpdateTemplateSyncConfigRequest other = (UpdateTemplateSyncConfigRequest) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryProvider() == null ^ this.getRepositoryProvider() == null)
            return false;
        if (other.getRepositoryProvider() != null && other.getRepositoryProvider().equals(this.getRepositoryProvider()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryProvider() == null) ? 0 : getRepositoryProvider().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTemplateSyncConfigRequest clone() {
        return (UpdateTemplateSyncConfigRequest) super.clone();
    }

}
