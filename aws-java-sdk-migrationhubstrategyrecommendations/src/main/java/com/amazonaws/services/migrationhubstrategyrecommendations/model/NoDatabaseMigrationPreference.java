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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object containing details about database migration preferences, when you have no particular preference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/NoDatabaseMigrationPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoDatabaseMigrationPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target database engine for database migration preference that you specify.
     * </p>
     */
    private java.util.List<String> targetDatabaseEngine;

    /**
     * <p>
     * The target database engine for database migration preference that you specify.
     * </p>
     * 
     * @return The target database engine for database migration preference that you specify.
     * @see TargetDatabaseEngine
     */

    public java.util.List<String> getTargetDatabaseEngine() {
        return targetDatabaseEngine;
    }

    /**
     * <p>
     * The target database engine for database migration preference that you specify.
     * </p>
     * 
     * @param targetDatabaseEngine
     *        The target database engine for database migration preference that you specify.
     * @see TargetDatabaseEngine
     */

    public void setTargetDatabaseEngine(java.util.Collection<String> targetDatabaseEngine) {
        if (targetDatabaseEngine == null) {
            this.targetDatabaseEngine = null;
            return;
        }

        this.targetDatabaseEngine = new java.util.ArrayList<String>(targetDatabaseEngine);
    }

    /**
     * <p>
     * The target database engine for database migration preference that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetDatabaseEngine(java.util.Collection)} or {@link #withTargetDatabaseEngine(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetDatabaseEngine
     *        The target database engine for database migration preference that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDatabaseEngine
     */

    public NoDatabaseMigrationPreference withTargetDatabaseEngine(String... targetDatabaseEngine) {
        if (this.targetDatabaseEngine == null) {
            setTargetDatabaseEngine(new java.util.ArrayList<String>(targetDatabaseEngine.length));
        }
        for (String ele : targetDatabaseEngine) {
            this.targetDatabaseEngine.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target database engine for database migration preference that you specify.
     * </p>
     * 
     * @param targetDatabaseEngine
     *        The target database engine for database migration preference that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDatabaseEngine
     */

    public NoDatabaseMigrationPreference withTargetDatabaseEngine(java.util.Collection<String> targetDatabaseEngine) {
        setTargetDatabaseEngine(targetDatabaseEngine);
        return this;
    }

    /**
     * <p>
     * The target database engine for database migration preference that you specify.
     * </p>
     * 
     * @param targetDatabaseEngine
     *        The target database engine for database migration preference that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDatabaseEngine
     */

    public NoDatabaseMigrationPreference withTargetDatabaseEngine(TargetDatabaseEngine... targetDatabaseEngine) {
        java.util.ArrayList<String> targetDatabaseEngineCopy = new java.util.ArrayList<String>(targetDatabaseEngine.length);
        for (TargetDatabaseEngine value : targetDatabaseEngine) {
            targetDatabaseEngineCopy.add(value.toString());
        }
        if (getTargetDatabaseEngine() == null) {
            setTargetDatabaseEngine(targetDatabaseEngineCopy);
        } else {
            getTargetDatabaseEngine().addAll(targetDatabaseEngineCopy);
        }
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
        if (getTargetDatabaseEngine() != null)
            sb.append("TargetDatabaseEngine: ").append(getTargetDatabaseEngine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NoDatabaseMigrationPreference == false)
            return false;
        NoDatabaseMigrationPreference other = (NoDatabaseMigrationPreference) obj;
        if (other.getTargetDatabaseEngine() == null ^ this.getTargetDatabaseEngine() == null)
            return false;
        if (other.getTargetDatabaseEngine() != null && other.getTargetDatabaseEngine().equals(this.getTargetDatabaseEngine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetDatabaseEngine() == null) ? 0 : getTargetDatabaseEngine().hashCode());
        return hashCode;
    }

    @Override
    public NoDatabaseMigrationPreference clone() {
        try {
            return (NoDatabaseMigrationPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.NoDatabaseMigrationPreferenceMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
