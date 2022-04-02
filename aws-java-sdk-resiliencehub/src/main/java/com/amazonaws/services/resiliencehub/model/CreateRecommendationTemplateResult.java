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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateRecommendationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRecommendationTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created recommendation template, returned as an object. This object includes the template's name,
     * format, status, tags, Amazon S3 bucket location, and more.
     * </p>
     */
    private RecommendationTemplate recommendationTemplate;

    /**
     * <p>
     * The newly created recommendation template, returned as an object. This object includes the template's name,
     * format, status, tags, Amazon S3 bucket location, and more.
     * </p>
     * 
     * @param recommendationTemplate
     *        The newly created recommendation template, returned as an object. This object includes the template's
     *        name, format, status, tags, Amazon S3 bucket location, and more.
     */

    public void setRecommendationTemplate(RecommendationTemplate recommendationTemplate) {
        this.recommendationTemplate = recommendationTemplate;
    }

    /**
     * <p>
     * The newly created recommendation template, returned as an object. This object includes the template's name,
     * format, status, tags, Amazon S3 bucket location, and more.
     * </p>
     * 
     * @return The newly created recommendation template, returned as an object. This object includes the template's
     *         name, format, status, tags, Amazon S3 bucket location, and more.
     */

    public RecommendationTemplate getRecommendationTemplate() {
        return this.recommendationTemplate;
    }

    /**
     * <p>
     * The newly created recommendation template, returned as an object. This object includes the template's name,
     * format, status, tags, Amazon S3 bucket location, and more.
     * </p>
     * 
     * @param recommendationTemplate
     *        The newly created recommendation template, returned as an object. This object includes the template's
     *        name, format, status, tags, Amazon S3 bucket location, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommendationTemplateResult withRecommendationTemplate(RecommendationTemplate recommendationTemplate) {
        setRecommendationTemplate(recommendationTemplate);
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
        if (getRecommendationTemplate() != null)
            sb.append("RecommendationTemplate: ").append(getRecommendationTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRecommendationTemplateResult == false)
            return false;
        CreateRecommendationTemplateResult other = (CreateRecommendationTemplateResult) obj;
        if (other.getRecommendationTemplate() == null ^ this.getRecommendationTemplate() == null)
            return false;
        if (other.getRecommendationTemplate() != null && other.getRecommendationTemplate().equals(this.getRecommendationTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationTemplate() == null) ? 0 : getRecommendationTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreateRecommendationTemplateResult clone() {
        try {
            return (CreateRecommendationTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
