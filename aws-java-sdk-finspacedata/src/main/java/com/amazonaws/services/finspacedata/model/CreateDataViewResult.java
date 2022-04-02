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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Response for creating a data view.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataViewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Dataset used for the Dataview.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * The unique identifier for the created Dataview.
     * </p>
     */
    private String dataViewId;

    /**
     * <p>
     * The unique identifier of the Dataset used for the Dataview.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier of the Dataset used for the Dataview.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier of the Dataset used for the Dataview.
     * </p>
     * 
     * @return The unique identifier of the Dataset used for the Dataview.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier of the Dataset used for the Dataview.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier of the Dataset used for the Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewResult withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the created Dataview.
     * </p>
     * 
     * @param dataViewId
     *        The unique identifier for the created Dataview.
     */

    public void setDataViewId(String dataViewId) {
        this.dataViewId = dataViewId;
    }

    /**
     * <p>
     * The unique identifier for the created Dataview.
     * </p>
     * 
     * @return The unique identifier for the created Dataview.
     */

    public String getDataViewId() {
        return this.dataViewId;
    }

    /**
     * <p>
     * The unique identifier for the created Dataview.
     * </p>
     * 
     * @param dataViewId
     *        The unique identifier for the created Dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataViewResult withDataViewId(String dataViewId) {
        setDataViewId(dataViewId);
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
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getDataViewId() != null)
            sb.append("DataViewId: ").append(getDataViewId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataViewResult == false)
            return false;
        CreateDataViewResult other = (CreateDataViewResult) obj;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getDataViewId() == null ^ this.getDataViewId() == null)
            return false;
        if (other.getDataViewId() != null && other.getDataViewId().equals(this.getDataViewId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getDataViewId() == null) ? 0 : getDataViewId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataViewResult clone() {
        try {
            return (CreateDataViewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
