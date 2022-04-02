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
 * Represents the drift check explainability baselines that can be used when the model monitor is set using the model
 * package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DriftCheckExplainability" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DriftCheckExplainability implements Serializable, Cloneable, StructuredPojo {

    private MetricsSource constraints;
    /**
     * <p>
     * The explainability config file for the model.
     * </p>
     */
    private FileSource configFile;

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

    public DriftCheckExplainability withConstraints(MetricsSource constraints) {
        setConstraints(constraints);
        return this;
    }

    /**
     * <p>
     * The explainability config file for the model.
     * </p>
     * 
     * @param configFile
     *        The explainability config file for the model.
     */

    public void setConfigFile(FileSource configFile) {
        this.configFile = configFile;
    }

    /**
     * <p>
     * The explainability config file for the model.
     * </p>
     * 
     * @return The explainability config file for the model.
     */

    public FileSource getConfigFile() {
        return this.configFile;
    }

    /**
     * <p>
     * The explainability config file for the model.
     * </p>
     * 
     * @param configFile
     *        The explainability config file for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckExplainability withConfigFile(FileSource configFile) {
        setConfigFile(configFile);
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
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints()).append(",");
        if (getConfigFile() != null)
            sb.append("ConfigFile: ").append(getConfigFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DriftCheckExplainability == false)
            return false;
        DriftCheckExplainability other = (DriftCheckExplainability) obj;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getConfigFile() == null ^ this.getConfigFile() == null)
            return false;
        if (other.getConfigFile() != null && other.getConfigFile().equals(this.getConfigFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getConfigFile() == null) ? 0 : getConfigFile().hashCode());
        return hashCode;
    }

    @Override
    public DriftCheckExplainability clone() {
        try {
            return (DriftCheckExplainability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DriftCheckExplainabilityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
