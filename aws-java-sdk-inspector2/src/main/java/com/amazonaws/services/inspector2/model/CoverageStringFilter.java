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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of a coverage string filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CoverageStringFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageStringFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to compare strings on.
     * </p>
     */
    private String comparison;
    /**
     * <p>
     * The value to compare strings on.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The operator to compare strings on.
     * </p>
     * 
     * @param comparison
     *        The operator to compare strings on.
     * @see CoverageStringComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The operator to compare strings on.
     * </p>
     * 
     * @return The operator to compare strings on.
     * @see CoverageStringComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The operator to compare strings on.
     * </p>
     * 
     * @param comparison
     *        The operator to compare strings on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStringComparison
     */

    public CoverageStringFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The operator to compare strings on.
     * </p>
     * 
     * @param comparison
     *        The operator to compare strings on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStringComparison
     */

    public CoverageStringFilter withComparison(CoverageStringComparison comparison) {
        this.comparison = comparison.toString();
        return this;
    }

    /**
     * <p>
     * The value to compare strings on.
     * </p>
     * 
     * @param value
     *        The value to compare strings on.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to compare strings on.
     * </p>
     * 
     * @return The value to compare strings on.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to compare strings on.
     * </p>
     * 
     * @param value
     *        The value to compare strings on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStringFilter withValue(String value) {
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
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison()).append(",");
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

        if (obj instanceof CoverageStringFilter == false)
            return false;
        CoverageStringFilter other = (CoverageStringFilter) obj;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
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

        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CoverageStringFilter clone() {
        try {
            return (CoverageStringFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CoverageStringFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
