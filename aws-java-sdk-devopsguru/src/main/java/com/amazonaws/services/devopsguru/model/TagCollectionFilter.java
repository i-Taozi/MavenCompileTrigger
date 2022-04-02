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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of Amazon Web Services tags used to filter insights. This is used to return insights generated from only
 * resources that contain the tags in the tag collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/TagCollectionFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagCollectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>Devops-guru-deployment-application</code> or
     * <code>Devops-guru-rds-application</code>. While <i>keys</i> are case-sensitive, the case of <i>key</i> characters
     * don't matter to DevOps Guru. For example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code>
     * and a <i>key</i> named <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application
     * might be <code>Devops-Guru-production-application/RDS</code> or
     * <code>Devops-Guru-production-application/containers</code>.
     * </p>
     * </important>
     */
    private String appBoundaryKey;
    /**
     * <p>
     * The values in an Amazon Web Services tag collection.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>Devops-guru-deployment-application</code> or
     * <code>Devops-guru-rds-application</code>. While <i>keys</i> are case-sensitive, the case of <i>key</i> characters
     * don't matter to DevOps Guru. For example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code>
     * and a <i>key</i> named <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application
     * might be <code>Devops-Guru-production-application/RDS</code> or
     * <code>Devops-Guru-production-application/containers</code>.
     * </p>
     * </important>
     * 
     * @param appBoundaryKey
     *        An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that
     *        DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this
     *        <i>key</i> make up your DevOps Guru application and analysis boundary.</p> <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>Devops-guru-deployment-application</code> or <code>Devops-guru-rds-application</code>. While
     *        <i>keys</i> are case-sensitive, the case of <i>key</i> characters don't matter to DevOps Guru. For
     *        example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named
     *        <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     */

    public void setAppBoundaryKey(String appBoundaryKey) {
        this.appBoundaryKey = appBoundaryKey;
    }

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>Devops-guru-deployment-application</code> or
     * <code>Devops-guru-rds-application</code>. While <i>keys</i> are case-sensitive, the case of <i>key</i> characters
     * don't matter to DevOps Guru. For example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code>
     * and a <i>key</i> named <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application
     * might be <code>Devops-Guru-production-application/RDS</code> or
     * <code>Devops-Guru-production-application/containers</code>.
     * </p>
     * </important>
     * 
     * @return An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that
     *         DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this
     *         <i>key</i> make up your DevOps Guru application and analysis boundary.</p> <important>
     *         <p>
     *         The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *         the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *         <code>Devops-guru-deployment-application</code> or <code>Devops-guru-rds-application</code>. While
     *         <i>keys</i> are case-sensitive, the case of <i>key</i> characters don't matter to DevOps Guru. For
     *         example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named
     *         <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *         <code>Devops-Guru-production-application/RDS</code> or
     *         <code>Devops-Guru-production-application/containers</code>.
     *         </p>
     */

    public String getAppBoundaryKey() {
        return this.appBoundaryKey;
    }

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>Devops-guru-deployment-application</code> or
     * <code>Devops-guru-rds-application</code>. While <i>keys</i> are case-sensitive, the case of <i>key</i> characters
     * don't matter to DevOps Guru. For example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code>
     * and a <i>key</i> named <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application
     * might be <code>Devops-Guru-production-application/RDS</code> or
     * <code>Devops-Guru-production-application/containers</code>.
     * </p>
     * </important>
     * 
     * @param appBoundaryKey
     *        An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that
     *        DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this
     *        <i>key</i> make up your DevOps Guru application and analysis boundary.</p> <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>Devops-guru-deployment-application</code> or <code>Devops-guru-rds-application</code>. While
     *        <i>keys</i> are case-sensitive, the case of <i>key</i> characters don't matter to DevOps Guru. For
     *        example, DevOps Guru works with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named
     *        <code>DevOps-Guru-RDS</code>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagCollectionFilter withAppBoundaryKey(String appBoundaryKey) {
        setAppBoundaryKey(appBoundaryKey);
        return this;
    }

    /**
     * <p>
     * The values in an Amazon Web Services tag collection.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * 
     * @return The values in an Amazon Web Services tag collection.</p>
     *         <p>
     *         The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *         example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *         <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *         string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *         characters for a tag value.
     */

    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * The values in an Amazon Web Services tag collection.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * 
     * @param tagValues
     *        The values in an Amazon Web Services tag collection.</p>
     *        <p>
     *        The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *        example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *        <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *        characters for a tag value.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * The values in an Amazon Web Services tag collection.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        The values in an Amazon Web Services tag collection.</p>
     *        <p>
     *        The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *        example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *        <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *        characters for a tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagCollectionFilter withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new java.util.ArrayList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values in an Amazon Web Services tag collection.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * 
     * @param tagValues
     *        The values in an Amazon Web Services tag collection.</p>
     *        <p>
     *        The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *        example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *        <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *        characters for a tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagCollectionFilter withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getAppBoundaryKey() != null)
            sb.append("AppBoundaryKey: ").append(getAppBoundaryKey()).append(",");
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagCollectionFilter == false)
            return false;
        TagCollectionFilter other = (TagCollectionFilter) obj;
        if (other.getAppBoundaryKey() == null ^ this.getAppBoundaryKey() == null)
            return false;
        if (other.getAppBoundaryKey() != null && other.getAppBoundaryKey().equals(this.getAppBoundaryKey()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBoundaryKey() == null) ? 0 : getAppBoundaryKey().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public TagCollectionFilter clone() {
        try {
            return (TagCollectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.TagCollectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
