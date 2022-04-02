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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoveryInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoveryInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A set of filters by which to return Recovery Instances.
     * </p>
     */
    private DescribeRecoveryInstancesRequestFilters filters;
    /**
     * <p>
     * Maximum number of Recovery Instances to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token of the next Recovery Instance to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A set of filters by which to return Recovery Instances.
     * </p>
     * 
     * @param filters
     *        A set of filters by which to return Recovery Instances.
     */

    public void setFilters(DescribeRecoveryInstancesRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A set of filters by which to return Recovery Instances.
     * </p>
     * 
     * @return A set of filters by which to return Recovery Instances.
     */

    public DescribeRecoveryInstancesRequestFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A set of filters by which to return Recovery Instances.
     * </p>
     * 
     * @param filters
     *        A set of filters by which to return Recovery Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequest withFilters(DescribeRecoveryInstancesRequestFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Maximum number of Recovery Instances to retrieve.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of Recovery Instances to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of Recovery Instances to retrieve.
     * </p>
     * 
     * @return Maximum number of Recovery Instances to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of Recovery Instances to retrieve.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of Recovery Instances to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token of the next Recovery Instance to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next Recovery Instance to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token of the next Recovery Instance to retrieve.
     * </p>
     * 
     * @return The token of the next Recovery Instance to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token of the next Recovery Instance to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next Recovery Instance to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeRecoveryInstancesRequest == false)
            return false;
        DescribeRecoveryInstancesRequest other = (DescribeRecoveryInstancesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecoveryInstancesRequest clone() {
        return (DescribeRecoveryInstancesRequest) super.clone();
    }

}
