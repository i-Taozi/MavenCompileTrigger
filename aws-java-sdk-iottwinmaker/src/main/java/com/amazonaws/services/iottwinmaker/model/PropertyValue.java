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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a value for a time series property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/PropertyValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     */
    private DataValue value;

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of a value for a time series property.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     * 
     * @return The timestamp of a value for a time series property.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of a value for a time series property.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of a value for a time series property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValue withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     * 
     * @param value
     *        An object that specifies a value for a time series property.
     */

    public void setValue(DataValue value) {
        this.value = value;
    }

    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     * 
     * @return An object that specifies a value for a time series property.
     */

    public DataValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * An object that specifies a value for a time series property.
     * </p>
     * 
     * @param value
     *        An object that specifies a value for a time series property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValue withValue(DataValue value) {
        setValue(value);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyValue == false)
            return false;
        PropertyValue other = (PropertyValue) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PropertyValue clone() {
        try {
            return (PropertyValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.PropertyValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
