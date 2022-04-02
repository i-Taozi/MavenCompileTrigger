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
package com.amazonaws.services.nimblestudio.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LaunchProfileValidationStatusCode {

    VALIDATION_NOT_STARTED("VALIDATION_NOT_STARTED"),
    VALIDATION_IN_PROGRESS("VALIDATION_IN_PROGRESS"),
    VALIDATION_SUCCESS("VALIDATION_SUCCESS"),
    VALIDATION_FAILED_INVALID_SUBNET_ROUTE_TABLE_ASSOCIATION("VALIDATION_FAILED_INVALID_SUBNET_ROUTE_TABLE_ASSOCIATION"),
    VALIDATION_FAILED_SUBNET_NOT_FOUND("VALIDATION_FAILED_SUBNET_NOT_FOUND"),
    VALIDATION_FAILED_INVALID_SECURITY_GROUP_ASSOCIATION("VALIDATION_FAILED_INVALID_SECURITY_GROUP_ASSOCIATION"),
    VALIDATION_FAILED_INVALID_ACTIVE_DIRECTORY("VALIDATION_FAILED_INVALID_ACTIVE_DIRECTORY"),
    VALIDATION_FAILED_UNAUTHORIZED("VALIDATION_FAILED_UNAUTHORIZED"),
    VALIDATION_FAILED_INTERNAL_SERVER_ERROR("VALIDATION_FAILED_INTERNAL_SERVER_ERROR");

    private String value;

    private LaunchProfileValidationStatusCode(String value) {
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
     * @return LaunchProfileValidationStatusCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LaunchProfileValidationStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LaunchProfileValidationStatusCode enumEntry : LaunchProfileValidationStatusCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
