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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactReferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactReferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     */
    private java.util.List<ReferenceSummary> referenceSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @return Information about the contact flows.
     */

    public java.util.List<ReferenceSummary> getReferenceSummaryList() {
        return referenceSummaryList;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @param referenceSummaryList
     *        Information about the contact flows.
     */

    public void setReferenceSummaryList(java.util.Collection<ReferenceSummary> referenceSummaryList) {
        if (referenceSummaryList == null) {
            this.referenceSummaryList = null;
            return;
        }

        this.referenceSummaryList = new java.util.ArrayList<ReferenceSummary>(referenceSummaryList);
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceSummaryList(java.util.Collection)} or {@link #withReferenceSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param referenceSummaryList
     *        Information about the contact flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactReferencesResult withReferenceSummaryList(ReferenceSummary... referenceSummaryList) {
        if (this.referenceSummaryList == null) {
            setReferenceSummaryList(new java.util.ArrayList<ReferenceSummary>(referenceSummaryList.length));
        }
        for (ReferenceSummary ele : referenceSummaryList) {
            this.referenceSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @param referenceSummaryList
     *        Information about the contact flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactReferencesResult withReferenceSummaryList(java.util.Collection<ReferenceSummary> referenceSummaryList) {
        setReferenceSummaryList(referenceSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.</p> <important>
     *        <p>
     *        This is always returned as null in the response.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * 
     * @return If there are additional results, this is the token for the next set of results.</p> <important>
     *         <p>
     *         This is always returned as null in the response.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.</p> <important>
     *        <p>
     *        This is always returned as null in the response.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactReferencesResult withNextToken(String nextToken) {
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
        if (getReferenceSummaryList() != null)
            sb.append("ReferenceSummaryList: ").append(getReferenceSummaryList()).append(",");
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

        if (obj instanceof ListContactReferencesResult == false)
            return false;
        ListContactReferencesResult other = (ListContactReferencesResult) obj;
        if (other.getReferenceSummaryList() == null ^ this.getReferenceSummaryList() == null)
            return false;
        if (other.getReferenceSummaryList() != null && other.getReferenceSummaryList().equals(this.getReferenceSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getReferenceSummaryList() == null) ? 0 : getReferenceSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactReferencesResult clone() {
        try {
            return (ListContactReferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
