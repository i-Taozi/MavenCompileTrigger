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
package com.amazonaws.services.iottwinmaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SceneSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SceneSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CONTENTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentLocation").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SCENEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sceneId").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateDateTime").timestampFormat("unixTimestamp").build();

    private static final SceneSummaryMarshaller instance = new SceneSummaryMarshaller();

    public static SceneSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SceneSummary sceneSummary, ProtocolMarshaller protocolMarshaller) {

        if (sceneSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sceneSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(sceneSummary.getContentLocation(), CONTENTLOCATION_BINDING);
            protocolMarshaller.marshall(sceneSummary.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(sceneSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(sceneSummary.getSceneId(), SCENEID_BINDING);
            protocolMarshaller.marshall(sceneSummary.getUpdateDateTime(), UPDATEDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
