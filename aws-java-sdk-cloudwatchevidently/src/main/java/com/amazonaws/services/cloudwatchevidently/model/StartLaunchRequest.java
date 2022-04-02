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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StartLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartLaunchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the launch to start.
     * </p>
     */
    private String launch;
    /**
     * <p>
     * The name or ARN of the project that contains the launch to start.
     * </p>
     */
    private String project;

    /**
     * <p>
     * The name of the launch to start.
     * </p>
     * 
     * @param launch
     *        The name of the launch to start.
     */

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    /**
     * <p>
     * The name of the launch to start.
     * </p>
     * 
     * @return The name of the launch to start.
     */

    public String getLaunch() {
        return this.launch;
    }

    /**
     * <p>
     * The name of the launch to start.
     * </p>
     * 
     * @param launch
     *        The name of the launch to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLaunchRequest withLaunch(String launch) {
        setLaunch(launch);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch to start.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch to start.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch to start.
     * </p>
     * 
     * @return The name or ARN of the project that contains the launch to start.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the launch to start.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the launch to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartLaunchRequest withProject(String project) {
        setProject(project);
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
        if (getLaunch() != null)
            sb.append("Launch: ").append(getLaunch()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartLaunchRequest == false)
            return false;
        StartLaunchRequest other = (StartLaunchRequest) obj;
        if (other.getLaunch() == null ^ this.getLaunch() == null)
            return false;
        if (other.getLaunch() != null && other.getLaunch().equals(this.getLaunch()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunch() == null) ? 0 : getLaunch().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public StartLaunchRequest clone() {
        return (StartLaunchRequest) super.clone();
    }

}
