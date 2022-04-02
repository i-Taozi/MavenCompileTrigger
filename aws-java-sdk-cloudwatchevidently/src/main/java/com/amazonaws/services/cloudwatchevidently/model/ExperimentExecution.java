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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains the date and time that the experiment started and ended.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ExperimentExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the experiment ended.
     * </p>
     */
    private java.util.Date endedTime;
    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     */
    private java.util.Date startedTime;

    /**
     * <p>
     * The date and time that the experiment ended.
     * </p>
     * 
     * @param endedTime
     *        The date and time that the experiment ended.
     */

    public void setEndedTime(java.util.Date endedTime) {
        this.endedTime = endedTime;
    }

    /**
     * <p>
     * The date and time that the experiment ended.
     * </p>
     * 
     * @return The date and time that the experiment ended.
     */

    public java.util.Date getEndedTime() {
        return this.endedTime;
    }

    /**
     * <p>
     * The date and time that the experiment ended.
     * </p>
     * 
     * @param endedTime
     *        The date and time that the experiment ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentExecution withEndedTime(java.util.Date endedTime) {
        setEndedTime(endedTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     * 
     * @param startedTime
     *        The date and time that the experiment started.
     */

    public void setStartedTime(java.util.Date startedTime) {
        this.startedTime = startedTime;
    }

    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     * 
     * @return The date and time that the experiment started.
     */

    public java.util.Date getStartedTime() {
        return this.startedTime;
    }

    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     * 
     * @param startedTime
     *        The date and time that the experiment started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentExecution withStartedTime(java.util.Date startedTime) {
        setStartedTime(startedTime);
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
        if (getEndedTime() != null)
            sb.append("EndedTime: ").append(getEndedTime()).append(",");
        if (getStartedTime() != null)
            sb.append("StartedTime: ").append(getStartedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentExecution == false)
            return false;
        ExperimentExecution other = (ExperimentExecution) obj;
        if (other.getEndedTime() == null ^ this.getEndedTime() == null)
            return false;
        if (other.getEndedTime() != null && other.getEndedTime().equals(this.getEndedTime()) == false)
            return false;
        if (other.getStartedTime() == null ^ this.getStartedTime() == null)
            return false;
        if (other.getStartedTime() != null && other.getStartedTime().equals(this.getStartedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndedTime() == null) ? 0 : getEndedTime().hashCode());
        hashCode = prime * hashCode + ((getStartedTime() == null) ? 0 : getStartedTime().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentExecution clone() {
        try {
            return (ExperimentExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ExperimentExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
