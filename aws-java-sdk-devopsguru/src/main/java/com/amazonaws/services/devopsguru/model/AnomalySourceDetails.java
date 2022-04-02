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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the source of the anomalous operational data that triggered the anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AnomalySourceDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalySourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed CloudWatch
     * metrics that show anomalous behavior.
     * </p>
     */
    private java.util.List<CloudWatchMetricsDetail> cloudWatchMetrics;
    /**
     * <p>
     * An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     * Performance Insights metrics that show anomalous behavior.
     * </p>
     */
    private java.util.List<PerformanceInsightsMetricsDetail> performanceInsightsMetrics;

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed CloudWatch
     * metrics that show anomalous behavior.
     * </p>
     * 
     * @return An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed
     *         CloudWatch metrics that show anomalous behavior.
     */

    public java.util.List<CloudWatchMetricsDetail> getCloudWatchMetrics() {
        return cloudWatchMetrics;
    }

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed CloudWatch
     * metrics that show anomalous behavior.
     * </p>
     * 
     * @param cloudWatchMetrics
     *        An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed
     *        CloudWatch metrics that show anomalous behavior.
     */

    public void setCloudWatchMetrics(java.util.Collection<CloudWatchMetricsDetail> cloudWatchMetrics) {
        if (cloudWatchMetrics == null) {
            this.cloudWatchMetrics = null;
            return;
        }

        this.cloudWatchMetrics = new java.util.ArrayList<CloudWatchMetricsDetail>(cloudWatchMetrics);
    }

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed CloudWatch
     * metrics that show anomalous behavior.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchMetrics(java.util.Collection)} or {@link #withCloudWatchMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchMetrics
     *        An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed
     *        CloudWatch metrics that show anomalous behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceDetails withCloudWatchMetrics(CloudWatchMetricsDetail... cloudWatchMetrics) {
        if (this.cloudWatchMetrics == null) {
            setCloudWatchMetrics(new java.util.ArrayList<CloudWatchMetricsDetail>(cloudWatchMetrics.length));
        }
        for (CloudWatchMetricsDetail ele : cloudWatchMetrics) {
            this.cloudWatchMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed CloudWatch
     * metrics that show anomalous behavior.
     * </p>
     * 
     * @param cloudWatchMetrics
     *        An array of <code>CloudWatchMetricsDetail</code> objects that contain information about analyzed
     *        CloudWatch metrics that show anomalous behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceDetails withCloudWatchMetrics(java.util.Collection<CloudWatchMetricsDetail> cloudWatchMetrics) {
        setCloudWatchMetrics(cloudWatchMetrics);
        return this;
    }

    /**
     * <p>
     * An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     * Performance Insights metrics that show anomalous behavior.
     * </p>
     * 
     * @return An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     *         Performance Insights metrics that show anomalous behavior.
     */

    public java.util.List<PerformanceInsightsMetricsDetail> getPerformanceInsightsMetrics() {
        return performanceInsightsMetrics;
    }

    /**
     * <p>
     * An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     * Performance Insights metrics that show anomalous behavior.
     * </p>
     * 
     * @param performanceInsightsMetrics
     *        An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     *        Performance Insights metrics that show anomalous behavior.
     */

    public void setPerformanceInsightsMetrics(java.util.Collection<PerformanceInsightsMetricsDetail> performanceInsightsMetrics) {
        if (performanceInsightsMetrics == null) {
            this.performanceInsightsMetrics = null;
            return;
        }

        this.performanceInsightsMetrics = new java.util.ArrayList<PerformanceInsightsMetricsDetail>(performanceInsightsMetrics);
    }

    /**
     * <p>
     * An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     * Performance Insights metrics that show anomalous behavior.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPerformanceInsightsMetrics(java.util.Collection)} or
     * {@link #withPerformanceInsightsMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param performanceInsightsMetrics
     *        An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     *        Performance Insights metrics that show anomalous behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceDetails withPerformanceInsightsMetrics(PerformanceInsightsMetricsDetail... performanceInsightsMetrics) {
        if (this.performanceInsightsMetrics == null) {
            setPerformanceInsightsMetrics(new java.util.ArrayList<PerformanceInsightsMetricsDetail>(performanceInsightsMetrics.length));
        }
        for (PerformanceInsightsMetricsDetail ele : performanceInsightsMetrics) {
            this.performanceInsightsMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     * Performance Insights metrics that show anomalous behavior.
     * </p>
     * 
     * @param performanceInsightsMetrics
     *        An array of <code>PerformanceInsightsMetricsDetail</code> objects that contain information about analyzed
     *        Performance Insights metrics that show anomalous behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySourceDetails withPerformanceInsightsMetrics(java.util.Collection<PerformanceInsightsMetricsDetail> performanceInsightsMetrics) {
        setPerformanceInsightsMetrics(performanceInsightsMetrics);
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
        if (getCloudWatchMetrics() != null)
            sb.append("CloudWatchMetrics: ").append(getCloudWatchMetrics()).append(",");
        if (getPerformanceInsightsMetrics() != null)
            sb.append("PerformanceInsightsMetrics: ").append(getPerformanceInsightsMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalySourceDetails == false)
            return false;
        AnomalySourceDetails other = (AnomalySourceDetails) obj;
        if (other.getCloudWatchMetrics() == null ^ this.getCloudWatchMetrics() == null)
            return false;
        if (other.getCloudWatchMetrics() != null && other.getCloudWatchMetrics().equals(this.getCloudWatchMetrics()) == false)
            return false;
        if (other.getPerformanceInsightsMetrics() == null ^ this.getPerformanceInsightsMetrics() == null)
            return false;
        if (other.getPerformanceInsightsMetrics() != null && other.getPerformanceInsightsMetrics().equals(this.getPerformanceInsightsMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchMetrics() == null) ? 0 : getCloudWatchMetrics().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsMetrics() == null) ? 0 : getPerformanceInsightsMetrics().hashCode());
        return hashCode;
    }

    @Override
    public AnomalySourceDetails clone() {
        try {
            return (AnomalySourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.AnomalySourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
