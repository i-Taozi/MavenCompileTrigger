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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Device registration state event configuration object for enabling and disabling relevant topics.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeviceRegistrationStateEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceRegistrationStateEventConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Device registration state event configuration object for enabling or disabling Sidewalk related event topics.
     * </p>
     */
    private SidewalkEventNotificationConfigurations sidewalk;

    /**
     * <p>
     * Device registration state event configuration object for enabling or disabling Sidewalk related event topics.
     * </p>
     * 
     * @param sidewalk
     *        Device registration state event configuration object for enabling or disabling Sidewalk related event
     *        topics.
     */

    public void setSidewalk(SidewalkEventNotificationConfigurations sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * Device registration state event configuration object for enabling or disabling Sidewalk related event topics.
     * </p>
     * 
     * @return Device registration state event configuration object for enabling or disabling Sidewalk related event
     *         topics.
     */

    public SidewalkEventNotificationConfigurations getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * Device registration state event configuration object for enabling or disabling Sidewalk related event topics.
     * </p>
     * 
     * @param sidewalk
     *        Device registration state event configuration object for enabling or disabling Sidewalk related event
     *        topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceRegistrationStateEventConfiguration withSidewalk(SidewalkEventNotificationConfigurations sidewalk) {
        setSidewalk(sidewalk);
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
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceRegistrationStateEventConfiguration == false)
            return false;
        DeviceRegistrationStateEventConfiguration other = (DeviceRegistrationStateEventConfiguration) obj;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public DeviceRegistrationStateEventConfiguration clone() {
        try {
            return (DeviceRegistrationStateEventConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.DeviceRegistrationStateEventConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
