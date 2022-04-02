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
package com.amazonaws.services.dataexchange.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportAssetFromApiGatewayApiResponseDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportAssetFromApiGatewayApiResponseDetailsMarshaller {

    private static final MarshallingInfo<String> APIDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiDescription").build();
    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiId").build();
    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiKey").build();
    private static final MarshallingInfo<String> APINAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiName").build();
    private static final MarshallingInfo<String> APISPECIFICATIONMD5HASH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiSpecificationMd5Hash").build();
    private static final MarshallingInfo<String> APISPECIFICATIONUPLOADURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiSpecificationUploadUrl").build();
    private static final MarshallingInfo<java.util.Date> APISPECIFICATIONUPLOADURLEXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiSpecificationUploadUrlExpiresAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> PROTOCOLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtocolType").build();
    private static final MarshallingInfo<String> REVISIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RevisionId").build();
    private static final MarshallingInfo<String> STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stage").build();

    private static final ImportAssetFromApiGatewayApiResponseDetailsMarshaller instance = new ImportAssetFromApiGatewayApiResponseDetailsMarshaller();

    public static ImportAssetFromApiGatewayApiResponseDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportAssetFromApiGatewayApiResponseDetails importAssetFromApiGatewayApiResponseDetails, ProtocolMarshaller protocolMarshaller) {

        if (importAssetFromApiGatewayApiResponseDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiDescription(), APIDESCRIPTION_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiKey(), APIKEY_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiName(), APINAME_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiSpecificationMd5Hash(), APISPECIFICATIONMD5HASH_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiSpecificationUploadUrl(), APISPECIFICATIONUPLOADURL_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getApiSpecificationUploadUrlExpiresAt(),
                    APISPECIFICATIONUPLOADURLEXPIRESAT_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getProtocolType(), PROTOCOLTYPE_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getRevisionId(), REVISIONID_BINDING);
            protocolMarshaller.marshall(importAssetFromApiGatewayApiResponseDetails.getStage(), STAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
