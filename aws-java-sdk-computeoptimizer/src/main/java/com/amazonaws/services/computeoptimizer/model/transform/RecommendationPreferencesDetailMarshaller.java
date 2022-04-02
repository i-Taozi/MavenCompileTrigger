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
package com.amazonaws.services.computeoptimizer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationPreferencesDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationPreferencesDetailMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scope").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> ENHANCEDINFRASTRUCTUREMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enhancedInfrastructureMetrics").build();
    private static final MarshallingInfo<String> INFERREDWORKLOADTYPES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferredWorkloadTypes").build();

    private static final RecommendationPreferencesDetailMarshaller instance = new RecommendationPreferencesDetailMarshaller();

    public static RecommendationPreferencesDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationPreferencesDetail recommendationPreferencesDetail, ProtocolMarshaller protocolMarshaller) {

        if (recommendationPreferencesDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationPreferencesDetail.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(recommendationPreferencesDetail.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(recommendationPreferencesDetail.getEnhancedInfrastructureMetrics(), ENHANCEDINFRASTRUCTUREMETRICS_BINDING);
            protocolMarshaller.marshall(recommendationPreferencesDetail.getInferredWorkloadTypes(), INFERREDWORKLOADTYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
