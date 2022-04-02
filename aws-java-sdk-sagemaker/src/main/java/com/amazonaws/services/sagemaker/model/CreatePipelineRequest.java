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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     */
    private String pipelineDisplayName;
    /**
     * <p>
     * The JSON pipeline definition of the pipeline.
     * </p>
     */
    private String pipelineDefinition;
    /**
     * <p>
     * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline
     * definition from this location.
     * </p>
     */
    private PipelineDefinitionS3Location pipelineDefinitionS3Location;
    /**
     * <p>
     * A description of the pipeline.
     * </p>
     */
    private String pipelineDescription;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of tags to apply to the created pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of
     * this pipeline by default.
     * </p>
     */
    private ParallelismConfiguration parallelismConfiguration;

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @param pipelineDisplayName
     *        The display name of the pipeline.
     */

    public void setPipelineDisplayName(String pipelineDisplayName) {
        this.pipelineDisplayName = pipelineDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @return The display name of the pipeline.
     */

    public String getPipelineDisplayName() {
        return this.pipelineDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline.
     * </p>
     * 
     * @param pipelineDisplayName
     *        The display name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineDisplayName(String pipelineDisplayName) {
        setPipelineDisplayName(pipelineDisplayName);
        return this;
    }

    /**
     * <p>
     * The JSON pipeline definition of the pipeline.
     * </p>
     * 
     * @param pipelineDefinition
     *        The JSON pipeline definition of the pipeline.
     */

    public void setPipelineDefinition(String pipelineDefinition) {
        this.pipelineDefinition = pipelineDefinition;
    }

    /**
     * <p>
     * The JSON pipeline definition of the pipeline.
     * </p>
     * 
     * @return The JSON pipeline definition of the pipeline.
     */

    public String getPipelineDefinition() {
        return this.pipelineDefinition;
    }

    /**
     * <p>
     * The JSON pipeline definition of the pipeline.
     * </p>
     * 
     * @param pipelineDefinition
     *        The JSON pipeline definition of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineDefinition(String pipelineDefinition) {
        setPipelineDefinition(pipelineDefinition);
        return this;
    }

    /**
     * <p>
     * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline
     * definition from this location.
     * </p>
     * 
     * @param pipelineDefinitionS3Location
     *        The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the
     *        pipeline definition from this location.
     */

    public void setPipelineDefinitionS3Location(PipelineDefinitionS3Location pipelineDefinitionS3Location) {
        this.pipelineDefinitionS3Location = pipelineDefinitionS3Location;
    }

    /**
     * <p>
     * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline
     * definition from this location.
     * </p>
     * 
     * @return The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the
     *         pipeline definition from this location.
     */

    public PipelineDefinitionS3Location getPipelineDefinitionS3Location() {
        return this.pipelineDefinitionS3Location;
    }

    /**
     * <p>
     * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline
     * definition from this location.
     * </p>
     * 
     * @param pipelineDefinitionS3Location
     *        The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the
     *        pipeline definition from this location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineDefinitionS3Location(PipelineDefinitionS3Location pipelineDefinitionS3Location) {
        setPipelineDefinitionS3Location(pipelineDefinitionS3Location);
        return this;
    }

    /**
     * <p>
     * A description of the pipeline.
     * </p>
     * 
     * @param pipelineDescription
     *        A description of the pipeline.
     */

    public void setPipelineDescription(String pipelineDescription) {
        this.pipelineDescription = pipelineDescription;
    }

    /**
     * <p>
     * A description of the pipeline.
     * </p>
     * 
     * @return A description of the pipeline.
     */

    public String getPipelineDescription() {
        return this.pipelineDescription;
    }

    /**
     * <p>
     * A description of the pipeline.
     * </p>
     * 
     * @param pipelineDescription
     *        A description of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineDescription(String pipelineDescription) {
        setPipelineDescription(pipelineDescription);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the created pipeline.
     * </p>
     * 
     * @return A list of tags to apply to the created pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to the created pipeline.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the created pipeline.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to apply to the created pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the created pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the created pipeline.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the created pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of
     * this pipeline by default.
     * </p>
     * 
     * @param parallelismConfiguration
     *        This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all
     *        runs of this pipeline by default.
     */

    public void setParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
    }

    /**
     * <p>
     * This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of
     * this pipeline by default.
     * </p>
     * 
     * @return This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all
     *         runs of this pipeline by default.
     */

    public ParallelismConfiguration getParallelismConfiguration() {
        return this.parallelismConfiguration;
    }

    /**
     * <p>
     * This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of
     * this pipeline by default.
     * </p>
     * 
     * @param parallelismConfiguration
     *        This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all
     *        runs of this pipeline by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        setParallelismConfiguration(parallelismConfiguration);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineDisplayName() != null)
            sb.append("PipelineDisplayName: ").append(getPipelineDisplayName()).append(",");
        if (getPipelineDefinition() != null)
            sb.append("PipelineDefinition: ").append(getPipelineDefinition()).append(",");
        if (getPipelineDefinitionS3Location() != null)
            sb.append("PipelineDefinitionS3Location: ").append(getPipelineDefinitionS3Location()).append(",");
        if (getPipelineDescription() != null)
            sb.append("PipelineDescription: ").append(getPipelineDescription()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getParallelismConfiguration() != null)
            sb.append("ParallelismConfiguration: ").append(getParallelismConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePipelineRequest == false)
            return false;
        CreatePipelineRequest other = (CreatePipelineRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineDisplayName() == null ^ this.getPipelineDisplayName() == null)
            return false;
        if (other.getPipelineDisplayName() != null && other.getPipelineDisplayName().equals(this.getPipelineDisplayName()) == false)
            return false;
        if (other.getPipelineDefinition() == null ^ this.getPipelineDefinition() == null)
            return false;
        if (other.getPipelineDefinition() != null && other.getPipelineDefinition().equals(this.getPipelineDefinition()) == false)
            return false;
        if (other.getPipelineDefinitionS3Location() == null ^ this.getPipelineDefinitionS3Location() == null)
            return false;
        if (other.getPipelineDefinitionS3Location() != null && other.getPipelineDefinitionS3Location().equals(this.getPipelineDefinitionS3Location()) == false)
            return false;
        if (other.getPipelineDescription() == null ^ this.getPipelineDescription() == null)
            return false;
        if (other.getPipelineDescription() != null && other.getPipelineDescription().equals(this.getPipelineDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getParallelismConfiguration() == null ^ this.getParallelismConfiguration() == null)
            return false;
        if (other.getParallelismConfiguration() != null && other.getParallelismConfiguration().equals(this.getParallelismConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDisplayName() == null) ? 0 : getPipelineDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPipelineDefinition() == null) ? 0 : getPipelineDefinition().hashCode());
        hashCode = prime * hashCode + ((getPipelineDefinitionS3Location() == null) ? 0 : getPipelineDefinitionS3Location().hashCode());
        hashCode = prime * hashCode + ((getPipelineDescription() == null) ? 0 : getPipelineDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getParallelismConfiguration() == null) ? 0 : getParallelismConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreatePipelineRequest clone() {
        return (CreatePipelineRequest) super.clone();
    }

}
