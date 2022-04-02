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
 * The summary of an in-progress deployment when an endpoint is creating or updating with a new endpoint configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PendingDeploymentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingDeploymentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint configuration used in the deployment.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * List of <code>PendingProductionVariantSummary</code> objects.
     * </p>
     */
    private java.util.List<PendingProductionVariantSummary> productionVariants;
    /**
     * <p>
     * The start time of the deployment.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The name of the endpoint configuration used in the deployment.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration used in the deployment.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration used in the deployment.
     * </p>
     * 
     * @return The name of the endpoint configuration used in the deployment.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration used in the deployment.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration used in the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingDeploymentSummary withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * List of <code>PendingProductionVariantSummary</code> objects.
     * </p>
     * 
     * @return List of <code>PendingProductionVariantSummary</code> objects.
     */

    public java.util.List<PendingProductionVariantSummary> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * List of <code>PendingProductionVariantSummary</code> objects.
     * </p>
     * 
     * @param productionVariants
     *        List of <code>PendingProductionVariantSummary</code> objects.
     */

    public void setProductionVariants(java.util.Collection<PendingProductionVariantSummary> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<PendingProductionVariantSummary>(productionVariants);
    }

    /**
     * <p>
     * List of <code>PendingProductionVariantSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductionVariants(java.util.Collection)} or {@link #withProductionVariants(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productionVariants
     *        List of <code>PendingProductionVariantSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingDeploymentSummary withProductionVariants(PendingProductionVariantSummary... productionVariants) {
        if (this.productionVariants == null) {
            setProductionVariants(new java.util.ArrayList<PendingProductionVariantSummary>(productionVariants.length));
        }
        for (PendingProductionVariantSummary ele : productionVariants) {
            this.productionVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>PendingProductionVariantSummary</code> objects.
     * </p>
     * 
     * @param productionVariants
     *        List of <code>PendingProductionVariantSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingDeploymentSummary withProductionVariants(java.util.Collection<PendingProductionVariantSummary> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * <p>
     * The start time of the deployment.
     * </p>
     * 
     * @param startTime
     *        The start time of the deployment.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the deployment.
     * </p>
     * 
     * @return The start time of the deployment.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the deployment.
     * </p>
     * 
     * @param startTime
     *        The start time of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingDeploymentSummary withStartTime(java.util.Date startTime) {
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: ").append(getProductionVariants()).append(",");
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

        if (obj instanceof PendingDeploymentSummary == false)
            return false;
        PendingDeploymentSummary other = (PendingDeploymentSummary) obj;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null && other.getProductionVariants().equals(this.getProductionVariants()) == false)
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

        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public PendingDeploymentSummary clone() {
        try {
            return (PendingDeploymentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PendingDeploymentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
