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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecretsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the secrets in the account.
     * </p>
     */
    private java.util.List<SecretListEntry> secretList;
    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the secrets in the account.
     * </p>
     * 
     * @return A list of the secrets in the account.
     */

    public java.util.List<SecretListEntry> getSecretList() {
        return secretList;
    }

    /**
     * <p>
     * A list of the secrets in the account.
     * </p>
     * 
     * @param secretList
     *        A list of the secrets in the account.
     */

    public void setSecretList(java.util.Collection<SecretListEntry> secretList) {
        if (secretList == null) {
            this.secretList = null;
            return;
        }

        this.secretList = new java.util.ArrayList<SecretListEntry>(secretList);
    }

    /**
     * <p>
     * A list of the secrets in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretList(java.util.Collection)} or {@link #withSecretList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param secretList
     *        A list of the secrets in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsResult withSecretList(SecretListEntry... secretList) {
        if (this.secretList == null) {
            setSecretList(new java.util.ArrayList<SecretListEntry>(secretList.length));
        }
        for (SecretListEntry ele : secretList) {
            this.secretList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the secrets in the account.
     * </p>
     * 
     * @param secretList
     *        A list of the secrets in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsResult withSecretList(java.util.Collection<SecretListEntry> secretList) {
        setSecretList(secretList);
        return this;
    }

    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        Secrets Manager includes this value if there's more output available than what is included in the current
     *        response. This can occur even when the response includes no values at all, such as when you ask for a
     *        filtered view of a long list. To get the next results, call <code>ListSecrets</code> again with this
     *        value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     * 
     * @return Secrets Manager includes this value if there's more output available than what is included in the current
     *         response. This can occur even when the response includes no values at all, such as when you ask for a
     *         filtered view of a long list. To get the next results, call <code>ListSecrets</code> again with this
     *         value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Secrets Manager includes this value if there's more output available than what is included in the current
     * response. This can occur even when the response includes no values at all, such as when you ask for a filtered
     * view of a long list. To get the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        Secrets Manager includes this value if there's more output available than what is included in the current
     *        response. This can occur even when the response includes no values at all, such as when you ask for a
     *        filtered view of a long list. To get the next results, call <code>ListSecrets</code> again with this
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsResult withNextToken(String nextToken) {
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
        if (getSecretList() != null)
            sb.append("SecretList: ").append(getSecretList()).append(",");
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

        if (obj instanceof ListSecretsResult == false)
            return false;
        ListSecretsResult other = (ListSecretsResult) obj;
        if (other.getSecretList() == null ^ this.getSecretList() == null)
            return false;
        if (other.getSecretList() != null && other.getSecretList().equals(this.getSecretList()) == false)
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

        hashCode = prime * hashCode + ((getSecretList() == null) ? 0 : getSecretList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSecretsResult clone() {
        try {
            return (ListSecretsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
