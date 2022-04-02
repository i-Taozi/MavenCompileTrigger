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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network Connect peer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ConnectPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectPeer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ID of the attachment to connect.
     * </p>
     */
    private String connectAttachmentId;
    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     */
    private String connectPeerId;
    /**
     * <p>
     * The Connect peer Regions where edges are located.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The timestamp when the Connect peer was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The configuration of the Connect peer.
     * </p>
     */
    private ConnectPeerConfiguration configuration;
    /**
     * <p>
     * The tags associated with the Connect peer.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment to connect.
     * </p>
     * 
     * @param connectAttachmentId
     *        The ID of the attachment to connect.
     */

    public void setConnectAttachmentId(String connectAttachmentId) {
        this.connectAttachmentId = connectAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment to connect.
     * </p>
     * 
     * @return The ID of the attachment to connect.
     */

    public String getConnectAttachmentId() {
        return this.connectAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment to connect.
     * </p>
     * 
     * @param connectAttachmentId
     *        The ID of the attachment to connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withConnectAttachmentId(String connectAttachmentId) {
        setConnectAttachmentId(connectAttachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param connectPeerId
     *        The ID of the Connect peer.
     */

    public void setConnectPeerId(String connectPeerId) {
        this.connectPeerId = connectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @return The ID of the Connect peer.
     */

    public String getConnectPeerId() {
        return this.connectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param connectPeerId
     *        The ID of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withConnectPeerId(String connectPeerId) {
        setConnectPeerId(connectPeerId);
        return this;
    }

    /**
     * <p>
     * The Connect peer Regions where edges are located.
     * </p>
     * 
     * @param edgeLocation
     *        The Connect peer Regions where edges are located.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The Connect peer Regions where edges are located.
     * </p>
     * 
     * @return The Connect peer Regions where edges are located.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The Connect peer Regions where edges are located.
     * </p>
     * 
     * @param edgeLocation
     *        The Connect peer Regions where edges are located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer.
     * @see ConnectPeerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @return The state of the Connect peer.
     * @see ConnectPeerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectPeerState
     */

    public ConnectPeer withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectPeerState
     */

    public ConnectPeer withState(ConnectPeerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the Connect peer was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the Connect peer was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the Connect peer was created.
     * </p>
     * 
     * @return The timestamp when the Connect peer was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the Connect peer was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the Connect peer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The configuration of the Connect peer.
     * </p>
     * 
     * @param configuration
     *        The configuration of the Connect peer.
     */

    public void setConfiguration(ConnectPeerConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the Connect peer.
     * </p>
     * 
     * @return The configuration of the Connect peer.
     */

    public ConnectPeerConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the Connect peer.
     * </p>
     * 
     * @param configuration
     *        The configuration of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withConfiguration(ConnectPeerConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The tags associated with the Connect peer.
     * </p>
     * 
     * @return The tags associated with the Connect peer.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the Connect peer.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Connect peer.
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
     * The tags associated with the Connect peer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the Connect peer.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectPeer withTags(java.util.Collection<Tag> tags) {
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getConnectAttachmentId() != null)
            sb.append("ConnectAttachmentId: ").append(getConnectAttachmentId()).append(",");
        if (getConnectPeerId() != null)
            sb.append("ConnectPeerId: ").append(getConnectPeerId()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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

        if (obj instanceof ConnectPeer == false)
            return false;
        ConnectPeer other = (ConnectPeer) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getConnectAttachmentId() == null ^ this.getConnectAttachmentId() == null)
            return false;
        if (other.getConnectAttachmentId() != null && other.getConnectAttachmentId().equals(this.getConnectAttachmentId()) == false)
            return false;
        if (other.getConnectPeerId() == null ^ this.getConnectPeerId() == null)
            return false;
        if (other.getConnectPeerId() != null && other.getConnectPeerId().equals(this.getConnectPeerId()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getConnectAttachmentId() == null) ? 0 : getConnectAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getConnectPeerId() == null) ? 0 : getConnectPeerId().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ConnectPeer clone() {
        try {
            return (ConnectPeer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectPeerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
