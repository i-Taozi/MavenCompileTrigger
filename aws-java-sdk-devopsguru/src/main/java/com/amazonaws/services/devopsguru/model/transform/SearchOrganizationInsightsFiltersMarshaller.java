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
package com.amazonaws.services.devopsguru.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SearchOrganizationInsightsFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SearchOrganizationInsightsFiltersMarshaller {

    private static final MarshallingInfo<List> SEVERITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severities").build();
    private static final MarshallingInfo<List> STATUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statuses").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();
    private static final MarshallingInfo<StructuredPojo> SERVICECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCollection").build();

    private static final SearchOrganizationInsightsFiltersMarshaller instance = new SearchOrganizationInsightsFiltersMarshaller();

    public static SearchOrganizationInsightsFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SearchOrganizationInsightsFilters searchOrganizationInsightsFilters, ProtocolMarshaller protocolMarshaller) {

        if (searchOrganizationInsightsFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(searchOrganizationInsightsFilters.getSeverities(), SEVERITIES_BINDING);
            protocolMarshaller.marshall(searchOrganizationInsightsFilters.getStatuses(), STATUSES_BINDING);
            protocolMarshaller.marshall(searchOrganizationInsightsFilters.getResourceCollection(), RESOURCECOLLECTION_BINDING);
            protocolMarshaller.marshall(searchOrganizationInsightsFilters.getServiceCollection(), SERVICECOLLECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
