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
 * An error returned by the <code>BatchPutProperty</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/BatchPutPropertyError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutPropertyError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     * </p>
     */
    private PropertyValueEntry entry;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     * </p>
     * 
     * @param entry
     *        An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     */

    public void setEntry(PropertyValueEntry entry) {
        this.entry = entry;
    }

    /**
     * <p>
     * An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     * </p>
     * 
     * @return An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     */

    public PropertyValueEntry getEntry() {
        return this.entry;
    }

    /**
     * <p>
     * An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     * </p>
     * 
     * @param entry
     *        An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyError withEntry(PropertyValueEntry entry) {
        setEntry(entry);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @param errorMessage
     *        The error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @return The error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message.
     * </p>
     * 
     * @param errorMessage
     *        The error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutPropertyError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getEntry() != null)
            sb.append("Entry: ").append(getEntry()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutPropertyError == false)
            return false;
        BatchPutPropertyError other = (BatchPutPropertyError) obj;
        if (other.getEntry() == null ^ this.getEntry() == null)
            return false;
        if (other.getEntry() != null && other.getEntry().equals(this.getEntry()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutPropertyError clone() {
        try {
            return (BatchPutPropertyError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.BatchPutPropertyErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
