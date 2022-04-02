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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), the sharpness of your output is reduced. You can
 * optionally use Post temporal sharpening (PostTemporalSharpening) to apply sharpening to the edges of your output. The
 * default behavior, Auto (AUTO), allows the transcoder to determine whether to apply sharpening, depending on your
 * input type and quality. When you set Post temporal sharpening to Enabled (ENABLED), specify how much sharpening is
 * applied using Post temporal sharpening strength (PostTemporalSharpeningStrength). Set Post temporal sharpening to
 * Disabled (DISABLED) to not apply sharpening.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NoiseFilterPostTemporalSharpening {

    DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    AUTO("AUTO");

    private String value;

    private NoiseFilterPostTemporalSharpening(String value) {
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
     * @return NoiseFilterPostTemporalSharpening corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NoiseFilterPostTemporalSharpening fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NoiseFilterPostTemporalSharpening enumEntry : NoiseFilterPostTemporalSharpening.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
