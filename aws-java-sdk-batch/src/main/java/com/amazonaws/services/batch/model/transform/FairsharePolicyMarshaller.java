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
package com.amazonaws.services.batch.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FairsharePolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FairsharePolicyMarshaller {

    private static final MarshallingInfo<Integer> SHAREDECAYSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shareDecaySeconds").build();
    private static final MarshallingInfo<Integer> COMPUTERESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computeReservation").build();
    private static final MarshallingInfo<List> SHAREDISTRIBUTION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shareDistribution").build();

    private static final FairsharePolicyMarshaller instance = new FairsharePolicyMarshaller();

    public static FairsharePolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FairsharePolicy fairsharePolicy, ProtocolMarshaller protocolMarshaller) {

        if (fairsharePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fairsharePolicy.getShareDecaySeconds(), SHAREDECAYSECONDS_BINDING);
            protocolMarshaller.marshall(fairsharePolicy.getComputeReservation(), COMPUTERESERVATION_BINDING);
            protocolMarshaller.marshall(fairsharePolicy.getShareDistribution(), SHAREDISTRIBUTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
