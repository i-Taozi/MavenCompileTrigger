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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/BatchEvaluateFeature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEvaluateFeatureResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures, where each structure displays the results of one feature evaluation assignment to one
     * user session.
     * </p>
     */
    private java.util.List<EvaluationResult> results;

    /**
     * <p>
     * An array of structures, where each structure displays the results of one feature evaluation assignment to one
     * user session.
     * </p>
     * 
     * @return An array of structures, where each structure displays the results of one feature evaluation assignment to
     *         one user session.
     */

    public java.util.List<EvaluationResult> getResults() {
        return results;
    }

    /**
     * <p>
     * An array of structures, where each structure displays the results of one feature evaluation assignment to one
     * user session.
     * </p>
     * 
     * @param results
     *        An array of structures, where each structure displays the results of one feature evaluation assignment to
     *        one user session.
     */

    public void setResults(java.util.Collection<EvaluationResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<EvaluationResult>(results);
    }

    /**
     * <p>
     * An array of structures, where each structure displays the results of one feature evaluation assignment to one
     * user session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        An array of structures, where each structure displays the results of one feature evaluation assignment to
     *        one user session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateFeatureResult withResults(EvaluationResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<EvaluationResult>(results.length));
        }
        for (EvaluationResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure displays the results of one feature evaluation assignment to one
     * user session.
     * </p>
     * 
     * @param results
     *        An array of structures, where each structure displays the results of one feature evaluation assignment to
     *        one user session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateFeatureResult withResults(java.util.Collection<EvaluationResult> results) {
        setResults(results);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEvaluateFeatureResult == false)
            return false;
        BatchEvaluateFeatureResult other = (BatchEvaluateFeatureResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public BatchEvaluateFeatureResult clone() {
        try {
            return (BatchEvaluateFeatureResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
