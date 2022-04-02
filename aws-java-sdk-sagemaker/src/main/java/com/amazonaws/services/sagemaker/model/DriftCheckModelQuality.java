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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the drift check model quality baselines that can be used when the model monitor is set using the model
 * package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DriftCheckModelQuality" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DriftCheckModelQuality implements Serializable, Cloneable, StructuredPojo {

    private MetricsSource statistics;

    private MetricsSource constraints;

    /**
     * @param statistics
     */

    public void setStatistics(MetricsSource statistics) {
        this.statistics = statistics;
    }

    /**
     * @return
     */

    public MetricsSource getStatistics() {
        return this.statistics;
    }

    /**
     * @param statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckModelQuality withStatistics(MetricsSource statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * @param constraints
     */

    public void setConstraints(MetricsSource constraints) {
        this.constraints = constraints;
    }

    /**
     * @return
     */

    public MetricsSource getConstraints() {
        return this.constraints;
    }

    /**
     * @param constraints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckModelQuality withConstraints(MetricsSource constraints) {
        setConstraints(constraints);
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
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DriftCheckModelQuality == false)
            return false;
        DriftCheckModelQuality other = (DriftCheckModelQuality) obj;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        return hashCode;
    }

    @Override
    public DriftCheckModelQuality clone() {
        try {
            return (DriftCheckModelQuality) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DriftCheckModelQualityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
