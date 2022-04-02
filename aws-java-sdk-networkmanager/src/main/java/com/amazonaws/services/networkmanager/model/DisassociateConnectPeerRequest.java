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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateConnectPeer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateConnectPeerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the Connect peer to disassociate from a device.
     * </p>
     */
    private String connectPeerId;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConnectPeerRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the Connect peer to disassociate from a device.
     * </p>
     * 
     * @param connectPeerId
     *        The ID of the Connect peer to disassociate from a device.
     */

    public void setConnectPeerId(String connectPeerId) {
        this.connectPeerId = connectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer to disassociate from a device.
     * </p>
     * 
     * @return The ID of the Connect peer to disassociate from a device.
     */

    public String getConnectPeerId() {
        return this.connectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer to disassociate from a device.
     * </p>
     * 
     * @param connectPeerId
     *        The ID of the Connect peer to disassociate from a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConnectPeerRequest withConnectPeerId(String connectPeerId) {
        setConnectPeerId(connectPeerId);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getConnectPeerId() != null)
            sb.append("ConnectPeerId: ").append(getConnectPeerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateConnectPeerRequest == false)
            return false;
        DisassociateConnectPeerRequest other = (DisassociateConnectPeerRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getConnectPeerId() == null ^ this.getConnectPeerId() == null)
            return false;
        if (other.getConnectPeerId() != null && other.getConnectPeerId().equals(this.getConnectPeerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getConnectPeerId() == null) ? 0 : getConnectPeerId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateConnectPeerRequest clone() {
        return (DisassociateConnectPeerRequest) super.clone();
    }

}
