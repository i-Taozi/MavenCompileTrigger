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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReactiveOrganizationInsightSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReactiveOrganizationInsightSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccountId").build();
    private static final MarshallingInfo<String> ORGANIZATIONALUNITID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnitId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severity").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> INSIGHTTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsightTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();
    private static final MarshallingInfo<StructuredPojo> SERVICECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceCollection").build();

    private static final ReactiveOrganizationInsightSummaryMarshaller instance = new ReactiveOrganizationInsightSummaryMarshaller();

    public static ReactiveOrganizationInsightSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReactiveOrganizationInsightSummary reactiveOrganizationInsightSummary, ProtocolMarshaller protocolMarshaller) {

        if (reactiveOrganizationInsightSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getOrganizationalUnitId(), ORGANIZATIONALUNITID_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getInsightTimeRange(), INSIGHTTIMERANGE_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getResourceCollection(), RESOURCECOLLECTION_BINDING);
            protocolMarshaller.marshall(reactiveOrganizationInsightSummary.getServiceCollection(), SERVICECOLLECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
