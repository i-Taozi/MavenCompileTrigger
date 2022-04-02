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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartImportFileTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartImportFileTaskRequestMarshaller {

    private static final MarshallingInfo<String> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Bucket").build();
    private static final MarshallingInfo<String> DATASOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSourceType").build();
    private static final MarshallingInfo<List> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("groupId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> S3BUCKETFORREPORTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3bucketForReportData").build();
    private static final MarshallingInfo<String> S3KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("s3key").build();

    private static final StartImportFileTaskRequestMarshaller instance = new StartImportFileTaskRequestMarshaller();

    public static StartImportFileTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartImportFileTaskRequest startImportFileTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (startImportFileTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startImportFileTaskRequest.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(startImportFileTaskRequest.getDataSourceType(), DATASOURCETYPE_BINDING);
            protocolMarshaller.marshall(startImportFileTaskRequest.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(startImportFileTaskRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(startImportFileTaskRequest.getS3bucketForReportData(), S3BUCKETFORREPORTDATA_BINDING);
            protocolMarshaller.marshall(startImportFileTaskRequest.getS3key(), S3KEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
