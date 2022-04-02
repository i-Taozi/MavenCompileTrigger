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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLineageGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLineageGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of lineage groups and their properties.
     * </p>
     */
    private java.util.List<LineageGroupSummary> lineageGroupSummaries;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of lineage groups and their properties.
     * </p>
     * 
     * @return A list of lineage groups and their properties.
     */

    public java.util.List<LineageGroupSummary> getLineageGroupSummaries() {
        return lineageGroupSummaries;
    }

    /**
     * <p>
     * A list of lineage groups and their properties.
     * </p>
     * 
     * @param lineageGroupSummaries
     *        A list of lineage groups and their properties.
     */

    public void setLineageGroupSummaries(java.util.Collection<LineageGroupSummary> lineageGroupSummaries) {
        if (lineageGroupSummaries == null) {
            this.lineageGroupSummaries = null;
            return;
        }

        this.lineageGroupSummaries = new java.util.ArrayList<LineageGroupSummary>(lineageGroupSummaries);
    }

    /**
     * <p>
     * A list of lineage groups and their properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineageGroupSummaries(java.util.Collection)} or
     * {@link #withLineageGroupSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lineageGroupSummaries
     *        A list of lineage groups and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsResult withLineageGroupSummaries(LineageGroupSummary... lineageGroupSummaries) {
        if (this.lineageGroupSummaries == null) {
            setLineageGroupSummaries(new java.util.ArrayList<LineageGroupSummary>(lineageGroupSummaries.length));
        }
        for (LineageGroupSummary ele : lineageGroupSummaries) {
            this.lineageGroupSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lineage groups and their properties.
     * </p>
     * 
     * @param lineageGroupSummaries
     *        A list of lineage groups and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsResult withLineageGroupSummaries(java.util.Collection<LineageGroupSummary> lineageGroupSummaries) {
        setLineageGroupSummaries(lineageGroupSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it
     *        in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use
     *         it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the
     * subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it
     *        in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLineageGroupSummaries() != null)
            sb.append("LineageGroupSummaries: ").append(getLineageGroupSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLineageGroupsResult == false)
            return false;
        ListLineageGroupsResult other = (ListLineageGroupsResult) obj;
        if (other.getLineageGroupSummaries() == null ^ this.getLineageGroupSummaries() == null)
            return false;
        if (other.getLineageGroupSummaries() != null && other.getLineageGroupSummaries().equals(this.getLineageGroupSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineageGroupSummaries() == null) ? 0 : getLineageGroupSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLineageGroupsResult clone() {
        try {
            return (ListLineageGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
