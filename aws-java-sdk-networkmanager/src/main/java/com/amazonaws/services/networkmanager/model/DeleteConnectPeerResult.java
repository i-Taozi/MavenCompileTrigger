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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnectPeer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConnectPeerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     */
    private ConnectPeer connectPeer;

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     * 
     * @param connectPeer
     *        Information about the deleted Connect peer.
     */

    public void setConnectPeer(ConnectPeer connectPeer) {
        this.connectPeer = connectPeer;
    }

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     * 
     * @return Information about the deleted Connect peer.
     */

    public ConnectPeer getConnectPeer() {
        return this.connectPeer;
    }

    /**
     * <p>
     * Information about the deleted Connect peer.
     * </p>
     * 
     * @param connectPeer
     *        Information about the deleted Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectPeerResult withConnectPeer(ConnectPeer connectPeer) {
        setConnectPeer(connectPeer);
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
        if (getConnectPeer() != null)
            sb.append("ConnectPeer: ").append(getConnectPeer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConnectPeerResult == false)
            return false;
        DeleteConnectPeerResult other = (DeleteConnectPeerResult) obj;
        if (other.getConnectPeer() == null ^ this.getConnectPeer() == null)
            return false;
        if (other.getConnectPeer() != null && other.getConnectPeer().equals(this.getConnectPeer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectPeer() == null) ? 0 : getConnectPeer().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConnectPeerResult clone() {
        try {
            return (DeleteConnectPeerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
