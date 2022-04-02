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
 * Represents the drift check bias baselines that can be used when the model monitor is set using the model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DriftCheckBias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DriftCheckBias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bias config file for a model.
     * </p>
     */
    private FileSource configFile;

    private MetricsSource preTrainingConstraints;

    private MetricsSource postTrainingConstraints;

    /**
     * <p>
     * The bias config file for a model.
     * </p>
     * 
     * @param configFile
     *        The bias config file for a model.
     */

    public void setConfigFile(FileSource configFile) {
        this.configFile = configFile;
    }

    /**
     * <p>
     * The bias config file for a model.
     * </p>
     * 
     * @return The bias config file for a model.
     */

    public FileSource getConfigFile() {
        return this.configFile;
    }

    /**
     * <p>
     * The bias config file for a model.
     * </p>
     * 
     * @param configFile
     *        The bias config file for a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBias withConfigFile(FileSource configFile) {
        setConfigFile(configFile);
        return this;
    }

    /**
     * @param preTrainingConstraints
     */

    public void setPreTrainingConstraints(MetricsSource preTrainingConstraints) {
        this.preTrainingConstraints = preTrainingConstraints;
    }

    /**
     * @return
     */

    public MetricsSource getPreTrainingConstraints() {
        return this.preTrainingConstraints;
    }

    /**
     * @param preTrainingConstraints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBias withPreTrainingConstraints(MetricsSource preTrainingConstraints) {
        setPreTrainingConstraints(preTrainingConstraints);
        return this;
    }

    /**
     * @param postTrainingConstraints
     */

    public void setPostTrainingConstraints(MetricsSource postTrainingConstraints) {
        this.postTrainingConstraints = postTrainingConstraints;
    }

    /**
     * @return
     */

    public MetricsSource getPostTrainingConstraints() {
        return this.postTrainingConstraints;
    }

    /**
     * @param postTrainingConstraints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DriftCheckBias withPostTrainingConstraints(MetricsSource postTrainingConstraints) {
        setPostTrainingConstraints(postTrainingConstraints);
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
        if (getConfigFile() != null)
            sb.append("ConfigFile: ").append(getConfigFile()).append(",");
        if (getPreTrainingConstraints() != null)
            sb.append("PreTrainingConstraints: ").append(getPreTrainingConstraints()).append(",");
        if (getPostTrainingConstraints() != null)
            sb.append("PostTrainingConstraints: ").append(getPostTrainingConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DriftCheckBias == false)
            return false;
        DriftCheckBias other = (DriftCheckBias) obj;
        if (other.getConfigFile() == null ^ this.getConfigFile() == null)
            return false;
        if (other.getConfigFile() != null && other.getConfigFile().equals(this.getConfigFile()) == false)
            return false;
        if (other.getPreTrainingConstraints() == null ^ this.getPreTrainingConstraints() == null)
            return false;
        if (other.getPreTrainingConstraints() != null && other.getPreTrainingConstraints().equals(this.getPreTrainingConstraints()) == false)
            return false;
        if (other.getPostTrainingConstraints() == null ^ this.getPostTrainingConstraints() == null)
            return false;
        if (other.getPostTrainingConstraints() != null && other.getPostTrainingConstraints().equals(this.getPostTrainingConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigFile() == null) ? 0 : getConfigFile().hashCode());
        hashCode = prime * hashCode + ((getPreTrainingConstraints() == null) ? 0 : getPreTrainingConstraints().hashCode());
        hashCode = prime * hashCode + ((getPostTrainingConstraints() == null) ? 0 : getPostTrainingConstraints().hashCode());
        return hashCode;
    }

    @Override
    public DriftCheckBias clone() {
        try {
            return (DriftCheckBias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DriftCheckBiasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
