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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a search result from a position search query that is run on a place index resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchForPositionResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchForPositionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The distance in meters of a great-circle arc between the query position and the result.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance
     * between two locations.
     * </p>
     * </note>
     */
    private Double distance;
    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     */
    private Place place;

    /**
     * <p>
     * The distance in meters of a great-circle arc between the query position and the result.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance
     * between two locations.
     * </p>
     * </note>
     * 
     * @param distance
     *        The distance in meters of a great-circle arc between the query position and the result.</p> <note>
     *        <p>
     *        A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest
     *        distance between two locations.
     *        </p>
     */

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The distance in meters of a great-circle arc between the query position and the result.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance
     * between two locations.
     * </p>
     * </note>
     * 
     * @return The distance in meters of a great-circle arc between the query position and the result.</p> <note>
     *         <p>
     *         A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest
     *         distance between two locations.
     *         </p>
     */

    public Double getDistance() {
        return this.distance;
    }

    /**
     * <p>
     * The distance in meters of a great-circle arc between the query position and the result.
     * </p>
     * <note>
     * <p>
     * A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest distance
     * between two locations.
     * </p>
     * </note>
     * 
     * @param distance
     *        The distance in meters of a great-circle arc between the query position and the result.</p> <note>
     *        <p>
     *        A great-circle arc is the shortest path on a sphere, in this case the Earth. This returns the shortest
     *        distance between two locations.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchForPositionResult withDistance(Double distance) {
        setDistance(distance);
        return this;
    }

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     * 
     * @param place
     *        Details about the search result, such as its address and position.
     */

    public void setPlace(Place place) {
        this.place = place;
    }

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     * 
     * @return Details about the search result, such as its address and position.
     */

    public Place getPlace() {
        return this.place;
    }

    /**
     * <p>
     * Details about the search result, such as its address and position.
     * </p>
     * 
     * @param place
     *        Details about the search result, such as its address and position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchForPositionResult withPlace(Place place) {
        setPlace(place);
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
        if (getDistance() != null)
            sb.append("Distance: ").append(getDistance()).append(",");
        if (getPlace() != null)
            sb.append("Place: ").append(getPlace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchForPositionResult == false)
            return false;
        SearchForPositionResult other = (SearchForPositionResult) obj;
        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getPlace() == null ^ this.getPlace() == null)
            return false;
        if (other.getPlace() != null && other.getPlace().equals(this.getPlace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode + ((getPlace() == null) ? 0 : getPlace().hashCode());
        return hashCode;
    }

    @Override
    public SearchForPositionResult clone() {
        try {
            return (SearchForPositionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.SearchForPositionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
