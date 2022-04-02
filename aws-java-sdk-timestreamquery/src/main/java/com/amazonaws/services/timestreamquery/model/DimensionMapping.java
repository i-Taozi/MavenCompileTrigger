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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This type is used to map column(s) from the query result to a dimension in the destination table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DimensionMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Column name from query result.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Type for the dimension.
     * </p>
     */
    private String dimensionValueType;

    /**
     * <p>
     * Column name from query result.
     * </p>
     * 
     * @param name
     *        Column name from query result.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Column name from query result.
     * </p>
     * 
     * @return Column name from query result.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Column name from query result.
     * </p>
     * 
     * @param name
     *        Column name from query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionMapping withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Type for the dimension.
     * </p>
     * 
     * @param dimensionValueType
     *        Type for the dimension.
     * @see DimensionValueType
     */

    public void setDimensionValueType(String dimensionValueType) {
        this.dimensionValueType = dimensionValueType;
    }

    /**
     * <p>
     * Type for the dimension.
     * </p>
     * 
     * @return Type for the dimension.
     * @see DimensionValueType
     */

    public String getDimensionValueType() {
        return this.dimensionValueType;
    }

    /**
     * <p>
     * Type for the dimension.
     * </p>
     * 
     * @param dimensionValueType
     *        Type for the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueType
     */

    public DimensionMapping withDimensionValueType(String dimensionValueType) {
        setDimensionValueType(dimensionValueType);
        return this;
    }

    /**
     * <p>
     * Type for the dimension.
     * </p>
     * 
     * @param dimensionValueType
     *        Type for the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueType
     */

    public DimensionMapping withDimensionValueType(DimensionValueType dimensionValueType) {
        this.dimensionValueType = dimensionValueType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDimensionValueType() != null)
            sb.append("DimensionValueType: ").append(getDimensionValueType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionMapping == false)
            return false;
        DimensionMapping other = (DimensionMapping) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDimensionValueType() == null ^ this.getDimensionValueType() == null)
            return false;
        if (other.getDimensionValueType() != null && other.getDimensionValueType().equals(this.getDimensionValueType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDimensionValueType() == null) ? 0 : getDimensionValueType().hashCode());
        return hashCode;
    }

    @Override
    public DimensionMapping clone() {
        try {
            return (DimensionMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.DimensionMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
