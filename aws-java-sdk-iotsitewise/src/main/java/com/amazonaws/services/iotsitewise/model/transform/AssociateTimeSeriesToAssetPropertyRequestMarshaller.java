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
package com.amazonaws.services.iotsitewise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateTimeSeriesToAssetPropertyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateTimeSeriesToAssetPropertyRequestMarshaller {

    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("alias").build();
    private static final MarshallingInfo<String> ASSETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("assetId").build();
    private static final MarshallingInfo<String> PROPERTYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("propertyId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final AssociateTimeSeriesToAssetPropertyRequestMarshaller instance = new AssociateTimeSeriesToAssetPropertyRequestMarshaller();

    public static AssociateTimeSeriesToAssetPropertyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateTimeSeriesToAssetPropertyRequest associateTimeSeriesToAssetPropertyRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateTimeSeriesToAssetPropertyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateTimeSeriesToAssetPropertyRequest.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(associateTimeSeriesToAssetPropertyRequest.getAssetId(), ASSETID_BINDING);
            protocolMarshaller.marshall(associateTimeSeriesToAssetPropertyRequest.getPropertyId(), PROPERTYID_BINDING);
            protocolMarshaller.marshall(associateTimeSeriesToAssetPropertyRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
