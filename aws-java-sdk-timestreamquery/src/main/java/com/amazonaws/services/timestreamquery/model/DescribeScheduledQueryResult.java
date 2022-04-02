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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeScheduledQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The scheduled query.
     * </p>
     */
    private ScheduledQueryDescription scheduledQuery;

    /**
     * <p>
     * The scheduled query.
     * </p>
     * 
     * @param scheduledQuery
     *        The scheduled query.
     */

    public void setScheduledQuery(ScheduledQueryDescription scheduledQuery) {
        this.scheduledQuery = scheduledQuery;
    }

    /**
     * <p>
     * The scheduled query.
     * </p>
     * 
     * @return The scheduled query.
     */

    public ScheduledQueryDescription getScheduledQuery() {
        return this.scheduledQuery;
    }

    /**
     * <p>
     * The scheduled query.
     * </p>
     * 
     * @param scheduledQuery
     *        The scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledQueryResult withScheduledQuery(ScheduledQueryDescription scheduledQuery) {
        setScheduledQuery(scheduledQuery);
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
        if (getScheduledQuery() != null)
            sb.append("ScheduledQuery: ").append(getScheduledQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledQueryResult == false)
            return false;
        DescribeScheduledQueryResult other = (DescribeScheduledQueryResult) obj;
        if (other.getScheduledQuery() == null ^ this.getScheduledQuery() == null)
            return false;
        if (other.getScheduledQuery() != null && other.getScheduledQuery().equals(this.getScheduledQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledQuery() == null) ? 0 : getScheduledQuery().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledQueryResult clone() {
        try {
            return (DescribeScheduledQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
