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
package com.amazonaws.services.backupgateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateGatewayRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateGatewayRequestProtocolMarshaller implements Marshaller<Request<CreateGatewayRequest>, CreateGatewayRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.AWS_JSON).requestUri("/")
            .httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(false).hasPayloadMembers(true)
            .operationIdentifier("BackupOnPremises_v20210101.CreateGateway").serviceName("AWSBackupGateway").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public CreateGatewayRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateGatewayRequest> marshall(CreateGatewayRequest createGatewayRequest) {

        if (createGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<CreateGatewayRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    createGatewayRequest);

            protocolMarshaller.startMarshalling();
            CreateGatewayRequestMarshaller.getInstance().marshall(createGatewayRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
