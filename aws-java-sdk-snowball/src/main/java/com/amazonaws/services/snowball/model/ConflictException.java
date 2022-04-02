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
package com.amazonaws.services.snowball.model;

import javax.annotation.Generated;

/**
 * <p>
 * You get this exception when you call <code>CreateReturnShippingLabel</code> more than once when other requests are
 * not completed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.snowball.model.AmazonSnowballException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other requests are
     * not completed. .
     * </p>
     */
    private String conflictResource;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other requests are
     * not completed. .
     * </p>
     * 
     * @param conflictResource
     *        You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other
     *        requests are not completed. .
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictResource")
    public void setConflictResource(String conflictResource) {
        this.conflictResource = conflictResource;
    }

    /**
     * <p>
     * You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other requests are
     * not completed. .
     * </p>
     * 
     * @return You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other
     *         requests are not completed. .
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictResource")
    public String getConflictResource() {
        return this.conflictResource;
    }

    /**
     * <p>
     * You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other requests are
     * not completed. .
     * </p>
     * 
     * @param conflictResource
     *        You get this resource when you call <code>CreateReturnShippingLabel</code> more than once when other
     *        requests are not completed. .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withConflictResource(String conflictResource) {
        setConflictResource(conflictResource);
        return this;
    }

}
