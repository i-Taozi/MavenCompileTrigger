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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateMulticastGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMulticastGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;
    /**
     * <p>
     * The description of the multicast group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     */
    private String clientRequestToken;

    private LoRaWANMulticast loRaWAN;

    private java.util.List<Tag> tags;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMulticastGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the multicast group.
     * </p>
     * 
     * @param description
     *        The description of the multicast group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the multicast group.
     * </p>
     * 
     * @return The description of the multicast group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the multicast group.
     * </p>
     * 
     * @param description
     *        The description of the multicast group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMulticastGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. If you try to create a new resource with the same
     *        token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @return Each resource must have a unique client request token. If you try to create a new resource with the same
     *         token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *         automatically generate a unique client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Each resource must have a unique client request token. If you try to create a new resource with the same token as
     * a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate
     * a unique client request.
     * </p>
     * 
     * @param clientRequestToken
     *        Each resource must have a unique client request token. If you try to create a new resource with the same
     *        token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will
     *        automatically generate a unique client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMulticastGroupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * @param loRaWAN
     */

    public void setLoRaWAN(LoRaWANMulticast loRaWAN) {
        this.loRaWAN = loRaWAN;
    }

    /**
     * @return
     */

    public LoRaWANMulticast getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * @param loRaWAN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMulticastGroupRequest withLoRaWAN(LoRaWANMulticast loRaWAN) {
        setLoRaWAN(loRaWAN);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMulticastGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMulticastGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getLoRaWAN() != null)
            sb.append("LoRaWAN: ").append(getLoRaWAN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMulticastGroupRequest == false)
            return false;
        CreateMulticastGroupRequest other = (CreateMulticastGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLoRaWAN() == null ^ this.getLoRaWAN() == null)
            return false;
        if (other.getLoRaWAN() != null && other.getLoRaWAN().equals(this.getLoRaWAN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLoRaWAN() == null) ? 0 : getLoRaWAN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMulticastGroupRequest clone() {
        return (CreateMulticastGroupRequest) super.clone();
    }

}
