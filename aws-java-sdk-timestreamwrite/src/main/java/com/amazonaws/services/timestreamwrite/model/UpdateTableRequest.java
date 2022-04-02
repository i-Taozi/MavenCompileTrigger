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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The retention duration of the memory store and the magnetic store.
     * </p>
     */
    private RetentionProperties retentionProperties;
    /**
     * <p>
     * Contains properties to set on the table when enabling magnetic store writes.
     * </p>
     */
    private MagneticStoreWriteProperties magneticStoreWriteProperties;

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @return The name of the Timestream database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timestream table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @return The name of the Timestream table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param tableName
     *        The name of the Timestream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The retention duration of the memory store and the magnetic store.
     * </p>
     * 
     * @param retentionProperties
     *        The retention duration of the memory store and the magnetic store.
     */

    public void setRetentionProperties(RetentionProperties retentionProperties) {
        this.retentionProperties = retentionProperties;
    }

    /**
     * <p>
     * The retention duration of the memory store and the magnetic store.
     * </p>
     * 
     * @return The retention duration of the memory store and the magnetic store.
     */

    public RetentionProperties getRetentionProperties() {
        return this.retentionProperties;
    }

    /**
     * <p>
     * The retention duration of the memory store and the magnetic store.
     * </p>
     * 
     * @param retentionProperties
     *        The retention duration of the memory store and the magnetic store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withRetentionProperties(RetentionProperties retentionProperties) {
        setRetentionProperties(retentionProperties);
        return this;
    }

    /**
     * <p>
     * Contains properties to set on the table when enabling magnetic store writes.
     * </p>
     * 
     * @param magneticStoreWriteProperties
     *        Contains properties to set on the table when enabling magnetic store writes.
     */

    public void setMagneticStoreWriteProperties(MagneticStoreWriteProperties magneticStoreWriteProperties) {
        this.magneticStoreWriteProperties = magneticStoreWriteProperties;
    }

    /**
     * <p>
     * Contains properties to set on the table when enabling magnetic store writes.
     * </p>
     * 
     * @return Contains properties to set on the table when enabling magnetic store writes.
     */

    public MagneticStoreWriteProperties getMagneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties;
    }

    /**
     * <p>
     * Contains properties to set on the table when enabling magnetic store writes.
     * </p>
     * 
     * @param magneticStoreWriteProperties
     *        Contains properties to set on the table when enabling magnetic store writes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTableRequest withMagneticStoreWriteProperties(MagneticStoreWriteProperties magneticStoreWriteProperties) {
        setMagneticStoreWriteProperties(magneticStoreWriteProperties);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getRetentionProperties() != null)
            sb.append("RetentionProperties: ").append(getRetentionProperties()).append(",");
        if (getMagneticStoreWriteProperties() != null)
            sb.append("MagneticStoreWriteProperties: ").append(getMagneticStoreWriteProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableRequest == false)
            return false;
        UpdateTableRequest other = (UpdateTableRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getRetentionProperties() == null ^ this.getRetentionProperties() == null)
            return false;
        if (other.getRetentionProperties() != null && other.getRetentionProperties().equals(this.getRetentionProperties()) == false)
            return false;
        if (other.getMagneticStoreWriteProperties() == null ^ this.getMagneticStoreWriteProperties() == null)
            return false;
        if (other.getMagneticStoreWriteProperties() != null && other.getMagneticStoreWriteProperties().equals(this.getMagneticStoreWriteProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getRetentionProperties() == null) ? 0 : getRetentionProperties().hashCode());
        hashCode = prime * hashCode + ((getMagneticStoreWriteProperties() == null) ? 0 : getMagneticStoreWriteProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTableRequest clone() {
        return (UpdateTableRequest) super.clone();
    }

}
