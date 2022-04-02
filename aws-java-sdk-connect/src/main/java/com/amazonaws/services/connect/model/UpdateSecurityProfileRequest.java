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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateSecurityProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the security profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     */
    private String securityProfileId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @param description
     *        The description of the security profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @return The description of the security profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @param description
     *        The description of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     * 
     * @return The permissions granted to a security profile.
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to a security profile.
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to a security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to a security profile.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to a security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @param securityProfileId
     *        The identifier for the security profle.
     */

    public void setSecurityProfileId(String securityProfileId) {
        this.securityProfileId = securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @return The identifier for the security profle.
     */

    public String getSecurityProfileId() {
        return this.securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @param securityProfileId
     *        The identifier for the security profle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withSecurityProfileId(String securityProfileId) {
        setSecurityProfileId(securityProfileId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getSecurityProfileId() != null)
            sb.append("SecurityProfileId: ").append(getSecurityProfileId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileRequest == false)
            return false;
        UpdateSecurityProfileRequest other = (UpdateSecurityProfileRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSecurityProfileId() == null ^ this.getSecurityProfileId() == null)
            return false;
        if (other.getSecurityProfileId() != null && other.getSecurityProfileId().equals(this.getSecurityProfileId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileId() == null) ? 0 : getSecurityProfileId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityProfileRequest clone() {
        return (UpdateSecurityProfileRequest) super.clone();
    }

}
