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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeeting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeetingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     */
    private String mediaRegion;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String meetingHostId;
    /**
     * <p>
     * The external meeting ID.
     * </p>
     */
    private String externalMeetingId;
    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     */
    private NotificationsConfiguration notificationsConfiguration;
    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     */
    private MeetingFeaturesConfiguration meetingFeatures;

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different meetings.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     * 
     * @return The unique identifier for the client request. Use a different token for different meetings.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different meetings.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different meetings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which to create the meeting.</p>
     *        <p>
     *        Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     *        <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> ,
     *        <code>ca-central-1</code> , <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code>
     *        , <code>eu-west-1</code> , <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> ,
     *        <code>us-east-1</code> , <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     */

    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     * 
     * @return The Region in which to create the meeting.</p>
     *         <p>
     *         Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     *         <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> ,
     *         <code>ca-central-1</code> , <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code>
     *         , <code>eu-west-1</code> , <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> ,
     *         <code>us-east-1</code> , <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     */

    public String getMediaRegion() {
        return this.mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting.
     * </p>
     * <p>
     * Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     * <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> , <code>ca-central-1</code> ,
     * <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code> , <code>eu-west-1</code> ,
     * <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> , <code>us-east-1</code> ,
     * <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which to create the meeting.</p>
     *        <p>
     *        Available values: <code>af-south-1</code> , <code>ap-northeast-1</code> , <code>ap-northeast-2</code> ,
     *        <code>ap-south-1</code> , <code>ap-southeast-1</code> , <code>ap-southeast-2</code> ,
     *        <code>ca-central-1</code> , <code>eu-central-1</code> , <code>eu-north-1</code> , <code>eu-south-1</code>
     *        , <code>eu-west-1</code> , <code>eu-west-2</code> , <code>eu-west-3</code> , <code>sa-east-1</code> ,
     *        <code>us-east-1</code> , <code>us-east-2</code> , <code>us-west-1</code> , <code>us-west-2</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withMediaRegion(String mediaRegion) {
        setMediaRegion(mediaRegion);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param meetingHostId
     *        Reserved.
     */

    public void setMeetingHostId(String meetingHostId) {
        this.meetingHostId = meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getMeetingHostId() {
        return this.meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param meetingHostId
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withMeetingHostId(String meetingHostId) {
        setMeetingHostId(meetingHostId);
        return this;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @param externalMeetingId
     *        The external meeting ID.
     */

    public void setExternalMeetingId(String externalMeetingId) {
        this.externalMeetingId = externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @return The external meeting ID.
     */

    public String getExternalMeetingId() {
        return this.externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @param externalMeetingId
     *        The external meeting ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withExternalMeetingId(String externalMeetingId) {
        setExternalMeetingId(externalMeetingId);
        return this;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     * 
     * @param notificationsConfiguration
     *        The configuration for resource targets to receive notifications when meeting and attendee events occur.
     */

    public void setNotificationsConfiguration(NotificationsConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     * 
     * @return The configuration for resource targets to receive notifications when meeting and attendee events occur.
     */

    public NotificationsConfiguration getNotificationsConfiguration() {
        return this.notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * </p>
     * 
     * @param notificationsConfiguration
     *        The configuration for resource targets to receive notifications when meeting and attendee events occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withNotificationsConfiguration(NotificationsConfiguration notificationsConfiguration) {
        setNotificationsConfiguration(notificationsConfiguration);
        return this;
    }

    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     * 
     * @param meetingFeatures
     *        Lists the audio and video features enabled for a meeting, such as echo reduction.
     */

    public void setMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        this.meetingFeatures = meetingFeatures;
    }

    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     * 
     * @return Lists the audio and video features enabled for a meeting, such as echo reduction.
     */

    public MeetingFeaturesConfiguration getMeetingFeatures() {
        return this.meetingFeatures;
    }

    /**
     * <p>
     * Lists the audio and video features enabled for a meeting, such as echo reduction.
     * </p>
     * 
     * @param meetingFeatures
     *        Lists the audio and video features enabled for a meeting, such as echo reduction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingRequest withMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        setMeetingFeatures(meetingFeatures);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getMediaRegion() != null)
            sb.append("MediaRegion: ").append(getMediaRegion()).append(",");
        if (getMeetingHostId() != null)
            sb.append("MeetingHostId: ").append("***Sensitive Data Redacted***").append(",");
        if (getExternalMeetingId() != null)
            sb.append("ExternalMeetingId: ").append("***Sensitive Data Redacted***").append(",");
        if (getNotificationsConfiguration() != null)
            sb.append("NotificationsConfiguration: ").append(getNotificationsConfiguration()).append(",");
        if (getMeetingFeatures() != null)
            sb.append("MeetingFeatures: ").append(getMeetingFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingRequest == false)
            return false;
        CreateMeetingRequest other = (CreateMeetingRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getMeetingHostId() == null ^ this.getMeetingHostId() == null)
            return false;
        if (other.getMeetingHostId() != null && other.getMeetingHostId().equals(this.getMeetingHostId()) == false)
            return false;
        if (other.getExternalMeetingId() == null ^ this.getExternalMeetingId() == null)
            return false;
        if (other.getExternalMeetingId() != null && other.getExternalMeetingId().equals(this.getExternalMeetingId()) == false)
            return false;
        if (other.getNotificationsConfiguration() == null ^ this.getNotificationsConfiguration() == null)
            return false;
        if (other.getNotificationsConfiguration() != null && other.getNotificationsConfiguration().equals(this.getNotificationsConfiguration()) == false)
            return false;
        if (other.getMeetingFeatures() == null ^ this.getMeetingFeatures() == null)
            return false;
        if (other.getMeetingFeatures() != null && other.getMeetingFeatures().equals(this.getMeetingFeatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode + ((getMeetingHostId() == null) ? 0 : getMeetingHostId().hashCode());
        hashCode = prime * hashCode + ((getExternalMeetingId() == null) ? 0 : getExternalMeetingId().hashCode());
        hashCode = prime * hashCode + ((getNotificationsConfiguration() == null) ? 0 : getNotificationsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMeetingFeatures() == null) ? 0 : getMeetingFeatures().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingRequest clone() {
        return (CreateMeetingRequest) super.clone();
    }

}
