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
 * This structure defines the traffic allocation percentages among the feature variations during one step of a launch,
 * and the start time of that step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ScheduledSplit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledSplit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     */
    private java.util.Map<String, Long> groupWeights;
    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * 
     * @return The traffic allocation percentages among the feature variations during one step of a launch. This is a
     *         set of key-value pairs. The keys are variation names. The values represent the percentage of traffic to
     *         allocate to that variation during this step.
     */

    public java.util.Map<String, Long> getGroupWeights() {
        return groupWeights;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * 
     * @param groupWeights
     *        The traffic allocation percentages among the feature variations during one step of a launch. This is a set
     *        of key-value pairs. The keys are variation names. The values represent the percentage of traffic to
     *        allocate to that variation during this step.
     */

    public void setGroupWeights(java.util.Map<String, Long> groupWeights) {
        this.groupWeights = groupWeights;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * 
     * @param groupWeights
     *        The traffic allocation percentages among the feature variations during one step of a launch. This is a set
     *        of key-value pairs. The keys are variation names. The values represent the percentage of traffic to
     *        allocate to that variation during this step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit withGroupWeights(java.util.Map<String, Long> groupWeights) {
        setGroupWeights(groupWeights);
        return this;
    }

    /**
     * Add a single GroupWeights entry
     *
     * @see ScheduledSplit#withGroupWeights
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit addGroupWeightsEntry(String key, Long value) {
        if (null == this.groupWeights) {
            this.groupWeights = new java.util.HashMap<String, Long>();
        }
        if (this.groupWeights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.groupWeights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GroupWeights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit clearGroupWeightsEntries() {
        this.groupWeights = null;
        return this;
    }

    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     * 
     * @param startTime
     *        The date and time that this step of the launch starts.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     * 
     * @return The date and time that this step of the launch starts.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     * 
     * @param startTime
     *        The date and time that this step of the launch starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getGroupWeights() != null)
            sb.append("GroupWeights: ").append(getGroupWeights()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledSplit == false)
            return false;
        ScheduledSplit other = (ScheduledSplit) obj;
        if (other.getGroupWeights() == null ^ this.getGroupWeights() == null)
            return false;
        if (other.getGroupWeights() != null && other.getGroupWeights().equals(this.getGroupWeights()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupWeights() == null) ? 0 : getGroupWeights().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledSplit clone() {
        try {
            return (ScheduledSplit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ScheduledSplitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
