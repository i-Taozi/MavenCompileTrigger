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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkInfoMarshaller {

    private static final MarshallingInfo<String> INTERFACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interfaceName").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipAddress").build();
    private static final MarshallingInfo<String> MACADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("macAddress").build();
    private static final MarshallingInfo<String> NETMASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("netMask").build();

    private static final NetworkInfoMarshaller instance = new NetworkInfoMarshaller();

    public static NetworkInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkInfo networkInfo, ProtocolMarshaller protocolMarshaller) {

        if (networkInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkInfo.getInterfaceName(), INTERFACENAME_BINDING);
            protocolMarshaller.marshall(networkInfo.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(networkInfo.getMacAddress(), MACADDRESS_BINDING);
            protocolMarshaller.marshall(networkInfo.getNetMask(), NETMASK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
