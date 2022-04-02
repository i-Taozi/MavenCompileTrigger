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
package com.amazonaws.services.inspector2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ErrorCode {

    ALREADY_ENABLED("ALREADY_ENABLED"),
    ENABLE_IN_PROGRESS("ENABLE_IN_PROGRESS"),
    DISABLE_IN_PROGRESS("DISABLE_IN_PROGRESS"),
    SUSPEND_IN_PROGRESS("SUSPEND_IN_PROGRESS"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    ACCESS_DENIED("ACCESS_DENIED"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    SSM_UNAVAILABLE("SSM_UNAVAILABLE"),
    SSM_THROTTLED("SSM_THROTTLED"),
    EVENTBRIDGE_UNAVAILABLE("EVENTBRIDGE_UNAVAILABLE"),
    EVENTBRIDGE_THROTTLED("EVENTBRIDGE_THROTTLED"),
    RESOURCE_SCAN_NOT_DISABLED("RESOURCE_SCAN_NOT_DISABLED"),
    DISASSOCIATE_ALL_MEMBERS("DISASSOCIATE_ALL_MEMBERS");

    private String value;

    private ErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ErrorCode enumEntry : ErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
