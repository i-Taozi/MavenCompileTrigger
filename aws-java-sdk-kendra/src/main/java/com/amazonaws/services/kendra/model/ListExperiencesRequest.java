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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperiences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExperiencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Kendra
     * experiences.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of returned Amazon Kendra experiences.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the index for your Amazon Kendra experience.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperiencesRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Kendra
     * experiences.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *        pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     *        Kendra experiences.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Kendra
     * experiences.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *         pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     *         Kendra experiences.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of Amazon Kendra
     * experiences.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *        pagination token in the response. You can use this pagination token to retrieve the next set of Amazon
     *        Kendra experiences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperiencesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned Amazon Kendra experiences.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned Amazon Kendra experiences.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of returned Amazon Kendra experiences.
     * </p>
     * 
     * @return The maximum number of returned Amazon Kendra experiences.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of returned Amazon Kendra experiences.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned Amazon Kendra experiences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperiencesRequest withMaxResults(Integer maxResults) {
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
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

        if (obj instanceof ListExperiencesRequest == false)
            return false;
        ListExperiencesRequest other = (ListExperiencesRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListExperiencesRequest clone() {
        return (ListExperiencesRequest) super.clone();
    }

}
