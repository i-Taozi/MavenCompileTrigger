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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteService"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application that the service is in.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The current state of the service.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the application that the service is in.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that the service is in.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that the service is in.
     * </p>
     * 
     * @return The ID of the application that the service is in.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application that the service is in.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that the service is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @return The unique identifier of the environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the service was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the service was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the service was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the service was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The unique identifier of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @return The unique identifier of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The unique identifier of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceResult withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @param state
     *        The current state of the service.
     * @see ServiceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @return The current state of the service.
     * @see ServiceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @param state
     *        The current state of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceState
     */

    public DeleteServiceResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the service.
     * </p>
     * 
     * @param state
     *        The current state of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceState
     */

    public DeleteServiceResult withState(ServiceState state) {
        this.state = state.toString();
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServiceResult == false)
            return false;
        DeleteServiceResult other = (DeleteServiceResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteServiceResult clone() {
        try {
            return (DeleteServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
