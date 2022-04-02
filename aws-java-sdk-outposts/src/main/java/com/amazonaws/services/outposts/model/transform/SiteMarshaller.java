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
package com.amazonaws.services.outposts.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SiteMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SiteMarshaller {

    private static final MarshallingInfo<String> SITEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SiteId").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> SITEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SiteArn").build();
    private static final MarshallingInfo<String> NOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Notes").build();
    private static final MarshallingInfo<String> OPERATINGADDRESSCOUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingAddressCountryCode").build();
    private static final MarshallingInfo<String> OPERATINGADDRESSSTATEORREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingAddressStateOrRegion").build();
    private static final MarshallingInfo<String> OPERATINGADDRESSCITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingAddressCity").build();
    private static final MarshallingInfo<StructuredPojo> RACKPHYSICALPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RackPhysicalProperties").build();

    private static final SiteMarshaller instance = new SiteMarshaller();

    public static SiteMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Site site, ProtocolMarshaller protocolMarshaller) {

        if (site == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(site.getSiteId(), SITEID_BINDING);
            protocolMarshaller.marshall(site.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(site.getName(), NAME_BINDING);
            protocolMarshaller.marshall(site.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(site.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(site.getSiteArn(), SITEARN_BINDING);
            protocolMarshaller.marshall(site.getNotes(), NOTES_BINDING);
            protocolMarshaller.marshall(site.getOperatingAddressCountryCode(), OPERATINGADDRESSCOUNTRYCODE_BINDING);
            protocolMarshaller.marshall(site.getOperatingAddressStateOrRegion(), OPERATINGADDRESSSTATEORREGION_BINDING);
            protocolMarshaller.marshall(site.getOperatingAddressCity(), OPERATINGADDRESSCITY_BINDING);
            protocolMarshaller.marshall(site.getRackPhysicalProperties(), RACKPHYSICALPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
