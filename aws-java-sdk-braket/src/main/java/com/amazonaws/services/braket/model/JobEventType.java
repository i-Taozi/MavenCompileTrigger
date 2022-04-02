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
package com.amazonaws.services.braket.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum JobEventType {

    WAITING_FOR_PRIORITY("WAITING_FOR_PRIORITY"),
    QUEUED_FOR_EXECUTION("QUEUED_FOR_EXECUTION"),
    STARTING_INSTANCE("STARTING_INSTANCE"),
    DOWNLOADING_DATA("DOWNLOADING_DATA"),
    RUNNING("RUNNING"),
    DEPRIORITIZED_DUE_TO_INACTIVITY("DEPRIORITIZED_DUE_TO_INACTIVITY"),
    UPLOADING_RESULTS("UPLOADING_RESULTS"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    MAX_RUNTIME_EXCEEDED("MAX_RUNTIME_EXCEEDED"),
    CANCELLED("CANCELLED");

    private String value;

    private JobEventType(String value) {
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
     * @return JobEventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static JobEventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (JobEventType enumEntry : JobEventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
