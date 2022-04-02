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
package com.amazonaws.services.cloudwatchrum;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchrum.model.*;

/**
 * Abstract implementation of {@code AWSCloudWatchRUMAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudWatchRUMAsync extends AbstractAWSCloudWatchRUM implements AWSCloudWatchRUMAsync {

    protected AbstractAWSCloudWatchRUMAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAppMonitorResult> createAppMonitorAsync(CreateAppMonitorRequest request) {

        return createAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppMonitorResult> createAppMonitorAsync(CreateAppMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppMonitorRequest, CreateAppMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppMonitorResult> deleteAppMonitorAsync(DeleteAppMonitorRequest request) {

        return deleteAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppMonitorResult> deleteAppMonitorAsync(DeleteAppMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppMonitorRequest, DeleteAppMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppMonitorResult> getAppMonitorAsync(GetAppMonitorRequest request) {

        return getAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppMonitorResult> getAppMonitorAsync(GetAppMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppMonitorRequest, GetAppMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppMonitorDataResult> getAppMonitorDataAsync(GetAppMonitorDataRequest request) {

        return getAppMonitorDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppMonitorDataResult> getAppMonitorDataAsync(GetAppMonitorDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppMonitorDataRequest, GetAppMonitorDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppMonitorsResult> listAppMonitorsAsync(ListAppMonitorsRequest request) {

        return listAppMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppMonitorsResult> listAppMonitorsAsync(ListAppMonitorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppMonitorsRequest, ListAppMonitorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRumEventsResult> putRumEventsAsync(PutRumEventsRequest request) {

        return putRumEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRumEventsResult> putRumEventsAsync(PutRumEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRumEventsRequest, PutRumEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppMonitorResult> updateAppMonitorAsync(UpdateAppMonitorRequest request) {

        return updateAppMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppMonitorResult> updateAppMonitorAsync(UpdateAppMonitorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppMonitorRequest, UpdateAppMonitorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
