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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLensSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String lensAlias;
    /**
     * <p>
     * The Amazon Web Services account ID or IAM role with which the lens is shared.
     * </p>
     */
    private String sharedWithPrefix;

    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     */
    private Integer maxResults;

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID or IAM role with which the lens is shared.
     * </p>
     * 
     * @param sharedWithPrefix
     *        The Amazon Web Services account ID or IAM role with which the lens is shared.
     */

    public void setSharedWithPrefix(String sharedWithPrefix) {
        this.sharedWithPrefix = sharedWithPrefix;
    }

    /**
     * <p>
     * The Amazon Web Services account ID or IAM role with which the lens is shared.
     * </p>
     * 
     * @return The Amazon Web Services account ID or IAM role with which the lens is shared.
     */

    public String getSharedWithPrefix() {
        return this.sharedWithPrefix;
    }

    /**
     * <p>
     * The Amazon Web Services account ID or IAM role with which the lens is shared.
     * </p>
     * 
     * @param sharedWithPrefix
     *        The Amazon Web Services account ID or IAM role with which the lens is shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesRequest withSharedWithPrefix(String sharedWithPrefix) {
        setSharedWithPrefix(sharedWithPrefix);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @return The maximum number of results to return for this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensSharesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getSharedWithPrefix() != null)
            sb.append("SharedWithPrefix: ").append(getSharedWithPrefix()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLensSharesRequest == false)
            return false;
        ListLensSharesRequest other = (ListLensSharesRequest) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getSharedWithPrefix() == null ^ this.getSharedWithPrefix() == null)
            return false;
        if (other.getSharedWithPrefix() != null && other.getSharedWithPrefix().equals(this.getSharedWithPrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getSharedWithPrefix() == null) ? 0 : getSharedWithPrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLensSharesRequest clone() {
        return (ListLensSharesRequest) super.clone();
    }

}
