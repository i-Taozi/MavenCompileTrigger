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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the properties of the recommender.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/RecommenderSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the recommender.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     */
    private String recommenderArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     */
    private RecommenderConfig recommenderConfig;
    /**
     * <p>
     * The status of the recommender. A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the recommender.
     * </p>
     * 
     * @param name
     *        The name of the recommender.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recommender.
     * </p>
     * 
     * @return The name of the recommender.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recommender.
     * </p>
     * 
     * @param name
     *        The name of the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     * 
     * @param recommenderArn
     *        The Amazon Resource Name (ARN) of the recommender.
     */

    public void setRecommenderArn(String recommenderArn) {
        this.recommenderArn = recommenderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommender.
     */

    public String getRecommenderArn() {
        return this.recommenderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     * 
     * @param recommenderArn
     *        The Amazon Resource Name (ARN) of the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withRecommenderArn(String recommenderArn) {
        setRecommenderArn(recommenderArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was
     *        created for.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was
     *         created for.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was
     *        created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     * 
     * @param recommenderConfig
     *        The configuration details of the recommender.
     */

    public void setRecommenderConfig(RecommenderConfig recommenderConfig) {
        this.recommenderConfig = recommenderConfig;
    }

    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     * 
     * @return The configuration details of the recommender.
     */

    public RecommenderConfig getRecommenderConfig() {
        return this.recommenderConfig;
    }

    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     * 
     * @param recommenderConfig
     *        The configuration details of the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withRecommenderConfig(RecommenderConfig recommenderConfig) {
        setRecommenderConfig(recommenderConfig);
        return this;
    }

    /**
     * <p>
     * The status of the recommender. A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the recommender. A recommender can be in one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the recommender. A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the recommender. A recommender can be in one of the following states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the recommender. A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the recommender. A recommender can be in one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recommender was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recommender was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recommender was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the recommender was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recommender was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the recommender was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecommenderArn() != null)
            sb.append("RecommenderArn: ").append(getRecommenderArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getRecommenderConfig() != null)
            sb.append("RecommenderConfig: ").append(getRecommenderConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommenderSummary == false)
            return false;
        RecommenderSummary other = (RecommenderSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecommenderArn() == null ^ this.getRecommenderArn() == null)
            return false;
        if (other.getRecommenderArn() != null && other.getRecommenderArn().equals(this.getRecommenderArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getRecommenderConfig() == null ^ this.getRecommenderConfig() == null)
            return false;
        if (other.getRecommenderConfig() != null && other.getRecommenderConfig().equals(this.getRecommenderConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecommenderArn() == null) ? 0 : getRecommenderArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getRecommenderConfig() == null) ? 0 : getRecommenderConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public RecommenderSummary clone() {
        try {
            return (RecommenderSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.RecommenderSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
