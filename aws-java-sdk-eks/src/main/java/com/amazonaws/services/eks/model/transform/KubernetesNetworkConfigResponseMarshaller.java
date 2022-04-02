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
package com.amazonaws.services.eks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KubernetesNetworkConfigResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KubernetesNetworkConfigResponseMarshaller {

    private static final MarshallingInfo<String> SERVICEIPV4CIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceIpv4Cidr").build();
    private static final MarshallingInfo<String> SERVICEIPV6CIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceIpv6Cidr").build();
    private static final MarshallingInfo<String> IPFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipFamily").build();

    private static final KubernetesNetworkConfigResponseMarshaller instance = new KubernetesNetworkConfigResponseMarshaller();

    public static KubernetesNetworkConfigResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KubernetesNetworkConfigResponse kubernetesNetworkConfigResponse, ProtocolMarshaller protocolMarshaller) {

        if (kubernetesNetworkConfigResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kubernetesNetworkConfigResponse.getServiceIpv4Cidr(), SERVICEIPV4CIDR_BINDING);
            protocolMarshaller.marshall(kubernetesNetworkConfigResponse.getServiceIpv6Cidr(), SERVICEIPV6CIDR_BINDING);
            protocolMarshaller.marshall(kubernetesNetworkConfigResponse.getIpFamily(), IPFAMILY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
