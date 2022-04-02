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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDomainName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainNameResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration for the <code>DomainName</code>.
     * </p>
     */
    private DomainNameConfig domainNameConfig;

    /**
     * <p>
     * The configuration for the <code>DomainName</code>.
     * </p>
     * 
     * @param domainNameConfig
     *        The configuration for the <code>DomainName</code>.
     */

    public void setDomainNameConfig(DomainNameConfig domainNameConfig) {
        this.domainNameConfig = domainNameConfig;
    }

    /**
     * <p>
     * The configuration for the <code>DomainName</code>.
     * </p>
     * 
     * @return The configuration for the <code>DomainName</code>.
     */

    public DomainNameConfig getDomainNameConfig() {
        return this.domainNameConfig;
    }

    /**
     * <p>
     * The configuration for the <code>DomainName</code>.
     * </p>
     * 
     * @param domainNameConfig
     *        The configuration for the <code>DomainName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainNameResult withDomainNameConfig(DomainNameConfig domainNameConfig) {
        setDomainNameConfig(domainNameConfig);
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
        if (getDomainNameConfig() != null)
            sb.append("DomainNameConfig: ").append(getDomainNameConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainNameResult == false)
            return false;
        GetDomainNameResult other = (GetDomainNameResult) obj;
        if (other.getDomainNameConfig() == null ^ this.getDomainNameConfig() == null)
            return false;
        if (other.getDomainNameConfig() != null && other.getDomainNameConfig().equals(this.getDomainNameConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainNameConfig() == null) ? 0 : getDomainNameConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainNameResult clone() {
        try {
            return (GetDomainNameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
