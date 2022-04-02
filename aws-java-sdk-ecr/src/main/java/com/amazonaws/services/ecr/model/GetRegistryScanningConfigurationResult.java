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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetRegistryScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegistryScanningConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the registry.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The scanning configuration for the registry.
     * </p>
     */
    private RegistryScanningConfiguration scanningConfiguration;

    /**
     * <p>
     * The ID of the registry.
     * </p>
     * 
     * @param registryId
     *        The ID of the registry.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The ID of the registry.
     * </p>
     * 
     * @return The ID of the registry.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The ID of the registry.
     * </p>
     * 
     * @param registryId
     *        The ID of the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegistryScanningConfigurationResult withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The scanning configuration for the registry.
     * </p>
     * 
     * @param scanningConfiguration
     *        The scanning configuration for the registry.
     */

    public void setScanningConfiguration(RegistryScanningConfiguration scanningConfiguration) {
        this.scanningConfiguration = scanningConfiguration;
    }

    /**
     * <p>
     * The scanning configuration for the registry.
     * </p>
     * 
     * @return The scanning configuration for the registry.
     */

    public RegistryScanningConfiguration getScanningConfiguration() {
        return this.scanningConfiguration;
    }

    /**
     * <p>
     * The scanning configuration for the registry.
     * </p>
     * 
     * @param scanningConfiguration
     *        The scanning configuration for the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegistryScanningConfigurationResult withScanningConfiguration(RegistryScanningConfiguration scanningConfiguration) {
        setScanningConfiguration(scanningConfiguration);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getScanningConfiguration() != null)
            sb.append("ScanningConfiguration: ").append(getScanningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegistryScanningConfigurationResult == false)
            return false;
        GetRegistryScanningConfigurationResult other = (GetRegistryScanningConfigurationResult) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getScanningConfiguration() == null ^ this.getScanningConfiguration() == null)
            return false;
        if (other.getScanningConfiguration() != null && other.getScanningConfiguration().equals(this.getScanningConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getScanningConfiguration() == null) ? 0 : getScanningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetRegistryScanningConfigurationResult clone() {
        try {
            return (GetRegistryScanningConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
