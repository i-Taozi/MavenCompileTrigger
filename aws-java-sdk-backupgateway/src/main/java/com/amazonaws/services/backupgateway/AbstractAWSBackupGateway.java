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
package com.amazonaws.services.backupgateway;

import javax.annotation.Generated;

import com.amazonaws.services.backupgateway.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSBackupGateway}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSBackupGateway implements AWSBackupGateway {

    protected AbstractAWSBackupGateway() {
    }

    @Override
    public AssociateGatewayToServerResult associateGatewayToServer(AssociateGatewayToServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateGatewayResult createGateway(CreateGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteGatewayResult deleteGateway(DeleteGatewayRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteHypervisorResult deleteHypervisor(DeleteHypervisorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateGatewayFromServerResult disassociateGatewayFromServer(DisassociateGatewayFromServerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportHypervisorConfigurationResult importHypervisorConfiguration(ImportHypervisorConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListHypervisorsResult listHypervisors(ListHypervisorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVirtualMachinesResult listVirtualMachines(ListVirtualMachinesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutMaintenanceStartTimeResult putMaintenanceStartTime(PutMaintenanceStartTimeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestHypervisorConfigurationResult testHypervisorConfiguration(TestHypervisorConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateHypervisorResult updateHypervisor(UpdateHypervisorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
