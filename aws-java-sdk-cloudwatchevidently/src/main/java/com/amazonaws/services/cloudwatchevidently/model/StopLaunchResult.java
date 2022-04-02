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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopLaunchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the launch stopped.
     * </p>
     */
    private java.util.Date endedTime;

    /**
     * <p>
     * The date and time that the launch stopped.
     * </p>
     * 
     * @param endedTime
     *        The date and time that the launch stopped.
     */

    public void setEndedTime(java.util.Date endedTime) {
        this.endedTime = endedTime;
    }

    /**
     * <p>
     * The date and time that the launch stopped.
     * </p>
     * 
     * @return The date and time that the launch stopped.
     */

    public java.util.Date getEndedTime() {
        return this.endedTime;
    }

    /**
     * <p>
     * The date and time that the launch stopped.
     * </p>
     * 
     * @param endedTime
     *        The date and time that the launch stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopLaunchResult withEndedTime(java.util.Date endedTime) {
        setEndedTime(endedTime);
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
        if (getEndedTime() != null)
            sb.append("EndedTime: ").append(getEndedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopLaunchResult == false)
            return false;
        StopLaunchResult other = (StopLaunchResult) obj;
        if (other.getEndedTime() == null ^ this.getEndedTime() == null)
            return false;
        if (other.getEndedTime() != null && other.getEndedTime().equals(this.getEndedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndedTime() == null) ? 0 : getEndedTime().hashCode());
        return hashCode;
    }

    @Override
    public StopLaunchResult clone() {
        try {
            return (StopLaunchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
