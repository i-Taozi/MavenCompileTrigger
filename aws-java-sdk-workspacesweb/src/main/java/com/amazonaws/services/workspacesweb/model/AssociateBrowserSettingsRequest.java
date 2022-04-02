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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/AssociateBrowserSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateBrowserSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     */
    private String browserSettingsArn;
    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     */
    private String portalArn;

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     * 
     * @param browserSettingsArn
     *        The ARN of the browser settings.
     */

    public void setBrowserSettingsArn(String browserSettingsArn) {
        this.browserSettingsArn = browserSettingsArn;
    }

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     * 
     * @return The ARN of the browser settings.
     */

    public String getBrowserSettingsArn() {
        return this.browserSettingsArn;
    }

    /**
     * <p>
     * The ARN of the browser settings.
     * </p>
     * 
     * @param browserSettingsArn
     *        The ARN of the browser settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateBrowserSettingsRequest withBrowserSettingsArn(String browserSettingsArn) {
        setBrowserSettingsArn(browserSettingsArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     */

    public void setPortalArn(String portalArn) {
        this.portalArn = portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @return The ARN of the web portal.
     */

    public String getPortalArn() {
        return this.portalArn;
    }

    /**
     * <p>
     * The ARN of the web portal.
     * </p>
     * 
     * @param portalArn
     *        The ARN of the web portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateBrowserSettingsRequest withPortalArn(String portalArn) {
        setPortalArn(portalArn);
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
        if (getBrowserSettingsArn() != null)
            sb.append("BrowserSettingsArn: ").append(getBrowserSettingsArn()).append(",");
        if (getPortalArn() != null)
            sb.append("PortalArn: ").append(getPortalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateBrowserSettingsRequest == false)
            return false;
        AssociateBrowserSettingsRequest other = (AssociateBrowserSettingsRequest) obj;
        if (other.getBrowserSettingsArn() == null ^ this.getBrowserSettingsArn() == null)
            return false;
        if (other.getBrowserSettingsArn() != null && other.getBrowserSettingsArn().equals(this.getBrowserSettingsArn()) == false)
            return false;
        if (other.getPortalArn() == null ^ this.getPortalArn() == null)
            return false;
        if (other.getPortalArn() != null && other.getPortalArn().equals(this.getPortalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrowserSettingsArn() == null) ? 0 : getBrowserSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getPortalArn() == null) ? 0 : getPortalArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateBrowserSettingsRequest clone() {
        return (AssociateBrowserSettingsRequest) super.clone();
    }

}
